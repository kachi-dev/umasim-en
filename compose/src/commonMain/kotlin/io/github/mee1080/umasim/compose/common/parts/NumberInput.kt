package io.github.mee1080.umasim.compose.common.parts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.common.atoms.MyButton
import kotlin.math.max
import kotlin.math.min

@Composable
fun NumberInput(
    value: Int,
    onValueChange: (Int) -> Unit,
    modifier: Modifier = Modifier,
    min: Int = Int.MIN_VALUE,
    max: Int = Int.MAX_VALUE,
    numberWidth: Dp = 32.dp,
    enabled: Boolean = true,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
    ) {
        MyButton({ onValueChange(max(min, value - 1)) }, enabled = enabled && value > min) { Text("-") }
        Text(value.toString(), Modifier.width(numberWidth), textAlign = TextAlign.Center)
        MyButton({ onValueChange(min(max, value + 1)) }, enabled = enabled && value < max) { Text("+") }
    }
}