package io.github.mee1080.umasim.compose.pages.race

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.github.mee1080.umasim.compose.common.atoms.LabeledCheckbox
import io.github.mee1080.umasim.compose.common.atoms.MyButton
import io.github.mee1080.umasim.compose.common.atoms.SelectBox
import io.github.mee1080.umasim.compose.common.parts.HideBlock
import io.github.mee1080.umasim.compose.common.parts.NumberInput
import io.github.mee1080.umasim.compose.common.parts.WithTooltip
import io.github.mee1080.umasim.race.calc2.NOT_SELECTED
import io.github.mee1080.umasim.race.calc2.RaceSetting
import io.github.mee1080.umasim.race.data2.SkillData
import io.github.mee1080.umasim.race.data2.skillData2
import io.github.mee1080.umasim.store.AppState
import io.github.mee1080.umasim.store.framework.OperationDispatcher
import io.github.mee1080.umasim.store.operation.*
import io.github.mee1080.utility.applyIf
import io.github.mee1080.umasim.compose.translation.LanguageManager


@Composable
fun SkillInput(virtual: Boolean, state: AppState, dispatch: OperationDispatcher<AppState>) {
    val hasSkills by derivedStateOf { state.hasSkills(virtual) }
    HideBlock(
        header = { Text(LanguageManager.getText("スキル")) },
        initialOpen = true,
        headerClosed = {
            Text("${LanguageManager.getText("スキル")}：${hasSkills.joinToString(", ") { LanguageManager.getTextSync(it.name) }}")
        },
    ) {
        SkillSetting(virtual, state, dispatch)
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun SkillSetting(virtual: Boolean, state: AppState, dispatch: OperationDispatcher<AppState>) {
    val skillIdSet by derivedStateOf { state.skillIdSet(virtual) }
    val chara by derivedStateOf { state.chara(virtual) }
    val setting by derivedStateOf { state.setting }
    var filter by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        MyButton({ dispatch(clearSkill(virtual)) }) { Text(LanguageManager.getText("すべてのスキルを削除")) }
        UniqueSkillSetting(virtual, chara.charaName, chara.uniqueLevel, skillIdSet, dispatch)
        SkillFilter(filter) { filter = it }
        FlowRow(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            LabeledCheckbox(state.skillCategoryView, { dispatch(setSkillCategoryView(it)) }) {
                Text(LanguageManager.getText("カテゴリ表示"))
            }
            LabeledCheckbox(
                selected = state.skillDisplayMinus,
                onCheckedChange = { dispatch(setSkillDisplayMinus(it)) },
                enabled = !state.skillCategoryView,
            ) {
                Text(LanguageManager.getText("マイナススキル表示"))
            }
        }
        if (filter.isNotEmpty()) {
            val skills = notUniqueSkills.filter { LanguageManager.getTextSync(it.name).contains(filter, ignoreCase = true) }
            SkillFlowRow(virtual, "", skills, skillIdSet, dispatch)
        } else if (!state.skillCategoryView) {
            val skills = notUniqueSkills.filterBySetting(virtual, setting, skillIdSet)
                .applyIf(!state.skillDisplayMinus) { filter { it.rarity != "minus" } }
            SkillFlowRow(virtual, "", skills, skillIdSet, dispatch)
        } else {
            val passiveSkills = groupedSkills["passive"]
            if (passiveSkills != null) {
                TypeSkillSetting(virtual, LanguageManager.getText("パッシブ"), passiveSkills, skillIdSet, setting, dispatch)
            }
            val healSkills = groupedSkills["heal"]
            if (healSkills != null) {
                TypeSkillSetting(virtual, LanguageManager.getText("回復"), healSkills, skillIdSet, setting, dispatch)
            }
            val speedSkills = groupedSkills["speed"]
            if (speedSkills != null) {
                TypeSkillSetting(virtual, LanguageManager.getText("速度"), speedSkills, skillIdSet, setting, dispatch)
            }
            val accelerationSkills = groupedSkills["acceleration"]
            if (accelerationSkills != null) {
                TypeSkillSetting(virtual, LanguageManager.getText("加速"), accelerationSkills, skillIdSet, setting, dispatch)
            }
            val multiSkill = groupedSkills["multi"]
            if (multiSkill != null) {
                TypeSkillSetting(virtual, LanguageManager.getText("複合"), multiSkill, skillIdSet, setting, dispatch)
            }
            val gateSkills = groupedSkills["other"]
            if (gateSkills != null) {
                TypeSkillSetting(virtual, LanguageManager.getText("その他"), gateSkills, skillIdSet, setting, dispatch)
            }
            val debuffSkills = groupedSkills["debuff"]
            if (debuffSkills != null) {
                TypeSkillSetting(virtual, LanguageManager.getText("デバフスキル"), debuffSkills, skillIdSet, setting, dispatch)
            }
        }
    }
}

@Composable
private fun SkillFilter(
    value: String,
    onChange: (String) -> Unit,
) {
    var inputValue by remember { mutableStateOf(value) }
    LaunchedEffect(value) {
        inputValue = value
    }
    FlowRow(
        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text("${LanguageManager.getText("フィルタ")}：")
        OutlinedTextField(
            value = inputValue,
            onValueChange = { inputValue = it },
            modifier = Modifier.width(256.dp),
        )
        MyButton({ onChange(inputValue) }) {
            Text(LanguageManager.getText("反映"))
        }
        if (value.isNotEmpty()) {
            MyButton({ onChange("") }) {
                Text(LanguageManager.getText("クリア"))
            }
        }
    }
}

val rarityColors = mapOf(
    "evo" to Color(255, 242, 249),
    "scenario" to Color(255, 242, 249),
    "rare" to Color(255, 255, 242),
    "minus" to Color(244, 239, 255),
)

@Composable
private fun SkillChip(virtual: Boolean, skill: SkillData, selected: Boolean, dispatch: OperationDispatcher<AppState>) {
    WithTooltip(
        tooltip = {
            Column {
                skill.messages.forEach { Text(LanguageManager.getText(it)) }
            }
        },
    ) {
        val containerColor = rarityColors.getOrElse(skill.rarity) { Color.Transparent }
        val colors = FilterChipDefaults.filterChipColors(
            containerColor = containerColor,
            selectedContainerColor = containerColor,
        )
        val border = FilterChipDefaults.filterChipBorder(
            enabled = true,
            selected = selected,
            selectedBorderColor = Color.Red,
            selectedBorderWidth = 2.dp,
        )
        FilterChip(
            selected = selected,
            onClick = { dispatch(toggleSkill(virtual, skill)) },
            label = { Text(LanguageManager.getText(skill.name)) },
            leadingIcon = { if (selected) Icon(Icons.Default.Check, "Selected") },
            colors = colors,
            border = border,
        )
    }
}

// Auto-generated character mapping from umas.json
private val charaIdToDisplayName = mapOf(
    "100011" to "[Special Dreamer] Special Week",
    "100021" to "[Innocent Silence] Silence Suzuka",
    "100031" to "[Peak Joy] Tokai Teio",
    "100041" to "[Formula R] Maruzensky",
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
    "100301" to "[Rosy Dreams] Rice Shower",
    "100321" to "[tach-nology] Agnes Tachyon",
    "100351" to "[Get to Winning!] Winning Ticket",
    "100381" to "[Fille Éclair] Curren Chan",
    "100411" to "[Blossom in Learning] Sakura Bakushin O",
    "100451" to "[Murmuring Stream] Super Creek",
    "100461" to "[LOVE☆4EVER] Smart Falcon",
    "100501" to "[Nevertheless] Narita Taishin",
    "100521" to "[Bestest Prize ♪] Haru Urara",
    "100561" to "[Rising☆Fortune] Matikanefukukitaru",
    "100601" to "[Poinsettia Ribbon] Nice Nature",
    "100611" to "[King of Emeralds] King Halo",
    "110031" to "[Beyond the Horizon] Tokai Teio",
    "110111" to "[Saintly Jade Cleric] Grass Wonder",
    "110131" to "[End of the Skies] Mejiro McQueen",
    "110141" to "[Kukulkan Warrior] El Condor Pasa",
    "110181" to "[Quercus Civilis] Air Groove",
    "110241" to "[Sunlight Bouquet] Mayano Top Gun",
)

private val displayNameToHolder = charaIdToDisplayName.entries.associate { (skillId, displayName) ->
    val skill = skillData2.find { it.id == skillId }
    displayName to (skill?.holder ?: displayName)
}

private val charaList =
    listOf(NOT_SELECTED) + skillData2
        .filter { it.holder != null && it.rarity == "unique" }
        .mapNotNull { skill ->
            charaIdToDisplayName[skill.id]
        }
        .distinct()
        .sortedBy { it.substring(it.indexOf(']')) }

private val notUniqueSkills = skillData2
    .filter { it.rarity !in listOf("unique", "evo") }

private val groupedSkills = notUniqueSkills
    .groupBy { it.type }
    .mapValues { skillsByType ->
        skillsByType.value.groupBy { it.rarity }.mapValues { skills ->
            skills.value.sortedBy { it.id }
        }
    }

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun UniqueSkillSetting(
    virtual: Boolean,
    charaName: String,
    uniqueLevel: Int,
    skillIdSet: Set<String>,
    dispatch: OperationDispatcher<AppState>,
) {
    HideBlock(
        header = { Text(LanguageManager.getText("固有/進化")) },
        initialOpen = true,
        headerBackground = MaterialTheme.colorScheme.tertiaryContainer,
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            SelectBox(
                charaList, charaName,
                onSelect = { dispatch(setCharaName(virtual, it)) },
                modifier = Modifier.fillMaxWidth(),
                label = { Text(LanguageManager.getText("キャラ")) },
            )
            if (charaName != NOT_SELECTED) {
                val originalCharaName = displayNameToHolder[charaName] ?: charaName
                val uniqueSkill = charaToUniqueSkill[originalCharaName]
                if (uniqueSkill != null) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        val selected = skillIdSet.contains(uniqueSkill.id)
                        SkillChip(virtual, uniqueSkill, selected, dispatch)
                        NumberInput(
                            uniqueLevel,
                            { dispatch(setUniqueLevel(virtual, it)) },
                            min = 1,
                            max = 6,
                            enabled = selected
                        )
                    }
                }
                val evoSkills = charaToEvoSkills[originalCharaName]
                if (evoSkills?.isNotEmpty() == true) {
                    FlowRow(
                        verticalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterVertically),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        evoSkills.forEach { skill ->
                            SkillChip(virtual, skill, skillIdSet.contains(skill.id), dispatch)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun TypeSkillSetting(
    virtual: Boolean,
    title: String,
    skills: Map<String, List<SkillData>>,
    skillIdSet: Set<String>,
    setting: RaceSetting,
    dispatch: OperationDispatcher<AppState>
) {
    HideBlock(
        header = { Text(title) },
        headerBackground = MaterialTheme.colorScheme.tertiaryContainer,
        headerClosed = {
            val hasSkills = skills.values.flatten().filter { skillIdSet.contains(it.id) }
            Text("$title：${hasSkills.joinToString(", ") { LanguageManager.getTextSync(it.name) }}")
        }
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            val inheritSkills = skills["inherit"]?.filterBySetting(virtual, setting, skillIdSet)
            if (!inheritSkills.isNullOrEmpty()) {
                SkillFlowRow(virtual, LanguageManager.getText("継承"), inheritSkills, skillIdSet, dispatch)
            }
            val scenarioSkills = skills["scenario"]?.filterBySetting(virtual, setting, skillIdSet)
            if (!scenarioSkills.isNullOrEmpty()) {
                SkillFlowRow(virtual, LanguageManager.getText("シナリオ進化"), scenarioSkills, skillIdSet, dispatch)
            }
            val rareSkills = skills["rare"]?.filterBySetting(virtual, setting, skillIdSet)
            if (!rareSkills.isNullOrEmpty()) {
                SkillFlowRow(virtual, LanguageManager.getText("レア"), rareSkills, skillIdSet, dispatch)
            }
            val normalSkills = skills["normal"]?.filterBySetting(virtual, setting, skillIdSet)
            if (!normalSkills.isNullOrEmpty()) {
                SkillFlowRow(virtual, LanguageManager.getText("通常"), normalSkills, skillIdSet, dispatch)
            }
            val specialSkills = skills["special"]?.filterBySetting(virtual, setting, skillIdSet)
            if (!specialSkills.isNullOrEmpty()) {
                SkillFlowRow(virtual, LanguageManager.getText("特殊"), specialSkills, skillIdSet, dispatch)
            }
            val minusSkills = skills["minus"]?.filterBySetting(virtual, setting, skillIdSet)
            if (!minusSkills.isNullOrEmpty()) {
                SkillFlowRow(virtual, LanguageManager.getText("マイナス"), minusSkills, skillIdSet, dispatch)
            }
        }
    }
}

@Composable
private fun List<SkillData>.filterBySetting(
    virtual: Boolean,
    setting: RaceSetting,
    skillIdSet: Set<String>,
): List<SkillData> {
    val style by derivedStateOf { if (virtual) setting.virtualLeader.basicRunningStyle else setting.basicRunningStyle }
    val track by derivedStateOf { setting.trackDetail }
    return filter { skill ->
        skillIdSet.contains(skill.id) || skill.invokes.any {
            it.targetRunningStyle.emptyOrContains(style.value)
                    && it.targetRotation.emptyOrContains(track.turn)
                    && it.targetGroundType.emptyOrContains(track.surface)
                    && it.targetDistanceType.emptyOrContains(track.distanceType)
                    && it.targetTrackId.emptyOrContains(track.raceTrackId)
                    && it.targetBasisDistance.emptyOrContains(track.isBasisDistance)
                    && it.targetCornerCount.emptyOrContains(track.corners.size)
        }
    }
}

private fun Set<Int>.emptyOrContains(value: Int) = isEmpty() || contains(value)

@Composable
private fun SkillFlowRow(
    virtual: Boolean,
    title: String,
    skills: List<SkillData>,
    skillIdSet: Set<String>,
    dispatch: OperationDispatcher<AppState>,
) {
    if (title.isNotEmpty()) {
        Text(title, style = MaterialTheme.typography.headlineSmall)
    }
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        skills.forEach { skill ->
            SkillChip(virtual, skill, skillIdSet.contains(skill.id), dispatch)
        }
    }
}