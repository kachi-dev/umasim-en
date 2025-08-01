package io.github.mee1080.umasim.compose.pages.race

import androidx.compose.foundation.HorizontalScrollbar
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.common.parts.LinedTable
import io.github.mee1080.umasim.compose.common.parts.Table
import io.github.mee1080.umasim.race.calc2.RaceSetting
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.SimulationSkillSummary
import io.github.mee1080.umasim.store.SimulationSummary
import io.github.mee1080.umasim.store.SimulationSummaryEntry
import io.github.mee1080.utility.roundToString
import io.github.mee1080.utility.secondToTimeString
import io.github.mee1080.utility.toPercentString
import kotlin.math.roundToInt
import io.github.mee1080.umasim.compose.translation.LanguageManager

@Composable
fun SummaryOutput(state: AppState) {
    val summary = state.simulationSummary ?: return
    Column {
        Text(LanguageManager.getText("結果"), style = MaterialTheme.typography.headlineSmall)
        Text("${LanguageManager.getText("最大スパート率")}：${summary.spurtRate.toPercentString(2)}")
        Text("${LanguageManager.getText("スタミナ生存率")}：${summary.staminaSurvivalRate.toPercentString(2)}")
        Text(LanguageManager.getText("最大スパートでも最後の60mでスタミナ切れで死亡する可能性があります"), style = MaterialTheme.typography.bodySmall)
        SummaryTable(summary)
        SkillTable(summary)
    }
}

private val tableHeader = listOf(
    "",
    "平均タイム",
    "最速タイム",
    "最遅タイム",
    "平均余剰耐力",
    "最大余剰耐力",
    "最小余剰耐力",
    "位置取り調整回数",
    "持久力温存発生率",
    "持久力温存平均距離",
    "追い比べ完走率",
    "追い比べ平均時間",
)

@Composable
private fun SummaryTable(summary: SimulationSummary) {
    Column {
        val scrollState = rememberScrollState()
        val translatedHeader = tableHeader.map { LanguageManager.getText(it) }
        val tableData = buildList {
            add(translatedHeader)
            add(toTableData(LanguageManager.getText("全体"), summary.allSummary))
            add(toTableData(LanguageManager.getText("最大スパート"), summary.spurtSummary))
            add(toTableData(LanguageManager.getText("非最大スパート"), summary.notSpurtSummary))
        }
        LinedTable(
            rowCount = 4, columnCount = tableHeader.size,
            modifier = Modifier.fillMaxWidth().horizontalScroll(scrollState),
            cellBackground = MaterialTheme.colorScheme.surface,
            cellPadding = 4.dp,
        ) { row, column ->
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = when {
                    row == 0 -> Alignment.CenterHorizontally
                    column == 0 -> Alignment.Start
                    else -> Alignment.End
                },
                verticalArrangement = Arrangement.Center,
            ) {
                Text(tableData[row][column])
            }
        }
        HorizontalScrollbar(rememberScrollbarAdapter(scrollState), Modifier.fillMaxWidth())
    }
}

private fun toTableData(label: String, entry: SimulationSummaryEntry): List<String> {
    return if (entry.count == 0) {
        listOf(label, "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-")
    } else {
        listOf(
            label,
            entry.averageTime.secondToTimeString(),
            entry.bestTime.secondToTimeString(),
            entry.worstTime.secondToTimeString(),
            entry.averageSp.roundToString(1),
            entry.bestSp.roundToString(1),
            entry.worstSp.roundToString(1),
            entry.positionCompetitionCount.roundToString(2),
            entry.staminaKeepRate.toPercentString(1),
            entry.staminaKeepDistance.roundToString(1),
            entry.competeFightFinishRate.toPercentString(1),
            entry.competeFightTime.roundToString(1),
        )
    }
}

@Composable
private fun SkillTable(summary: SimulationSummary) {
    val summaries = summary.skillSummaries
    if (summaries.isEmpty()) return
    val tableData = buildList {
        add(
            listOf(
                "発動数",
                "発動率",
                "平均発動位置1",
                "2回発動率",
                "平均発動位置2",
                "序盤発動率",
                "中盤接続率",
                "平均中盤接続時間",
                "中盤発動率",
                "終盤接続率",
                "平均終盤接続時間",
                "終盤発動率",
                "平均終盤遅延",
                "速度上昇無効割合",
            ).map { LanguageManager.getText(it) }
        )
        summaries.forEach { add(toTableData(summary.setting, it.second)) }
    }
    Text(LanguageManager.getText("スキル情報"), modifier = Modifier.padding(top = 8.dp))
    Row {
        Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
            Text("", Modifier.padding(4.dp))
            summaries.forEach {
                Text(LanguageManager.getText(it.first), Modifier.padding(4.dp))
            }
        }
        Table(tableData.size, 14, scrollable = true) { row, col ->
            Text(
                tableData[row][col], Modifier.padding(4.dp).align(
                    when {
                        row == 0 -> Alignment.Center
                        col == 2 || col == 4 -> Alignment.CenterStart
                        else -> Alignment.CenterEnd
                    }
                )
            )
        }
    }
}

private fun toTableData(setting: RaceSetting, entry: SimulationSkillSummary): List<String> {
    return if (entry.count == 0) {
        listOf("0") + List(13) { "-" }
    } else {
        listOf(
            entry.count.toString(),
            entry.triggerRate.toPercentString(1),
            (entry.averageStartFrame1 / 15.0).roundToString(2, "s") + "/" +
                    entry.averageStartPosition1.roundToString(2, "m") +
                    toPositionString(setting, entry.averageStartPosition1),
            entry.doubleTriggerRate.toPercentString(1),
            (entry.averageStartFrame2 / 15.0).roundToString(2, "s") + "/" +
                    entry.averageStartPosition2.roundToString(2, "m") +
                    toPositionString(setting, entry.averageStartPosition2),
            entry.phase0TriggeredRate.toPercentString(1),
            entry.phase1ConnectionRate.toPercentString(1),
            (entry.averagePhase1ConnectionFrame / 15.0).roundToString(2, "s"),
            entry.phase1TriggeredRate.toPercentString(1),
            entry.phase2ConnectionRate.toPercentString(1),
            (entry.averagePhase2ConnectionFrame / 15.0).roundToString(2, "s"),
            entry.phase2TriggeredRate.toPercentString(1),
            (entry.averagePhase2DelayFrame / 15.0).roundToString(2, "s"),
            entry.invalidRate.toPercentString(1),
        )
    }
}

private fun toPositionString(setting: RaceSetting, position: Double): String {
    return when {
        position.isNaN() || position.isInfinite() -> ""
        position < setting.phase0Half -> ""
        position < setting.phase1Start -> "(中盤入り前${(setting.phase1Start - position).roundToInt()}m)"
        position < setting.phase1Half -> "(中盤開始${(position - setting.phase1Start).roundToInt()}m)"
        position < setting.phase2Start -> "(終盤入り前${(setting.phase2Start - position).roundToInt()}m)"
        position < setting.phase2Half -> "(終盤開始${(position - setting.phase2Start).roundToInt()}m)"
        else -> "(ゴール前${(setting.courseLength - position).roundToInt()}m)"
    }
}
