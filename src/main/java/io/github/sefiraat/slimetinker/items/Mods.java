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

public final class Mods {

    private Mods() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final SlimefunItemStack MOD_REDSTONE_DUMMY = ThemeUtils.themedItemStack(
        "MOD_REDSTONE_DUMMY",
        Material.REDSTONE,
        ThemeItemType.MOD,
        "模組: 紅石",
        ThemeUtils.PASSIVE + "可安裝裝備: 工具/武器",
        "",
        ThemeUtils.PASSIVE + "玩家手持該裝備時,",
        ThemeUtils.PASSIVE + "可以獲得與模組等級對應的急迫效果"
    );

    public static final SlimefunItemStack MOD_LAPIS_DUMMY = ThemeUtils.themedItemStack(
        "MOD_LAPIS_DUMMY",
        Material.LAPIS_LAZULI,
        ThemeItemType.MOD,
        "模組: 青金石",
        ThemeUtils.PASSIVE + "可安裝裝備: 工具/武器",
        "",
        ThemeUtils.PASSIVE + "玩家手持該裝備時,",
        ThemeUtils.PASSIVE + "會獲得模組等級對應幸運或搶奪附魔的效果",
        ThemeUtils.PASSIVE + "每安裝1個該模組可提升10%的效果"
    );

    public static final SlimefunItemStack MOD_QUARTZ_DUMMY = ThemeUtils.themedItemStack(
        "MOD_QUARTZ_DUMMY",
        Material.QUARTZ,
        ThemeItemType.MOD,
        "模組: 石英",
        ThemeUtils.PASSIVE + "可安裝裝備: 工具/武器",
        "",
        ThemeUtils.PASSIVE + "玩家手持該裝備時,",
        ThemeUtils.PASSIVE + "會增加該工具/武器的傷害",
        ThemeUtils.PASSIVE + "每安裝1個該模組可提升20%的效果"
    );

    public static final SlimefunItemStack MOD_DIAMOND_DUMMY = ThemeUtils.themedItemStack(
        "MOD_DIAMOND_DUMMY",
        Material.DIAMOND,
        ThemeItemType.MOD,
        "模組: 鑽石",
        ThemeUtils.PASSIVE + "可安裝裝備: 工具/武器",
        "",
        ThemeUtils.PASSIVE + "玩家手持該裝備時,",
        ThemeUtils.PASSIVE + "受到攻擊時有幾率反彈傷害",
        ThemeUtils.PASSIVE + "每安裝1個該模組可提升10%的效果"
    );

    public static final SlimefunItemStack MOD_EMERALD_DUMMY = ThemeUtils.themedItemStack(
        "MOD_EMERALD_DUMMY",
        Material.EMERALD,
        ThemeItemType.MOD,
        "模組: 綠寶石",
        ThemeUtils.PASSIVE + "可安裝裝備: 工具/武器",
        "",
        ThemeUtils.PASSIVE + "每次使用裝備都可以獲得額外經驗",
        ThemeUtils.PASSIVE + "每安裝1個該模組可提升1點額外工具經驗或10%額外武器經驗"
    );


    public static final SlimefunItemStack MOD_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "MOD_PLATE_DUMMY",
        Material.OBSIDIAN,
        ThemeItemType.MOD,
        "模組: 強化合金板",
        ThemeUtils.PASSIVE + "可安裝裝備: 工具/武器/裝備",
        "",
        ThemeUtils.PASSIVE + "每安裝1個該模組可增加10%不消耗耐久的幾率",
        ThemeUtils.PASSIVE + "安裝10個模組的裝備無法破壞"
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
