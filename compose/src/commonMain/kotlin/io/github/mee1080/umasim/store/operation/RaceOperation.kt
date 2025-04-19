package io.github.mee1080.umasim.store.operation

import io.github.mee1080.umasim.compose.common.lib.asyncDispatcher
import io.github.mee1080.umasim.compose.common.lib.progressReportDelay
import io.github.mee1080.umasim.compose.common.lib.progressReportInterval
import io.github.mee1080.umasim.race.calc2.*
import io.github.mee1080.umasim.race.data.PositionKeepState
import io.github.mee1080.umasim.race.data.horseLane
import io.github.mee1080.umasim.race.data2.SkillData
import io.github.mee1080.umasim.race.data2.skillData2
import io.github.mee1080.umasim.store.*
import io.github.mee1080.umasim.store.framework.ActionContext
import io.github.mee1080.umasim.store.framework.AsyncOperation
import io.github.mee1080.umasim.store.framework.OnRunning
import io.github.mee1080.utility.averageOf
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlin.coroutines.coroutineContext
import kotlin.math.max

private val simulationTag = OnRunning.Tag()

private val simulationPolicy = OnRunning.Ignore(simulationTag)

private val simulationCancelPolicy = OnRunning.CancelAndRun(simulationTag)

fun runSimulation(overrideCount: Int? = null) = AsyncOperation<AppState>({ state ->
    emit { it.clearSimulationResult() }
    when (state.simulationMode) {
        SimulationMode.NORMAL -> runSimulationNormal(state, overrideCount)
        SimulationMode.CONTRIBUTION -> runSimulationContribution(state, false)
        SimulationMode.CONTRIBUTION2 -> runSimulationContribution(state, true)
    }
}, simulationPolicy)

private fun AppState.clearSimulationResult() = copy(
    simulationProgress = 0,
    simulationSummary = null,
    lastSimulationSettingWithPassive = null,
    graphData = null,
    contributionResults = emptyList(),
)

private suspend fun ActionContext<AppState>.runSimulationNormal(state: AppState, overrideCount: Int? = null) {
    val simulationCount = overrideCount ?: state.simulationCount
    if (simulationCount <= 0) return
    val results = mutableListOf<RaceSimulationResult>()
    val skillSummaries = state.hasSkills(false).associate {
        it.name to mutableListOf<SimulationSkillInfo>()
    }
    var lastRaceState: RaceState? = null
    val scope = CoroutineScope(coroutineContext + asyncDispatcher.limitedParallelism(state.threadCount))
    var count = 0
    List(simulationCount) { index ->
        scope.async {
            val result = RaceCalculator().simulate(state.setting)
            val skillMap = createSkillMap(result.second)
            result to skillMap
        }
    }.forEach { deferred ->
        if (count++ % progressReportInterval == 0) {
            emit { it.copy(simulationProgress = count + 1) }
            delay(progressReportDelay)
        }
        val (result, skillMap) = deferred.await()
        results += result.first
        skillMap.forEach {
            skillSummaries[it.key]?.add(it.value)
        }
        lastRaceState = result.second
    }
    val graphData = toGraphData(state.setting, lastRaceState?.simulation?.frames)
    val spurtResults = results.filter { it.maxSpurt }
    val notSpurtResult = results.filter { !it.maxSpurt }
    val summary = SimulationSummary(
        setting = state.setting,
        allSummary = toSummary(results),
        spurtSummary = toSummary(spurtResults),
        notSpurtSummary = toSummary(notSpurtResult),
        spurtRate = spurtResults.size.toDouble() / results.size,
        skillSummaries = skillSummaries.map { it.key to toSummary(it.value) },
    )
    emit {
        it.copy(
            simulationProgress = 0,
            simulationSummary = summary,
            lastSimulationSettingWithPassive = lastRaceState?.setting,
            graphData = graphData,
        )
    }
}

