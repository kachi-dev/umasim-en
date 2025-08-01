package io.github.mee1080.umasim.store

import androidx.compose.runtime.Stable
import io.github.mee1080.umasim.compose.common.lib.defaultThreadCount
import io.github.mee1080.umasim.race.calc2.*
import io.github.mee1080.umasim.race.data2.SkillData
import io.github.mee1080.umasim.race.data2.skillData2
import io.github.mee1080.umasim.store.framework.State
import io.github.mee1080.umasim.store.operation.updateSetting
import io.github.mee1080.utility.decodeFromStringOrNull
import io.github.mee1080.utility.encodeToString
import io.github.mee1080.utility.persistentSettings
import io.github.mee1080.utility.roundToString
import kotlinx.serialization.Serializable
import kotlinx.serialization.Transient

private const val KEY_APP_STATE_AUTO_SAVE = "race.appStateAutoSave"

fun AppState.loadSetting(): AppState {
    val savedSetting = persistentSettings.getStringOrNull(KEY_APP_STATE_AUTO_SAVE)?.let {
        decodeFromStringOrNull<AppState>(it)
    }?.let { base ->
        base.updateSetting { setting ->
            setting.copy(
                umaStatus = setting.umaStatus.copy(
                    hasSkills = skillData2.filter { base.skillIdSet.contains(it.id) }
                ),
                virtualLeader = setting.virtualLeader.copy(
                    hasSkills = skillData2.filter { base.virtualSkillIdSet.contains(it.id) }
                ),
            )
        }
    }
    return savedSetting ?: this
}

fun AppState.saveSetting() {
    persistentSettings.putString(KEY_APP_STATE_AUTO_SAVE, encodeToString(this))
}

enum class SimulationMode(val label: String) {
    NORMAL("通常"),
    CONTRIBUTION("スキル貢献度（各スキルを所持していない場合の増加タイム）"),
    CONTRIBUTION2("スキル貢献度（選択スキルのうち1つを獲得した場合の短縮タイム）")
}

@Stable
@Serializable
data class AppState(
    val setting: RaceSetting = RaceSetting(),
    val systemSetting: SystemSetting = SystemSetting(),
    val skillCategoryView: Boolean = true,
    val skillDisplayMinus: Boolean = false,
    val skillIdSet: Set<String> = emptySet(),
    val virtualSkillIdSet: Set<String> = emptySet(),
    val simulationCount: Int = 100,
    val simulationMode: SimulationMode = SimulationMode.NORMAL,
    val contributionTargets: Set<String> = emptySet(),
    val threadCount: Int = defaultThreadCount,
    @Transient
    val simulationProgress: Int = 0,
    @Transient
    val simulationSummary: SimulationSummary? = null,
    @Transient
    val lastSimulationSettingWithPassive: RaceSettingWithPassive? = null,
    @Transient
    val graphData: GraphData? = null,
    @Transient
    val contributionResults: List<ContributionResult> = emptyList(),
) : State {
    fun chara(virtual: Boolean): UmaStatus {
        return if (virtual) setting.virtualLeader else setting.umaStatus
    }

    fun skillIdSet(virtual: Boolean): Set<String> {
        return if (virtual) virtualSkillIdSet else skillIdSet
    }

    fun hasSkills(virtual: Boolean): List<SkillData> {
        return if (virtual) setting.virtualLeader.hasSkills else setting.umaStatus.hasSkills
    }
}

@Stable
data class SimulationSummary(
    val setting: RaceSetting,
    val allSummary: SimulationSummaryEntry,
    val spurtSummary: SimulationSummaryEntry,
    val notSpurtSummary: SimulationSummaryEntry,
    val spurtRate: Double,
    val staminaSurvivalRate: Double,
    val skillSummaries: List<Pair<String, SimulationSkillSummary>>,
)

data class SimulationSummaryEntry(
    val count: Int = 0,
    val averageTime: Double = 0.0,
    val bestTime: Double = 0.0,
    val worstTime: Double = 0.0,
    val averageSp: Double = 0.0,
    val bestSp: Double = 0.0,
    val worstSp: Double = 0.0,
    val positionCompetitionCount: Double = 0.0,
    val staminaKeepRate: Double = 0.0,
    val staminaKeepDistance: Double = 0.0,
    val competeFightFinishRate: Double = 0.0,
    val competeFightTime: Double = 0.0,
)

