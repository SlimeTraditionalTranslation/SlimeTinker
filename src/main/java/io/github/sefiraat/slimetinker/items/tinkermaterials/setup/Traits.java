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
import org.mini2Dx.gettext.GetText;


public final class Traits {

    private Traits() {
        throw new UnsupportedOperationException("Utility Class");
    }

    // region Core

    public static final MaterialTrait CORE_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Stability"))
        .setLore(
            GetText.tr("Does... nothing!")
        );

    public static final MaterialTrait CORE_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Sharp 1"))
        .setLore(
            GetText.tr("Gives increased damage, stacks with"),
            GetText.tr("mods and other properties.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodIron);

    public static final MaterialTrait CORE_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Steadfast"))
        .setLore(
            GetText.tr("33% chance to ignore an explosion")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIron);

    public static final MaterialTrait CORE_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Rusty"))
        .setLore(
            GetText.tr("Armour durability loss +10%. Player Exp gain +10%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksIron);

    public static final MaterialTrait CORE_GOLD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Golden Veil"))
        .setLore(
            GetText.tr("Makes the player invisible. If used on"),
            GetText.tr("a weapon, -100% damage.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headGold)
        .addConsumer(TraitEventType.TICK, TickEvents::headGold);

    public static final MaterialTrait CORE_GOLD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("All that Glitters"))
        .setLore(
            GetText.tr("Makes you all shiny...")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodGold);

    public static final MaterialTrait CORE_GOLD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Prosperous"))
        .setLore(
            GetText.tr("1% chance to drop a gold nugget when hit")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateGold);

    public static final MaterialTrait CORE_GOLD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Barter"))
        .setLore(
            GetText.tr("Piglins like your armour")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGold);

    public static final MaterialTrait CORE_COPPER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Brains, Not Brawn"))
        .setLore(
            GetText.tr("Tool exp gain is doubled. Damage"),
            GetText.tr("dealt is halved.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait CORE_COPPER_ROD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Conductive"))
        .setLore(
            GetText.tr("All tool exp is converted to player exp.")
        );

    public static final MaterialTrait CORE_COPPER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Beginner"))
        .setLore(
            GetText.tr("Damage taken +25%. Armour Exp +20%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateCopper);

    public static final MaterialTrait CORE_COPPER_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Tarnished"))
        .setLore(
            GetText.tr("Outgoing damage reduced by 25%. Armour Exp +20%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait CORE_LEAD_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Poisonous"))
        .setLore(
            GetText.tr("25% chance to afflict poison on hit.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headLead);

    public static final MaterialTrait CORE_LEAD_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Leech"))
        .setLore(
            GetText.tr("Bonus health, but drains your energy.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodLead);

    public static final MaterialTrait CORE_LEAD_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Sickly"))
        .setLore(
            GetText.tr("Lead Armour is not a good idea")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateLead);

    public static final MaterialTrait CORE_LEAD_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Sickly"))
        .setLore(
            GetText.tr("Lead Armour is not a good idea")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLead);

    public static final MaterialTrait CORE_SILVER_HEAD = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Enchanting"))
        .setLore(
            GetText.tr("Tool exp gain is halved. Tools add a"),
            GetText.tr("random vanilla enchant when leveling. May or"),
            GetText.tr("may not match the tool type.")
        );

    public static final MaterialTrait CORE_SILVER_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Soft Touch"))
        .setLore(
            GetText.tr("You feel lighter.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSilver);

    public static final MaterialTrait CORE_SILVER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Conductivity"))
        .setLore(
            GetText.tr("Immune to lightning and even reflect it back!")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSilver);

    public static final MaterialTrait CORE_SILVER_LINKS = new MaterialTrait()
        // Consumer not required - effect handled directly within Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Enchanting"))
        .setLore(
            GetText.tr("Gains a random enchantment every time this"),
            GetText.tr("piece of armour levels up. May not be useful.")
        );

    public static final MaterialTrait CORE_ALUMINUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Recyclable"))
        .setLore(
            GetText.tr("Chance to restore durability on hit/block break")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headAluminum);

    public static final MaterialTrait CORE_ALUMINUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Soft"))
        .setLore(
            GetText.tr("Durability loss +100%, tool EXP +50%.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluminum);

    public static final MaterialTrait CORE_ALUMINUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Foil"))
        .setLore(
            GetText.tr("Damage Taken +50%. Speed + 1")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluminum)
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluminum);

    public static final MaterialTrait CORE_ALUMINUM_LINKS = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Easily Shaped"))
        .setLore(
            GetText.tr("Repairs only need a single kit.")
        );

    public static final MaterialTrait CORE_TIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Malleable"))
        .setLore(
            GetText.tr("Deal 50% less damage but gain luck.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headTin);

    public static final MaterialTrait CORE_TIN_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Can"))
        .setLore(
            GetText.tr("Your hunger just fades away")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodTin);

    public static final MaterialTrait CORE_TIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Non-Corrosive"))
        .setLore(
            GetText.tr("Immune to poison")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateTin);

    public static final MaterialTrait CORE_TIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Boost"))
        .setLore(
            GetText.tr("When taking heavy damage, gain absorption")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTin);

    public static final MaterialTrait CORE_ZINC_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Graceful"))
        .setLore(
            GetText.tr("DOLPHIN POWERS, ACTIVATE!")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headZinc);

    public static final MaterialTrait CORE_ZINC_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Super Lightweight"))
        .setLore(
            GetText.tr("Makes you lighter than air when not sneaking.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodZinc);

    public static final MaterialTrait CORE_ZINC_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Sneaky"))
        .setLore(
            GetText.tr("Damage doubled if target is facing away."),
            GetText.tr("Small tolerance")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateZinc);

    public static final MaterialTrait CORE_ZINC_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Acupuncture"))
        .setLore(
            GetText.tr("Take no damage from cactus pricks")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksZinc);

    public static final MaterialTrait CORE_MAGNESIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Flammable"))
        .setLore(
            GetText.tr("Has a (Tool level x 5)% chance to"),
            GetText.tr("set your enemies ablaze.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Magnetesium"))
        .setLore(
            GetText.tr("Random items are drawn to you from"),
            GetText.tr("within a 5 block range")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Light"))
        .setLore(
            GetText.tr("Damage dealt -25%. Speed + 1")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagnesium)
        .addConsumer(TraitEventType.TICK, TickEvents::plateMagnesium);

    public static final MaterialTrait CORE_MAGNESIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("MagneSight™"))
        .setLore(
            GetText.tr("Gain Nightvision.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksMagnesium);

    public static final MaterialTrait CORE_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Stainless"))
        .setLore(
            GetText.tr("The tool/weapon repels blood.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSteel);

    public static final MaterialTrait CORE_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Lightweight"))
        .setLore(
            GetText.tr("Tool Exp +50%. Speed + 1")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSteel);

    public static final MaterialTrait CORE_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Hardy"))
        .setLore(
            GetText.tr("Explosions do 25% less damage")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSteel);

    public static final MaterialTrait CORE_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Strong"))
        .setLore(
            GetText.tr("Health boost + 1")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Vampirism"))
        .setLore(
            GetText.tr("Chance to heal by damage given."),
            GetText.tr("Damage dealt varies by time of day.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Nightstalker"))
        .setLore(
            GetText.tr("Gives night vision.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodDamsteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Compounding"))
        .setLore(
            GetText.tr("Gain extra health equal for each compounding"),
            GetText.tr("piece. Amount stacks on it's own gain")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDamSteel);

    public static final MaterialTrait CORE_DAMASCUS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Snroht"))
        .setLore(
            GetText.tr("Thorns damage is ignored and reflected back")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDamSteel);

    public static final MaterialTrait CORE_DURALUMIN_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Durable"))
        .setLore(
            GetText.tr("Ignores being broken but damage 50%,"),
            GetText.tr("mining will be slower and 0 exp.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDuralium)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headDuralium)
        .addConsumer(TraitEventType.TICK, TickEvents::headDuralium);

    public static final MaterialTrait CORE_DURALUMIN_ROD = new MaterialTrait()
        // Special case - in RepairBench.java. Will have to stay there
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Easy Fix"))
        .setLore(
            GetText.tr("Only 1 kit is needed to fully repair.")
        );

    public static final MaterialTrait CORE_DURALUMIN_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Durable"))
        .setLore(
            GetText.tr("Works when broken but damage taken +20%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateDuralium);

    public static final MaterialTrait CORE_DURALUMIN_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Shock Absorbant"))
        .setLore(
            GetText.tr("10% chance to ignore damage. Not additive")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksDuralium);

    public static final MaterialTrait CORE_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Resistance"))
        .setLore(
            GetText.tr("Gives fire resistance while held.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBronze);

    public static final MaterialTrait CORE_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Ingheights"))
        .setLore(
            GetText.tr("Something is wrong with this tool.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBronze);

    public static final MaterialTrait CORE_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Farmer"))
        .setLore(
            GetText.tr("All crops drop 1 extra item. Not affected by fortune."),
            GetText.tr("Does not stack with itself but does with other effects.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::plateBronze);

    public static final MaterialTrait CORE_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Brittle"))
        .setLore(
            GetText.tr("Durability loss doubled.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Sharp 2"))
        .setLore(
            GetText.tr("Gives increased damage, stacks with"),
            GetText.tr("mods and other properties.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headAlubronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Brittle"))
        .setLore(
            GetText.tr("Durability loss is doubled.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Beautiful"))
        .setLore(
            GetText.tr("Chance to grow flowers as you walk.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait CORE_ALUMINUM_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Eject!"))
        .setLore(
            GetText.tr("If damaged when below 1/2 health - Eject!")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBronze);

    public static final MaterialTrait CORE_HARDENED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Tuff Stuff"))
        .setLore(
            GetText.tr("Knocks back anything hit with a chance"),
            GetText.tr("to stun.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait CORE_HARDENED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Heavy"))
        .setLore(
            GetText.tr("Mines in a 3x3 area.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_HARDENED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Toughened"))
        .setLore(
            GetText.tr("Will not lose durability.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateHardened);

    public static final MaterialTrait CORE_HARDENED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Dwarven Skills"))
        .setLore(
            GetText.tr("Chance to find rare artifacts while mining.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Flaming Hot"))
        .setLore(
            GetText.tr("Smelts broken blocks when possible.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Too Hot to Handle"))
        .setLore(
            GetText.tr("?")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodCorbronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Superhot"))
        .setLore(
            GetText.tr("Chance to set nearby entities on fire")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait CORE_CORINTHIAN_BRONZE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Warm Blodded"))
        .setLore(
            GetText.tr("Speed + 2 when hot in the nether."),
            GetText.tr("Slow + 1 when cold in the end")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCorBronze);

    public static final MaterialTrait CORE_SOLDER_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Hidden"))
        .setLore(
            GetText.tr("Grants invisibility, breaks instantly.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSolder)
        .addConsumer(TraitEventType.TICK, TickEvents::headSolder);

    public static final MaterialTrait CORE_SOLDER_ROD = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Fused"))
        .setLore(
            GetText.tr("Tool cannot be dropped either by the"),
            GetText.tr("player or on death.")
        );

    public static final MaterialTrait CORE_SOLDER_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Soft Landing"))
        .setLore(
            GetText.tr("Hitting walls no longer hurts")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSolder);

    public static final MaterialTrait CORE_SOLDER_LINKS = new MaterialTrait()
        // Special Case - in EntityKilledListener.java and DropItemListener.java - likely wont move
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Fused"))
        .setLore(
            GetText.tr("Cannot be dropped on death or on purpose.")
        );

    public static final MaterialTrait CORE_BILLON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Fast"))
        .setLore(
            GetText.tr("Move speed increased and haste applied."),
            GetText.tr("Stacks with modifiers.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headBillon);

    public static final MaterialTrait CORE_BILLON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Springs"))
        .setLore(
            GetText.tr("Makes you jump higher.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBillon);

    public static final MaterialTrait CORE_BILLON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("WHM"))
        .setLore(
            GetText.tr("Your attacks heal instead of harm.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateBillon);

    public static final MaterialTrait CORE_BILLON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Heat Conductor"))
        .setLore(
            GetText.tr("Magma blocks no longer cause damage")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBillon);

    public static final MaterialTrait CORE_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Stiff"))
        .setLore(
            GetText.tr("Damage +50% but makes you unlucky")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait CORE_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Oxygenated"))
        .setLore(
            GetText.tr("Gives water breathing while held.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodBrass);

    public static final MaterialTrait CORE_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Band"))
        .setLore(
            GetText.tr("Durability loss + 200%. Damage reduced between 1-25%"),
            GetText.tr("getting lower as durability drops.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateBrass)
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::plateBrass);

    public static final MaterialTrait CORE_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Scarpaaarr!"))
        .setLore(
            GetText.tr("Durability loss doubled. When damaged below 1/2 health, gain Speed 3.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Abra"))
        .setLore(
            GetText.tr("Any hit mob has a % chance to be"),
            GetText.tr("randomly teleported.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Studious"))
        .setLore(
            GetText.tr("Tool and Player exp +50% but damage halved"),
            GetText.tr("and you are slower to act.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodAlubrass)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Magus"))
        .setLore(
            GetText.tr("Magic Damage -50%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAluBrass);

    public static final MaterialTrait CORE_ALUMINUM_BRASS_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Escape"))
        .setLore(
            GetText.tr("Randomly teleport then hit (CD: 10s)")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait CORE_NICKEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Charged Head -"))
        .setLore(
            GetText.tr("Doesn't do anything... on it's own...")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Charged Rod -"))
        .setLore(
            GetText.tr("Doesn't do anything... on it's own...")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_NICKEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Magnetic -"))
        .setLore(
            GetText.tr("Gain 1 Stack of Magnetism and 1 Stack of Negativity."),
            GetText.tr("Magnetism draws in all nearby items."),
            GetText.tr("Range = Magnetism Level - (∆ Positivity/Negativity)")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateNickel);

    public static final MaterialTrait CORE_NICKEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Magnetic -"))
        .setLore(
            GetText.tr("Gain 1 Stack of Magnetism and 1 Stack of Negativity."),
            GetText.tr("Magnetism draws in all nearby items."),
            GetText.tr("Range = Magnetism Level - (∆ Positivity/Negativity)")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksNickel);

    public static final MaterialTrait CORE_COBALT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Charged Head +"))
        .setLore(
            GetText.tr("Doesn't do anything... on it's own...")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Charged Rod +"))
        .setLore(
            GetText.tr("Doesn't do anything... on it's own...")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::charged);

    public static final MaterialTrait CORE_COBALT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Magnetic +"))
        .setLore(
            GetText.tr("Gain 1 Stack of Magnetism and 1 Stack of Negativity."),
            GetText.tr("Magnetism draws in all nearby items."),
            GetText.tr("Range = Magnetism Level - (∆ Positivity/Negativity)")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCobalt);

    public static final MaterialTrait CORE_COBALT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Magnetic +"))
        .setLore(
            GetText.tr("Gain 1 Stack of Magnetism and 1 Stack of Positivity."),
            GetText.tr("Magnetism draws in all nearby items."),
            GetText.tr("Range = Magnetism Level - (∆ Positivity/Negativity)")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCobalt);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Bulky"))
        .setLore(
            GetText.tr("Mines in a 3x3 area")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_ROD = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Reinforced"))
        .setLore(
            GetText.tr("Any Plate mod on the tool is counted twice.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait CORE_REINFORCED_ALLOY_PLATES = new MaterialTrait()
        // Special Case - nested within plate mod. Will be moved when mods are changed to consumers
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Reinforcable"))
        .setLore(
            GetText.tr("Plate mods count twice.")
        );

    public static final MaterialTrait CORE_REINFORCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Witherproof"))
        .setLore(
            GetText.tr("Immune to the wither effect.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksReinforced);

    public static final MaterialTrait CORE_STRING_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Works"))
        .setLore(
            GetText.tr("No special effects.")
        );

    public static final MaterialTrait CORE_STRING_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Works"))
        .setLore(
            GetText.tr("No special effects but makes armour quickly.")
        );

    public static final MaterialTrait CORE_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Growth"))
        .setLore(
            GetText.tr("Slowly repairs the tool during the day."),
            GetText.tr("Stacks with mods. Must be in hand")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderVine);

    public static final MaterialTrait CORE_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Growth"))
        .setLore(
            GetText.tr("Slowly repairs during the day.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVine);


    public static final MaterialTrait CORE_CRIMSON_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Decay"))
        .setLore(
            GetText.tr("Slowly repairs the tool at night."),
            GetText.tr("Stacks with mods. Must be in hand")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderCrimsonRoot);

    public static final MaterialTrait CORE_CRIMSON_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Decay"))
        .setLore(
            GetText.tr("Slowly repairs during night.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCrimsonRoots);

    public static final MaterialTrait CORE_WARPED_ROOT_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Refreshing"))
        .setLore(
            GetText.tr("Slowly heals the holder.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindWarpedRoot);

    public static final MaterialTrait CORE_WARPED_ROOT_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Refreshing"))
        .setLore(
            GetText.tr("Slowly heals the equipping player.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWarpedRoots);

    public static final MaterialTrait CORE_WEEPING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Doom"))
        .setLore(
            GetText.tr("I get a bad feeling from this...")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderWeepingVine);

    public static final MaterialTrait CORE_WEEPING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Doom"))
        .setLore(
            GetText.tr("Gives you bad omen. Hide your villagers!")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonWeepingVines);

    public static final MaterialTrait CORE_TWISTING_VINE_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Attraction"))
        .setLore(
            GetText.tr("All drops are drawn to you within a"),
            GetText.tr("5 block range.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::binderTwistingVine);

    public static final MaterialTrait CORE_TWISTING_VINE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Attraction"))
        .setLore(
            GetText.tr("Nearby drops (5x5 area) are drawn to you.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonTwistingWines);

    public static final MaterialTrait CORE_SLIME_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Bouncy"))
        .setLore(
            GetText.tr("Fall damage is halved.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlime);

    public static final MaterialTrait CORE_SLIME_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Bouncy"))
        .setLore(
            GetText.tr("Fall damage -25%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlime);

    public static final MaterialTrait CORE_SILICON_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Slow Learner"))
        .setLore(
            GetText.tr("Tool exp gain when breaking blocks is"),
            GetText.tr("increased by (Tool Level x 5%)")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::bindSilicon);

    public static final MaterialTrait CORE_SILICON_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Slow Learner"))
        .setLore(
            GetText.tr("Armour exp gain = (Level * 5%)")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonSilicon);

    public static final MaterialTrait CORE_LEATHER_BINDER = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Thick"))
        .setLore(
            GetText.tr("Tool exp gain + 50%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::binderLeather)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::binderLeather);

    public static final MaterialTrait CORE_LEATHER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Thick"))
        .setLore(
            GetText.tr("Armour exp gain + 10%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::gambesonLeather);

    public static final MaterialTrait CORE_FERROSILICON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Hydrogen"))
        .setLore(
            GetText.tr("Float away from danger.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Solar Powered"))
        .setLore(
            GetText.tr("Restores durability during the day time.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateFerrosilicon);

    public static final MaterialTrait CORE_FERROSILICON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Brightburn"))
        .setLore(
            GetText.tr("Gives on stack of Burning Bright! With 4 "),
            GetText.tr("stacks, hostile mobs are repelled (not bosses).")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Lightning Rod"))
        .setLore(
            GetText.tr("A chance to strike hit mobs with lightning.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Powered On"))
        .setLore(
            GetText.tr("Randomly powers a block within a 5x2x5 range.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateRedstoneAlloy);

    public static final MaterialTrait CORE_REDSTONE_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Who needs pressure plates?"))
        .setLore(
            GetText.tr("The block you stand on is powered.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksRedstoneAlloy);

    public static final MaterialTrait CORE_BOOMERITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Ladder Simulator™"))
        .setLore(
            GetText.tr("Spawns ladders on right click.")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headBoomerite);

    public static final MaterialTrait CORE_BOOMERITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Go Boomer"))
        .setLore(
            GetText.tr("Warning... things will go boom...")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateBoomerite);

    public static final MaterialTrait CORE_SEFIRITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Celebrate"))
        .setLore(
            GetText.tr("Time to celebrate")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headSefirite);

    public static final MaterialTrait CORE_CRINGLEIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Feeling Festive"))
        .setLore(
            GetText.tr("Get that festive feeling!")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksCringleium);

    public static final MaterialTrait CORE_LOVE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("It's all you need"))
        .setLore(
            GetText.tr("You are loved")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksLove);

    public static final MaterialTrait CORE_NICEINIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("Nice"))
        .setLore(
            GetText.tr("Nice")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headNice)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headNice);

    public static final MaterialTrait CORE_ANNIVERSARIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.CORE_NOTE)
        .setTraitName(GetText.tr("10 Years of (Slime)fun!"))
        .setLore(
            GetText.tr("10 Years of (Slime)fun!"),
            "",
            GetText.tr("Requires all four armor pieces.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAnniversary);

    // endregion

    // region Infinity Expansion

    public static final MaterialTrait INFINITY_VOID_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Void Miner"))
        .setLore(
            GetText.tr("Randomly generates ores while mining/digging.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headVoid);

    public static final MaterialTrait INFINITY_VOID_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Fear the Void"))
        .setLore(
            GetText.tr("Damage +150%. 250% in the End.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodVoid);

    public static final MaterialTrait INFINITY_VOID_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Planewalker"))
        .setLore(
            GetText.tr("The void is no longer your enemy")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateVoid);

    public static final MaterialTrait INFINITY_VOID_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("The End"))
        .setLore(
            GetText.tr("Reduce damage from the Dragon, Endermen and"),
            GetText.tr("Shulkers by 10%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksVoid);

    public static final MaterialTrait INFINITY_MAGSTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Really Stainless"))
        .setLore(
            GetText.tr("Like Stainless, but.. REALLY.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagSteel);

    public static final MaterialTrait INFINITY_MAGSTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Flammable"))
        .setLore(
            GetText.tr("Has a (Tool level x 5)% chance to"),
            GetText.tr("set your enemies ablaze.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMagnesium);

    public static final MaterialTrait INFINITY_MAGSTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Tarnished"))
        .setLore(
            GetText.tr("Outgoing damage reduced by 25%. Armour Exp +20%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksCopper);

    public static final MaterialTrait INFINITY_MAGSTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Defender"))
        .setLore(
            GetText.tr("5% chance, when hit, to ignore damage"),
            GetText.tr("and gain absorption.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagSteel);

    public static final MaterialTrait INFINITY_TITANIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Reinforced"))
        .setLore(
            GetText.tr("Any Plate mod on the tool is counted twice.")
        );

    public static final MaterialTrait INFINITY_TITANIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Durable"))
        .setLore(
            GetText.tr("Ignores being broken but damage 50%,"),
            GetText.tr("mining will be slower and 0 exp.")
        );

    public static final MaterialTrait INFINITY_TITANIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Dwarven Skills"))
        .setLore(
            GetText.tr("Chance to find rare artifacts while mining.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksHardened);

    public static final MaterialTrait INFINITY_TITANIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Heat Resistant"))
        .setLore(
            GetText.tr("Immune to fire and lava.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksTitanium);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Stability II"))
        .setLore(
            GetText.tr("Still does Nothing")
        );

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Sharp 1 II"))
        .setLore(
            GetText.tr("What a bad naming convention. +Damage")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Steadfast II"))
        .setLore(
            GetText.tr("Ignore all explosions")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingIron);

    public static final MaterialTrait INFINITY_IRON_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Rusty II"))
        .setLore(
            GetText.tr("Armour durability loss +10%. Player Exp gain +20%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingIron);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Golden Veil II"))
        .setLore(
            GetText.tr("Makes the player invisible. If used on"),
            GetText.tr("a weapon, +50% damage.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingGold)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("All That Glitters II"))
        .setLore(
            GetText.tr("Makes you shiny AND rainbow...y")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Prosperous II"))
        .setLore(
            GetText.tr("1% chance to drop 1-4 gold nuggets when hit")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingGold);

    public static final MaterialTrait INFINITY_GOLD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Barter II"))
        .setLore(
            GetText.tr("Piglins REALLY like your armour")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingGold);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Brains, Not Brawn II"))
        .setLore(
            GetText.tr("Tool exp +200%, Damage 50%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_ROD = new MaterialTrait()
        // Special case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Conductive II"))
        .setLore(
            GetText.tr("All tool exp is converted to player exp"),
            GetText.tr("with a 50% bonus.")
        );

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Beginner II"))
        .setLore(
            GetText.tr("Damage Taken +50%. Armour Exp +40%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingCopper)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingCopper);

    public static final MaterialTrait INFINITY_COPPER_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Tarnished II"))
        .setLore(
            GetText.tr("Outgoing damage reduced by 25%. Armour Exp +40%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSingCopper);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Poisonous II"))
        .setLore(
            GetText.tr("Poisons more frequently and for longer.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Leech II"))
        .setLore(
            GetText.tr("Bonus health, but drains your energy.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Sickly II"))
        .setLore(
            GetText.tr("Lead armour is a VERY BAD idea")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingLead);

    public static final MaterialTrait INFINITY_LEAD_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Sickly II"))
        .setLore(
            GetText.tr("Lead armour is a VERY BAD idea")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingLead);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_HEAD = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Enchanting II"))
        .setLore(
            GetText.tr("Tool exp gain is halved. Tools add 1-3"),
            GetText.tr("randomly selected enchants when leveling"),
            GetText.tr("up. These enchants may not be useful!")
        );

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Soft Touch II"))
        .setLore(
            GetText.tr("You feel much lighter.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Conductivity II"))
        .setLore(
            GetText.tr("Chance to summon a tempest when hit."),
            GetText.tr("Lightning damage heals you.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingSilver);

    public static final MaterialTrait INFINITY_SILVER_SINGULARITY_LINKS = new MaterialTrait()
        // Special Case, handled in Experience.java
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Enchanting II"))
        .setLore(
            GetText.tr("Gains 1-3 random enchantments everytime this"),
            GetText.tr("piece of armour levels up. May not be useful.")
        );

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Recyclable II"))
        .setLore(
            GetText.tr("Chance to restore durability on hit/block break")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Soft II"))
        .setLore(
            GetText.tr("Durability loss +100%, tool EXP +100%.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodSingAluminum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodSingAluminum)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodSingAluminum);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Foil II"))
        .setLore(
            GetText.tr("Damage Taken +50%. Speed + 2")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingAluminium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingAluminium);

    public static final MaterialTrait INFINITY_ALUMINUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Easily Shaped II"))
        .setLore(
            GetText.tr("Repairs only need a single kit of ANY metal")
        );

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Malleable II"))
        .setLore(
            GetText.tr("Deal 50% less damage but gain lots of"),
            GetText.tr("Luck and Speed.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingTin)
        .addConsumer(TraitEventType.TICK, TickEvents::headSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Can II"))
        .setLore(
            GetText.tr("No Hunger Loss")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Non-Corrosive II"))
        .setLore(
            GetText.tr("Poison heals and immune to hunger and weakness.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingTin);

    public static final MaterialTrait INFINITY_TIN_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Boost II"))
        .setLore(
            GetText.tr("When taking heavy damage, gain lots of absorption")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingTin);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Graceful II"))
        .setLore(
            GetText.tr("DOLPHIN POWERS, ACTIVATE... MORE!")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Super Lightweight II"))
        .setLore(
            GetText.tr("Makes you lighter than air when sneaking.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Sneaky II"))
        .setLore(
            GetText.tr("Damage doubled if target is facing away."),
            GetText.tr("Large tolerence")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingZinc);

    public static final MaterialTrait INFINITY_ZINC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Acupuncture II"))
        .setLore(
            GetText.tr("Cactus pricks heal you.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingZinc);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Flammable II"))
        .setLore(
            GetText.tr("Has a (Tool level x 10)% chance to"),
            GetText.tr("set your enemies ablaze for a longer time.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Magnetesium II"))
        .setLore(
            GetText.tr("Random items are drawn to you from"),
            GetText.tr("within a 10 block range")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Light II"))
        .setLore(
            GetText.tr("Damage dealt -50%. Speed + 2")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSingMagnesium)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateSingMagnesium);

    public static final MaterialTrait INFINITY_MAGNESIUM_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("MagneSight™ II"))
        .setLore(
            GetText.tr("Gain night vision and highlight all mobs")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksSingMagnesium);

    public static final MaterialTrait INFINITY_MYTHRIL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Elven Speed"))
        .setLore(
            GetText.tr("Haste 2, Speed 1. Durability loss +50%")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headMythril)
        .addConsumer(TraitEventType.TICK, TickEvents::headMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Sting of Gondolin"))
        .setLore(
            GetText.tr("All nearby, hostile, mobs are repelled.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMythril);

    public static final MaterialTrait INFINITY_MYTHRIL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Brightburn"))
        .setLore(
            GetText.tr("Gives on stack of Burning Bright! With 4"),
            GetText.tr("stacks, hostile mobs are repelled (not bosses).")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait INFINITY_MYTHRIL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Call of the Wild"))
        .setLore(
            GetText.tr("When hit, you sometimes summon a wolf to your aid")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMythril);

    public static final MaterialTrait INFINITY_ADAMANTITE_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Mystic"))
        .setLore(
            GetText.tr("Player Exp + 100% (Mining) +50% (Mobs)")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headAdamantite)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Adamant"))
        .setLore(
            GetText.tr("Become immune to all explosions")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Deflective"))
        .setLore(
            GetText.tr("Projectile Damage -25%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateAdamantite);

    public static final MaterialTrait INFINITY_ADAMANTITE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Experienced"))
        .setLore(
            GetText.tr("All tool and armour exp +10%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait INFINITY_MAGNONIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Magnanimous"))
        .setLore(
            GetText.tr("You're just far too kind")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headMagnonium);

    public static final MaterialTrait INFINITY_MAGNONIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Flaming Hot"))
        .setLore(
            GetText.tr("Smelts things when possible.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCorbronze);

    public static final MaterialTrait INFINITY_MAGNONIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Escape"))
        .setLore(
            GetText.tr("When hit, teleport away randomly (CD: 10s).")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksAluBrass);

    public static final MaterialTrait INFINITY_MAGNONIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Oxygenated"))
        .setLore(
            GetText.tr("Who needs it!?")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagnonium);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Fortunate"))
        .setLore(
            GetText.tr("200% drops from fortune. Stacks"),
            GetText.tr("with Lapis modifiers.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Merchant's Veil"))
        .setLore(
            GetText.tr("Invisibility with none of the drawbacks!")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("How Fortunate"))
        .setLore(
            GetText.tr("0.5% chance to get a gift when hit.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateFortune);

    public static final MaterialTrait INFINITY_FORTUNE_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Beautiful"))
        .setLore(
            GetText.tr("Plants flowers as you walk.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateAluBronze);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Tricks"))
        .setLore(
            GetText.tr("Plays nasty tricks on nearby things.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Secrets Revealed"))
        .setLore(
            GetText.tr("Reveals all nearby living (or not!) things.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Wizard Robes"))
        .setLore(
            GetText.tr("Chance, when attacking, to create MAGIC")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateMagic);

    public static final MaterialTrait INFINITY_MAGIC_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Magical Mint"))
        .setLore(
            GetText.tr("It may still be foul, but the Dragon's"),
            GetText.tr("breath will not hurt you.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagic);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Earth Shaker"))
        .setLore(
            GetText.tr("Knocks back hit mobs and stuns them"),
            GetText.tr("when they land.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Grinder"))
        .setLore(
            GetText.tr("Breaking blocks act as if they have"),
            GetText.tr("gone through the grinder.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Lava Walker"))
        .setLore(
            GetText.tr("Lava turns into magma blocks beneath your feet.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateEarth);

    public static final MaterialTrait INFINITY_EARTH_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("It's only natural"))
        .setLore(
            GetText.tr("Feeds two nearby animals on right click. (CD: 2m)"),
            GetText.tr("Cooldown fires regardless of success.")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksEarth);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Clean Cut"))
        .setLore(
            GetText.tr("Damage +100%. Haste 2")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Conductor"))
        .setLore(
            GetText.tr("All player exp is converted to tool"),
            GetText.tr("exp at a 10 : 1 ratio.")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::rodMetal)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("KOTR"))
        .setLore(
            GetText.tr("Chance, when hit, to summon a Knight"),
            GetText.tr("of the Round. (It's a Golem ;))")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    public static final MaterialTrait INFINITY_METAL_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Gleam"))
        .setLore(
            GetText.tr("Chance when hit to reflect damage and"),
            GetText.tr("dazzle attackers.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMetal);

    public static final MaterialTrait INFINITY_INFINITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Infinite"))
        .setLore(
            GetText.tr("This tool will live on forever.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headInfinity);

    public static final MaterialTrait INFINITY_INFINITY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Conceptual Defence"))
        .setLore(
            GetText.tr("All damage is halved (rounded up).")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodInfinity);

    public static final MaterialTrait INFINITY_INFINITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Infinite Capacity"))
        .setLore(
            GetText.tr("Everytime you take damage, 10% is stored"),
            GetText.tr("up to 5 hearts. Right click to release"),
            GetText.tr("the damage on nearby entities")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateInfinity)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateInfinity);

    public static final MaterialTrait INFINITY_INFINITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Oroborus"))
        .setLore(
            GetText.tr("20% chance to reflect damage taken.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Breakpoint"))
        .setLore(
            GetText.tr("Unbreakable. +200% Damage."),
            GetText.tr("+200% Tool Exp and 3x3 Mining.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headSingInfinity)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSingInfinity)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Infinitly Powerful"))
        .setLore(
            GetText.tr("Every X points of damage taken (before"),
            GetText.tr("reductions) will unlock a new, random,"),
            GetText.tr("enchantment. No upper limits."),
            GetText.tr("damage required will increase each time")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateSingInfinity);

    public static final MaterialTrait INFINITY_INFINITY_SINGULARITY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setTraitName(GetText.tr("Infinite Defence"))
        .setLore(
            GetText.tr("All damage taken set to 1 when 4 pieces"),
            GetText.tr("are equipped.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksSingInfinity);

    public static final MaterialTrait INFINITY_REINFORCED_DRACONIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.INFINITY_EXPANSION_NOTE)
        .setSponsoredBy(GetText.tr("Bunkky/ReasonFoundDecoy"))
        .setTraitName(GetText.tr("Draconic Tantrum"))
        .setLore(
            GetText.tr("When hit by the Ender Dragon, gain"),
            GetText.tr("bonus damage for 15 seconds."),
            GetText.tr("Stacks additively. Stacks refresh duration.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headReinforcedDraconium)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headReinforcedDraconium);

    // endregion

    // region LiteXpansion

    public static final MaterialTrait LITE_RUBBER_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Insulated"))
        .setLore(
            GetText.tr("Become immune to lightning.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindRubber);

    public static final MaterialTrait LITE_RUBBER_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Sweaty"))
        .setLore(
            GetText.tr("A rubber lining is WAY too hot.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonRubber);

    public static final MaterialTrait LITE_REFINED_IRON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Really Stable"))
        .setLore(
            GetText.tr("Does nothing. Perhaps if you level it up?.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Manners Maketh Man"))
        .setLore(
            GetText.tr("Speed 1, Damage + 50%. Your fights look"),
            GetText.tr("super cool.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodRefinedIron)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodRefinedIron)
        .addConsumer(TraitEventType.TICK, TickEvents::rodRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Kingsman"))
        .setLore(
            GetText.tr("On right click, summons a colorful cavalcade"),
            GetText.tr("of pure destruction."),
            GetText.tr("Does nothing if you don't have manners."),
            GetText.tr("Requires 4 pieces with Kingsman.")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::plateRefinedIron);

    public static final MaterialTrait LITE_REFINED_IRON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Narrowing"))
        .setLore(
            GetText.tr("Attackers are blinded.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksRefinedIron);

    public static final MaterialTrait LITE_MIXED_METAL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Mixed Metals"))
        .setLore(
            GetText.tr("Has the effects of all it's ingredients but"),
            GetText.tr("their power is halved.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::headMixedMetal);

    public static final MaterialTrait LITE_MIXED_METAL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Stiff"))
        .setLore(
            GetText.tr("Double damage. Unlucky!")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headBrass)
        .addConsumer(TraitEventType.TICK, TickEvents::headBrass);

    public static final MaterialTrait LITE_MIXED_METAL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Experienced"))
        .setLore(
            GetText.tr("All tool/armour exp + 10%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksAdamantite)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::linksAdamantite);

    public static final MaterialTrait LITE_MIXED_METAL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Mix it up!"))
        .setLore(
            GetText.tr("Mixes things up a bit when hit")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMixedMetal);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Cleave"))
        .setLore(
            GetText.tr("Damage all nearby mobs when you attack."),
            GetText.tr("Cleave damage does not trigger Tinker's effects.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Heavy Duty"))
        .setLore(
            GetText.tr("When durability gets low, it eats 1 iron"),
            GetText.tr("ingot from your inventory to restore some.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::rodAdvancedAlloy);

    public static final MaterialTrait LITE_ADVANCED_ALLOY_PLATES = new MaterialTrait()
        // Event More Advanced (mod affector)
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Even More Advanced"))
        .setLore(
            GetText.tr("Advanced modifiers +1 for each piece.")
        );

    public static final MaterialTrait LITE_ADVANCED_ALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Superhot"))
        .setLore(
            GetText.tr("Chance to set nearby linving things on fire.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateCorBronze);

    public static final MaterialTrait LITE_MAG_THOR_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Heat Resistant"))
        .setLore(
            GetText.tr("Lava is no longer your enemy.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headMagThor);

    public static final MaterialTrait LITE_MAG_THOR_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Vampirism"))
        .setLore(
            GetText.tr("Chance to heal by damage given."),
            GetText.tr("Damage dealt varies by time of day.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDamsteel);

    public static final MaterialTrait LITE_MAG_THOR_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Radioactive Plates"))
        .setLore(
            GetText.tr("Poisons enemies that attack you.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMagThor);

    public static final MaterialTrait LITE_MAG_THOR_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Building Rage"))
        .setLore(
            GetText.tr("Chance, when hit, to gain Speed 1 and Haste 1")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksMagThor);

    public static final MaterialTrait LITE_CARBON_MESH_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Nimble"))
        .setLore(
            GetText.tr("Speed 1. Take 33% less damage")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindCarbonMesh)
        .addConsumer(TraitEventType.TICK, TickEvents::bindCarbonMesh);

    public static final MaterialTrait LITE_CARBON_MESH_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Carbon Fibre"))
        .setLore(
            GetText.tr("Speed + 1")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonCarbonMesh);

    public static final MaterialTrait LITE_SCRAP_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Terrible"))
        .setLore(
            GetText.tr("+300% durability loss. 0% Exp Gain.")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::headScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headScrap)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headScrap);

    public static final MaterialTrait LITE_SCRAP_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Brains, Not Brawn."))
        .setLore(
            GetText.tr("Tool exp gain is doubled. Damage"),
            GetText.tr("dealt is halved.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headCopper)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headCopper);

    public static final MaterialTrait LITE_SCRAP_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Pathetic"))
        .setLore(
            GetText.tr("Do not wear this armour."),
            GetText.tr("VERY BAD THINGS MAY HAPPEN"),
            GetText.tr("YOU HAVE BEEN WARNED"),
            GetText.tr("Exp + 400%.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateScrap)
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::plateScrap);

    public static final MaterialTrait LITE_SCRAP_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Falling Apart"))
        .setLore(
            GetText.tr("Exp + 200%. Chance for the armour to"),
            GetText.tr("just fall off!")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksScrap)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksScrap);

    public static final MaterialTrait LITE_IRIDIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Protective"))
        .setLore(
            GetText.tr("Saves you from deaths. (CD 20m)")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::headIridium);

    public static final MaterialTrait LITE_IRIDIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Warp"))
        .setLore(
            GetText.tr("Turns your opponent around. (CD: 20m)")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodIridium);

    public static final MaterialTrait LITE_IRIDIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Indomitable"))
        .setLore(
            GetText.tr("10% of all damage is ignored and reflected.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateIridium);

    public static final MaterialTrait LITE_IRIDIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.LITEXPANSION_NOTE)
        .setTraitName(GetText.tr("Unconventional Power"))
        .setLore(
            GetText.tr("Any damage taken is remembered. Right"),
            GetText.tr("Click to charge inventory items.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksIridium)
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksIridium);

    // endregion

    // region Slimefun Warfare

    public static final MaterialTrait SFW_SEGGANESSON_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Overcharge"))
        .setLore(
            GetText.tr("Stores energy each time you hit a mob."),
            GetText.tr("Every 10th attack releases this back.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Blinding Speed"))
        .setLore(
            GetText.tr("Gain insane speed but with a side effect.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Gravity"))
        .setLore(
            GetText.tr("All nearby entities are slowly pulled"),
            GetText.tr("towards you")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateSegganesson);

    public static final MaterialTrait SFW_SEGGANESSON_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Soul Siphon"))
        .setLore(
            GetText.tr("Stores the souls of killed, hostile, mobs."),
            GetText.tr("Damage + 1% per 100 souls. Caps at 100%.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::linksSegganesson);

    public static final MaterialTrait SFW_SLIMESTEEL_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Bouncy II"))
        .setLore(
            GetText.tr("Fall damage halved with a jump boost.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::bindSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindSlimesteel);

    public static final MaterialTrait SFW_SLIMESTEEL_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Moon Bounce"))
        .setLore(
            GetText.tr("When on boots, fall damage is ignored."),
            GetText.tr("You also get more bouncy.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::gambesonSlimeSteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Strong and Sticky"))
        .setLore(
            GetText.tr("Dropped blocks go into your inventory"),
            GetText.tr("when possible to do so")
        )
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Flexibility"))
        .setLore(
            GetText.tr("Incoming damage reduced and durability is lost"),
            GetText.tr("instead. Doesn't work while tool is broken.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::rodReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Rigid Flexibility"))
        .setLore(
            GetText.tr("Speed and Jump + 1. Damage Taken + 10%")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateReinforcedSlimesteel)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateReinforcedSlimesteel);

    public static final MaterialTrait SFW_REINFORCED_SLIMESTEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Deflection"))
        .setLore(
            GetText.tr("10% chance to ignore projectile damage.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksReinforcedSlimesteel);

    public static final MaterialTrait SFW_OSMIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Heavy"))
        .setLore(
            GetText.tr("Mines in a 3x3 Area")
        )
        .addConsumer(TraitEventType.DURABILITY, DurabilityEvents::explosive);

    public static final MaterialTrait SFW_OSMIUM_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Heavy Pommel"))
        .setLore(
            GetText.tr("Struck mobs are slowed and cannot teleport.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodOsmium);

    public static final MaterialTrait SFW_OSMIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Increased Mass"))
        .setLore(
            GetText.tr("Attackers will be knocked back."),
            GetText.tr("Gives you slow when procced")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmium)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateOsmium);

    public static final MaterialTrait SFW_OSMIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Draw"))
        .setLore(
            GetText.tr("5% chance to heal by damage dealt.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::linksOsmium);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Brute"))
        .setLore(
            GetText.tr("Slow swinging speed. Hit enemies are stunned"),
            GetText.tr("briefly. Damage +100% with an additional 33%"),
            GetText.tr("chance to crit for a further +100%")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headOsmiumSuperalloy)
        .addConsumer(TraitEventType.TICK, TickEvents::headOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Tuff Stuff"))
        .setLore(
            GetText.tr("Knocks back anything hit and stuns.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headHard);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Tempest"))
        .setLore(
            GetText.tr("When wearing 4 pieces, chance when hit"),
            GetText.tr("to summon a tempest.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateOsmiumSuperalloy);

    public static final MaterialTrait SFW_OSMIUM_SUPERALLOY_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Partial Decay"))
        .setLore(
            GetText.tr("Chance to damage random nearby living"),
            GetText.tr("things. Will never kill.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksOsmiumSuperalloy);

    public static final MaterialTrait SFW_UNPATENTABLIUM_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Innovation"))
        .setLore(
            GetText.tr("+100% Tool and Player EXP during the day.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headUnpatentabilum)
        .addConsumer(TraitEventType.BLOCK_BREAK, BlockBreakEvents::headUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_ROD = new MaterialTrait()
        // Special case in ItemDrop and PlayerDeath
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Incorporeal Right"))
        .setLore(
            GetText.tr("Tool cannot be dropped or lost on death.")
        );

    public static final MaterialTrait SFW_UNPATENTABLIUM_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("Intense Gaze"))
        .setLore(
            GetText.tr("Entities you look at will teleport to you."),
            GetText.tr("Does not work on players or bosses.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateUnpatentabilum);

    public static final MaterialTrait SFW_UNPATENTABLIUM_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.SLIMEFUN_WARFARE_NOTE)
        .setTraitName(GetText.tr("KOTR"))
        .setLore(
            GetText.tr("Chance, when hit, to summon a Knight"),
            GetText.tr("of the Round. (It's a Golem ;))")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateMetal);

    // endregion

    // region DynaTech

    public static final MaterialTrait DYN_STAINLESS_STEEL_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Super Dooper Stainless"))
        .setLore(
            GetText.tr("Like Steel or MagSteel but yet more absurd.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Cutlery"))
        .setLore(
            GetText.tr("Hitting animals will directly feed you. Grim")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::rodStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("The Standard"))
        .setLore(
            GetText.tr("Damage taken reduced by 5%")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::plateStainlessSteel);

    public static final MaterialTrait DYN_STAINLESS_STEEL_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Water Safe"))
        .setLore(
            GetText.tr("Gives you water breathing")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksStainlessSteel);

    public static final MaterialTrait DYN_VEX_GEM_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("NoClip"))
        .setLore(
            GetText.tr("Right click while holding to randomly teleport."),
            GetText.tr("5 min cooldown.")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::bindVex);

    public static final MaterialTrait DYN_VEX_GEM_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Annoying"))
        .setLore(
            GetText.tr("Vex gems shouldn't be used like this!")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonVex);

    public static final MaterialTrait DYN_STAR_DUST_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Bright Fury"))
        .setLore(
            GetText.tr("Attacks dazzle and blind while being."),
            GetText.tr("50% more powerful.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headStarDust);

    public static final MaterialTrait DYN_STAR_DUST_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Yvaine"))
        .setLore(
            GetText.tr("Gives an ethereal glow and makes villagers"),
            GetText.tr("friendlier to you.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::rodStarDust);

    public static final MaterialTrait DYN_STAR_DUST_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Starshine"))
        .setLore(
            GetText.tr("5% chance to heal 1/2 heart during the night")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateStardust);

    public static final MaterialTrait DYN_STAR_DUST_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Bright-burn"))
        .setLore(
            GetText.tr("Gives on stack of Burning Bright! With 4 "),
            GetText.tr("stacks, hostile mobs are repelled (not bosses).")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::brightBurn);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_BINDING = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_BINDING)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Incorporeal"))
        .setLore(
            GetText.tr("Projectiles just pass right through you.")
        )
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::bindGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_ROD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_ROD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("HyperCube [B]"))
        .setLore(
            GetText.tr("Only works with both [A] and [B]. Shift + Right"),
            GetText.tr("click to store a location. Right click to recall"),
            GetText.tr("to that location. (CD: 10m)")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::rodGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_GAMBESON = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_GAMBESON)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Ghost in the shell"))
        .setLore(
            GetText.tr("Slowly damages all nearby mobs at the cost of durability."),
            GetText.tr("Mobs cannot die due to this effect.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::gambesonGhostly);

    public static final MaterialTrait DYN_GHOSTLY_ESSENCE_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Ghostly"))
        .setLore(
            GetText.tr("Hover like a ghost")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::linksGhostly);

    public static final MaterialTrait DYN_TESSERACT_HEAD = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("HyperCube [A]"))
        .setLore(
            GetText.tr("Only works with both [A] and [B]. Shift + Right"),
            GetText.tr("click to store a location. Right click to recall"),
            GetText.tr("to that location. (CD: 10m)")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::headTessMat);

    public static final MaterialTrait DYN_TESSERACT_PLATES = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Hyberbolic Tesseration"))
        .setLore(
            GetText.tr("When in your personal home, you store energy."),
            GetText.tr("Damage taken is removed from this energy pool."),
            GetText.tr("Required 8x pieces to function and caps at 50"),
            GetText.tr("per piece.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    public static final MaterialTrait DYN_TESSERACT_LINKS = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.DYNATECH_NOTE)
        .setTraitName(GetText.tr("Hyberbolic Tesseration"))
        .setLore(
            GetText.tr("When in your personal home, you store energy."),
            GetText.tr("Damage taken is removed from this energy pool."),
            GetText.tr("Required 8x pieces to function and caps at 50"),
            GetText.tr("per piece.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::hyperbolic)
        .addConsumer(TraitEventType.PLAYER_DAMAGED, PlayerDamagedEvents::hyperbolic);

    // endregion

    // region TranscEndence

    public static final MaterialTrait TNS_DAXI_STRENGTH = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_HEAD)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName(GetText.tr("The Power of Daxi"))
        .setLore(
            GetText.tr("Has a chance on hit to unleash the"),
            GetText.tr("power of the Strength Daxi for an"),
            GetText.tr("additional 100% damage.")
        )
        .addConsumer(TraitEventType.ENTITY_DAMAGED, EntityDamageEvents::headDaxiStrength);

    public static final MaterialTrait TNS_DAXI_ABSORPTION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName(GetText.tr("Unite - Absorption"))
        .setLore(
            GetText.tr("When all four defensive Daxi unite,"),
            GetText.tr("you will be granted the power to"),
            GetText.tr("retain your Daxi through death.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiAbsorption);

    public static final MaterialTrait TNS_DAXI_FORTITUDE = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName(GetText.tr("Unite - Fortitude"))
        .setLore(
            GetText.tr("When all four defensive Daxi unite,"),
            GetText.tr("you will be granted the power to"),
            GetText.tr("retain your Daxi through death.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiFortitude);

    public static final MaterialTrait TNS_DAXI_SATURATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName(GetText.tr("Unite - Saturation"))
        .setLore(
            GetText.tr("When all four defensive Daxi unite,"),
            GetText.tr("you will be granted the power to"),
            GetText.tr("retain your Daxi through death.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiSaturation);

    public static final MaterialTrait TNS_DAXI_REGENERATION = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_PLATES)
        .setAddedBy(SupportedPluginsManager.TRANSCENDENCE_NOTE)
        .setTraitName(GetText.tr("Unite - Regeneration"))
        .setLore(
            GetText.tr("When all four defensive Daxi unite,"),
            GetText.tr("you will be granted the power to"),
            GetText.tr("retain your Daxi through death.")
        )
        .addConsumer(TraitEventType.TICK, TickEvents::plateDaxiRegeneration);

    // endregion

    // region Networks

    public static final MaterialTrait NTW_UTLIMANINIUM = new MaterialTrait()
        .setPartType(MaterialTrait.PROP_LINKS)
        .setAddedBy(SupportedPluginsManager.NETWORKS_NOTE)
        .setTraitName(GetText.tr("Feeling Connected"))
        .setLore(
            GetText.tr("Allows you to connect wirelessly"),
            GetText.tr("to a network using direct nural"),
            GetText.tr("connection via your helmet."),
            "",
            GetText.tr("Shift + Left Click with an empty"),
            GetText.tr("hand to bind to a grid."),
            "",
            GetText.tr("Left Click air with an empty hand to"),
            GetText.tr("try to open the bound grid."),
            "",
            GetText.tr("Will only work on a helmet.")
        )
        .addConsumer(TraitEventType.INTERACT, InteractionEvents::linksUltimaninium);

    // endregion
}
