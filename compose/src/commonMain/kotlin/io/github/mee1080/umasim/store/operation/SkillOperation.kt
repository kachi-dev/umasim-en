package io.github.mee1080.umasim.store.operation

import io.github.mee1080.umasim.race.data2.SkillData
import io.github.mee1080.umasim.race.data2.skillData2
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.framework.DirectOperation
import io.github.mee1080.utility.applyIf

internal val charaToUniqueSkill = skillData2.filter { it.rarity == "unique" }.associateBy { it.holder!! }

internal val charaToEvoSkills = skillData2.filter { it.rarity == "evo" }.groupBy { it.holder!! }

// Auto-generated character mapping from umas.json (same as in SkillInput.kt)
private val charaIdToDisplayName = mapOf(
    "100011" to "[Special Dreamer] Special Week",
    "100021" to "[Innocent Silence] Silence Suzuka",
    "100031" to "[Peak Joy] Tokai Teio",
    "100041" to "[Formula R] Maruzensky",
    "100051" to "[Shooting Star Revue] Fuji Kiseki",
    "100061" to "[Starlight Beat] Oguri Cap",
    "100071" to "[Red Strife] Gold Ship",
    "100081" to "[Wild Top Gear] Vodka",
    "100091" to "[Peak Blue] Daiwa Scarlet",
    "100101" to "[Wild Frontier] Taiki Shuttle",
    "100111" to "[Stone-Piercing Blue] Grass Wonder",
    "100121" to "[Azure Amazon] Hishi Amazon",
    "100131" to "[Frontline Elegance] Mejiro McQueen",
    "100141" to "[El☆Número 1] El Condor Pasa",
    "100151" to "[O Sole Suo!] T.M. Opera O",
    "100161" to "[Maverick] Narita Brian",
    "100171" to "[Emperor's Path] Symboli Rudolf",
    "100181" to "[Empress Road] Air Groove",
    "100201" to "[Reeling in the Big One] Seiun Sky",
    "100231" to "[pf. Winning Equation...] Biwa Hayahide",
    "100241" to "[Scramble☆Zone] Mayano Top Gun",
    "100261" to "[MB-19890425] Mihono Bourbon",
    "100271" to "[Down the Line] Mejiro Ryan",
    "100281" to "[Buono ☆ Alla Moda] Hishi Akebono",
    "100301" to "[Rosy Dreams] Rice Shower",
    "100321" to "[tach-nology] Agnes Tachyon",
    "100351" to "[Get to Winning!] Winning Ticket",
    "100371" to "[Meisterschaft] Eishin Flash",
    "100381" to "[Fille Éclair] Curren Chan",
    "100391" to "[Princess of Pink] Kawakami Princess",
    "100401" to "[Authentic / 1928] Gold City",
    "100411" to "[Blossom in Learning] Sakura Bakushin O",
    "100451" to "[Murmuring Stream] Super Creek",
    "100461" to "[LOVE☆4EVER] Smart Falcon",
    "100501" to "[Nevertheless] Narita Taishin",
    "100521" to "[Bestest Prize ♪] Haru Urara",
    "100561" to "[Rising☆Fortune] Matikanefukukitaru",
    "100581" to "[Turbulent Blue] Meisho Doto",
    "100591" to "[Twisted Line] Mejiro Dober",
    "100601" to "[Poinsettia Ribbon] Nice Nature",
    "100611" to "[King of Emeralds] King Halo",
    "100681" to "[HARIKITTE IKOU!!!] Kitasan Black",
    "110011" to "[Hopp'n♪Happy Heart] Special Week",
    "110031" to "[Beyond the Horizon] Tokai Teio",
    "110041" to "[Hot☆Summer Night] Maruzensky",
    "110111" to "[Saintly Jade Cleric ] Grass Wonder",
    "110131" to "[End of the Skies] Mejiro McQueen",
    "110141" to "[Kukulkan Warrior] El Condor Pasa",
    "110181" to "[Quercus Civilis] Air Groove",
    "110241" to "[Sunlight Bouquet] Mayano Top Gun",
    "110561" to "[Lucky Tidings] Matikanefukukitaru",
)

private val displayNameToHolder = charaIdToDisplayName.entries.associate { (skillId, displayName) ->
    val skill = skillData2.find { it.id == skillId }
    displayName to (skill?.holder ?: displayName)
}

fun AppState.updateSkillIdSet(virtual: Boolean, action: (Set<String>) -> Set<String>): AppState {
    return if (virtual) {
        copy(virtualSkillIdSet = action(virtualSkillIdSet))
    } else {
        copy(skillIdSet = action(skillIdSet))
    }
}

fun setCharaName(virtual: Boolean, charaName: String) = DirectOperation<AppState> { state ->
    val originalCharaName = displayNameToHolder[charaName] ?: charaName
    val uniqueSkill = charaToUniqueSkill[originalCharaName]
    val deleteSkills = state.hasSkills(virtual).filter {
        it.holder != null || it.name == uniqueSkill?.name
    }.toSet()
    val deleteSkillIds = deleteSkills.map { it.id }.toSet()
    val addSkills = buildSet {
        uniqueSkill?.let { add(it) }
    }
    val addSkillIds = addSkills.map { it.id }.toSet()
    state.updateSkillIdSet(virtual) {
        it - deleteSkillIds + addSkillIds
    }.updateUmaStatus(virtual) {
        it.copy(
            charaName = charaName,
            hasSkills = it.hasSkills - deleteSkills + addSkills,
        )
    }.applyIf(!virtual) {
        copy(contributionTargets = state.contributionTargets - deleteSkillIds)
    }
}

fun setUniqueLevel(virtual: Boolean, uniqueLevel: Int) = DirectOperation<AppState> { state ->
    state.updateUmaStatus(virtual) { it.copy(uniqueLevel = uniqueLevel) }
}

fun toggleSkill(virtual: Boolean, skillData: SkillData) = DirectOperation<AppState> { state ->
    if (state.skillIdSet(virtual).contains(skillData.id)) {
        state.updateSkillIdSet(virtual) {
            it - skillData.id
        }.updateUmaStatus(virtual) {
            it.copy(hasSkills = it.hasSkills - skillData)
        }.applyIf(!virtual) {
            copy(contributionTargets = state.contributionTargets - skillData.id)
        }
    } else {
        val groupSkills = state.hasSkills(virtual).filter { it.group == skillData.group }.toSet()
        val groupSkillIds = groupSkills.map { it.id }.toSet()
        state.updateSkillIdSet(virtual) {
            it + skillData.id - groupSkillIds
        }.updateUmaStatus(virtual) {
            it.copy(hasSkills = it.hasSkills + skillData - groupSkills)
        }.applyIf(!virtual) {
            copy(contributionTargets = state.contributionTargets - groupSkillIds)
        }
    }
}

fun clearSkill(virtual: Boolean) = DirectOperation<AppState> { state ->
    state.updateSkillIdSet(virtual) { emptySet() }.updateUmaStatus(virtual) { it.copy(hasSkills = emptyList()) }
}

fun setSkillCategoryView(categoryView: Boolean) = DirectOperation<AppState> { state ->
    state.copy(skillCategoryView = categoryView)
}

fun setSkillDisplayMinus(categoryView: Boolean) = DirectOperation<AppState> { state ->
    state.copy(skillDisplayMinus = categoryView)
}
