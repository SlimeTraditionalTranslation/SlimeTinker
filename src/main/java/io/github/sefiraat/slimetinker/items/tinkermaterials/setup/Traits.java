package io.github.sefiraat.slimetinker.items.tinkermaterials.setup;

import io.github.sefiraat.slimetinker.events.BlockBreakEvents;
import io.github.sefiraat.slimetinker.events.DurabilityEvents;
import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.InteractionEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.events.friend.TraitEventType;
import io.github.sefiraat.slimetinker.items.tinkermaterials.elements.MaterialTrait;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;


public final class Traits {

    private Traits() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // region Core

    public static final MaterialTrait CORE_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Stability")
        .setSpTraitName("續航力")
        .setLore(
            "就...沒什麼!"
        );

    public static final MaterialTrait CORE_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sharp 1")
        .setSpTraitName("鋒利 1")
        .setLore(
            "增加傷害，可疊加"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodIron);

    public static final MaterialTrait CORE_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Steadfast")
        .setSpTraitName("堅定不移")
        .setLore(
            "33% 機率免疫爆炸傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIron);

    public static final MaterialTrait CORE_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Rusty")
        .setSpTraitName("腐蝕")
        .setLore(
            "護甲耐久度損失+10%",
            "玩家經驗增加+10%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksIron);

    public static final MaterialTrait CORE_GOLD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Golden Veil")
        .setSpTraitName("金色面紗")
        .setLore(
            "使玩家隱形獲得隱身效果",
            "應用在武器身上時:攻擊傷害-100%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headGold)
        .addConsumer(TraitEventType.TICK, TickEvents::headGold);

    public static final MaterialTrait CORE_GOLD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("All that Glitters")
        .setSpTraitName("閃閃發光")
        .setLore(
            "讓你全身閃亮亮...",
            "獲得發光效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodGold);

    public static final MaterialTrait CORE_GOLD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Prosperous")
        .setSpTraitName("繁榮")
        .setLore(
            "受到傷害時有1%機率獲得到金粒"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateGold);

    public static final MaterialTrait CORE_GOLD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Barter")
        .setSpTraitName("以物換物")
        .setLore(
            "豬布林喜翻你的護甲",
            "(周圍5格內的豬布靈不會攻擊你)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGold);

    public static final MaterialTrait CORE_COPPER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Brains, Not Brawn")
        .setSpTraitName("智力")
        .setLore(
            "工具經驗獲取+100%",
            "攻擊傷害-50%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait CORE_COPPER_ROD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Conductive")
        .setSpTraitName("經驗轉換")
        .setLore(
            "所有工具經驗轉換為玩家經驗."
        );

    public static final MaterialTrait CORE_COPPER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Beginner")
        .setSpTraitName("初學者")
        .setLore(
            "受到的傷害+25%",
            "護甲經驗獲得+20%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateCopper);

    public static final MaterialTrait CORE_COPPER_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tarnished")
        .setSpTraitName("玷污")
        .setLore(
            "傷害降低-25%",
            "護甲經驗獲取+20%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait CORE_LEAD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Poisonous")
        .setSpTraitName("劇毒")
        .setLore(
            "擊中時有25%機率使毒中毒."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headLead);

    public static final MaterialTrait CORE_LEAD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Leech")
        .setSpTraitName("水蛭")
        .setLore(
            "額外的健康，但會消耗你的能量."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodLead);

    public static final MaterialTrait CORE_LEAD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sickly")
        .setSpTraitName("生病了")
        .setLore(
            "鉛甲不是個好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateLead);

    public static final MaterialTrait CORE_LEAD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sickly")
        .setSpTraitName("生病了")
        .setLore(
            "鉛甲不是個好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLead);

    public static final MaterialTrait CORE_SILVER_HEAD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Enchanting")
        .setSpTraitName("附魔")
        .setLore(
            "工具經驗增益減半",
            "工具升級時獲得隨機附魔",
            "附魔可能不是用於該物品"
        );

    public static final MaterialTrait CORE_SILVER_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Soft Touch")
        .setSpTraitName("觸感柔軟")
        .setLore(
            "你感覺更輕了",
            "(獲得緩降III效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSilver);

    public static final MaterialTrait CORE_SILVER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Conductivity")
        .setSpTraitName("導電")
        .setLore(
            "免疫閃電傷害",
            "被閃電擊中時在周圍召喚閃電"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSilver);

    public static final MaterialTrait CORE_SILVER_LINKS = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Enchanting")
        .setSpTraitName("附魔")
        .setLore(
            "每次升級時獲得一個隨機附魔",
            "附魔可能不適用於該物品"
        );

    public static final MaterialTrait CORE_ALUMINUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Recyclable")
        .setSpTraitName("再生")
        .setLore(
            "擊中/格擋破壞時有機會恢復耐久度"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headAluminum);

    public static final MaterialTrait CORE_ALUMINUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Soft")
        .setSpTraitName("柔軟")
        .setLore(
            "耐久損失+100%",
            "工具經驗+50%"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluminum);

    public static final MaterialTrait CORE_ALUMINUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Foil")
        .setSpTraitName("緊酸")
        .setLore(
            "受到的傷害+50%",
            "速度+1"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluminum)
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluminum);

    public static final MaterialTrait CORE_ALUMINUM_LINKS = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Easily Shaped")
        .setSpTraitName("快速維修")
        .setLore(
            "維修只需要一個零件"
        );

    public static final MaterialTrait CORE_TIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Malleable")
        .setSpTraitName("幸運")
        .setLore(
            "攻擊的傷害減少-50%",
            "獲得幸運效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headTin);

    public static final MaterialTrait CORE_TIN_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Can")
        .setSpTraitName("隨身罐頭")
        .setLore(
            "你的飢餓感就會消失",
            "(獲得飽和效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodTin);

    public static final MaterialTrait CORE_TIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Non-Corrosive")
        .setSpTraitName("抗毒")
        .setLore(
            "免疫中毒效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateTin);

    public static final MaterialTrait CORE_TIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Boost")
        .setSpTraitName("承傷")
        .setLore(
            "受到重傷時獲得吸收"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTin);

    public static final MaterialTrait CORE_ZINC_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Graceful")
        .setSpTraitName("海豚之力")
        .setLore(
            "激活海豚的力量!",
            "(获得海豚的恩惠效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headZinc);

    public static final MaterialTrait CORE_ZINC_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Super Lightweight")
        .setSpTraitName("漂浮")
        .setLore(
            "不蹲下的時候讓你變得比空氣還輕.",
            "(獲得飄浮II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodZinc);

    public static final MaterialTrait CORE_ZINC_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sneaky")
        .setSpTraitName("偷襲")
        .setLore(
            "當目標看向別處時,",
            "對其造成的傷害翻倍"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateZinc);
    public static final MaterialTrait CORE_ZINC_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Acupuncture")
        .setSpTraitName("針刺療法")
        .setLore(
            "不被仙人掌刺傷"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksZinc);

    public static final MaterialTrait CORE_MAGNESIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Flammable")
        .setSpTraitName("鳳凰之力")
        .setLore(
            "有(工具等級x5)%機率",
            "點燃你的敵人."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Magnetesium")
        .setSpTraitName("磁鐵")
        .setLore(
            "隨機撿起範圍5格內的物品"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Light")
        .setSpTraitName("快溜")
        .setLore(
            "造成的傷害-25%",
            "速度 + 1"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagnesium)
        .addConsumer(TraitEventType.TICK, TickEvents::plateMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("MagneSight™")
        .setSpTraitName("夜視™") //缺失
        .setLore(
            "獲得夜視效果."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksMagnesium);

    public static final MaterialTrait CORE_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Stainless")
        .setSpTraitName("不銹鋼")
        .setLore(
            "可排斥血液."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSteel);

    public static final MaterialTrait CORE_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Lightweight")
        .setSpTraitName("輕量")
        .setLore(
            "工具經驗+50%",
            "速度+1"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSteel);

    public static final MaterialTrait CORE_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hardy")
        .setSpTraitName("堅硬")
        .setLore(
            "爆炸造成的傷害降低-25%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSteel);

    public static final MaterialTrait CORE_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Strong")
        .setSpTraitName("強壯")
        .setLore(
            "生命提升+1"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Vampirism")
        .setSpTraitName("吸血鬼")
        .setLore(
            "攻擊傷害有機會治愈自己.",
            "造成的傷害因一天中的時間而異."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nightstalker")
        .setSpTraitName("夜行者")
        .setLore(
            "可以在黑暗中看的更清晰.",
            "獲得夜視效果."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Compounding")
        .setSpTraitName("複利")
        .setLore(
            "獲得生命提升效果",
            "等級取決於含有復用特性護甲數量"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDamSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Snroht")
        .setSpTraitName("荆棘")
        .setLore(
            "荊棘損傷被忽視並反彈"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDamSteel);

    public static final MaterialTrait CORE_DURALUMIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Durable")
        .setSpTraitName("耐用挖掘")
        .setLore(
            "物品損壞時仍然可使用,但:-50%傷害",
            "獲得挖掘疲勞效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDuralium)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headDuralium)
        .addConsumer(TraitEventType.TICK, TickEvents::headDuralium);

    public static final MaterialTrait CORE_DURALUMIN_ROD = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Easy Fix")
        .setSpTraitName("輕鬆修復")
        .setLore(
            "只需 1 個修復工具即可完全修復."
        );

    public static final MaterialTrait CORE_DURALUMIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Durable")
        .setSpTraitName("耐用")
        .setLore(
            "物品損壞時仍然可使用，但承受傷害+20%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateDuralium);

    public static final MaterialTrait CORE_DURALUMIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Shock Absorbant")
        .setSpTraitName("減震器")
        .setLore(
            "10% 機率忽略傷害。不添加"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDuralium);

    public static final MaterialTrait CORE_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Resistance")
        .setSpTraitName("防火")
        .setLore(
            "獲得防火效果."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBronze);

    public static final MaterialTrait CORE_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ingheights")
        .setSpTraitName("不對ㄟ")
        .setLore(
            "這個工具怪怪的OAO。"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBronze);

    public static final MaterialTrait CORE_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Farmer")
        .setSpTraitName("農民")
        .setLore(
            "收穫農作物時額外增加1個掉落物",
            "該效果不會受幸運的影響",
            "該效果不能疊加,但可被其他效果影響"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::plateBronze);

    public static final MaterialTrait CORE_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Brittle")
        .setSpTraitName("易碎")
        .setLore(
            "耐久損失翻倍."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Sharp 2")
        .setSpTraitName("鋒利 2")
        .setLore(
            "獲得力量效果，可疊加"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headAlubronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Brittle")
        .setSpTraitName("易碎")
        .setLore(
            "+100% 耐久消耗."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Beautiful")
        .setSpTraitName("花兒")
        .setLore(
            "走路時有機會讓路旁的土地開花."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Eject!")
        .setSpTraitName("彈出！")
        .setLore(
            "如果在低於 1/2 生命值時發動",
            "會彈射起飛!",
            "(獲得飄浮III效果)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBronze);

    public static final MaterialTrait CORE_HARDENED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Tuff Stuff")
        .setSpTraitName("擊退")
        .setLore(
            "擊退任何擊中的東西",
            "有機率囚禁目標."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait CORE_HARDENED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Heavy")
        .setSpTraitName("笨重")
        .setLore(
            "3x3 區域內的礦井."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_HARDENED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Toughened")
        .setSpTraitName("增韌")
        .setLore(
            "不會失去耐久度."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateHardened);

    public static final MaterialTrait CORE_HARDENED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Dwarven Skills")
        .setSpTraitName("矮人技能")
        .setLore(
            "採礦時有機會找到稀有文物."
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Flaming Hot")
        .setSpTraitName("熾熱")
        .setLore(
            "盡可能熔煉破碎的方塊."
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Too Hot to Handle")
        .setSpTraitName("太熱而無法處理")
        .setLore(
            "?"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Superhot")
        .setSpTraitName("超級熱")
        .setLore(
            "有機會點燃附近的實體"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Warm Blodded")
        .setSpTraitName("熱血的")
        .setLore(
            "當你在地獄感到熱時速度+2.",
            "當你在中界感到冷時速度-1"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCorBronze);

    public static final MaterialTrait CORE_SOLDER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hidden")
        .setSpTraitName("隱身")
        .setLore(
            "授予隱身，立即中斷."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSolder)
        .addConsumer(TraitEventType.TICK, TickEvents::headSolder);

    public static final MaterialTrait CORE_SOLDER_ROD = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Fused")
        .setSpTraitName("保險")
        .setLore(
            "工具不能在地獄掉落被",
            "玩家或死亡."
        );

    public static final MaterialTrait CORE_SOLDER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Soft Landing")
        .setSpTraitName("易著陸")
        .setLore(
            "撞牆不再痛"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSolder);

    public static final MaterialTrait CORE_SOLDER_LINKS = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Fused")
        .setSpTraitName("保險")
        .setLore(
            "在死亡時不會掉落也無法丟棄"
        );

    public static final MaterialTrait CORE_BILLON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Fast")
        .setSpTraitName("速掘")
        .setLore(
            "獲得挖速加速效果",
            "可疊加"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBillon);

    public static final MaterialTrait CORE_BILLON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Springs")
        .setSpTraitName("彈簧")
        .setLore(
            "讓你跳得更高",
            "(獲得跳躍提升IV效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBillon);

    public static final MaterialTrait CORE_BILLON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("WHM")
        .setSpTraitName("天使")
        .setLore(
            "你的攻擊轉化為治療"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateBillon);

    public static final MaterialTrait CORE_BILLON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Heat Conductor")
        .setSpTraitName("熱導體")
        .setLore(
            "免疫岩漿的傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBillon);

    public static final MaterialTrait CORE_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Stiff")
        .setSpTraitName("倒楣")
        .setLore(
            "攻擊傷害+50%",
            "獲得厄運III效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait CORE_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Oxygenated")
        .setSpTraitName("氧氣")
        .setLore(
            "獲得水下呼吸效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBrass);

    public static final MaterialTrait CORE_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Band")
        .setSpTraitName("綁定")
        .setLore(
            "耐久損失+200%",
            "傷害降低-1~25%",
            "隨著耐久度的下降而降低"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateBrass)
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateBrass);

    public static final MaterialTrait CORE_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Scarpaaarr!")
        .setSpTraitName("Scarpaaarr!") // 缺失翻譯
        .setLore(
            "耐久消耗+100%",
            "當血量低於一半時受到傷害",
            "獲得速度III效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Abra")
        .setSpTraitName("阿布拉") // 缺失翻譯
        .setLore(
            "攻擊生物時有33%的機率使目標隨機傳送"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Studious")
        .setSpTraitName("好學")
        .setLore(
            "工具經驗獲取+50%",
            "玩家經驗獲取+50%",
            "攻擊傷害-50%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAlubrass)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Magus")
        .setSpTraitName("巫師")
        .setLore(
            "承受的魔法傷害-50%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Escape")
        .setSpTraitName("逃脫")
        .setLore(
            "受到傷害時隨機傳送到附近",
            "(冷卻: 10秒)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait CORE_NICKEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Charged Head -")
        .setSpTraitName("帶電(負極-)")
        .setLore(
            "有20%的機率",
            "攻擊傷害+200%",
            "並囚固目標",
            "(需要與正極同時存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Charged Rod -")
        .setSpTraitName("帶電(負極-)")
        .setLore(
            "有20%的機率",
            "攻擊傷害+200%",
            "並囚固目標",
            "(需要與正極同時存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Magnetic -")
        .setSpTraitName("磁鐵(負極-)")
        .setLore(
            "磁鐵的負極",
            "磁鐵可以自動吸收周圍的掉落物",
            "範圍 = (磁鐵正極數 + 磁鐵負極數) - (磁鐵正級數與負極數的差異)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateNickel);

    public static final MaterialTrait CORE_NICKEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Magnetic -")
        .setSpTraitName("磁鐵(負極-)")
        .setLore(
            "磁鐵的負極",
            "磁鐵可以自動吸收周圍的掉落物",
            "範圍 = (磁鐵正極數 + 磁鐵負極數) - (磁鐵正級數與負極數的差異)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksNickel);

    public static final MaterialTrait CORE_COBALT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Charged Head +")
        .setSpTraitName("帶電(正極+)")
        .setLore(
            "有20%的機率",
            "攻擊傷害+200%",
            "並禁錮目標",
            "(需要與負極同時存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Charged Rod +")
        .setSpTraitName("帶電(正極+)")
        .setLore(
            "有20%的機率",
            "攻擊傷害+200%",
            "並禁錮目標",
            "(需要與負極同時存在才能生效)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Magnetic +")
        .setSpTraitName("磁鐵(正極+)")
        .setLore(
            "磁鐵的正極",
            "磁鐵可以自動吸收周圍的掉落物",
            "範圍 = (磁鐵正極數 + 磁鐵負極數) - (磁鐵正級數與負極數的差異)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCobalt);

    public static final MaterialTrait CORE_COBALT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Magnetic +")
        .setSpTraitName("磁鐵(正極+)")
        .setLore(
            "磁鐵的正極",
            "磁鐵可以自動吸收周圍的掉落物",
            "範圍 = (磁鐵正極數 + 磁鐵負極數) - (磁鐵正級數與負極數的差異)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCobalt);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Bulky")
        .setSpTraitName("槌子")
        .setLore(
            "可挖掘 3x3x3 區域"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_ROD = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Reinforced")
        .setSpTraitName("加強化")
        .setLore(
            "強化合金板模組擁有雙倍效果"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_PLATES = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Reinforcable")
        .setSpTraitName("加強化")
        .setLore(
            "強化合金板模組擁有雙倍效果"
        );

    public static final MaterialTrait CORE_REINFORCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Works")
        .setTraitName("Witherproof")
        .setSpTraitName("防凋零")
        .setLore(
            "免疫凋零效果"
        );

    public static final MaterialTrait CORE_STRING_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Works")
        .setSpTraitName("罷工")
        .setLore(
            "沒有任何效果"
        );

    public static final MaterialTrait CORE_STRING_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Works")
        .setSpTraitName("罷工")
        .setLore(
            "沒有任何效果"
        );

    public static final MaterialTrait CORE_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Growth")
        .setSpTraitName("生長")
        .setLore(
            "在白天緩慢修復工具"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderVine);

    public static final MaterialTrait CORE_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Growth")
        .setSpTraitName("生長")
        .setLore(
            "在白天緩慢修復工具"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVine);


    public static final MaterialTrait CORE_CRIMSON_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Decay")
        .setSpTraitName("衰變")
        .setLore(
            "在夜間緩慢修復工具."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderCrimsonRoot);

    public static final MaterialTrait CORE_CRIMSON_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Decay")
        .setSpTraitName("衰變")
        .setLore(
            "在夜間緩慢修復工具."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCrimsonRoots);

    public static final MaterialTrait CORE_WARPED_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Refreshing")
        .setSpTraitName("恢復")
        .setLore(
            "緩慢治療玩家."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindWarpedRoot);

    public static final MaterialTrait CORE_WARPED_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Refreshing")
        .setSpTraitName("恢復")
        .setLore(
            "緩慢治療玩家."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWarpedRoots);

    public static final MaterialTrait CORE_WEEPING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Doom")
        .setSpTraitName("不祥之兆") // 缺失翻譯
        .setLore(
            "我感覺很不好...",
            "(獲得不祥之兆效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderWeepingVine);

    public static final MaterialTrait CORE_WEEPING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Doom")
        .setSpTraitName("不祥之兆")
        .setLore(
            "保護你的村民!",
            "獲得不祥之兆效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWeepingVines);

    public static final MaterialTrait CORE_TWISTING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Attraction")
        .setSpTraitName("吸引")
        .setLore(
            "自動吸取5格內的掉落物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderTwistingVine);

    public static final MaterialTrait CORE_TWISTING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Attraction")
        .setSpTraitName("吸引")
        .setLore(
            "自動吸取5x5格內的掉落物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonTwistingWines);

    public static final MaterialTrait CORE_SLIME_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Bouncy")
        .setSpTraitName("彈性")
        .setLore(
            "掉落傷害-50%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlime);

    public static final MaterialTrait CORE_SLIME_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Bouncy")
        .setSpTraitName("彈性")
        .setLore(
            "掉落傷害-25%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlime);

    public static final MaterialTrait CORE_SILICON_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Slow Learner")
        .setSpTraitName("慢學者")
        .setLore(
            "破壞方塊時",
            "+(5x工具等級)% 工具經驗獲取"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::bindSilicon);

    public static final MaterialTrait CORE_SILICON_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Slow Learner")
        .setSpTraitName("慢學者")
        .setLore(
            "+(5x護甲等級)% 護甲經驗獲取"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonSilicon);

    public static final MaterialTrait CORE_LEATHER_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Thick")
        .setSpTraitName("厚皮革")
        .setLore(
            "工具經驗獲取+50%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::binderLeather)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::binderLeather);

    public static final MaterialTrait CORE_LEATHER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Thick")
        .setSpTraitName("厚皮革")
        .setLore(
            "護甲經驗獲取+10%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonLeather);

    public static final MaterialTrait CORE_FERROSILICON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Hydrogen")
        .setSpTraitName("氫氣")
        .setLore(
            "受到傷害時獲得漂浮效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Solar Powered")
        .setSpTraitName("太陽能")
        .setLore(
            "在白天持續回復耐久"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Brightburn")
        .setSpTraitName("魔童")
        .setLore(
            "獲得1層魔童效果",
            "當擁有4層及以上的魔童效果時",
            "擊退周圍5格內的所有的生物",
            "(凋靈與末影龍除外)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Lightning Rod")
        .setSpTraitName("電棍")
        .setLore(
            "有機率在命中生物時召喚閃電"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Powered On")
        .setSpTraitName("充能")
        .setLore(
            "在 5x2x5 範圍內隨機充能方塊",
            "(激活紅石信號)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Who needs pressure plates?")
        .setSpTraitName("誰需要壓力板?")
        .setLore(
            "你腳下的方塊是充能的"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksRedstoneAlloy);

    public static final MaterialTrait CORE_BOOMERITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Ladder Simulator™")
        .setSpTraitName("梯子模擬器™")
        .setLore(
            "右鍵點擊時生成梯子."
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headBoomerite);

    public static final MaterialTrait CORE_BOOMERITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Go Boomer")
        .setSpTraitName("要爆炸了!")
        .setLore(
            "警告: 即將發生爆炸..."
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateBoomerite);

    public static final MaterialTrait CORE_SEFIRITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Celebrate")
        .setSpTraitName("慶祝")
        .setLore(
            "現在該慶祝了!"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headSefirite);

    public static final MaterialTrait CORE_CRINGLEIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Feeling Festive")
        .setSpTraitName("感受節日!")
        .setLore(
            "趕緊享受節日的快樂吧!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCringleium);

    public static final MaterialTrait CORE_LOVE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("It's all you need")
        .setSpTraitName("這就是你所需要的")
        .setLore(
            "你被關愛了",
            "(獲得生命回復效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLove);

    public static final MaterialTrait CORE_NICEINIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName("Nice")
        .setSpTraitName("水拉")
        .setLore(
            "水拉"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headNice)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headNice);

    // endregion

    // region Infinity Expansion

    public static final MaterialTrait INFINITY_VOID_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Void Miner")
        .setSpTraitName("虛空礦工")
        .setLore(
            "在挖掘的時候有機率隨機掉落資源"

        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headVoid);

    public static final MaterialTrait INFINITY_VOID_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Fear the Void")
        .setSpTraitName("恐懼虛空")
        .setLore(
            "攻擊傷害+150%",
            "在末地時:",
            "攻擊傷害+250%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodVoid);

    public static final MaterialTrait INFINITY_VOID_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Planewalker")
        .setSpTraitName("虛空旅者")
        .setLore(
            "虛空不再是你的敵人",
            "(落入虛空時自動傳送至當前位置向上200格的位置)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateVoid);

    public static final MaterialTrait INFINITY_VOID_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("The End")
        .setSpTraitName("終界霸主")
        .setLore(
            "來自末影龍,末影人,潛影貝的傷害-10%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksVoid);

    public static final MaterialTrait INFINITY_MAGSTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Really Stainless")
        .setSpTraitName("真正的不銹鋼")
        .setLore(
            "像不銹鋼一樣，但是...真的",
            "(更酷的視覺效果)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagSteel);

    public static final MaterialTrait INFINITY_MAGSTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Flammable")
        .setSpTraitName("燃燒")
        .setLore(
            "有(工具等級 x 5)%的機率",
            "讓敵人著火"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait INFINITY_MAGSTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Tarnished")
        .setSpTraitName("玷污")
        .setLore(
            "攻擊傷害-20%",
            "護甲經驗獲取+20%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait INFINITY_MAGSTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Defender")
        .setSpTraitName("防禦")
        .setLore(
            "受到時傷害時有5%的機率",
            "免疫傷害並獲得吸收傷害效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagSteel);

    public static final MaterialTrait INFINITY_TITANIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Reinforced")
        .setSpTraitName("雙倍強化")
        .setLore(
            "強化合金板模組擁有雙倍效果",
            "(只需5個不消耗耐久)"
        );

    public static final MaterialTrait INFINITY_TITANIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Durable")
        .setSpTraitName("耐用")
        .setLore(
            "工具損壞時仍然可以，但：",
            "-50% 攻擊傷害",
            "獲得挖掘疲勞效果",
            "無法獲得工具經驗"
        );

    public static final MaterialTrait INFINITY_TITANIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Dwarven Skills")
        .setSpTraitName("地精")
        .setLore(
            "在挖礦時有機率找到額外的物品",
            "該機率可以疊加"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait INFINITY_TITANIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Heat Resistant")
        .setSpTraitName("防火")
        .setLore(
            "免疫來自火焰、岩漿與岩漿塊的傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTitanium);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Stability II")
        .setSpTraitName("穩定 II")
        .setLore(
            "這東東還是什麼都沒有"
        );

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sharp 1 II")
        .setSpTraitName("鋒利 1 II")
        .setLore(
            "多麼糟糕的命名約定",
            "獲得力量II效果(可疊加)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Steadfast II")
        .setSpTraitName("堅韌II") // 翻譯奇怪
        .setLore(
            "免疫所有爆炸",
            "爆炸將治療你"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Rusty II")
        .setSpTraitName("腐蝕 II")
        .setLore(
            "攻擊傷害-10% ",
            "玩家經驗獲取+10% "
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingIron);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Golden Veil II")
        .setSpTraitName("金色面纱 II")
        .setLore(
            "獲得隱身效果",
            "應用在武器上時:攻擊傷害+50%"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingGold)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("All That Glitters II")
        .setSpTraitName("閃閃發光 II")
        .setLore(
            "獲得彩虹發光效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Prosperous II")
        .setSpTraitName("繁榮 II")
        .setLore(
            "在受到傷害時",
            "有1%機率掉落1-4個金粒"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Barter II")
        .setSpTraitName("以物換物 II")
        .setLore(
            "豬布靈會被你深深地吸引",
            "(周圍5格內的豬布靈不會攻擊你)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingGold);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Brains, Not Brawn II")
        .setSpTraitName("智力 II")
        .setLore(
            "工具經驗獲取+200%",
            "攻擊傷害-50%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_ROD = new MaterialTrait()
        // Special case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Conductive II")
        .setSpTraitName("經驗轉換 II")
        .setLore(
            "所有工具經驗轉化為玩家經驗",
            "並獲得額外50%的經驗加成"
        );

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Beginner II")
        .setSpTraitName("初學者 II")
        .setLore(
            "護甲經驗獲取+40%",
            "承受傷害+50%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Tarnished II")
        .setSpTraitName("玷污 II")
        .setLore(
            "攻擊傷害-20%",
            "護甲經驗獲取+40%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingCopper);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Poisonous II")
        .setSpTraitName("劇毒 II")
        .setLore(
            "攻擊時有50%的機率附加中毒II效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Leech II")
        .setSpTraitName("水蛭 II")
        .setLore(
            "獲得額外血量",
            "(獲得生命提升II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sickly II")
        .setSpTraitName("生病了 II")
        .setLore(
            "鉛甲真的並不是不是個好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sickly II")
        .setSpTraitName("生病了 II")
        .setLore(
            "鉛甲真的並不是個好主意"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingLead);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_HEAD = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Enchanting II")
        .setSpTraitName("附魔 II")
        .setLore(
            "工具經驗獲取-50%",
            "工具升級時獲得隨時附魔",
            "附魔可能不適用於該工具"
        );

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Soft Touch II")
        .setSpTraitName("觸感柔軟 II")
        .setLore(
            "你感覺更輕鬆了",
            "(免疫摔落傷害)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Conductivity II")
        .setSpTraitName("導電 II")
        .setLore(
            "被擊中時有機會召喚暴風雨.",
            "被閃電擊中時可獲得治療."
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_LINKS = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Enchanting II")
        .setSpTraitName("附魔 II")
        .setLore(
            "護甲升級時獲得1-3個隨機附魔",
            "附魔可能並不適用於該護甲"
        );

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Recyclable II")
        .setSpTraitName("再生 II")
        .setLore(
            "使用時有25%的機率恢復耐久"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Soft II")
        .setSpTraitName("柔軟 II")
        .setLore(
            "耐久消耗+100%",
            "工具經驗獲取+50% "
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodSingAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodSingAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Foil II")
        .setSpTraitName("緊酸 II")
        .setLore(
            "承受傷害+50%",
            "獲得速度效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingAluminium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingAluminium);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Easily Shaped II")
        .setSpTraitName("快速修復 II")
        .setLore(
            "維修只需要一個任何金屬零件"
        );

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Malleable II")
        .setSpTraitName("幸運 II")
        .setLore(
            "攻擊傷害-50%",
            "獲得幸運II效果",
            "獲得速度II效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Can II")
        .setSpTraitName("隨身罐頭 II")
        .setLore(
            "你不再飢餓",
            "(獲得飽和效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Non-Corrosive II")
        .setSpTraitName("抗毒 II")
        .setLore(
            "免疫中毒、飢餓、虛弱效果",
            "中毒效果會治療你"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Boost II")
        .setSpTraitName("承傷 II")
        .setLore(
            "當受到傷害時,獲得傷害吸收II效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingTin);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Graceful II")
        .setSpTraitName("海豚之力 II")
        .setLore(
            "激活海豚的力量!更多的力量!",
            "(獲得海豚的恩惠II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Super Lightweight II")
        .setSpTraitName("飄浮 II")
        .setLore(
            "蹲下時讓你變得比空氣還輕",
            "(獲得飄浮II效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sneaky II")
        .setSpTraitName("偷襲 II")
        .setLore(
            "當目標看向別處時",
            "對其造成的傷害+100% "
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Acupuncture II")
        .setSpTraitName("針刺療法 II")
        .setLore(
            "免疫來自仙人掌的傷害",
            "來自仙人掌的傷害可以治療你"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingZinc);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Flammable II")
        .setSpTraitName("燃燒 II")
        .setLore(
            "有(工具等級 x 10)%的機率",
            "讓敵人著火更長時間"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Magnetesium II")
        .setSpTraitName("磁鐵 II")
        .setLore(
            "隨機撿起附近10格範圍內的物品"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Light II")
        .setSpTraitName("快溜 II")
        .setLore(
            "輸出傷害-25%",
            "獲得速度效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingMagnesium)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("MagneSight™ II")
        .setSpTraitName("夜視™ II")
        .setLore(
            "獲得夜視效果",
            "並標記出周圍10格內所有生物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingMagnesium);

    public static final MaterialTrait INFINITY_MYTHRIL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Elven Speed")
        .setSpTraitName("精靈速度")
        .setLore(
            "耐久消耗+50% ",
            "獲得急迫II效果",
            "獲得速度效果"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headMythril)
        .addConsumer(TraitEventType.TICK, TickEvents::headMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Sting of Gondolin")
        .setSpTraitName("剛多林之刺")
        .setLore(
            "擊退附近所有的敵對生物"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Brightburn")
        .setSpTraitName("靈異乍現")
        .setLore(
            "當擁有靈異乍現及以上的魔童效果時",
            "擊退周圍5格內的所有的敵對生物",
            "(凋靈與末影龍除外)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait INFINITY_MYTHRIL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Call of the Wild")
        .setSpTraitName("野性的呼喚")
        .setLore(
            "當受到攻擊時",
            "有機率召喚一隻狼來幫助你"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMythril);

    public static final MaterialTrait INFINITY_ADAMANTITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Mystic")
        .setSpTraitName("神秘")
        .setLore(
            "挖礦時:",
            "玩家經驗獲取+100% ",
            "",
            "擊殺生物時:",
            "玩家經驗獲取+50%"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headAdamantite)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Adamant")
        .setSpTraitName("堅硬")
        .setLore(
            "免疫爆炸傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Deflective")
        .setSpTraitName("偏轉")
        .setLore(
            "來自發射器的傷害-25% "
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Experienced")
        .setSpTraitName("有經驗的")
        .setLore(
            "工具經驗獲取+10%",
            "玩家經驗獲取+10% "
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait INFINITY_MAGNONIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Magnanimous")
        .setSpTraitName("慷慨的")
        .setLore(
            "你真的太棒了",
            "謝謝你"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headMagnonium);

    public static final MaterialTrait INFINITY_MAGNONIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Flaming Hot")
        .setSpTraitName("熾熱")
        .setLore(
            "可熔煉掉落物."
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait INFINITY_MAGNONIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Escape")
        .setSpTraitName("逃脫")
        .setLore(
            "受到傷害時隨機傳送到附近(CD: 10秒)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait INFINITY_MAGNONIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Oxygenated")
        .setSpTraitName("水下也有氧氣")
        .setLore(
            "(免疫淹水後的傷害)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagnonium);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Fortunate")
        .setSpTraitName("幸運的")
        .setLore(
            "獲得雙倍掉落物",
            "可與青金石模組疊加"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Merchant's Veil")
        .setSpTraitName("商人面纱")
        .setLore(
            "(獲得隱身III效果)!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("How Fortunate")
        .setSpTraitName("如此幸運")
        .setLore(
            "受到攻擊時有0.5%的機率獲得一件禮物"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Beautiful")
        .setSpTraitName("花兒")
        .setLore(
            "走在草地上時有機率讓周圍開花"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Tricks")
        .setSpTraitName("把戲")
        .setLore(
            "對周圍所有生物隨機釋放把戲,包括:",
            "擊退,中毒,隨機傳送,著火,速度"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Secrets Revealed")
        .setSpTraitName("揭露秘密")
        .setLore(
            "標記出周圍10格內的所有的生物(也許不會)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Wizard Robes")
        .setSpTraitName("巫師袍")
        .setLore(
            "造成傷害時有機率釋放魔法"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Magical Mint")
        .setSpTraitName("魔法薄荷")
        .setLore(
            "免疫龍之土息造成的傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagic);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Earth Shaker")
        .setSpTraitName("撼地者")
        .setLore(
            "擊退並囚固命中的生物"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Grinder")
        .setSpTraitName("粉碎機")
        .setLore(
            "破壞方塊時的掉落物",
            "就像經過了粉碎機一樣"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Lava Walker")
        .setSpTraitName("岩漿過客")
        .setLore(
            "腳下的岩漿變為岩漿塊"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("It's only natural")
        .setSpTraitName("大自然的法則")
        .setLore(
            "右鍵點擊時,餵食周圍的兩隻動物(CD: 2分)",
            "無論是否餵食成功,該效果都會進入冷卻"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksEarth);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Clean Cut")
        .setSpTraitName("乾淨俐落")
        .setLore(
            "+100% 輸出傷害",
            "獲得急迫II效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Conductor")
        .setSpTraitName("經驗傳導")
        .setLore(
            "所有玩家經驗以10:1的比例",
            "轉化為工具經驗"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("KOTR")
        .setSpTraitName("鐵傀儡")
        .setLore(
            "受到傷害時有機率",
            "在周圍生成鐵傀儡"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Gleam")
        .setSpTraitName("閃光彈")
        .setLore(
            "受到傷害時,有機率",
            "反彈傷害並使攻擊者眩暈"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMetal);

    public static final MaterialTrait INFINITY_INFINITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Infinite")
        .setSpTraitName("無限")
        .setLore(
            "這件工具會一直流傳..."
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headInfinity);

    public static final MaterialTrait INFINITY_INFINITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Conceptual Defence")
        .setSpTraitName("概念性防御")
        .setLore(
            "承受傷害-50%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodInfinity);

    public static final MaterialTrait INFINITY_INFINITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Infinite Capacity")
        .setSpTraitName("無限容量")
        .setLore(
            "每次受到傷害，都會儲存10%",
            "最多 5 顆心的傷害。右鍵單擊釋放",
            "對附近實體的傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateInfinity)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateInfinity);

    public static final MaterialTrait INFINITY_INFINITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Oroborus")
        .setSpTraitName("反傷")
        .setLore(
            "有20%的機率反彈承受的傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Breakpoint")
        .setSpTraitName("斷點")
        .setLore(
            "無法破壞",
            "輸出傷害+200% ",
            "工具經驗獲取+200%",
            "可挖掘 3x3x3 區域"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingInfinity)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingInfinity)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Infinitly Powerful")
        .setSpTraitName("無限的力量")
        .setLore(
            "每承受2000點傷害(減傷計算前)",
            "可以獲得一個新的隨機附魔",
            "無等級上限"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName("Infinite Defence")
        .setSpTraitName("無限的防禦")
        .setLore(
            "當裝備全套包含無盡防禦的防具時",
            "所有承受的傷害均減少至1點"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingInfinity);

    // endregion

    // region LiteXpansion

    public static final MaterialTrait LITE_RUBBER_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Insulated")
        .setSpTraitName("絕緣")
        .setLore(
            "對閃電免疫"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindRubber);

    public static final MaterialTrait LITE_RUBBER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Sweaty")
        .setSpTraitName("汗流浹背")
        .setLore(
            "橡膠襯裡太熱了"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonRubber);

    public static final MaterialTrait LITE_REFINED_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Really Stable")
        .setSpTraitName("真正穩定")
        .setLore(
            "工具等級滿10級後:攻擊傷害+(工具等級 * 10)%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Manners Maketh Man")
        .setSpTraitName("禮儀造就人")
        .setLore(
            "速度1，傷害+50%。你的戰鬥看起來",
            "超酷."
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRefinedIron)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodRefinedIron)
        .addConsumer(TraitEventType.TICK, TickEvents::rodRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Kingsman")
        .setSpTraitName("王牌特工")
        .setLore(
            "需要滿足以下全部條件才能生效:",
            "- 裝備全套有王牌特工特性的盔甲",
            "- 熟知禮儀 (不知禮，無以立也)",
            "",
            "右鍵點擊時召喚毀滅陣",
            "對陣中的所有生物造成傷害(CD: 20分)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Narrowing")
        .setSpTraitName("縮小")
        .setLore(
            "攻擊者獲得失明效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksRefinedIron);

    public static final MaterialTrait LITE_MIXED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Mixed Metals")
        .setSpTraitName("合金")
        .setLore(
            "隨機獲得其冶煉材料的特性但效果減半",
            "(隨機獲得速度,防火,幸運效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMixedMetal);

    public static final MaterialTrait LITE_MIXED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Stiff")
        .setSpTraitName("倒霉")
        .setLore(
            "攻擊傷害+50%",
            "獲得厄運III效果"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait LITE_MIXED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Experienced")
        .setSpTraitName("有經驗")
        .setLore(
            "工具經驗獲取+10%",
            "玩家經驗獲取+10%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait LITE_MIXED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Mix it up!")
        .setSpTraitName("不義遊戲")
        .setLore(
            "受到攻擊時",
            "有機率與攻擊者互換位置"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMixedMetal);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Cleave")
        .setSpTraitName("混亂")
        .setLore(
            "受到攻擊時",
            "有機率與攻擊者互換位置"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Heavy Duty")
        .setSpTraitName("散射")
        .setLore(
            "攻擊時對周圍所有生物同時造成傷害",
            "散射的傷害不會受到其他特性或模組的影響"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_PLATES = new MaterialTrait()
        // Event More Advanced (mod affector)
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Even More Advanced")
        .setSpTraitName("負荷更多")
        .setLore(
            "每損失50點耐久,會消耗一塊鐵錠來恢復50點耐久"
        );

    public static final MaterialTrait LITE_ADVANCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Superhot")
        .setSpTraitName("極度炙熱")
        .setLore(
            "有機會將附近的實體點燃"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait LITE_MAG_THOR_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Heat Resistant")
        .setSpTraitName("耐熱")
        .setLore(
            "熔岩不再是你的敵人"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headMagThor);

    public static final MaterialTrait LITE_MAG_THOR_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Vampirism")
        .setSpTraitName("吸血鬼")
        .setLore(
            "造成傷害時有33%的機率恢復1點血量",
            "(日間)-50% 傷害",
            "(夜間)+50% 傷害 "
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait LITE_MAG_THOR_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Radioactive Plates")
        .setSpTraitName("放射性板子")
        .setLore(
            "使攻擊你的敵人中毒"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMagThor);

    public static final MaterialTrait LITE_MAG_THOR_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Building Rage")
        .setSpTraitName("建築工人的狂暴")
        .setLore(
            "有20%的機率在受到傷害時",
            "獲得加速或急迫效果"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagThor);

    public static final MaterialTrait LITE_CARBON_MESH_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Nimble")
        .setSpTraitName("敏捷")
        .setLore(
            "獲得加速效果",
            "承受傷害-33%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindCarbonMesh)
        .addConsumer(TraitEventType.TICK, TickEvents::bindCarbonMesh);

    public static final MaterialTrait LITE_CARBON_MESH_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Carbon Fibre")
        .setSpTraitName("碳纖維")
        .setLore(
            "速度+1"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCarbonMesh);

    public static final MaterialTrait LITE_SCRAP_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Terrible")
        .setSpTraitName("糟糕的")
        .setLore(
            "耐久消耗+300%",
            "工具經驗獲取-100%"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headScrap)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headScrap);

    public static final MaterialTrait LITE_SCRAP_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Brains, Not Brawn.")
        .setSpTraitName("智力")
        .setLore(
            "工具經驗獲取+100%",
            "攻擊傷害-50%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait LITE_SCRAP_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Pathetic")
        .setSpTraitName("可憐")
        .setLore(
            "警告: 不要穿上這件盔甲",
            "會有壞事發生",
            "不然你經驗獲取+400%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateScrap);

    public static final MaterialTrait LITE_SCRAP_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Falling Apart")
        .setSpTraitName("分崩離析")
        .setLore(
            "玩家經驗獲取+200%",
            "受到傷害時裝備有機率直接掉落"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksScrap)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksScrap);

    public static final MaterialTrait LITE_IRIDIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Protective")
        .setSpTraitName("保護")
        .setLore(
            "使你免於死亡(CD: 20分)"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headIridium);

    public static final MaterialTrait LITE_IRIDIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Warp")
        .setSpTraitName("別看我")
        .setLore(
            "使目標看向你的朝向"
            )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodIridium);

    public static final MaterialTrait LITE_IRIDIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Indomitable")
        .setSpTraitName("不屈不撓")
        .setLore(
            "受到傷害的10%被忽略和反射"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIridium);

    public static final MaterialTrait LITE_IRIDIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName("Unconventional Power")
        .setSpTraitName("非常規動力")
        .setLore(
            "承受的傷害會被轉化為能源",
            "並存儲在盔甲中(傷害不會被抵消)",
            "右鍵點擊釋放存儲的能源",
            "用於給物品欄中所有的物品充電"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksIridium)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksIridium);

    // endregion

    // region Slimefun Warfare

    public static final MaterialTrait SFW_SEGGANESSON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Overcharge")
        .setSpTraitName("過度充電")
        .setLore(
            "每次擊中怪物時儲存能量",
            "每10次攻擊就會釋放這波能量"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Blinding Speed")
        .setSpTraitName("致盲速度")
        .setLore(
            "獲得速度V效果",
            "獲得失明效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Gravity")
        .setSpTraitName("重力")
        .setLore(
            "附近的所有實體都對著你慢慢被拉動"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Soul Siphon")
        .setSpTraitName("靈魂虹吸")
        .setLore(
            "儲存被殺、敵對、暴徒的靈魂",
            "每100個靈魂傷害+1%",
            "上限為100%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSegganesson);

    public static final MaterialTrait SFW_SLIMESTEEL_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Bouncy II")
        .setSpTraitName("彈性 II")
        .setLore(
            "墜落傷害因跳躍提升而減半"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlimesteel);

    public static final MaterialTrait SFW_SLIMESTEEL_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Moon Bounce")
        .setSpTraitName("月亮彈跳")
        .setLore(
            "穿靴子時，免疫跌落傷害",
            "你也會變得更有彈性"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlimeSteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Strong and Sticky")
        .setSpTraitName("強力黏液")
        .setLore(
            "當物品欄有空間時",
            "掉落的方塊將直接吸入物品欄中"
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Flexibility")
        .setSpTraitName("靈活")
        .setLore(
            "受到的傷害減少，耐久度降低",
            "反而工具損壞時不起作用"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Rigid Flexibility")
        .setSpTraitName("剛性與柔性")
        .setLore(
            "獲得速度效果",
            "獲得跳躍提升效果",
            "承受傷害+10%"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateReinforcedSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Deflection")
        .setSpTraitName("偏轉")
        .setLore(
            "有10%的機率免疫來自彈射物的傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksReinforcedSlimesteel);

    public static final MaterialTrait SFW_OSMIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Heavy")
        .setSpTraitName("重")
        .setLore(
            "可挖掘 3x3x3 區域"
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait SFW_OSMIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Heavy Pommel")
        .setSpTraitName("重型鞍座")
        .setLore(
            "命中的目標會被減速",
            "並且無法傳送"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodOsmium);

    public static final MaterialTrait SFW_OSMIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Increased Mass")
        .setSpTraitName("增加質量")
        .setLore(
            "獲得減速效果",
            "受到傷害時,攻擊者會被擊退"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateOsmium);

    public static final MaterialTrait SFW_OSMIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Draw")
        .setSpTraitName("畫筆")
        .setLore(
            "有5%的機率被承受傷害治療"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksOsmium);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Brute")
        .setSpTraitName("無禮")
        .setLore(
            "獲得挖掘疲勞效果",
            "命中的目標會被囚固",
            "輸出傷害+100%",
            "有33的機率額外輸出傷害+100%"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headOsmiumSuperalloy)
        .addConsumer(TraitEventType.TICK, TickEvents::headOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Tuff Stuff")
        .setSpTraitName("囚固")
        .setLore(
            "擊退任何命中的生物",
            "有機率囚固目標"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Tempest")
        .setSpTraitName("暴風雨")
        .setLore(
            "當裝備全套有暴風雨特性的盔甲時",
            "有機率在周圍召喚暴風雨"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Partial Decay")
        .setSpTraitName("部分衰減")
        .setLore(
            "有機率隨機對周圍生物造成傷害",
            "不會致死"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksOsmiumSuperalloy);

    public static final MaterialTrait SFW_UNPATENTABLIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Innovation")
        .setSpTraitName("革新")
        .setLore(
            "白天時工具和玩家經驗+100% "
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headUnpatentabilum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_ROD = new MaterialTrait()
        // Special case in ItemDrop and PlayerDeath
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Incorporeal Right")
        .setSpTraitName("無形權利")
        .setLore(
            "工具不能在死亡時掉落或丟失"
        );

    public static final MaterialTrait SFW_UNPATENTABLIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("Intense Gaze")
        .setSpTraitName("強烈的凝視")
        .setLore(
            "你看向的實體會傳送到你身邊"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName("KOTR")
        .setSpTraitName("鐵傀儡")
        .setLore(
            "受到傷害時有機率",
            "在周圍生成鐵傀儡"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    // endregion

    // region DynaTech

    public static final MaterialTrait DYN_STAINLESS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Super Dooper Stainless")
        .setSpTraitName("超級不銹鋼") // 翻譯錯誤 - 全部
        .setLore(
            "真的，絕對是不銹鋼",
            "可以抵擋更多鮮血",
            "(更多炫酷效果)"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Cutlery")
        .setSpTraitName("餐具") // 翻譯錯誤 - 全部
        .setLore(
            "攻擊動物可直接填飽自己"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("The Standard")
        .setSpTraitName("標準")
        .setLore(
            "受到的傷害降低5%"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Water Safe")
        .setSpTraitName("安全水域")
        .setLore(
            "獲得水下呼吸效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksStainlessSteel);

    public static final MaterialTrait DYN_VEX_GEM_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("NoClip")
        .setSpTraitName("土遁")
        .setLore(
            "右鍵點擊隨機傳送到附近",
            "(CD:5分鐘)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::bindVex);

    public static final MaterialTrait DYN_VEX_GEM_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Annoying")
        .setSpTraitName("惱人")
        .setLore(
            "惱鬼寶石不應該這樣用!"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVex);

    public static final MaterialTrait DYN_STAR_DUST_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Bright Fury")
        .setSpTraitName("光明之怒")
        .setLore(
            "攻擊傷害+50%",
            "攻擊可使目標眩暈"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStarDust);

    public static final MaterialTrait DYN_STAR_DUST_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Yvaine")
        .setSpTraitName("流星")
        .setLore(
            "獲得發光效果",
            "周圍的村民會不斷向你聚集"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodStarDust);

    public static final MaterialTrait DYN_STAR_DUST_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Starshine")
        .setSpTraitName("星星閃耀")
        .setLore(
            "有5%的機率",
            "在夜間恢復1點血量(半顆心)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateStardust);

    public static final MaterialTrait DYN_STAR_DUST_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Bright-burn")
        .setSpTraitName("魔童")
        .setLore(
            "獲得1層魔童效果",
            "當擁有4層及以上的魔童效果時",
            "擊退周圍5格內的所有的生物",
            "(凋靈與末影龍除外)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Incorporeal")
        .setSpTraitName("靈魂出竅")
        .setLore(
            "免疫來自彈射物的傷害"
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("HyperCube [B]")
        .setSpTraitName("超立方體 [B]")
        .setLore(
            "僅適用於 [A] 和 [B]。Shift + Right",
            "單擊以存儲位置.右鍵單擊以調用",
            "到那個位置（CD:10分)"
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Ghost in the shell")
        .setSpTraitName("攻殼機動隊")
        .setLore(
            "消耗耐久來緩慢攻擊周圍所有生物",
            "該特性不會致死",
            "(消耗耐久不受其他特性,模組,附魔的影響)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Ghostly")
        .setSpTraitName("幽靈")
        .setLore(
            "像幽靈一樣盤旋",
            "(獲得飄浮效果)"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGhostly);

    public static final MaterialTrait DYN_TESSERACT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("HyperCube [A]")
        .setSpTraitName("超立方體 [A]")
        .setLore(
            "僅適用於 [A] 和 [B]。Shift + Right",
            "單擊以存儲位置。右鍵單擊以傳送到那個位置（CD：10分)" // 翻譯缺失
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headTessMat);

    public static final MaterialTrait DYN_TESSERACT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Hyberbolic Tesseration")
        .setSpTraitName("光學能量")
        .setLore(
            "需要全套包含雙光學能量特性的盔甲",
            "(每件盔甲需要有2個光學能量特性)才能生效",
            "當你處於異次元之家中時，會不斷積累光學能量",
            "當受到傷害時，光學能量會被釋放用於抵消傷害",
            "(傷害為經過增傷/減傷計算後)",
            "1點光學能量可以抵消1點傷害",
            "若光學能量不足以抵消全部傷害,則不會抵消任何傷害",
            "每件盔甲最多可以存儲50點光學能量",
            "全套盔甲最多可以存儲200點光學能量"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    public static final MaterialTrait DYN_TESSERACT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName("Hyberbolic Tesseration")
        .setSpTraitName("光學能量")
        .setLore(
            "需要8個光學能量特性才能生效",
            "(每件盔甲需要有2個光學能量特性)",
            "當你處於異次元之家中時，會不斷積累光學能量",
            "當受到傷害時，光學能量會被釋放用於抵消傷害",
            "(傷害為經過增傷/減傷計算後)",
            "1點光學能量可以抵消1點傷害",
            "若光學能量不足以抵消全部傷害,則不會抵消任何傷害",
            "每件盔甲最多可以存儲50點光學能量",
            "全套盔甲最多可以存儲200點光學能量"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    // endregion

    // region TranscEndence

    public static final MaterialTrait TNS_DAXI_STRENGTH = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("The Power of Daxi")
        .setSpTraitName("超能力")
        .setLore(
            "有20%的機率釋放出超能力核心的力量",
            "造成100%額外傷害"
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDaxiStrength);

    public static final MaterialTrait TNS_DAXI_ABSORPTION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Unite - Absorption")
        .setSpTraitName("超能力 - 專心")
        .setLore(
            "當4種超能力聯合起來後",
            "你死亡時可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiAbsorption);

    public static final MaterialTrait TNS_DAXI_FORTITUDE = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Unite - Fortitude")
        .setSpTraitName("超能力 - 堅韌")
        .setLore(
            "當4種超能力聯合起來後",
            "你死亡時可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiFortitude);

    public static final MaterialTrait TNS_DAXI_SATURATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Unite - Saturation")
        .setSpTraitName("超能力 - 飽和")
        .setLore(
            "當4種超能力聯合起來後",
            "你死亡時可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiSaturation);

    public static final MaterialTrait TNS_DAXI_REGENERATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName("Unite - Regeneration")
        .setSpTraitName("超能力 - 再生")
        .setLore(
            "當4種超能力聯合起來後",
            "你死亡時可以保留超能力核心的效果"
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiRegeneration);

    // endregion

    // region Networks

    public static final MaterialTrait NTW_UTLIMANINIUM = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.NETWORKS_NOTE)
        .setTraitName("Feeling Connected")
        .setSpTraitName("感覺連接")
        .setLore(
            "允許您無線連接",
            "到使用直接神經網絡的網絡",
            "通過你的頭盔連接",
            "",
            "Shift + 左鍵單擊空白",
            "手綁定到網格",
            "",
            "空手左擊",
            "嘗試打開綁定網格。",
            "",
            "只能在頭盔上工作."
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksUltimaninium);

    // endregion
}
