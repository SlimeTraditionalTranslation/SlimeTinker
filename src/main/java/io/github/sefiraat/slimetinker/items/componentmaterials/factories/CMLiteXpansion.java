package io.github.sefiraat.slimetinker.items.componentmaterials.factories;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMForms;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMIdentity;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMToolMakeup;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMTrait;
import io.github.sefiraat.slimetinker.items.componentmaterials.CMTraits;
import io.github.sefiraat.slimetinker.items.componentmaterials.ComponentMaterial;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.TraitEventType;
import io.github.sefiraat.slimetinker.utils.enums.TraitPartType;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SuppressWarnings("SpellCheckingInspection")
@UtilityClass
public final class CMLiteXpansion {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.RUBBER,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.RUBBER, Objects.requireNonNull(SlimefunItem.getByID("RUBBER")).getItem(), SkullTextures.ALLOY_BROWN, "#38414d"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                        null,
                                        null,
                                        null,
                                        null,
                                        Objects.requireNonNull(SlimefunItem.getByID("RUBBER")).getId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.RUBBER,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "絕緣",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(橡膠)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*對閃電免疫.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));

        map.put(IDStrings.REFINED_IRON,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.REFINED_IRON, Objects.requireNonNull(SlimefunItem.getByID("REFINED_IRON")).getItem(), SkullTextures.ALLOY_SILVER, "#ababab"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_REFINED_IRON.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("REFINED_IRON")).getId(),
                                        Materials.BLOCK_CAST_REFINED_IRON.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.REFINED_IRON,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "真的穩定",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(精煉鐵)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*甚麼都沒做. 或許如果你升級了工具等級?.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "禮儀造就人",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(精煉鐵)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*加速I",
                                                ThemeUtils.PASSIVE+"*傷害+50%",
                                                ThemeUtils.PASSIVE+"*你的戰鬥看起來非常酷炫",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.MIXED_METAL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.MIXED_METAL, Objects.requireNonNull(SlimefunItem.getByID("MIXED_METAL_INGOT")).getItem(), SkullTextures.ALLOY_SILVER, "#6e7a66"),
                                Arrays.asList(
                                        map.get(IDStrings.REFINED_IRON).getLiquidItemStack(3),
                                        CMCore.getMap().get(IDStrings.BRONZE).getLiquidItemStack(3),
                                        CMCore.getMap().get(IDStrings.TIN).getLiquidItemStack(3)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_MIXED_METAL.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("MIXED_METAL_INGOT")).getId(),
                                        Materials.BLOCK_CAST_MIXED_METAL.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.MIXED_METAL,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "混合金屬",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(混合金屬)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*擁有其所有成分的效果,",
                                                ThemeUtils.PASSIVE+" 但其力量減半.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "僵硬",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(混合金屬)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*雙倍傷害. 多麼的不幸運!",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.ADVANCED_ALLOY,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.ADVANCED_ALLOY, Objects.requireNonNull(SlimefunItem.getByID("ADVANCED_ALLOY")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#78aba2"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_ADVANCED_ALLOY.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("ADVANCED_ALLOY")).getId(),
                                        Materials.BLOCK_CAST_ADVANCED_ALLOY.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.ADVANCED_ALLOY,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "劈開",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(高級合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*對附近所有實體造成一半的傷害.",
                                                ThemeUtils.PASSIVE+" 劈開傷害並不會觸發工匠的特殊效果.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "重職責",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(高級合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*當耐久度變低時, 它將會從你的",
                                                ThemeUtils.PASSIVE+" 物品欄內吃掉一個鐵錠來回復一些.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.THORIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.THORIUM, Objects.requireNonNull(SlimefunItem.getByID("THORIUM")).getItem(), SkullTextures.ALLOY_GREEN, "#33de4d"),
                                null,
                                new CMToolMakeup(false, false, false),
                                new CMForms(
                                        null,
                                        null,
                                        null,
                                        null,
                                        Objects.requireNonNull(SlimefunItem.getByID("THORIUM")).getId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.THORIUM,
                                        null,
                                        null,
                                        null
                                )
                        ));

        map.put(IDStrings.MAG_THOR,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.MAG_THOR, Objects.requireNonNull(SlimefunItem.getByID("MAG_THOR")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#33de4d"),
                                Arrays.asList(
                                        CMCore.getMap().get(IDStrings.REINFORCED).getLiquidItemStack(1),
                                        map.get(IDStrings.THORIUM).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.MAGNESIUM).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.ZINC).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_MAG_THOR.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("MAG_THOR")).getId(),
                                        Materials.BLOCK_CAST_MAG_THOR.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.MAG_THOR,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "耐熱性",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(釷鎂合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*岩漿不在是你的敵人.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "吸血主義",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(釷鎂合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*有機率會按給予的傷害進行治療.",
                                                ThemeUtils.PASSIVE+" 造成的傷害因時間而異.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.CARBON_MESH,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.CARBON_MESH, Objects.requireNonNull(SlimefunItem.getByID("RAW_CARBON_MESH")).getItem(), SkullTextures.ALLOY_BROWN, "#192927"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                        null,
                                        null,
                                        null,
                                        null,
                                        Objects.requireNonNull(SlimefunItem.getByID("RAW_CARBON_MESH")).getId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.CARBON_MESH,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "敏捷性",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(碳纖維網)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*加速I",
                                                ThemeUtils.PASSIVE+"*受到傷害減少33%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));

        map.put(IDStrings.SCRAP,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SCRAP, Objects.requireNonNull(SlimefunItem.getByID("SCRAP")).getItem(), SkullTextures.ALLOY_BROWN, "#5c451d"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_SCRAP.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("SCRAP")).getId(),
                                        Materials.BLOCK_CAST_SCRAP.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.SCRAP,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "糟糕的",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(廢料)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*耐久度損失 +300%",
                                                ThemeUtils.PASSIVE+"*經驗值收益 0%"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "用腦, 而不是用肌肉",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(廢料)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*工具經驗獲得雙倍化.",
                                                ThemeUtils.PASSIVE+"*造成的傷害減半",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.IRIDIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.IRIDIUM, Objects.requireNonNull(SlimefunItem.getByID("IRIDIUM")).getItem(), SkullTextures.ALLOY_PINK, "#c999c9"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_IRIDIUM.getItemId(),
                                        Objects.requireNonNull(SlimefunItem.getByID("IRIDIUM")).getId(),
                                        Materials.BLOCK_CAST_IRIDIUM.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.IRIDIUM,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "保護性",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(銥)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*使你免於死亡",
                                                ThemeUtils.PASSIVE+" (20分鐘冷卻)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.LITEXPANSION_NOTE,
                                                "扭轉性",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(銥)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*使你的對手轉身.",
                                                ThemeUtils.PASSIVE+" (20秒冷卻)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headCopper);                            // Brains not brawn - Damage             |
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::headCopper);                                 // Brains not brawn - Block Break        | - CO Copper Head
        map.get(IDStrings.ADVANCED_ALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headAdvancedAlloy);           // Cleave
        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headMagThor);                      // Heat Resistance
        map.get(IDStrings.ADVANCED_ALLOY).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::headAdvancedAlloy);                  // Heavy Duty
        map.get(IDStrings.RUBBER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindRubber);                       // Insulated
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodRefinedIron);                 // Manners Maketh Man - Damage
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodRefinedIron);                                   // Manners Maketh Man - Tick
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headMixedMetal);                                   // Mixed Metals
        map.get(IDStrings.CARBON_MESH).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindCarbonMesh);              // Nimble - Player Damage
        map.get(IDStrings.CARBON_MESH).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindCarbonMesh);                                 // Nimble - Tick
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headIridium);                       // Protective
        map.get(IDStrings.REFINED_IRON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headRefinedIron);               // Really Stable
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headBrass);                       // Stiff - Damage                        |
        map.get(IDStrings.MIXED_METAL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::headBrass);                                         // Stiff - Tick                          | - CO Brass Head
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headScrap);                                  // Terrible - Durability
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headScrap);                            // Terrible - Damage
        map.get(IDStrings.SCRAP).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headScrap);                                 // Terrible - Block Break
        map.get(IDStrings.MAG_THOR).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headDamsteel);                       // Vampirism                             | - CO DamSteel Head
        map.get(IDStrings.IRIDIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodIridium);                          // Warp

    }

}
