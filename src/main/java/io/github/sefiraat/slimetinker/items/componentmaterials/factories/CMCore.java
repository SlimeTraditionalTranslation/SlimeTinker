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
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("SpellCheckingInspection")
@UtilityClass
public final class CMCore {

    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.IRON,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.IRON, SlimefunItems.IRON_DUST, SkullTextures.ALLOY_SILVER, "#8c8c8c"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Material.IRON_NUGGET.toString(),
                                    Material.IRON_INGOT.toString(),
                                    Material.IRON_BLOCK.toString(),
                                    Material.IRON_ORE.toString(),
                                    null,
                                    SlimefunItems.IRON_DUST.getItemId(),
                                    Material.IRON_BOOTS.toString(),
                                    Material.IRON_LEGGINGS.toString(),
                                    Material.IRON_CHESTPLATE.toString(),
                                    Material.IRON_HELMET.toString()
                                ),
                                new CMTraits(
                                        IDStrings.IRON,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "穩定",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鐵)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"什麼也沒做！",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "銳利A",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鐵)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*力量I (有銳利A或銳利B即可)",
                                                ThemeUtils.PASSIVE+"*力量II (同時有銳利A和銳利B)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.GOLD,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.GOLD, SlimefunItems.GOLD_DUST, SkullTextures.ALLOY_RED, "#ffe138"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Material.GOLD_NUGGET.toString(),
                                    Material.GOLD_INGOT.toString(),
                                    Material.GOLD_BLOCK.toString(),
                                    Material.GOLD_ORE.toString(),
                                    null,
                                    SlimefunItems.GOLD_DUST.getItemId(),
                                    Material.GOLDEN_BOOTS.toString(),
                                    Material.GOLDEN_LEGGINGS.toString(),
                                    Material.GOLDEN_CHESTPLATE.toString(),
                                    Material.GOLDEN_HELMET.toString()
                                ),
                                new CMTraits(
                                        IDStrings.GOLD,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "隱形A",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*隱形I",
                                                ThemeUtils.PASSIVE+"*造成傷害-100%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "發光",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*發光I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.COPPER,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.COPPER, SlimefunItems.COPPER_DUST, SkullTextures.ALLOY_BROWN, "#c99732"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_COPPER.getItemId(),
                                    SlimefunItems.COPPER_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_COPPER.getItemId(),
                                    null,
                                    null,
                                    SlimefunItems.COPPER_DUST.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.COPPER,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "智力好，體力差",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*熟練經驗+200%",
                                                ThemeUtils.PASSIVE+"*造成傷害-50%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "經驗導流",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*將獲得的熟練經驗，",
                                                ThemeUtils.PASSIVE+" 轉換為玩家經驗",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.LEAD,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.LEAD, SlimefunItems.LEAD_DUST, SkullTextures.ALLOY_PURPLE, "#9043ba"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_LEAD.getItemId(),
                                    SlimefunItems.LEAD_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_LEAD.getItemId(),
                                    null,
                                    null,
                                    SlimefunItems.LEAD_DUST.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.LEAD,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "有毒",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鉛)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*擊中生物時",
                                                ThemeUtils.PASSIVE+" 有25%的機率造成中毒",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "強壯",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鉛)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*飢餓I",
                                                ThemeUtils.PASSIVE+"*生命提升III",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.SILVER,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SILVER, SlimefunItems.SILVER_DUST, SkullTextures.ALLOY_SILVER, "#d4d4d4"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_SILVER.getItemId(),
                                    SlimefunItems.SILVER_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_SILVER.getItemId(),
                                    null,
                                    null,
                                    SlimefunItems.SILVER_DUST.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.SILVER,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "隨機附魔",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(銀)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*在工具或武器升級時，",
                                                ThemeUtils.PASSIVE+" 隨機給予一項附魔，",
                                                ThemeUtils.PASSIVE+" 附魔項目不一定適合工具或武器",
                                                ThemeUtils.PASSIVE+"*熟練經驗-50%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                SlimefunItems.SILVER_INGOT,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "緩降",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(銀)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*緩降III",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.ALUMINUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.ALUMINUM, SlimefunItems.ALUMINUM_DUST, SkullTextures.ALLOY_SILVER, "#b0b0b0"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_ALUMINUM.getItemId(),
                                    SlimefunItems.ALUMINUM_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_ALUMINUM.getItemId(),
                                    null,
                                    null,
                                    SlimefunItems.ALUMINUM_DUST.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.ALUMINUM,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "耐久恢復",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鋁)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*擊中或破壞時，",
                                                ThemeUtils.PASSIVE+" 有機率恢復耐久度",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "柔軟",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鋁)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*耐久消耗+100%",
                                                ThemeUtils.PASSIVE+"*熟練經驗+50%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.TIN,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.TIN, SlimefunItems.TIN_DUST, SkullTextures.ALLOY_BLUE_PALE, "#a89b9b"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_TIN.getItemId(),
                                    SlimefunItems.TIN_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_TIN.getItemId(),
                                    null,
                                    null,
                                    SlimefunItems.TIN_DUST.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.TIN,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "減傷，幸運",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(錫)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*幸運I",
                                                ThemeUtils.PASSIVE+"*造成傷害-50%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "飽食",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(錫)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*飽食I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.ZINC,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.ZINC, SlimefunItems.ZINC_DUST, SkullTextures.ALLOY_SILVER, "#9ba8a6"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_ZINC.getItemId(),
                                    SlimefunItems.ZINC_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_ZINC.getItemId(),
                                    null,
                                    null,
                                    SlimefunItems.ZINC_DUST.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.ZINC,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "海豚悠游",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鋅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*海豚悠游I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "漂浮",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鋅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*漂浮II",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.MAGNESIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.MAGNESIUM, SlimefunItems.MAGNESIUM_DUST, SkullTextures.ALLOY_PINK, "#e8cef5"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_MAGNESIUM.getItemId(),
                                    SlimefunItems.MAGNESIUM_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_MAGNESIUM.getItemId(),
                                    null,
                                    null,
                                    SlimefunItems.MAGNESIUM_DUST.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.MAGNESIUM,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "燃燒",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鎂)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*有(熟練等級x5)%的機率，",
                                                ThemeUtils.PASSIVE+" 讓敵人著火",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "磁鐵(撿起)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鎂)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*從5格範圍內隨機撿起物品",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.COAL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.COAL, new ItemStack(Material.COAL), SkullTextures.ALLOY_BROWN, "#2d2e2d"),
                                null,
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_COAL.getItemId(),
                                    Material.COAL.toString(),
                                    Material.COAL_BLOCK.toString(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                null
                        ));
        map.put(IDStrings.STEEL,
                new ComponentMaterial
                        (
                                new CMIdentity(
                                    IDStrings.STEEL,
                                    SlimefunItems.STEEL_INGOT,
                                    SkullTextures.ALLOY_SILVER,
                                    "#d1d1d1"
                                ),
                                Arrays.asList(
                                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                                        map.get(IDStrings.COAL).getLiquidItemStack(4)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_STEEL.getItemId(),
                                    SlimefunItems.STEEL_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_STEEL.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.STEEL,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "Stainless(不詳)",
                                                "The tool/weapon repels blood."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "Lightweight(不詳)",
                                                "Random items are drawn to you from",
                                                "within a 5 block range"
                                        )
                                )
                        ));
        map.put(IDStrings.DAMSTEEL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.DAMSTEEL, SlimefunItems.DAMASCUS_STEEL_INGOT, SkullTextures.ALLOY_RED, "#a38c8c"),
                                Arrays.asList(
                                        map.get(IDStrings.STEEL).getLiquidItemStack(1),
                                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                                        map.get(IDStrings.COAL).getLiquidItemStack(8)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_DAMASCUS_STEEL.getItemId(),
                                    SlimefunItems.DAMASCUS_STEEL_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_DAMASCUS_STEEL.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.DAMSTEEL,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "吸血鬼",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(大馬士革鋼)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*每次攻擊有機率回復1血量",
                                                ThemeUtils.PASSIVE+"*造成傷害隨當日時間而有差異",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "夜視",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(大馬士革鋼)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*夜視I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.DURALIUM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.DURALIUM, SlimefunItems.DURALUMIN_INGOT, SkullTextures.ALLOY_SILVER, "#a3a089"),
                                Arrays.asList(
                                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2),
                                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_DURALIUM.getItemId(),
                                    SlimefunItems.DURALUMIN_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_DURALIUM.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.DURALIUM,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "耐用",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(硬鋁)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*工具損壞時，依然可以使用，",
                                                ThemeUtils.PASSIVE+" 但造成傷害-50%，",
                                                ThemeUtils.PASSIVE+" 採礦速度減慢，",
                                                ThemeUtils.PASSIVE+" 不會有熟練經驗",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "完整修復",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(硬鋁)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*只需要1個修復零件，",
                                                ThemeUtils.PASSIVE+" 就可完全修復",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.BRONZE,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.BRONZE, SlimefunItems.BRONZE_INGOT, SkullTextures.ALLOY_BROWN, "#877435"),
                                Arrays.asList(
                                        map.get(IDStrings.COPPER).getLiquidItemStack(2),
                                        map.get(IDStrings.TIN).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_BRONZE.getItemId(),
                                    SlimefunItems.BRONZE_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_BRONZE.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.BRONZE,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "抗火",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(青銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*抗火I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "凋零",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(青銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*凋零I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.ALUBRONZE,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.ALUBRONZE, SlimefunItems.ALUMINUM_BRONZE_INGOT, SkullTextures.ALLOY_TAN, "#bdaa6d"),
                                Arrays.asList(
                                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2),
                                        map.get(IDStrings.BRONZE).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_ALU_BRONZE.getItemId(),
                                    SlimefunItems.ALUMINUM_BRONZE_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_ALU_BRONZE.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.ALUBRONZE,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "銳利B",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鋁青銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*力量I (有銳利A或銳利B即可)",
                                                ThemeUtils.PASSIVE+"*力量II (同時有銳利A和銳利B)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "脆弱",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鋁青銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*耐久消耗+100%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.HARD,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.HARD, SlimefunItems.HARDENED_METAL_INGOT, SkullTextures.ALLOY_SILVER, "#29251a"),
                                Arrays.asList(
                                        map.get(IDStrings.ALUBRONZE).getLiquidItemStack(1),
                                        map.get(IDStrings.DURALIUM).getLiquidItemStack(1),
                                        map.get(IDStrings.DAMSTEEL).getLiquidItemStack(1),
                                        map.get(IDStrings.COAL).getLiquidItemStack(32)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_HARD_METAL.getItemId(),
                                    SlimefunItems.HARDENED_METAL_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_HARD_METAL.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.HARD,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "擊退",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(硬化金屬)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*擊退任何擊中的東西",
                                                ThemeUtils.PASSIVE+"*有機率擊暈(不詳)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "槌子A",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(硬化金屬)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*一次挖掘3×3×3的範圍",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.CORBRONZE,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.CORBRONZE, SlimefunItems.CORINTHIAN_BRONZE_INGOT, SkullTextures.ALLOY_BROWN, "#8a6500"),
                                Arrays.asList(
                                    map.get(IDStrings.BRONZE).getLiquidItemStack(1),
                                    map.get(IDStrings.GOLD).getLiquidItemStack(1),
                                    map.get(IDStrings.SILVER).getLiquidItemStack(1),
                                    map.get(IDStrings.COPPER).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_COR_BRONZE.getItemId(),
                                    SlimefunItems.CORINTHIAN_BRONZE_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_COR_BRONZE.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.CORBRONZE,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "自動熔煉",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(柯林斯青銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*挖取石頭時，",
                                                ThemeUtils.PASSIVE+" 掉落燒製後的物品",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "噁心",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(柯林斯青銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*噁心I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.SOLDER,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SOLDER, SlimefunItems.SOLDER_INGOT, SkullTextures.ALLOY_SILVER, "#b7afbd"),
                                Arrays.asList(
                                        map.get(IDStrings.LEAD).getLiquidItemStack(2),
                                        map.get(IDStrings.TIN).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_SOLDER.getItemId(),
                                    SlimefunItems.SOLDER_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_SOLDER.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.SOLDER,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "隱形B",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(焊錫)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*隱形I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "靈魂綁定",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(焊錫)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*玩家死亡時不會掉落此物品",
                                                ThemeUtils.PASSIVE+"*此物品無法丟棄",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.BILLON,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.BILLON, SlimefunItems.BILLON_INGOT, SkullTextures.ALLOY_SILVER, "#b0c2be"),
                                Arrays.asList(
                                        map.get(IDStrings.SILVER).getLiquidItemStack(2),
                                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_BILLON.getItemId(),
                                    SlimefunItems.BILLON_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_BILLON.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.BILLON,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "挖掘加速",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(銀銅合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*挖掘加速I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "跳躍提升",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(銀銅合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*跳躍提升IV",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.BRASS,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.BRASS, SlimefunItems.BRASS_INGOT, SkullTextures.ALLOY_TAN, "#dbcd4b"),
                                Arrays.asList(
                                        map.get(IDStrings.COPPER).getLiquidItemStack(2),
                                        map.get(IDStrings.ZINC).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_BRASS.getItemId(),
                                    SlimefunItems.BRASS_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_BRASS.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.BRASS,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "增傷，霉運",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(黃銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*霉運III",
                                                ThemeUtils.PASSIVE+"*造成傷害+50%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "水下呼吸",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(黃銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*水下呼吸I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.ALUBRASS,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.ALUBRASS, SlimefunItems.ALUMINUM_BRASS_INGOT, SkullTextures.ALLOY_BROWN, "#dbd279"),
                                Arrays.asList(
                                        map.get(IDStrings.BRASS).getLiquidItemStack(1),
                                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_ALU_BRASS.getItemId(),
                                    SlimefunItems.ALUMINUM_BRASS_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_ALU_BRASS.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.ALUBRASS,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "傳送",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鋁黃銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*擊中的生物有？%的機率",
                                                ThemeUtils.PASSIVE+" 會被隨機傳送",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "知識",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鋁黃銅)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*玩家經驗+50%(不詳)",
                                                ThemeUtils.PASSIVE+"*熟練經驗+50%",
                                                ThemeUtils.PASSIVE+"*造成傷害-50%",
                                                ThemeUtils.PASSIVE+"*移動速度減緩(不詳)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.NICKEL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.NICKEL, SlimefunItems.NICKEL_INGOT, SkullTextures.ALLOY_SILVER, "#ebebeb"),
                                Arrays.asList(
                                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_NICKEL.getItemId(),
                                    SlimefunItems.NICKEL_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_NICKEL.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.NICKEL,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "負極前端(-)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鎳)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*攻擊生物時，",
                                                ThemeUtils.PASSIVE+" 有機率熟練經驗+200%",
                                                ThemeUtils.PASSIVE+" (需要正極和負極同時存在)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "負極手柄(-)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鎳)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*攻擊生物時，",
                                                ThemeUtils.PASSIVE+" 有機率熟練經驗+200%",
                                                ThemeUtils.PASSIVE+" (需要正極和負極同時存在)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.COBALT,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.COBALT, SlimefunItems.COBALT_INGOT, SkullTextures.ALLOY_BLUE, "#9e9e9e"),
                                Arrays.asList(
                                        map.get(IDStrings.IRON).getLiquidItemStack(1),
                                        map.get(IDStrings.NICKEL).getLiquidItemStack(1),
                                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_COBALT.getItemId(),
                                    SlimefunItems.COBALT_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_COBALT.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.COBALT,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "正極前端(+)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(鈷)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*攻擊生物時，",
                                                ThemeUtils.PASSIVE+" 有機率熟練經驗+200%",
                                                ThemeUtils.PASSIVE+" (需要正極和負極同時存在)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "正極手柄(+)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(鈷)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*攻擊生物時，",
                                                ThemeUtils.PASSIVE+" 有機率熟練經驗+200%",
                                                ThemeUtils.PASSIVE+" (需要正極和負極同時存在)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.REINFORCED,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.REINFORCED, SlimefunItems.REINFORCED_ALLOY_INGOT, SkullTextures.ALLOY_PURPLE, "#465899"),
                                Arrays.asList(
                                        map.get(IDStrings.DAMSTEEL).getLiquidItemStack(1),
                                        map.get(IDStrings.HARD).getLiquidItemStack(1),
                                        map.get(IDStrings.CORBRONZE).getLiquidItemStack(1),
                                        map.get(IDStrings.SOLDER).getLiquidItemStack(1),
                                        map.get(IDStrings.BILLON).getLiquidItemStack(1),
                                        map.get(IDStrings.GOLD).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_REINFORCED.getItemId(),
                                    SlimefunItems.REINFORCED_ALLOY_INGOT.getItemId(),
                                    Materials.BLOCK_CAST_REINFORCED.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.REINFORCED,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "槌子B",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(強化合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*一次挖掘3×3×3的範圍",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "耐用加倍",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(強化合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*強化黑曜石板的強化效果×2",
                                                ThemeUtils.PASSIVE+"(只需要5個強化黑曜石板，",
                                                ThemeUtils.PASSIVE+"工具或武器就不會消耗耐久度)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.STRING,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.STRING, new ItemStack(Material.STRING), null, "#f5f5f5"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.STRING,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "沒有效果",
                                                "沒有效果"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.VINE,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.VINE, new ItemStack(Material.VINE), null, "#4ca86b"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.VINE,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "自動修復(白天)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(藤蔓)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*在白天時，每隔幾秒，修復1耐久度",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.CRIMSON_ROOTS,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.CRIMSON_ROOTS, new ItemStack(Material.CRIMSON_ROOTS), null, "#b5365e"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.CRIMSON_ROOTS,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "自動修復(夜晚)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(緋紅蕈根)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*在夜晚時，每隔幾秒，修復1耐久度",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.WARPED_ROOTS,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.WARPED_ROOTS, new ItemStack(Material.WARPED_ROOTS), null, "#36b549"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.WARPED_ROOTS,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "緩慢回復",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(扭曲蕈根)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*每隔幾秒，恢復1血量",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.WEEPING_VINES,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.WEEPING_VINES, new ItemStack(Material.WEEPING_VINES), null, "#9c091d"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.WEEPING_VINES,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "不祥之兆",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(垂泣藤)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*不祥之兆I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.TWISTED_VINES,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.TWISTED_VINES, new ItemStack(Material.TWISTING_VINES), null, "#1b8045"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.TWISTED_VINES,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "磁鐵(吸引)",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(扭曲藤)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*吸引5格範圍內的物品，",
                                                ThemeUtils.PASSIVE+" 到玩家身邊",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.SLIME,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SLIME, new ItemStack(Material.SLIME_BALL), SkullTextures.ALLOY_GREEN, "#29e01f"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    Material.SLIME_BLOCK.toString(),
                                    null,
                                    Material.SLIME_BALL.toString(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.SLIME,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "史萊姆",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(史萊姆)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*摔落傷害-50%",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.REDSTONE,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.REDSTONE, new ItemStack(Material.REDSTONE), SkullTextures.ALLOY_RED, "#c4082e"),
                                null,
                                new CMToolMakeup(false, false, false),
                                new CMForms(
                                    null,
                                    null,
                                    Material.REDSTONE_BLOCK.toString(),
                                    Material.REDSTONE_ORE.toString(),
                                    Material.REDSTONE.toString(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.REDSTONE,
                                        null,
                                        null,
                                        null
                                )
                        ));

        map.put(IDStrings.SILICON,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.SILICON, SlimefunItems.SILICON, SkullTextures.ALLOY_SILVER, "#f2f2f2"),
                                null,
                                new CMToolMakeup(false, true, false),
                                new CMForms(
                                        null,
                                        Material.QUARTZ.toString(),
                                        Material.QUARTZ_BLOCK.toString(),
                                        Material.NETHER_QUARTZ_ORE.toString(),
                                        SlimefunItems.SILICON.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.SILICON,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "Slow Learner(不詳)",
                                                "Tool exp gain when breaking blocks is",
                                                "increased by (Tool Level x 5%)"
                                        ),
                                        null
                                )
                        ));
        map.put(IDStrings.FERROSILICON,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.FERROSILICON, SlimefunItems.FERROSILICON, SkullTextures.ALLOY_SILVER, "#f2f2f2"),
                                Arrays.asList(
                                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                                        map.get(IDStrings.SILICON).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, false),
                                new CMForms(
                                        Materials.NUGGET_CAST_FERROSILICON.getItemId(),
                                        SlimefunItems.FERROSILICON.getItemId(),
                                        Materials.BLOCK_CAST_FERROSILICON.getItemId(),
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null,
                                        null
                                ),
                                new CMTraits(
                                        IDStrings.FERROSILICON,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "氫",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(矽鐵)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*受到傷害時，獲得漂浮I",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                                ),
                                        null,
                                        null
                                )
                        ));
        map.put(IDStrings.REDSTONE_ALLOY,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY, SkullTextures.ALLOY_RED, "#700d21"),
                                Arrays.asList(
                                        map.get(IDStrings.REDSTONE).getLiquidItemStack(10),
                                        map.get(IDStrings.FERROSILICON).getLiquidItemStack(1),
                                        map.get(IDStrings.HARD).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(false, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_REDSTONE_ALLOY.getItemId(),
                                    SlimefunItems.REDSTONE_ALLOY.getItemId(),
                                    Materials.BLOCK_CAST_REDSTONE_ALLOY.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.REDSTONE_ALLOY,
                                        null,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.CORE_NOTE,
                                                "閃電",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(紅石合金)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*攻擊時，有機率召喚閃電",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        )
                                )
                        ));
        map.put(IDStrings.DIAMOND,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.DIAMOND, new ItemStack(Material.DIAMOND), SkullTextures.ALLOY_BLUE, "#5fdde8"),
                                null,
                                new CMToolMakeup(false, false, false),
                                new CMForms(
                                    null,
                                    null,
                                    Material.DIAMOND_BLOCK.toString(),
                                    Material.DIAMOND_ORE.toString(),
                                    Material.DIAMOND.toString(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.DIAMOND,
                                        null,
                                        null,
                                        null
                                )
                        ));

        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headAluBrass);          // Abra
        map.get(IDStrings.GOLD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodGold);                                      // All that glitters
        map.get(IDStrings.TWISTED_VINES).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderTwistingVine);               // Attraction
        map.get(IDStrings.COPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headCopper);              // Brains not brawn - Damage
        map.get(IDStrings.COPPER).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headCopper);                   // Brains not brawn - Block Break
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::rodAluBronze);                // Brittle
        map.get(IDStrings.REINFORCED).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::explosive);                 // Bulky (explosive)
        map.get(IDStrings.TIN).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodTin);                                        // Can
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::charged);                 // Charged A (Head)
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::charged);                  // Charged A (Rod)
        map.get(IDStrings.COBALT).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::charged);                 // Charged B (Head)
        map.get(IDStrings.COBALT).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::charged);                  // Charged B (Rod)
                                                                                                                                            // Conductive (Special case - in Experience.java, should be moved out)
        map.get(IDStrings.CRIMSON_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderCrimsonRoot);                // Decay
        map.get(IDStrings.WEEPING_VINES).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderWeepingVine);                // Doom
                                                                                                                                            // Durable - Damage (Special Case - in EntityDamageListener.java - cant move)
                                                                                                                                            // Durable - Block Break (Special Case - in BlockBreakListener.java - cant move)
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headDuralium);                            // Durable - Tick
                                                                                                                                            // Easy Fix (Special case - in RepairBench.java. Will have to stay there)
                                                                                                                                            // Enchanting (Special case - in Experience.java - could be moved if I raise an event)
        map.get(IDStrings.BILLON).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headBillon);                                // Fast
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headMagnesium);        // Flammable
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headCorbronze);             // Flaming Hot
                                                                                                                                            // Fused (Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        map.get(IDStrings.GOLD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headGold);                  // Golden Veil - Damage
        map.get(IDStrings.GOLD).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headGold);                                    // Golden Veil - Tick
        map.get(IDStrings.ZINC).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headZinc);                                    // Graceful
        map.get(IDStrings.VINE).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderVine);                                // Growth
        map.get(IDStrings.HARD).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::explosive);                        // Heavy (explosive)
        map.get(IDStrings.SOLDER).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headSolder);                    // Hidden - Durability
        map.get(IDStrings.SOLDER).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headSolder);                                // Hidden - Tick
        map.get(IDStrings.FERROSILICON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.HEAD, PlayerDamagedEvents::headFerrosilicon); // Hydrogen
        map.get(IDStrings.BRONZE).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodBronze);                                  // Ingheights
        map.get(IDStrings.LEAD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodLead);                                      // Leech
        map.get(IDStrings.REDSTONE_ALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodRedstoneAlloy); // Lightning Rod
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodMagnesium);                            // Magnetisium
        map.get(IDStrings.TIN).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headTin);                    // Malleable - Damage
        map.get(IDStrings.TIN).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headTin);                                      // Malleable - Tick
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodDamsteel);                              // Night Stalker
        map.get(IDStrings.BRASS).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodBrass);                                    // Oxygenated
        map.get(IDStrings.LEAD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headLead);                  // Poisonous
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headAluminum);                // Recycleable
        map.get(IDStrings.WARPED_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindWarpedRoot);                    // Refreshing
                                                                                                                                            // Reinforced (Special Case - nested within plate mod. Will be moved when mods are changed so consumers)
        map.get(IDStrings.BRONZE).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headBronze);                                // Resistant
        map.get(IDStrings.IRON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodIron);                                      // Sharp I
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headAlubronze);                          // Sharp II
        map.get(IDStrings.SILICON).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.BINDER, BlockBreakEvents::bindSilicon);               // Slow Learner
        map.get(IDStrings.SLIME).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindSlime);             // Slimey
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::rodAluminum);                  // Soft - Durability
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodAluminum);            // Soft - Damage
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::rodAluminum);                 // Soft - Block Break
        map.get(IDStrings.SILVER).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSilver);                                  // Soft Touch
        map.get(IDStrings.BILLON).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodBillon);                                  // Springs
                                                                                                                                            // Stability (Special Case, doesn't do anything, just here for consistency)
        map.get(IDStrings.STEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headSteel);                // Stainless
        map.get(IDStrings.BRASS).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headBrass);                // Stiff - Damage
        map.get(IDStrings.BRASS).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headBrass);                                  // Stiff - Tick
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodAlubrass);            // Studious - Damage
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.ROD, BlockBreakEvents::rodAluBrass);                 // Studious - Block Break
        map.get(IDStrings.ZINC).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodZinc);                                      // Super Light Weight
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodCorbronze);                            // Too Hot to Handle
        map.get(IDStrings.HARD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headHard);                   // Tuff Stuff
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headDamsteel);          // Vampirism
                                                                                                                                            // Works (Special Case, doesn't do anything, just here for consistency)
    }


}
