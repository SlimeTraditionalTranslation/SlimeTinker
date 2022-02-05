package io.github.sefiraat.slimetinker.items.componentmaterials.cmfactories;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.RightClickEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.events.friend.TraitEventType;
import io.github.sefiraat.slimetinker.events.friend.TraitPartType;
import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.componentmaterials.ComponentMaterial;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMForms;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMIdentity;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMToolMakeup;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMTrait;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMTraits;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
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
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "什麼也沒做！"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "鋒利的 I",
                            "增加傷害，與模組和其他屬性疊加。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "堅定不移",
                            "33%的機率忽略爆炸。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "生鏽的",
                            "護甲耐久度損失+10%。",
                            "玩家經驗增加+10%。"
                        ))
                ));
        map.put(IDStrings.GOLD,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.GOLD, SlimefunItems.GOLD_DUST, SkullTextures.ALLOY_RED, "#ffe138"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "金色面紗",
                            "使玩家隱形。",
                            "如果用在武器上，-100%傷害。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "所有的閃光",
                            "讓你們都閃閃發光......"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "繁榮",
                            "擊中時有1%機率掉落金錠。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "物物交換",
                            "豬布林喜歡你的盔甲。"
                        ))
                ));
        map.put(IDStrings.COPPER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.COPPER, SlimefunItems.COPPER_DUST, SkullTextures.ALLOY_BROWN, "#c99732"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "大腦，而不是肌肉",
                            "工具經驗增益加倍。",
                            "造成的傷害減半。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "導電的",
                            "所有工具經驗都轉換為玩家經驗。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "初學者",
                            "受到的傷害+25%。",
                            "護甲經驗+20%。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "玷污",
                            "輸出傷害降低25%。",
                            "護甲經驗+20%。",
                            "註：玷(ㄉ一ㄢˋ)。"
                        ))
                ));
        map.put(IDStrings.LEAD,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.LEAD, SlimefunItems.LEAD_DUST, SkullTextures.ALLOY_PURPLE, "#9043ba"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "擊中時有25%的機率使目標中毒。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "水蛭",
                            "提供額外的生命值，但會消耗飽食度。",
                            "註：蛭(ㄓˋ)。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "病態的",
                            "用鉛製作裝備不是個好主意。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "病態的",
                            "用鉛製作裝備不是個好主意。"
                        ))
                ));
        map.put(IDStrings.SILVER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SILVER, SlimefunItems.SILVER_DUST, SkullTextures.ALLOY_SILVER, "#d4d4d4"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "附魔",
                            "工具經驗增益減半。",
                            "工具在升級時會隨機增加一個附魔。",
                            "可能與工具類型相符，也可能不相符。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "觸感柔軟",
                            "你感覺更輕了。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "導電度",
                            "對閃電免疫，甚至將其反射回來！"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "附魔",
                            "每次這件盔甲升級時，都會獲得一個隨機附魔。",
                            "可能沒用。"
                        ))
                ));
        map.put(IDStrings.ALUMINUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ALUMINUM, SlimefunItems.ALUMINUM_DUST, SkullTextures.ALLOY_SILVER, "#b0b0b0"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "可回收",
                            "擊中/格擋破壞時有機會恢復耐久度。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "柔軟的",
                            "耐久損失+100%。",
                            "工具經驗+50%。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "挫敗",
                            "受到的傷害+50%。",
                            "速度+1。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "易於成型",
                            "維修只需要一個維修包。"
                        ))
                ));
        map.put(IDStrings.TIN,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.TIN, SlimefunItems.TIN_DUST, SkullTextures.ALLOY_BLUE_PALE, "#a89b9b"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "可塑的",
                            "造成的傷害減少50%，但會獲得好運。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "能",
                            "你的飢餓感就會消失。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "非腐蝕性",
                            "免疫中毒。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "鼓舞",
                            "受到重傷時獲得吸收。"
                        ))
                ));
        map.put(IDStrings.ZINC,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ZINC, SlimefunItems.ZINC_DUST, SkullTextures.ALLOY_SILVER, "#9ba8a6"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "優美",
                            "海豚的力量，啟動！"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "超輕量級",
                            "不偷偷摸摸的時候讓你比空氣還輕。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "鬼鬼祟祟的",
                            "目標背對時傷害翻倍。",
                            "小公差。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "針刺",
                            "不受仙人掌刺傷。"
                        ))
                ));
        map.put(IDStrings.MAGNESIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.MAGNESIUM, SlimefunItems.MAGNESIUM_DUST, SkullTextures.ALLOY_PINK, "#e8cef5"),
                    null,
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "易燃的",
                            "有（工具等級x5）%的機率點燃你的敵人。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "鎂",
                            "從5個方塊的範圍內隨機吸取物品。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "光",
                            "造成的傷害-25%。",
                            "速度+1。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "MagneSight™",
                            "獲得夜視。",
                            "註：MagneSight 已窮盡搜尋能力，仍然不知道是什麼。"
                        ))
                ));
        map.put(IDStrings.COAL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.COAL, new ItemStack(Material.COAL), SkullTextures.ALLOY_BROWN, "#2d2e2d"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
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
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "防鏽的",
                            "工具/武器排斥血液。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "輕的",
                            "工具經驗+50%。",
                            "速度+1。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "強壯的",
                            "爆炸造成的傷害降低25%"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "強健的",
                            "血量提升+1"
                        ))
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
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "造成傷害時，有機會回復血量。",
                            "造成的傷害因一天中的時間而異。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "夜行者",
                            "提供夜視。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "複利",
                            "獲得額外生命值，每個複合件都相等。 Gain extra health equal for each compounding",
                            "數量堆疊在它自己的收益上。piece. Amount stacks on it's own gain"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "反向荊棘 Snroht",
                            "荊棘傷害被忽略並反射回來。Thorns damage is ignored and relfected back"
                        ))
                ));
        map.put(IDStrings.DURALIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.DURALIUM, SlimefunItems.DURALUMIN_INGOT, SkullTextures.ALLOY_SILVER, "#a3a089"),
                    Arrays.asList(
                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "耐用的",
                            "忽略被破壞，但損壞50%，採礦速度會變慢，0exp。Ignores being broken but damage 50%,",
                            "mining will be slower and 0 exp."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "輕鬆修復",
                            "完全修復只需要1個修復包。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "耐用的Durable",
                            "破損時有效，但受到的傷害 +20%Works when broken but damage taken +20%"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "減震器Shock Absorbant",
                            "10% 機率忽略傷害。 不添加10% chance to ignore damage. Not additive"
                        ))
                ));
        map.put(IDStrings.BRONZE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BRONZE, SlimefunItems.BRONZE_INGOT, SkullTextures.ALLOY_BROWN, "#877435"),
                    Arrays.asList(
                        map.get(IDStrings.COPPER).getLiquidItemStack(2),
                        map.get(IDStrings.TIN).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "反抗Resistance",
                            "手持時給予抗火性。Gives fire resistance while held."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "高度Ingheights",
                            "這個工具有問題。Something is wrong with this tool."
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "農民Farmer",
                            "所有作物掉落1個額外物品。不受財運影響。All crop drops 1 extra item. Not effected by fortune.",
                            "不與自身疊加，但與其他效果疊加。Does not stack with itself but does with other effects."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "易碎的",
                            "耐久損失加倍。"
                        ))
                ));
        map.put(IDStrings.ALUBRONZE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ALUBRONZE, SlimefunItems.ALUMINUM_BRONZE_INGOT, SkullTextures.ALLOY_TAN, "#bdaa6d"),
                    Arrays.asList(
                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2),
                        map.get(IDStrings.BRONZE).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "鋒利的 II",
                            "增加傷害，與模組和其他屬性疊加。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "易碎的",
                            "耐久損失加倍。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "美麗的Beautiful",
                            "走路時有機會種花。Chance to grow flowers as you walk."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "噴射！Eject!",
                            "如果在低於 1/2 生命值時損壞 - 彈出！If damaged when below 1/2 health - Eject!"
                        ))
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
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "凝灰岩的東西Tuff Stuff",
                            "擊退任何被擊中的東西，並有機會擊暈。Knocks back anything hit with a chance",
                            "to stun."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "錘子",
                            "挖掘3x3範圍。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "使堅韌Toughened",
                            "不會失去耐久度。Will not lose durability."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "矮人技能Dwarven Skills",
                            "採礦時有機會找到稀有文物。Chance to find rare artifacts while mining."
                        ))
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
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "熾熱Flaming Hot",
                            "在可能的情況下熔煉破碎的方塊。Smelts broken blocks when possible."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "太熱而無法處理Too Hot to Handle",
                            "?"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "超熱Superhot",
                            "有機會點燃附近的實體Chance to set nearby entities on fire"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "熱血的Warm Blodded",
                            "下界熾熱時速度 + 2。Speed + 2 when hot in the nether.",
                            "最終寒冷時減速 + 1。Slow + 1 when cold in the end"
                        ))
                ));
        map.put(IDStrings.SOLDER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SOLDER, SlimefunItems.SOLDER_INGOT, SkullTextures.ALLOY_SILVER, "#b7afbd"),
                    Arrays.asList(
                        map.get(IDStrings.LEAD).getLiquidItemStack(2),
                        map.get(IDStrings.TIN).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "隱Hidden",
                            "授予隱身，立即中斷。Grants invisibility, breaks instantly."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "融合Fused",
                            "玩家或死亡時都不能掉落工具。Tool cannot be dropped either by the",
                            "player or on death."
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "輕柔的著陸",
                            "不會有墜落傷害。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "保險",
                            "不會在死亡時掉落，也不能故意丟棄。"
                        ))
                ));
        map.put(IDStrings.BILLON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BILLON, SlimefunItems.BILLON_INGOT, SkullTextures.ALLOY_SILVER, "#b0c2be"),
                    Arrays.asList(
                        map.get(IDStrings.SILVER).getLiquidItemStack(2),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "迅速的",
                            "移動速度和挖掘速度增加。Move speed increased and haste applied.",
                            "可以與模組疊加。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "彈簧",
                            "讓你跳得更高。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "WHM",
                            "你的攻擊會治療而不是傷害。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "熱導體",
                            "岩漿塊不再對你造成傷害。"
                        ))
                ));
        map.put(IDStrings.BRASS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BRASS, SlimefunItems.BRASS_INGOT, SkullTextures.ALLOY_TAN, "#dbcd4b"),
                    Arrays.asList(
                        map.get(IDStrings.COPPER).getLiquidItemStack(2),
                        map.get(IDStrings.ZINC).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "艱難的",
                            "傷害+50%，但會讓你不幸。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "充氧的",
                            "手持時給予水中呼吸。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "Band",
                            "耐久度損失+200%。",
                            "隨著耐久度的下降，傷害降低1-25%。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "Scarpaaarr!",
                            "耐久度損失翻倍。",
                            "當傷害低於1/2生命值時，獲得速度3。"
                        ))
                ));
        map.put(IDStrings.ALUBRASS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.ALUBRASS, SlimefunItems.ALUMINUM_BRASS_INGOT, SkullTextures.ALLOY_BROWN, "#dbd279"),
                    Arrays.asList(
                        map.get(IDStrings.BRASS).getLiquidItemStack(1),
                        map.get(IDStrings.ALUMINUM).getLiquidItemStack(2)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "Abra",
                            "任何命中的生物都有%的機率被隨機傳送。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "好學",
                            "工具和玩家經驗+50%，",
                            "但傷害減半，且你的行動更慢。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "魔術師",
                            "魔法傷害-50%"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "逃脫",
                            "Randomly teleport then hit (冷卻10秒)。"
                        ))
                ));
        map.put(IDStrings.NICKEL,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.NICKEL, SlimefunItems.NICKEL_INGOT, SkullTextures.ALLOY_SILVER, "#ebebeb"),
                    Arrays.asList(
                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                        map.get(IDStrings.COPPER).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "充電棒-",
                            "什麼都不做……自己做……"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "充電棒-",
                            "什麼都不做……自己做……"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "Magnetic -",
                            "Gain 1 Stack of Magnetism and 1 Stack of Negativity.",
                            "Magnetism draws in all nearby items.",
                            "Range = Magnetism Level - (∆ Positivity/Negativity)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "Magnetic -",
                            "Gain 1 Stack of Magnetism and 1 Stack of Negativity.",
                            "Magnetism draws in all nearby items.",
                            "Range = Magnetism Level - (∆ Positivity/Negativity)"
                        ))
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
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "充電棒+",
                            "什麼都不做……自己做……"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "充電棒+",
                            "什麼都不做……自己做……"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "Magnetic +",
                            "Gain 1 Stack of Magnetism and 1 Stack of Negativity.",
                            "Magnetism draws in all nearby items.",
                            "Range = Magnetism Level - (∆ Positivity/Negativity)"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "Magnetic +",
                            "Gain 1 Stack of Magnetism and 1 Stack of Positivity.",
                            "Magnetism draws in all nearby items.",
                            "Range = Magnetism Level - (∆ Positivity/Negativity)"
                        ))
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
                    new CMToolMakeup(true, false, true, true, false, true),
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
                            "笨重的",
                            "挖掘3x3區域內的方塊"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_ROD,
                            SupportedPluginsManager.CORE_NOTE,
                            "Reinforced",
                            "該工具上的任何 Plate mod 都會計算兩次。Any Plate mod on the tool is counted twice."
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "Reinforced",
                            "板模型計算兩次。Plate mods count twice."
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "防凋零",
                            "免疫凋零效果。"
                        ))
                ));
        map.put(IDStrings.STRING,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.STRING, new ItemStack(Material.STRING), null, "#f5f5f5"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                            "工作",
                            "無特殊效果。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "工作",
                            "沒有特殊效果，但可以快速製造盔甲。"
                        ),
                        null)
                ));
        map.put(IDStrings.VINE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.VINE, new ItemStack(Material.VINE), null, "#4ca86b"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                            "生長",
                            "白天慢慢修工具。",
                            "可以與模組疊加。",
                            "必須拿在手上"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "生長",
                            "白天慢慢修復。"
                        ),
                        null)
                ));
        map.put(IDStrings.CRIMSON_ROOTS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.CRIMSON_ROOTS, new ItemStack(Material.CRIMSON_ROOTS), null, "#b5365e"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                            "衰變",
                            "晚上慢慢修工具。",
                            "可以與模組疊加。",
                            "必須拿在手上"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "衰變",
                            "晚上慢慢修復。"
                        ),
                        null)
                ));
        map.put(IDStrings.WARPED_ROOTS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.WARPED_ROOTS, new ItemStack(Material.WARPED_ROOTS), null, "#36b549"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                            "清爽",
                            "慢慢治愈擁有者。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "清爽",
                            "慢慢治療有穿裝備的玩家。"
                        ),
                        null)
                ));
        map.put(IDStrings.WEEPING_VINES,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.WEEPING_VINES, new ItemStack(Material.WEEPING_VINES), null, "#9c091d"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                            "末日",
                            "從這件事上我有一種不好的感覺......"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "厄運",
                            "給你帶來不祥之兆。",
                            "隱藏你的村民！"
                        ),
                        null)
                ));
        map.put(IDStrings.TWISTED_VINES,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.TWISTED_VINES, new ItemStack(Material.TWISTING_VINES), null, "#1b8045"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                            "吸引力",
                            "在5格範圍內，所有掉落物都會吸引到你身上。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "吸引力",
                            "附近的掉落物（5x5區域）將被你吸引。"
                        ),
                        null)
                ));
        map.put(IDStrings.SLIME,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SLIME, new ItemStack(Material.SLIME_BALL), SkullTextures.ALLOY_GREEN, "#29e01f"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                            "有彈性的",
                            "墜落傷害減半。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "有彈性的",
                            "墜落傷害-25%。"
                        ),
                        null)
                ));
        map.put(IDStrings.REDSTONE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.REDSTONE, new ItemStack(Material.REDSTONE), SkullTextures.ALLOY_RED, "#c4082e"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
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
                        null,
                        null,
                        null,
                        null)
                ));

        map.put(IDStrings.SILICON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SILICON, SlimefunItems.SILICON, SkullTextures.ALLOY_SILVER, "#f2f2f2"),
                    null,
                    new CMToolMakeup(false, true, false, true, true, false),
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
                            "慢學",
                            "破壞方塊時，",
                            "獲得工具經驗增加（工具等級x5%）。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "慢學",
                            "護甲經驗增益=（等級×5%）。"
                        ),
                        null)
                ));

        map.put(IDStrings.LEATHER,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.LEATHER, new ItemStack(Material.LEATHER), null, "#918056"),
                    null,
                    new CMToolMakeup(false, true, false, false, true, false),
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
                        IDStrings.LEATHER,
                        null,
                        new CMTrait(
                            CMTraits.PROP_BINDING,
                            SupportedPluginsManager.CORE_NOTE,
                            "厚的",
                            "工具經驗增益+50%。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_GAMBESON,
                            SupportedPluginsManager.CORE_NOTE,
                            "厚的",
                            "護甲經驗增益+10%。"
                        ),
                        null)
                ));

        map.put(IDStrings.FERROSILICON,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.FERROSILICON, SlimefunItems.FERROSILICON, SkullTextures.ALLOY_SILVER, "#f2f2f2"),
                    Arrays.asList(
                        map.get(IDStrings.IRON).getLiquidItemStack(2),
                        map.get(IDStrings.SILICON).getLiquidItemStack(1)
                    ),
                    new CMToolMakeup(true, false, false, true, false, true),
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
                            "飄離危險。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "太陽能",
                            "白天時，恢復耐久度。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "Brightburn",
                            "Gives on stack of Burning Bright! With 4 ",
                            "stacks, hostile mobs are repelled (not bosses).",
                            "註：Brightburn 是一部2019年美國超級英雄科幻恐怖片。"
                        ))
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
                    new CMToolMakeup(false, false, true, true, false, true),
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
                            "避雷針",
                            "有機會用閃電擊中擊中的生物。"
                        ),
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "開機",
                            "隨機為5x2x5範圍內的方塊提供紅石訊號。"
                        ),
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "誰需要壓力板？",
                            "你站立的方塊會有紅石訊號。"
                        ))
                ));
        map.put(IDStrings.DIAMOND,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.DIAMOND, new ItemStack(Material.DIAMOND), SkullTextures.ALLOY_BLUE, "#5fdde8"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
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
                        null,
                        null,
                        null,
                        null)
                ));
        map.put(IDStrings.BOOMERITE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.BOOMERITE, Materials.INGOT_CAST_BOOMERITE, SkullTextures.ALLOY_PURPLE, "#d94c00"),
                    Arrays.asList(
                        map.get(IDStrings.REINFORCED).getLiquidItemStack(1),
                        map.get(IDStrings.CORBRONZE).getLiquidItemStack(1),
                        map.get(IDStrings.HARD).getLiquidItemStack(1),
                        map.get(IDStrings.COPPER).getLiquidItemStack(5)
                    ),
                    new CMToolMakeup(true, false, false, true, false, false),
                    new CMForms(
                        Materials.NUGGET_CAST_BOOMERITE.getItemId(),
                        Materials.INGOT_CAST_BOOMERITE.getItemId(),
                        Materials.BLOCK_CAST_BOOMERITE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.BOOMERITE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "Ladder Simulator™",
                            "右鍵單擊生成梯子。",
                            "註：Ladder Simulator 是一款適用於Android操作系統的模擬器，具有模擬真實PLC的I/O端口的輸入和輸出對象。"
                        ),
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_PLATES,
                            SupportedPluginsManager.CORE_NOTE,
                            "Go Boomer",
                            "警告......事情會變得繁榮......",
                            "註：boomer 戰後嬰兒潮（指1945至1965年間英國和美國）。"
                        ),
                        null,
                        null)
                ));
        map.put(IDStrings.SEFIRITE,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.SEFIRITE, Materials.INGOT_CAST_SEFIRITE, SkullTextures.ALLOY_GREEN, "#9beb34"),
                    null,
                    new CMToolMakeup(true, false, false, false, false, false),
                    new CMForms(
                        Materials.NUGGET_CAST_SEFIRITE.getItemId(),
                        Materials.INGOT_CAST_SEFIRITE.getItemId(),
                        Materials.BLOCK_CAST_SEFIRITE.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.SEFIRITE,
                        new CMTrait(
                            CMTraits.PROP_HEAD,
                            SupportedPluginsManager.CORE_NOTE,
                            "慶祝",
                            "是時候慶祝了！"
                        ),
                        null,
                        null,
                        null,
                        null,
                        null)
                ));
        map.put(IDStrings.LIQUID_CHRISTMAS,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.LIQUID_CHRISTMAS, SlimefunItems.CHRISTMAS_PRESENT, SkullTextures.ALLOY_GREEN, "#00cc36"),
                    null,
                    new CMToolMakeup(false, false, false, false, false, false),
                    new CMForms(
                        null,
                        SlimefunItems.CHRISTMAS_PRESENT.getItemId(),
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
                        IDStrings.LIQUID_CHRISTMAS,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null)
                ));
        map.put(IDStrings.CRINGLEIUM,
            new ComponentMaterial
                (
                    new CMIdentity(IDStrings.CRINGLEIUM, Materials.INGOT_CAST_SEFIRITE, SkullTextures.ALLOY_GREEN, "#00cc36"),
                    Arrays.asList(
                        map.get(IDStrings.REINFORCED).getLiquidItemStack(2),
                        map.get(IDStrings.LIQUID_CHRISTMAS).getLiquidItemStack(3),
                        map.get(IDStrings.MAGNESIUM).getLiquidItemStack(2)
                    ),
                    new CMToolMakeup(false, false, false, false, false, true),
                    new CMForms(
                        Materials.NUGGET_CAST_CRINGLEIUM.getItemId(),
                        Materials.INGOT_CAST_CRINGLEIUM.getItemId(),
                        Materials.BLOCK_CAST_CRINGLEIUM.getItemId(),
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null
                    ),
                    new CMTraits(
                        IDStrings.CRINGLEIUM,
                        null,
                        null,
                        null,
                        null,
                        null,
                        new CMTrait(
                            CMTraits.PROP_LINKS,
                            SupportedPluginsManager.CORE_NOTE,
                            "感覺節日",
                            "感受節日的氣氛！"
                        ))
                ));

        setupToolConsumers();
        setupArmourConsumers();

    }

    public static void setupToolConsumers() {

        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headAluBrass);          // Abra
        map.get(IDStrings.GOLD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodGold);                                      // All that glitters
        map.get(IDStrings.TWISTED_VINES).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderTwistingVine);               // Attraction
        map.get(IDStrings.COPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headCopper);              // Brains not brawn - Damage
        map.get(IDStrings.COPPER).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headCopper);                   // Brains not brawn - Block Break
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.DURABILITY, TraitPartType.ROD, DurabilityEvents::rodAluBronze);                // Brittle
        map.get(IDStrings.REINFORCED).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::explosive);                 // Bulky (explosive)
        map.get(IDStrings.TIN).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodTin);                                        // Can
        map.get(IDStrings.SEFIRITE).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.HEAD, RightClickEvents::headSefirite);               // Celebrate
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::charged);                 // Charged A (Head)
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::charged);                  // Charged A (Rod)
        map.get(IDStrings.COBALT).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::charged);                 // Charged B (Head)
        map.get(IDStrings.COBALT).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::charged);                  // Charged B (Rod)
        // Conductive (Special case - in Experience.java, should be moved out)
        map.get(IDStrings.CRIMSON_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderCrimsonRoot);                // Decay
        map.get(IDStrings.WEEPING_VINES).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::binderWeepingVine);                // Doom
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headDuralium);          // Durable - Entity Damage - Damage Reduction + No Exp
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.HEAD, BlockBreakEvents::headDuralium);               // Durable - Block Break -  No Exp
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
        map.get(IDStrings.BOOMERITE).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.HEAD, RightClickEvents::headBoomerite);             // Ladder Simulator™
        map.get(IDStrings.LEAD).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodLead);                                      // Leech
        map.get(IDStrings.REDSTONE_ALLOY).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodRedstoneAlloy); // Lightning Rod
        map.get(IDStrings.STEEL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodSteel);                                    // Lightweight
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodMagnesium);                            // Magnetisium
        map.get(IDStrings.TIN).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headTin);                    // Malleable - Damage
        map.get(IDStrings.TIN).addEvent(TraitEventType.TICK, TraitPartType.HEAD, TickEvents::headTin);                                      // Malleable - Tick
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodDamsteel);                              // Night Stalker
        map.get(IDStrings.BRASS).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodBrass);                                    // Oxygenated
        map.get(IDStrings.LEAD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headLead);                  // Poisonous
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.DURABILITY, TraitPartType.HEAD, DurabilityEvents::headAluminum);                // Recycleable
        map.get(IDStrings.WARPED_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.BINDER, TickEvents::bindWarpedRoot);                    // Refreshing
        // Reinforced (Special Case - nested within plate mod. Will be moved when mods are changed to consumers)
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
        map.get(IDStrings.LEATHER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.BINDER, EntityDamageEvents::binderLeather);        // Thick - Exp Entity Damage
        map.get(IDStrings.LEATHER).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.BINDER, BlockBreakEvents::binderLeather);             // Thick - Exp Block Break
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodCorbronze);                            // Too Hot to Handle
        map.get(IDStrings.HARD).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::headHard);                   // Tuff Stuff
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headDamsteel);          // Vampirism
        // Works (Special Case, doesn't do anything, just here for consistency)
    }

    public static void setupArmourConsumers() {

        map.get(IDStrings.ZINC).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksZinc);               // Acupuncture
        map.get(IDStrings.TWISTED_VINES).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonTwistingWines);          // Attraction
        map.get(IDStrings.BRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateBrass);             // Band
        map.get(IDStrings.BRASS).addEvent(TraitEventType.DURABILITY, TraitPartType.PLATE, DurabilityEvents::plateBrass);                    // Band
        map.get(IDStrings.GOLD).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksGold);                                  // Barter
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateAluBronze);                        // Beautiful
        map.get(IDStrings.COPPER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateCopper);           // Beginner - Damage mod
        map.get(IDStrings.COPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateCopper);            // Beginner - EXP Gain
        map.get(IDStrings.TIN).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksTin);                 // Boost
        map.get(IDStrings.SLIME).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.GAMBESON, PlayerDamagedEvents::gambesonSlime);       // Bouncy
        map.get(IDStrings.FERROSILICON).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::brightBurn);                         // Brightburn
        map.get(IDStrings.BRASS).addEvent(TraitEventType.DURABILITY, TraitPartType.LINKS, DurabilityEvents::linksBrass);                    // Brittle
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateDamSteel);                          // Compounding
        map.get(IDStrings.SILVER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSilver);           // Conductive
        map.get(IDStrings.CRIMSON_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonCrimsonRoots);           // Decay
        map.get(IDStrings.WEEPING_VINES).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonWeepingVines);           // Doom
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateDuralium);       // Durable (Working trait is done via ItemUtils#doesNotUnequip(ItemStack)
        map.get(IDStrings.HARD).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.LINKS, BlockBreakEvents::linksHardened);                 // Dwarven Skills
        // Easily Shaped (In RepairBench)
        map.get(IDStrings.ALUBRONZE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksAluBronze);     // Eject!
        // Enchanting (Experience)
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksAluBrass);       // Escape
        map.get(IDStrings.BRONZE).addEvent(TraitEventType.BLOCK_BREAK, TraitPartType.PLATE, BlockBreakEvents::plateBronze);                 // Farmer
        map.get(IDStrings.CRINGLEIUM).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksCringleium);                      // Feeling Festive
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateAluminum);       // Foil 50% damage
        map.get(IDStrings.ALUMINUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateAluminum);                          // Foil +1 speed
        // Fused
        map.get(IDStrings.BOOMERITE).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateBoomerite);                        // Go Boomer
        map.get(IDStrings.VINE).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonVine);                            // Growth
        map.get(IDStrings.STEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSteel);             // Hardy
        map.get(IDStrings.BILLON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksBillon);           // Heat Conductor
        map.get(IDStrings.BRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksBrass);             // Help
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateMagnesium);      // Light - Player Damage
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateMagnesium);                        // Light - Speed
        map.get(IDStrings.MAGNESIUM).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksMagnesium);                        // Magnesight
        map.get(IDStrings.COBALT).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateCobalt);                              // Magnetic -
        map.get(IDStrings.COBALT).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksCobalt);                              // Magnetic -
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateNickel);                              // Magnetic +
        map.get(IDStrings.NICKEL).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksNickel);                              // Magnetic +
        map.get(IDStrings.ALUBRASS).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateAluBrass);       // Magus
        map.get(IDStrings.TIN).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateTin);                 // Non-corrosive
        map.get(IDStrings.REDSTONE_ALLOY).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateRedstoneAlloy);               // Powered On
        map.get(IDStrings.GOLD).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateGold);               // Prosperous
        map.get(IDStrings.WARPED_ROOTS).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonWarpedRoots);             // Refreshing
        // Reinforcable (Special Case - nested within plate mod. Will be moved when mods are changed to consumers)
        map.get(IDStrings.IRON).addEvent(TraitEventType.TICK, TraitPartType.LINKS, EntityDamageEvents::linksIron);                          // Rusty
        map.get(IDStrings.DURALIUM).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksDuralium);       // Shock Absorbant
        map.get(IDStrings.LEAD).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateLead);                                  // Sickly (plate)
        map.get(IDStrings.LEAD).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksLead);                                  // Sickly (links)
        map.get(IDStrings.SILICON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.GAMBESON, EntityDamageEvents::gambesonSilicon);    // Slow Learner
        map.get(IDStrings.ZINC).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateZinc);                // Sneaky
        map.get(IDStrings.DAMSTEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksDamSteel);       // Snroht
        map.get(IDStrings.SOLDER).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateSolder);           // Soft Landing
        map.get(IDStrings.FERROSILICON).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateFerrosilicon);                  // Solar Powered
        map.get(IDStrings.IRON).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateIron);               // Steadfast
        map.get(IDStrings.STEEL).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksSteel);                                // Strong
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateCorBronze);                        // SuperHot
        map.get(IDStrings.COPPER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.LINKS, EntityDamageEvents::linksCopper);            // Tarnished
        map.get(IDStrings.LEATHER).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.GAMBESON, EntityDamageEvents::gambesonLeather);    // Thick Hide
        map.get(IDStrings.HARD).addEvent(TraitEventType.DURABILITY, TraitPartType.PLATE, DurabilityEvents::plateHardened);                  // Toughened
        map.get(IDStrings.CORBRONZE).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksCorBronze);                        // Warm Blooded
        map.get(IDStrings.BILLON).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.PLATE, EntityDamageEvents::plateBillon);            // WHM
        map.get(IDStrings.REDSTONE_ALLOY).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksRedstoneAlloy);               // Who needs pressure plates
        map.get(IDStrings.REINFORCED).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::linksReinforced);   // Witherproof
        // Works
    }

}