private fun toSummary(result: List<RaceSimulationResult>): SimulationSummaryEntry {
    return if (result.isEmpty()) SimulationSummaryEntry() else SimulationSummaryEntry(
        count = result.size,
        averageTime = result.averageOf { it.raceTime },
        bestTime = result.minOf { it.raceTime },
        worstTime = result.maxOf { it.raceTime },
        averageSp = result.averageOf { it.spDiff },
        bestSp = result.maxOf { it.spDiff },
        worstSp = result.minOf { it.spDiff },
        positionCompetitionCount = result.averageOf { it.positionCompetitionCount.toDouble() },
        staminaKeepRate = result.count { it.staminaKeepDistance > 0.0 } / result.size.toDouble(),
        staminaKeepDistance = result.averageOf { it.staminaKeepDistance },
        competeFightFinishRate = result.count { it.competeFightFinished } /
                result.count { it.competeFightTime > 0.0 }.toDouble(),
        competeFightTime = result.averageOf { it.competeFightTime },
    )
}

private class SimulationSkillInfoWork(
    var info: SimulationSkillInfo,
    var invalidFrameCount: Int = 0,
    var totalFrameCount: Int = 0,
)

private fun createSkillMap(state: RaceState): Map<String, SimulationSkillInfo> {
    val (phase1Start, phase2Start) = getPhaseChangeFrames(state)
    val skillMap = state.setting.umaStatus.hasSkills.associate {
        it.name to SimulationSkillInfoWork(SimulationSkillInfo(phase1Start, phase2Start))
    }.toMutableMap()
    state.simulation.frames.forEachIndexed { index, frame ->
        val speedDiff = frame.targetSpeed - frame.speed
        frame.operatingSkills.filter { it.targetSpeed > 0.0 }.forEach {
            val current = skillMap[it.data.skill.name] ?: return@forEach
            current.totalFrameCount++
            if (frame.positionKeepState != PositionKeepState.PACE_DOWN && speedDiff > it.targetSpeed) {
                current.invalidFrameCount++
            }
        }
        frame.triggeredSkills.forEach {
            val current = skillMap[it.invoke.skill.name] ?: return@forEach
            if (current.info.startFrame1 < 0) {
                skillMap[it.invoke.skill.name]?.info = current.info.copy(startFrame1 = index)
            } else {
                skillMap[it.invoke.skill.name]?.info = current.info.copy(startFrame2 = index)
            }
        }
        frame.endedSkills.forEach {
            val current = skillMap[it.data.skill.name] ?: return@forEach
            if (current.info.endFrame1 < 0) {
                skillMap[it.data.skill.name]?.info = current.info.copy(endFrame1 = index)
            } else {
                skillMap[it.data.skill.name]?.info = current.info.copy(endFrame2 = index)
            }
        }
    }
    return skillMap.mapValues {
        val invalidRate = if (it.value.totalFrameCount == 0) null else {
            it.value.invalidFrameCount.toDouble() / it.value.totalFrameCount
        }
        it.value.info.copy(invalidRate = invalidRate)
    }
}

private fun getPhaseChangeFrames(state: RaceState): Pair<Int, Int> {
    var phase1 = -1
    var phase2 = -1
    var nextPhaseStart = state.setting.phase1Start
    state.simulation.frames.forEachIndexed { index, frame ->
        if (phase1 < 0) {
            if (frame.startPosition >= nextPhaseStart) {
                phase1 = index - 1
                nextPhaseStart = state.setting.phase2Start
            }
        } else if (phase2 < 0) {
            if (frame.startPosition >= nextPhaseStart) {
                phase2 = index - 1
                return@forEachIndexed
            }
        }
    }
    return phase1 to phase2
}

