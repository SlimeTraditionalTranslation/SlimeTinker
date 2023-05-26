package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.DummyModificationStation;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.mini2Dx.gettext.GetText;

public final class Mods {

    private Mods() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final SlimefunItemStack MOD_REDSTONE_DUMMY = ThemeUtils.themedItemStack(
        "MOD_REDSTONE_DUMMY",
        Material.REDSTONE,
        ThemeItemType.MOD,
        GetText.tr("Modification: Redstone"),
        ThemeUtils.PASSIVE + GetText.tr("When applied to a tool, the holder"),
        ThemeUtils.PASSIVE + GetText.tr("will be given Haste matching the level"),
        ThemeUtils.PASSIVE + GetText.tr("of the modification.")
    );

    public static final SlimefunItemStack MOD_LAPIS_DUMMY = ThemeUtils.themedItemStack(
        "MOD_LAPIS_DUMMY",
        Material.LAPIS_LAZULI,
        ThemeItemType.MOD,
        GetText.tr("Modification: Lapis"),
        ThemeUtils.PASSIVE + GetText.tr("When applied to a tool, the holder"),
        ThemeUtils.PASSIVE + GetText.tr("will drop bonus items from blocks or"),
        ThemeUtils.PASSIVE + GetText.tr("kills. Calculated after fortune/looting."),
        ThemeUtils.PASSIVE + GetText.tr("10% per level.")
    );

    public static final SlimefunItemStack MOD_QUARTZ_DUMMY = ThemeUtils.themedItemStack(
        "MOD_QUARTZ_DUMMY",
        Material.QUARTZ,
        ThemeItemType.MOD,
        GetText.tr("Modification: Quartz"),
        ThemeUtils.PASSIVE + GetText.tr("When applied to a tool, the holder"),
        ThemeUtils.PASSIVE + GetText.tr("will deal bonus damage. Calculated after"),
        ThemeUtils.PASSIVE + GetText.tr("sharpness or other damage enchants."),
        ThemeUtils.PASSIVE + GetText.tr("20% per level")
    );

    public static final SlimefunItemStack MOD_DIAMOND_DUMMY = ThemeUtils.themedItemStack(
        "MOD_DIAMOND_DUMMY",
        Material.DIAMOND,
        ThemeItemType.MOD,
        GetText.tr("Modification: Diamond"),
        ThemeUtils.PASSIVE + GetText.tr("When applied to a tool, the holder"),
        ThemeUtils.PASSIVE + GetText.tr("has a chance to reflect damage taken"),
        ThemeUtils.PASSIVE + GetText.tr("back on to the attacker. 10% per level")
    );

    public static final SlimefunItemStack MOD_EMERALD_DUMMY = ThemeUtils.themedItemStack(
        "MOD_EMERALD_DUMMY",
        Material.EMERALD,
        ThemeItemType.MOD,
        GetText.tr("Modification: Emerald"),
        ThemeUtils.PASSIVE + GetText.tr("When applied to a tool, the holder"),
        ThemeUtils.PASSIVE + GetText.tr("will gain bonus tool EXP per action"),
        ThemeUtils.PASSIVE + GetText.tr("undertaken. +1 exp for tools and 10%"),
        ThemeUtils.PASSIVE + GetText.tr("for weapons.")
    );


    public static final SlimefunItemStack MOD_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "MOD_PLATE_DUMMY",
        Material.OBSIDIAN,
        ThemeItemType.MOD,
        GetText.tr("Modification: Reinforced Plate"),
        ThemeUtils.PASSIVE + GetText.tr("A tool with this modification has a"),
        ThemeUtils.PASSIVE + GetText.tr("chance to not take durability damage. 10%"),
        ThemeUtils.PASSIVE + GetText.tr("per level - at Level 10 tools are unbreakable")
    );


    public static void set(SlimeTinker p) {
        // Dummies for the recipe book
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_REDSTONE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_LAPIS_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_QUARTZ_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_DIAMOND_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_EMERALD_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
        new UnplaceableBlock(ItemGroups.MODIFICATIONS, MOD_PLATE_DUMMY, DummyModificationStation.TYPE, new ItemStack[9]).register(p);
    }
}