data class SimulationSkillInfo(
    val phase1StartFrame: Int,
    val phase2StartFrame: Int,
    val startFrame1: Int = -1,
    val endFrame1: Int = -1,
    val startPosition1: Double = -1.0,
    val startFrame2: Int = -1,
    val endFrame2: Int = -1,
    val startPosition2: Double = -1.0,
    val invalidRate: Double? = null,
) {
    val phase1ConnectionFrame by lazy { calcConnectionFrame(phase1StartFrame) }
    val phase2ConnectionFrame by lazy { calcConnectionFrame(phase2StartFrame) }
    val phase2DelayFrame by lazy { calcDelayFrame(phase2StartFrame) }

    val triggeredPhase by lazy {
        when {
            startFrame1 < phase1StartFrame -> 0
            startFrame1 < phase2StartFrame -> 1
            else -> 2
        }
    }

    private fun calcConnectionFrame(phaseStartFrame: Int): Int? {
        return when (phaseStartFrame) {
            in (startFrame1 + 1)..endFrame1 -> phaseStartFrame - startFrame1
            in (startFrame2 + 1)..endFrame2 -> phaseStartFrame - startFrame2
            else -> null
        }
    }

    private fun calcDelayFrame(phaseStartFrame: Int): Int? {
        return when {
            phaseStartFrame <= startFrame1 -> startFrame1 - phaseStartFrame
            phaseStartFrame <= startFrame2 -> startFrame2 - phaseStartFrame
            else -> null
        }
    }
}

data class SimulationSkillSummary(
    val count: Int,
    val triggerRate: Double,
    val averageStartFrame1: Double,
    val averageStartPosition1: Double,
    val doubleTriggerRate: Double,
    val averageStartFrame2: Double,
    val averageStartPosition2: Double,
    val phase0TriggeredRate: Double,
    val phase1ConnectionRate: Double,
    val averagePhase1ConnectionFrame: Double,
    val phase1TriggeredRate: Double,
    val phase2ConnectionRate: Double,
    val averagePhase2ConnectionFrame: Double,
    val phase2TriggeredRate: Double,
    val averagePhase2DelayFrame: Double,
    val invalidRate: Double,
)

@Stable
data class GraphData(
    val frameList: List<RaceFrame>,
    val speedData: List<Pair<Float, Float>>,
    val staminaData: List<Pair<Float, Float>>,
    val staminaOverData: List<Pair<Float, Float>>,
    val staminaZero: Float,
    val laneData: List<Pair<Float, Float>>,
    val phase1Start: Float,
    val phase2Start: Float,
    val straightData: List<Pair<Float, Float>>,
    val cornerData: List<Pair<Float, Float>>,
    val upSlopeData: List<Pair<Float, Float>>,
    val downSlopeData: List<Pair<Float, Float>>,
    val skillData: List<GraphSkill>,
    val paceMakerData: List<Pair<Float, Float>>,
)

@Stable
data class GraphSkill(
    val start: Float,
    val end: Float?,
    val name: String,
    val effect: TriggeredSkill?,
) {
    val description = buildString {
        if (effect != null) {
            val heal = effect.heal
            if (heal != null) {
                val waste = effect.waste ?: 0.0
                if (waste > 0.0) {
                    appendLine("体力：${heal.roundToString(2)} (溢れ：${waste.roundToString(2)})")
                } else {
                    appendLine("体力：${heal.roundToString(2)}")
                }
            }
            val operating = effect.operating
            if (operating != null) {
                if (operating.targetSpeed > 0.0) {
                    appendLine("目標速度：${operating.targetSpeed.roundToString(2)}")
                }
                if (operating.speedWithDecel > 0.0) {
                    appendLine("現在速度：${operating.speedWithDecel.roundToString(2)}")
                }
                if (operating.currentSpeed > 0.0) {
                    appendLine("現在速度：${operating.currentSpeed.roundToString(2)}")
                }
                if (operating.acceleration > 0.0) {
                    appendLine("加速度：${operating.acceleration.roundToString(2)}")
                }
                if (operating.laneChangeSpeed > 0.0) {
                    appendLine("レーン移動速度：${operating.laneChangeSpeed.roundToString(2)}")
                }
                if (operating.duration > 0.0) {
                    appendLine("持続時間：${operating.duration.roundToString(2)}")
                }
            }
        }
    }.trim()
}

@Stable
data class ContributionResult(
    val name: String,
    val compareName: String?,
    val averageTime: Double,
    val averageDiff: Double,
    val upperTime: Double,
    val upperDiff: Double,
    val lowerTime: Double,
    val lowerDiff: Double,
    val efficiency: List<Double>,
)
