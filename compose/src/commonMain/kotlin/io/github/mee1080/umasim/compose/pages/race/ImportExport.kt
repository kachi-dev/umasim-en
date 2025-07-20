package io.github.mee1080.umasim.compose.pages.race

import androidx.compose.foundation.layout.*
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.common.atoms.MyButton
import io.github.mee1080.umasim.compose.common.atoms.TextWithLink
import io.github.mee1080.umasim.race.calc2.UmaStatus
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.ImportExportConverter
import io.github.mee1080.umasim.store.framework.OperationDispatcher
import io.github.mee1080.umasim.store.operation.importChara
import io.github.mee1080.umasim.compose.translation.LanguageManager

@Composable
fun ImportExport(virtual: Boolean, state: AppState, dispatch: OperationDispatcher<AppState>) {
    val chara by derivedStateOf { state.chara(virtual) }
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        ImportDialog(virtual, dispatch)
        ExportDialog(chara)
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun ImportDialog(virtual: Boolean, dispatch: OperationDispatcher<AppState>) {
    var open by remember { mutableStateOf(false) }
    MyButton({ open = true }) {
        Text(LanguageManager.getText("インポート"))
    }
    if (open) {
        var input by remember { mutableStateOf("") }
        var result by remember { mutableStateOf<UmaStatus?>(null) }
        AlertDialog(
            onDismissRequest = { open = false },
            text = {
                Column {
                    Text("※枠内にCtrl+Vなどでペーストし、インポートを押してください(Androidたぶん非対応)")
                    Text("※フォーマットは適当なので、ChatGPT等にOCRさせて読み込むのも可能")
                    TextWithLink("　例： https://x.com/mee10801/status/1796811671304028542")
                    OutlinedTextField(
                        value = input,
                        onValueChange = { input = it },
                        modifier = Modifier.heightIn(max = 200.dp),
                    )
                    MyButton(
                        onClick = { result = ImportExportConverter.importChara(input) },
                        modifier = Modifier.padding(vertical = 8.dp),
                    ) {
                        Text(LanguageManager.getText("インポート"))
                    }
                    result?.let {
                        Text("${LanguageManager.getText("キャラ")}：${it.charaName}")
                        Text("${LanguageManager.getText("ステータス")}：${it.speed}/${it.stamina}/${it.power}/${it.guts}/${it.wisdom}")
                        Text("${LanguageManager.getText("適性")}：${LanguageManager.getText("バ場")}${it.surfaceFit}/${LanguageManager.getText("距離")}${it.distanceFit}/${LanguageManager.getText("脚質")}${it.styleFit}")
                        if (it.hasSkills.isNotEmpty()) {
                            Text("${LanguageManager.getText("スキル")}：")
                            FlowRow(Modifier.padding(start = 16.dp)) {
                                it.hasSkills.forEach { skill ->
                                    Text("${skill.name}, ")
                                }
                            }
                        }
                        Text("※インポートされるのは、ステータス、適性、スキルのみです")
                    }
                }
            },
            confirmButton = {
                MyButton(
                    onClick = {
                        result?.let {
                            dispatch(importChara(virtual, it))
                        }
                        open = false
                    },
                    enabled = result != null,
                ) {
                    Text(LanguageManager.getText("反映"))
                }
            },
            dismissButton = {
                MyButton({ open = false }) {
                    Text(LanguageManager.getText("キャンセル"))
                }
            }
        )
    }
}

@Composable
private fun ExportDialog(chara: UmaStatus) {
    var open by remember { mutableStateOf(false) }
    MyButton({ open = true }) {
        Text(LanguageManager.getText("エクスポート"))
    }
    if (open) {
        var value by remember { mutableStateOf("") }
        LaunchedEffect(Unit) {
            value = ImportExportConverter.exportChara(chara)
        }
        AlertDialog(
            onDismissRequest = { open = false },
            text = {
                Column {
                    OutlinedTextField(
                        value = value,
                        onValueChange = {},
                        readOnly = true,
                    )
                    Text("※枠内をCtrl+Cなどでコピーしてください(Android非対応)")
                    Text("※エクスポートされるのは、ステータス、適性、スキルのみです")
                }
            },
            confirmButton = {
                MyButton({ open = false }) {
                    Text(LanguageManager.getText("閉じる"))
                }
            },
        )
    }
}
