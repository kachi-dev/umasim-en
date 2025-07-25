package io.github.mee1080.umasim.compose.pages.race

import androidx.compose.foundation.layout.*
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.common.atoms.IntTextField
import io.github.mee1080.umasim.compose.common.atoms.MyButton
import io.github.mee1080.umasim.compose.common.lib.defaultThreadCount
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.SimulationMode
import io.github.mee1080.umasim.store.framework.OperationDispatcher
import io.github.mee1080.umasim.store.operation.runSimulation
import io.github.mee1080.umasim.store.operation.setThreadCount
import io.github.mee1080.utility.toPercentString
import io.github.mee1080.umasim.compose.translation.LanguageManager

@Composable
fun ActionInput(state: AppState, dispatch: OperationDispatcher<AppState>) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        if (defaultThreadCount > 1) {
            Row {
                IntTextField(
                    value = state.threadCount,
                    modifier = Modifier.width(128.dp),
                    label = { Text(LanguageManager.getText("スレッド数")) },
                    onValueChange = { dispatch(setThreadCount(it)) }
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            MyButton(
                onClick = { dispatch(runSimulation()) },
                enabled = state.simulationCount > 0 && state.simulationProgress == 0,
            ) {
                Text(LanguageManager.getText("エミュレート開始"))
            }
            if (state.simulationMode == SimulationMode.NORMAL) {
                MyButton(
                    onClick = { dispatch(runSimulation(1)) },
                    enabled = state.simulationProgress == 0,
                ) {
                    Text(LanguageManager.getText("1回のみ"))
                }
            }
        }
        if (state.simulationCount > 0 && state.simulationProgress > 0) {
            Column(Modifier.fillMaxWidth()) {
                val progress = state.simulationProgress.toFloat() / state.simulationCount
                Text(progress.toPercentString())
                LinearProgressIndicator(
                    progress = { progress },
                    modifier = Modifier.fillMaxWidth(),
                )
            }
        }
    }
}