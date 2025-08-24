package io.github.mee1080.umasim.race.data2

import io.github.mee1080.umasim.race.data.*

object EnemyDebuffSkills {
    val skills = listOf(
        SkillData(
            id = "enemy_debuff_001",
            name = "八方にらみ",
            rarity = "rare",
            group = 1,
            type = "debuff",
            description = listOf("phase_random==2: heal -300"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_001",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("phase_random", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -300)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_001_x2",
            name = "八方にらみ #2",
            rarity = "rare",
            group = 11,
            type = "debuff",
            description = listOf("phase_random==2: heal -300 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_001_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("phase_random", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -300)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_002",
            name = "魅惑のささやき",
            rarity = "rare",
            group = 2,
            type = "debuff",
            description = listOf("distance_type==3 & phase==1 & blocked_front_continuetime>=1: heal -300"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_002",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("distance_type", "==", 3),
                            SkillCondition("phase", "==", 1),
                            SkillCondition("blocked_front_continuetime", ">=", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -300)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_002_x2",
            name = "魅惑のささやき #2",
            rarity = "rare",
            group = 12,
            type = "debuff",
            description = listOf("distance_type==3 & phase==1 & blocked_front_continuetime>=1: heal -300 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_002_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("distance_type", "==", 3),
                            SkillCondition("phase", "==", 1),
                            SkillCondition("blocked_front_continuetime", ">=", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -300)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_003",
            name = "逃げけん制",
            rarity = "normal",
            group = 3,
            type = "debuff",
            description = listOf("running_style==1 & phase==1: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_003",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 1),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_003_x2",
            name = "逃げけん制 #2",
            rarity = "normal",
            group = 13,
            type = "debuff",
            description = listOf("running_style==1 & phase==1: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_003_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 1),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_004",
            name = "逃げ焦り",
            rarity = "normal",
            group = 4,
            type = "debuff",
            description = listOf("running_style==1 & phase==2: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_004",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 1),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_004_x2",
            name = "逃げ焦り #2",
            rarity = "normal",
            group = 14,
            type = "debuff",
            description = listOf("running_style==1 & phase==2: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_004_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 1),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_005",
            name = "先行けん制",
            rarity = "normal",
            group = 5,
            type = "debuff",
            description = listOf("running_style==2 & phase==1: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_005",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 2),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_005_x2",
            name = "先行けん制 #2",
            rarity = "normal",
            group = 15,
            type = "debuff",
            description = listOf("running_style==2 & phase==1: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_005_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 2),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_006",
            name = "先行焦り",
            rarity = "normal",
            group = 6,
            type = "debuff",
            description = listOf("running_style==2 & phase==2: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_006",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 2),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_006_x2",
            name = "先行焦り #2",
            rarity = "normal",
            group = 16,
            type = "debuff",
            description = listOf("running_style==2 & phase==2: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_006_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 2),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_007",
            name = "差しけん制",
            rarity = "normal",
            group = 7,
            type = "debuff",
            description = listOf("running_style==3 & phase==1: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_007",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 3),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_007_x2",
            name = "差しけん制 #2",
            rarity = "normal",
            group = 17,
            type = "debuff",
            description = listOf("running_style==3 & phase==1: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_007_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 3),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_008",
            name = "差し焦り",
            rarity = "normal",
            group = 8,
            type = "debuff",
            description = listOf("running_style==3 & phase==2: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_008",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 3),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_008_x2",
            name = "差し焦り #2",
            rarity = "normal",
            group = 18,
            type = "debuff",
            description = listOf("running_style==3 & phase==2: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_008_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 3),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_009",
            name = "追込けん制",
            rarity = "normal",
            group = 9,
            type = "debuff",
            description = listOf("running_style==4 & phase==1: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_009",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 4),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_009_x2",
            name = "追込けん制 #2",
            rarity = "normal",
            group = 19,
            type = "debuff",
            description = listOf("running_style==4 & phase==1: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_009_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 4),
                            SkillCondition("phase", "==", 1)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_010",
            name = "追込焦り",
            rarity = "normal",
            group = 10,
            type = "debuff",
            description = listOf("running_style==4 & phase==2: heal -100"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_010",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 4),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        ),
        SkillData(
            id = "enemy_debuff_010_x2",
            name = "追込焦り #2",
            rarity = "normal",
            group = 20,
            type = "debuff",
            description = listOf("running_style==4 & phase==2: heal -100 (2nd debuffer)"),
            invokes = listOf(
                Invoke(
                    skillId = "enemy_debuff_010_x2",
                    index = 0,
                    conditions = listOf(
                        listOf(
                            SkillCondition("running_style", "==", 4),
                            SkillCondition("phase", "==", 2)
                        )
                    ),
                    effects = listOf(
                        SkillEffect("heal", -100)
                    )
                )
            )
        )
    )
}