private fun toSummary(list: List<SimulationSkillInfo>): SimulationSkillSummary {
    val triggeredList = list.filter { it.startFrame1 >= 0 }
    val secondTriggeredList = triggeredList.filter { it.startFrame2 >= 0 }
    val phase1ConnectedList = triggeredList.mapNotNull { it.phase1ConnectionFrame }
    val phase2ConnectedList = triggeredList.mapNotNull { it.phase2ConnectionFrame }
    return SimulationSkillSummary(
        count = triggeredList.size,
        triggerRate = if (list.isEmpty()) 0.0 else triggeredList.size.toDouble() / list.size,
        averageStartFrame1 = triggeredList.averageOf { it.startFrame1.toDouble() },
        doubleTriggerRate = if (list.isEmpty()) 0.0 else secondTriggeredList.size.toDouble() / list.size,
        averageStartFrame2 = secondTriggeredList.averageOf { it.startFrame2.toDouble() },
        phase0TriggeredRate = if (triggeredList.isEmpty()) 0.0 else {
            triggeredList.count { it.triggeredPhase == 0 }.toDouble() / triggeredList.size
        },
        phase1ConnectionRate = if (triggeredList.isEmpty()) 0.0 else phase1ConnectedList.size.toDouble() / triggeredList.size,
        averagePhase1ConnectionFrame = phase1ConnectedList.average(),
        phase1TriggeredRate = if (triggeredList.isEmpty()) 0.0 else {
            triggeredList.count { it.triggeredPhase == 1 }.toDouble() / triggeredList.size
        },
        phase2ConnectionRate = if (triggeredList.isEmpty()) 0.0 else phase2ConnectedList.size.toDouble() / triggeredList.size,
        averagePhase2ConnectionFrame = phase2ConnectedList.average(),
        phase2TriggeredRate = if (triggeredList.isEmpty()) 0.0 else {
            triggeredList.count { it.triggeredPhase == 2 }.toDouble() / triggeredList.size
        },
        averagePhase2DelayFrame = triggeredList.mapNotNull { it.phase2DelayFrame }.average(),
        invalidRate = if (list.isEmpty()) 0.0 else list.filter { it.invalidRate != null }.averageOf {
            it.invalidRate ?: 0.0
        },
    )
}

private const val speedMin = 13f
private const val speedMax = 28f

private const val staminaMin = -200f

private const val paceMakerMax = 80f

private const val areaHeight = 0.1f

private fun adjustRange(value: Double, min: Float, max: Float) = (value.toFloat() - min) / (max - min)

private fun toGraphData(setting: RaceSetting, frameList: List<RaceFrame>?): GraphData? {
    if (frameList.isNullOrEmpty()) return null
    val staminaMax = frameList[0].sp.toFloat()
    val trackDetail = setting.trackDetail
    return GraphData(
        frameList = frameList,
        speedData = frameList.mapIndexed { index, raceFrame ->
            index / 15f to adjustRange(raceFrame.speed, speedMin, speedMax)
        },
        staminaData = frameList.mapIndexed { index, raceFrame ->
            index / 15f to adjustRange(raceFrame.sp, staminaMin, staminaMax)
        },
        staminaZero = adjustRange(0.0, staminaMin, staminaMax),
        staminaOverData = frameList.mapIndexedNotNull { index, raceFrame ->
            if (raceFrame.sp >= 0) null else {
                index / 15f to adjustRange(raceFrame.sp, staminaMin, staminaMax)
            }
        },
        laneData = frameList.mapIndexed { index, raceFrame ->
            index / 15f to adjustRange(
                raceFrame.currentLane + horseLane / 2.0, 0f,
                (max(setting.track.gateCount + 1, 11) * horseLane + setting.track.initialLaneAdjuster).toFloat()
            )
        },
        phase1Start = frameList.indexOfFirst { it.startPosition >= setting.phase1Start } / 15f,
        phase2Start = frameList.indexOfFirst { it.startPosition >= setting.phase2Start } / 15f,
        straightData = toGraphData(trackDetail.straights.map { it.start to it.end }, frameList),
        cornerData = toGraphData(trackDetail.corners.map { it.start to it.end }, frameList),
        upSlopeData = toGraphData(trackDetail.slopes.filter { it.slope > 0f }.map { it.start to it.end }, frameList),
        downSlopeData = toGraphData(trackDetail.slopes.filter { it.slope < 0f }.map { it.start to it.end }, frameList),
        skillData = buildList {
            frameList.forEachIndexed { index, raceFrame ->
                raceFrame.triggeredSkills.forEach { skill ->
                    val end = searchFrame(frameList, index + 1) { frame ->
                        frame.endedSkills.any { it.data.skill.id == skill.invoke.skill.id }
                    }
                    add(GraphSkill(index / 15f, end?.div(15f), skill.invoke.skill.name, skill))
                }
                add(frameList, index, raceFrame, "掛かり") { it.temptation }
//                add(index, raceFrame, last, "スパート開始") { it.spurting }
//                add(index, raceFrame, last, "ペースダウンモード") { it.paceDownMode }
                add(frameList, index, raceFrame, "下り坂モード") { it.downSlopeMode }
//                add(index, raceFrame, last, "位置取り争い") { it.leadCompetition }
                add(frameList, index, raceFrame, "追い比べ") { it.competeFight }
//                add(index, raceFrame, last, "脚色十分") { it.conservePower }
//                add(index, raceFrame, last, "位置取り調整") { it.positionCompetition }
                add(frameList, index, raceFrame, "持久力温存") { it.staminaKeep }
//                add(index, raceFrame, last, "リード確保") { it.secureLead }
                add(frameList, index, raceFrame, "スタミナ勝負") { it.staminaLimitBreak }
//                if (raceFrame.positionKeepState != PositionKeepState.NONE && raceFrame.positionKeepState != last.positionKeepState) {
//                    add(index / 15f to raceFrame.positionKeepState.label)
//                }
            }
        }.sortedBy { it.start },
        paceMakerData = frameList.mapIndexedNotNull { index, raceFrame ->
            val paceMakerPosition = raceFrame.paceMakerFrame?.startPosition ?: return@mapIndexedNotNull null
            val min = paceMakerMax / staminaMax * staminaMin
            index / 15f to adjustRange(paceMakerPosition - raceFrame.startPosition, min, paceMakerMax)
        },
    )
}

