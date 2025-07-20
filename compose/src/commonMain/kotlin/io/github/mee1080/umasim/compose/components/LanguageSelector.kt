package io.github.mee1080.umasim.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.translation.Language
import io.github.mee1080.umasim.compose.translation.LanguageManager

@Composable
fun LanguageSelector() {
    val currentLanguage by LanguageManager.currentLanguage.collectAsState()
    
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(8.dp)
    ) {
        Language.entries.forEach { language ->
            TextButton(
                onClick = { LanguageManager.setLanguage(language) },
                modifier = Modifier.padding(horizontal = 4.dp)
            ) {
                Text(
                    text = language.displayName,
                    color = if (currentLanguage == language) {
                        androidx.compose.material3.MaterialTheme.colorScheme.primary
                    } else {
                        androidx.compose.material3.MaterialTheme.colorScheme.onSurface
                    }
                )
            }
        }
    }
} 