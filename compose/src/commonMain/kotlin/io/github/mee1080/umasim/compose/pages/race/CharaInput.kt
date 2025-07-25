package io.github.mee1080.umasim.compose.pages.race

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.common.atoms.IntTextField
import io.github.mee1080.umasim.compose.common.atoms.SelectBox
import io.github.mee1080.umasim.compose.common.parts.HideBlock
import io.github.mee1080.umasim.race.calc2.UmaStatus
import io.github.mee1080.umasim.race.data.Condition
import io.github.mee1080.umasim.race.data.FitRank
import io.github.mee1080.umasim.race.data.Style
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.framework.OperationDispatcher
import io.github.mee1080.umasim.store.operation.*
import io.github.mee1080.umasim.compose.translation.LanguageManager

@Composable
fun CharaInput(virtual: Boolean, state: AppState, dispatch: OperationDispatcher<AppState>) {
    val chara by derivedStateOf { state.chara(virtual) }
    HideBlock(
        header = { Text(LanguageManager.getText("ステータス")) },
        initialOpen = true,
        headerClosed = {
            Text("${LanguageManager.getText("ステータス")}：${chara.speed}/${chara.stamina}/${chara.power}/${chara.guts}/${chara.wisdom} ${LanguageManager.getText(chara.style.text)} ${chara.surfaceFit}/${chara.distanceFit}/${chara.styleFit} ${LanguageManager.getText(chara.condition.label)}")
        },
    ) {
        CharaStatus(virtual, chara, dispatch)
    }
}

private val styleList = listOf(Style.NIGE, Style.SEN, Style.SASI, Style.OI)

private val popularitySelection = List(18) { it + 1 }

private val gateNumberSelection = List(21) { it - 2 }

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun CharaStatus(virtual: Boolean, chara: UmaStatus, dispatch: OperationDispatcher<AppState>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        FlowRow {
            StatusTextField(chara.speed, LanguageManager.getText("スピード")) { dispatch(setStatus(virtual, speed = it)) }
            StatusTextField(chara.stamina, LanguageManager.getText("スタミナ")) { dispatch(setStatus(virtual, stamina = it)) }
            StatusTextField(chara.power, LanguageManager.getText("パワー")) { dispatch(setStatus(virtual, power = it)) }
            StatusTextField(chara.guts, LanguageManager.getText("根性")) { dispatch(setStatus(virtual, guts = it)) }
            StatusTextField(chara.wisdom, LanguageManager.getText("賢さ")) { dispatch(setStatus(virtual, wisdom = it)) }
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SelectBox(
                styleList, chara.style,
                onSelect = { dispatch(setStyle(virtual, it)) },
                modifier = Modifier.width(160.dp),
                label = { Text(LanguageManager.getText("作戦")) },
                itemToString = { LanguageManager.getTextSync(it.text) },
            )
            SelectBox(
                FitRank.entries, chara.surfaceFit,
                onSelect = { dispatch(setFit(virtual, surface = it)) },
                modifier = Modifier.width(128.dp),
                label = { Text(LanguageManager.getText("バ場適性")) },
                itemToString = { it.name },
            )
            SelectBox(
                FitRank.entries, chara.distanceFit,
                onSelect = { dispatch(setFit(virtual, distance = it)) },
                modifier = Modifier.width(128.dp),
                label = { Text(LanguageManager.getText("距離適性")) },
                itemToString = { it.name },
            )
            SelectBox(
                FitRank.entries, chara.styleFit,
                onSelect = { dispatch(setFit(virtual, style = it)) },
                modifier = Modifier.width(128.dp),
                label = { Text(LanguageManager.getText("脚質適性")) },
                itemToString = { it.name },
            )
            SelectBox(
                Condition.entries, chara.condition,
                onSelect = { dispatch(setCondition(virtual, it)) },
                modifier = Modifier.width(190.dp),
                label = { Text(LanguageManager.getText("調子")) },
                itemToString = { LanguageManager.getTextSync(it.label) },
            )
        }
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            SelectBox(
                popularitySelection, chara.popularity,
                onSelect = { dispatch(setPopularity(virtual, it)) },
                modifier = Modifier.width(128.dp),
                label = { Text(LanguageManager.getText("人気")) },
            )
            SelectBox(
                gateNumberSelection, chara.gateNumber,
                onSelect = { dispatch(setGateNumber(virtual, it)) },
                modifier = Modifier.width(256.dp),
                label = { Text(LanguageManager.getText("ゲート番号")) },
                itemToString = {
                    when (it) {
                        0 -> LanguageManager.getTextSync("ランダム")
                        -1 -> LanguageManager.getTextSync("内枠")
                        -2 -> LanguageManager.getTextSync("外枠")
                        else -> it.toString()
                    }
                },
            )
        }
    }
}

private val statusTextFieldModifier = Modifier.width(128.dp).padding(16.dp)

@Composable
private fun StatusTextField(value: Int, labelText: String, onValueChange: (Int) -> Unit) {
    IntTextField(
        value = value,
        modifier = statusTextFieldModifier,
        label = { Text(labelText) },
        onValueChange = onValueChange
    )
}