private fun MutableList<GraphSkill>.add(
    frameList: List<RaceFrame>,
    frame: Int,
    raceFrame: RaceFrame,
    label: String,
    check: (RaceFrame) -> Boolean,
) {
    if (check(raceFrame) && (frame == 0 || !check(frameList[frame - 1]))) {
        val end = searchFrame(frameList, frame + 1) { !check(it) } ?: frameList.lastIndex
        add(GraphSkill(frame / 15f, end / 15f, label, null))
    }
}

private fun searchFrame(
    frameList: List<RaceFrame>,
    startIndex: Int,
    predicate: (RaceFrame) -> Boolean,
): Int? {
    val frame = frameList.subList(startIndex, frameList.size).indexOfFirst(predicate)
    return if (frame == -1) null else frame + startIndex
}

private fun toGraphData(
    areas: List<Pair<Double, Double>>,
    frameList: List<RaceFrame>,
): List<Pair<Float, Float>> {
    return buildList {
        var areaIndex = 0
        var inArea = false
        frameList.forEachIndexed { index, raceFrame ->
            val area = areas.getOrNull(areaIndex) ?: return@buildList
            if (inArea) {
                if (raceFrame.startPosition >= area.second) {
                    inArea = false
                    add(index / 15f to areaHeight)
                    add(index / 15f to 0f)
                    areaIndex++
                }
            } else {
                if (raceFrame.startPosition >= area.first) {
                    inArea = true
                    add(index / 15f to 0f)
                    add(index / 15f to areaHeight)
                }
            }
        }
        if (areas.getOrNull(areaIndex) != null) {
            add((frameList.size - 1) / 15f to areaHeight)
            add((frameList.size - 1) / 15f to 0f)
        }
    }
}

fun cancelSimulation() = AsyncOperation<AppState>({ state ->
    emit { it.clearSimulationResult() }
}, simulationCancelPolicy)

/**
 * @param selectMode
 *  true:選択スキルのうち1つを獲得した場合の短縮タイム
 *  false:各スキルを所持していない場合の増加タイム
 */
