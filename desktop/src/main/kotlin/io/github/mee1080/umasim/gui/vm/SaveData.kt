package io.github.mee1080.umasim.gui.vm

import io.github.mee1080.umasim.ai.FactorBasedActionSelector2
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
data class SaveData(
    val chara: String,
    val support: String,
    val supportPresets: List<Pair<String, String>> = emptyList(),
    val simulationTurn: Int,
    val simulationCount: Int,
    val simulationThread: Int,
//    val simulationOption: FactorBasedActionSelector2.Option,
    val version: Int = 1,
) {

    companion object {
        fun fromJson(json: String) = Json.decodeFromString<SaveData>(json)
    }

    fun toJson() = Json.encodeToString(this)

    // FIXME
    val simulationOption get() = FactorBasedActionSelector2.speedPower
}