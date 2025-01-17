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
public final class CMSlimefunWarfare {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.SEGGANESSON,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SEGGANESSON, Objects.requireNonNull(SlimefunItem.getByID("SEGGANESSON")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#4bacbf"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                        "SEGGANESSON",
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.SEGGANESSON,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "過度充能",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(Segganesson)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*每次攻擊怪物時儲存能量.",
                                                ThemeUtils.PASSIVE+" 在第十次攻擊將會釋出電力.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "盲目速度",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(Segganesson)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*獲得瘋狂的速度,",
                                                ThemeUtils.PASSIVE+" 但會有副作用",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.SLIMESTEEL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SLIMESTEEL, Objects.requireNonNull(SlimefunItem.getByID("SLIMESTEEL_INGOT")).getItem(), SkullTextures.ALLOY_GREEN, "#aed197"),
                                Arrays.asList(
                                        CMCore.getMap().get(IDStrings.STEEL).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.SLIME).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                        Materials.NUGGET_CAST_SLIMESTEEL.getItemId(),
                                    "SLIMESTEEL_INGOT",
                                    Materials.BLOCK_CAST_SLIMESTEEL.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.SLIMESTEEL,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "彈性 II",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(黏液鋼錠)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*摔落傷害會隨著跳躍提升而減少",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));

        map.put(IDStrings.REINFORCED_SLIMESTEEL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.REINFORCED_SLIMESTEEL, Objects.requireNonNull(SlimefunItem.getByID("REINFORCED_SLIMESTEEL_INGOT")).getItem(), SkullTextures.ALLOY_GREEN, "#aed197"),
                                Arrays.asList(
                                        map.get(IDStrings.SLIMESTEEL).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.SLIME).getLiquidItemStack(9),
                                        CMCore.getMap().get(IDStrings.DAMSTEEL).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.HARD).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.CORBRONZE).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.ALUBRONZE).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_REINFORCED_SLIMESTEEL.getItemId(),
                                    "REINFORCED_SLIMESTEEL_INGOT",
                                    Materials.BLOCK_CAST_REINFORCED_SLIMESTEEL.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.REINFORCED_SLIMESTEEL,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "強力黏液",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(強化黏液鋼錠)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*當背包有空間時,",
                                                ThemeUtils.PASSIVE+" 掉落的方塊將直接被黏入物品欄.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "靈活性",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(強化黏液鋼錠)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*當背包有空間時,",
                                                ThemeUtils.PASSIVE+" 受到傷害減少, 但會消耗工具耐久度.",
                                                ThemeUtils.PASSIVE+" 工具在壞掉時不起作用.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.OSMIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.OSMIUM, Objects.requireNonNull(SlimefunItem.getByID("OSMIUM_INGOT")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#8dd6c0"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_OSMIUM.getItemId(),
                                    "OSMIUM_INGOT",
                                    Materials.BLOCK_CAST_OSMIUM.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.OSMIUM,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "重量",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鋨)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*一次挖3x3的大小",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "重型鞍座",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鋨)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*被擊中的怪物速度減慢並無法傳送.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.OSMIUM_SUPERALLOY,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.OSMIUM_SUPERALLOY, Objects.requireNonNull(SlimefunItem.getByID("OSMIUM_SUPERALLOY")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#8dd6c0"),
                                Arrays.asList(
                                        map.get(IDStrings.OSMIUM).getLiquidItemStack(2),
                                        map.get(IDStrings.SEGGANESSON).getLiquidItemStack(1),
                                        map.get(IDStrings.REINFORCED_SLIMESTEEL).getLiquidItemStack(1),
                                        CMCore.getMap().get(IDStrings.REINFORCED).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                        Materials.NUGGET_CAST_OSMIUM_SUPER_ALLOY.getItemId(),
                                    "OSMIUM_SUPERALLOY",
                                    Materials.BLOCK_CAST_OSMIUM_SUPER_ALLOY.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.OSMIUM_SUPERALLOY,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "蠻力",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鋨超級合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*降低揮動速度, 被擊中的敵人會短暫暈眩.",
                                                ThemeUtils.PASSIVE+"*造成傷害+100%",
                                                ThemeUtils.PASSIVE+"*額外33%機率在造成爆擊+100%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "堅固物",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鋨超級合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*降低揮動速度, 被擊中的敵人會短暫暈眩.",
                                                ThemeUtils.PASSIVE+" 擊退並暈眩任何被擊中的生物.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));

        map.put(IDStrings.UNPATENTABLIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.UNPATENTABLIUM, Objects.requireNonNull(SlimefunItem.getByID("UNPATENTABLIUM")).getItem(), SkullTextures.ALLOY_BLUE_PALE, "#8dd6c0"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_UNPATENTABILUM.getItemId(),
                                    "UNPATENTABLIUM",
                                    Materials.BLOCK_CAST_UNPATENTABILUM.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.OSMIUM_SUPERALLOY,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "改革",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(非專利能量元素)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*+100% 在白天獲得的工具與玩家經驗值.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE,
                                                "無形的權利",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(非專利能量元素)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*工具無法在死亡時遺失或被丟掉."
                                        )
                                )
                        ));

        map.get(IDStrings.SEGGANESSON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSegganesson);                                        // Blinding Speed
        map.get(IDStrings.SLIMESTEEL).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindSlimesteel);                                      // Bouncy II - Tick
        map.get(IDStrings.SLIMESTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindSlimesteel);                   // Bouncy II - Damage
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headOsmiumSuperalloy);          // Brute - Damage
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headOsmiumSuperalloy);                            // Brute - Tick
        map.get(IDStrings.REINFORCED_SLIMESTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.ROD, PlayerDamagedEvents::headReinforcedSlimesteel);  // Flexibility
        map.get(IDStrings.OSMIUM).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::explosive);                                     // Heavy (CO)
        map.get(IDStrings.OSMIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodOsmium);                                // Heavy Pommel
                                                                                                                                                            // Incorporeal Right (Special case in ItemDrop and PlayerDesth)
        map.get(IDStrings.UNPATENTABLIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headUnpatentabilum);              // Innovation - Damage
        map.get(IDStrings.UNPATENTABLIUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headUnpatentabilum);                   // Innovation - Block Break
        map.get(IDStrings.SEGGANESSON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSegganesson);                    // Overcharge
        map.get(IDStrings.REINFORCED_SLIMESTEEL).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headReinforcedSlimesteel);       // Strong and Sticky
        map.get(IDStrings.OSMIUM_SUPERALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headHard);                       // Tuff Stuff (CO)


    }

}