private suspend fun ActionContext<AppState>.runSimulationContribution(state: AppState, selectMode: Boolean) {
    val targets = state.contributionTargets.intersect(state.skillIdSet)
    val targetSkills = targets.flatMap { target ->
        val skill = state.hasSkills(false).firstOrNull { it.id == target } ?: return@flatMap emptyList()
        if (selectMode) {
            val groupSkills = skillData2.filter {
                it.group == skill.group && it.rarity == "normal" && it.sp < skill.sp
            }.sortedBy { it.sp } + skill
            buildList {
                groupSkills.forEachIndexed { index, groupSkill ->
                    add(groupSkill to groupSkills.subList(0, index))
                }
            }
        } else {
            listOf(skill to emptyList<SkillData>())
        }
    }
    if (state.simulationCount < 5 || targetSkills.isEmpty()) return
    val calculateState = CalculateState(this, state, targetSkills.size + 1)
    val baseSetting = if (selectMode) {
        state.setting.copy(
            umaStatus = state.setting.umaStatus.copy(
                hasSkills = state.hasSkills(false).filterNot { targets.contains(it.id) }
            )
        )
    } else state.setting
    val baseTimes = calculateState.calculateTimes(baseSetting)
    val baseResult = ContributionResult(
        name = "基本値",
        compareName = null,
        averageTime = baseTimes.average(),
        averageDiff = Double.NaN,
        upperTime = baseTimes.subList(0, baseTimes.size / 5).average(),
        upperDiff = Double.NaN,
        lowerTime = baseTimes.subList(baseTimes.size * 4 / 5, baseTimes.size).average(),
        lowerDiff = Double.NaN,
        efficiency = List(6) { Double.NaN },
    )
    val targetResults = mutableListOf<ContributionResult>()
    targetSkills.forEach { target ->
        val targetSkill = target.first
        val setting = state.setting.copy(
            umaStatus = state.setting.umaStatus.copy(
                hasSkills = if (selectMode) {
                    baseSetting.umaStatus.hasSkills + targetSkill
                } else {
                    state.setting.umaStatus.hasSkills.filterNot { it.id == targetSkill.id }
                },
            )
        )
        val times = calculateState.calculateTimes(setting)
        targetResults.add(
            calculateState.calcContributionResult(
                targetSkill.name, targetSkill.sp, baseResult, times, selectMode,
            )
        )
        target.second.forEach { compareSkill ->
            val compareResult = targetResults.first { it.name == compareSkill.name }
            targetResults.add(
                calculateState.calcContributionResult(
                    targetSkill.name, targetSkill.sp - compareSkill.sp, compareResult, times, selectMode,
                )
            )
        }
    }
    val sortedResults = targetResults.sortedByDescending { it.efficiency[0] }
    emit {
        it.copy(
            simulationProgress = 0,
            contributionResults = listOf(baseResult) + sortedResults,
        )
    }
}

private class CalculateState(
    val context: ActionContext<AppState>,
    val state: AppState,
    val setCount: Int,
) {

    var progress: Int = 0

    suspend fun calculateTimes(setting: RaceSetting): List<Double> {
        val scope = CoroutineScope(coroutineContext + asyncDispatcher.limitedParallelism(state.threadCount))
        return List(state.simulationCount) {
            scope.async {
                RaceCalculator().simulate(setting).first.raceTime
            }
        }.map { deferred ->
            if (progress++ % progressReportInterval == 0) {
                context.emit { it.copy(simulationProgress = progress / setCount) }
                delay(progressReportDelay)
            }
            deferred.await()
        }.sorted()
    }

    fun calcContributionResult(
        name: String,
        sp: Int,
        baseResult: ContributionResult,
        times: List<Double>,
        selectMode: Boolean,
    ): ContributionResult {
        val averageTime = times.average()
        val upperTime = times.subList(0, times.size / 5).average()
        val lowerTime = times.subList(times.size * 4 / 5, times.size).average()
        return ContributionResult(
            name = name,
            compareName = if (baseResult.name == "基本値") null else baseResult.name,
            averageTime = averageTime,
            averageDiff = averageTime - baseResult.averageTime,
            upperTime = upperTime,
            upperDiff = upperTime - baseResult.upperTime,
            lowerTime = lowerTime,
            lowerDiff = lowerTime - baseResult.lowerTime,
            efficiency = if (sp == 0) List(6) { Double.NaN } else {
                val base = (if (selectMode) -1 else 1) * (averageTime - baseResult.averageTime) * 100.0 / sp
                listOf(1.0, 0.9, 0.8, 0.7, 0.65, 0.6).map { base / it }
            },
        )
    }
}
