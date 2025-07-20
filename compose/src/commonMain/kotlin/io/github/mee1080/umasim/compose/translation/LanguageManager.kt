package io.github.mee1080.umasim.compose.translation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

enum class Language(val code: String, val displayName: String) {
    JAPANESE("ja", "日本語"),
    ENGLISH("en", "English")
}

object LanguageManager {
    private val _currentLanguage = MutableStateFlow(Language.ENGLISH)
    val currentLanguage: StateFlow<Language> = _currentLanguage.asStateFlow()
    
    fun setLanguage(language: Language) {
        println("DEBUG: Setting language to ${language.displayName}")
        _currentLanguage.value = language
    }
    
    // Compose-friendly function that triggers recomposition
    @Composable
    fun getText(japaneseText: String): String {
        val currentLang by currentLanguage.collectAsState()
        val result = when (currentLang) {
            Language.JAPANESE -> japaneseText
            Language.ENGLISH -> Translations.translate(japaneseText)
        }
        println("DEBUG: getText('$japaneseText') -> '$result' (lang: ${currentLang.displayName})")
        return result
    }
    
    // Non-Compose function for use outside of composables
    fun getTextSync(japaneseText: String): String {
        return when (_currentLanguage.value) {
            Language.JAPANESE -> japaneseText
            Language.ENGLISH -> Translations.translate(japaneseText)
        }
    }
    
    fun getTextOrNull(japaneseText: String): String? {
        return when (_currentLanguage.value) {
            Language.JAPANESE -> japaneseText
            Language.ENGLISH -> Translations.translateOrNull(japaneseText)
        }
    }
    
    fun hasTranslation(japaneseText: String): Boolean {
        return when (_currentLanguage.value) {
            Language.JAPANESE -> true
            Language.ENGLISH -> Translations.hasTranslation(japaneseText)
        }
    }
} 