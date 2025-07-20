package io.github.mee1080.umasim.compose.pages.race

import androidx.compose.foundation.layout.*
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.common.atoms.SelectBox
import io.github.mee1080.umasim.compose.common.parts.HideBlock
import io.github.mee1080.umasim.race.calc2.Track
import io.github.mee1080.umasim.race.data.CourseCondition
import io.github.mee1080.umasim.race.data.recentEventTrackList
import io.github.mee1080.umasim.race.data.trackData
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.framework.OperationDispatcher
import io.github.mee1080.umasim.store.operation.*
import io.github.mee1080.umasim.compose.translation.LanguageManager

@Composable
fun CourseInput(state: AppState, dispatch: OperationDispatcher<AppState>) {
    val track = state.setting.track
    HideBlock(
        header = { Text(LanguageManager.getText("コース")) },
        initialOpen = true,
        headerClosed = { Text("${LanguageManager.getText("コース")}：${LanguageManager.getText(state.setting.locationName)} ${LanguageManager.getText(state.setting.trackDetail.name)} ${LanguageManager.getText(track.condition.label)}") },
    ) {
        CourseSetting(track, dispatch)
    }
}

private val locationList = trackData.keys.sorted()

private val courseKeyList = trackData.mapValues { it.value.courses.keys.sorted() }

private val gateCountSelection = List(10) { it + 9 }

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun CourseSetting(track: Track, dispatch: OperationDispatcher<AppState>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        val selection = recentEventTrackList
        if (selection.isNotEmpty()) {
            FlowRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                selection.forEach {
                    val location = trackData[it.location] ?: return@forEach
                    val course = location.courses[it.course] ?: return@forEach
                    AssistChip({ dispatch(setTrack(it)) }, {
                        Text("${LanguageManager.getText(location.name)} ${LanguageManager.getText(course.name)} ${LanguageManager.getText(it.condition.label)} ${it.gateCount}${LanguageManager.getText("人")}")
                    })
                }
            }
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SelectBox(
                locationList, track.location,
                onSelect = { dispatch(setLocation(it)) },
                modifier = Modifier.width(192.dp),
                label = { Text(LanguageManager.getText("レース場")) },
                itemToString = { LanguageManager.getTextSync(trackData[it]?.name ?: "不明") },
            )
            val courseMap = trackData[track.location]?.courses
            if (courseMap != null) {
                SelectBox(
                    courseKeyList[track.location]!!, track.course,
                    onSelect = { dispatch(setCourse(it)) },
                    modifier = Modifier.width(256.dp),
                    label = { Text(LanguageManager.getText("コース")) },
                    itemToString = { LanguageManager.getTextSync(courseMap[it]?.name ?: "不明") },
                )
            }
            SelectBox(
                CourseCondition.entries, track.condition,
                onSelect = { dispatch(setCourseCondition(it)) },
                modifier = Modifier.width(128.dp),
                label = { Text(LanguageManager.getText("バ場状態")) },
                itemToString = { LanguageManager.getTextSync(it.label) },
            )
            SelectBox(
                gateCountSelection, track.gateCount,
                onSelect = { dispatch(setGateCount(it)) },
                modifier = Modifier.width(128.dp),
                label = { Text(LanguageManager.getText("出走人数")) },
            )
        }
    }
}