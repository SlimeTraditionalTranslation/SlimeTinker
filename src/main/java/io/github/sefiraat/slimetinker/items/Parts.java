package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.itemgroups.ItemGroups;
import io.github.sefiraat.slimetinker.items.templates.PartTemplate;
import io.github.sefiraat.slimetinker.items.templates.RepairkitTemplate;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.DummyWorkbench;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Parts {

    private Parts() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final String DESC_ERROR = "錯誤";

    public static final SlimefunItemStack PART_SHOVEL_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_SHOVEL_HEAD_DUMMY",
        SkullTextures.PART_SHOVEL_HEAD,
        ThemeItemType.CAST,
        "部件: 鏟頭",
        ThemeUtils.PASSIVE + "一個鏟頭部件"
    );

    public static final SlimefunItemStack PART_PICKAXE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_PICKAXE_HEAD_DUMMY",
        SkullTextures.PART_PICKAXE_HEAD,
        ThemeItemType.CAST,
        "部件: 鎬頭",
        ThemeUtils.PASSIVE + "一個鎬頭部件"
    );

    public static final SlimefunItemStack PART_AXE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_AXE_HEAD_DUMMY",
        SkullTextures.PART_AXE_HEAD,
        ThemeItemType.CAST,
        "部件: 斧刃",
        ThemeUtils.PASSIVE + "一個斧刃部件"
    );

    public static final SlimefunItemStack PART_HOE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_HOE_HEAD_DUMMY",
        SkullTextures.PART_HOE_HEAD,
        ThemeItemType.CAST,
        "部件: 鋤頭",
        ThemeUtils.PASSIVE + "一個鋤頭部件"
    );

    public static final SlimefunItemStack PART_SWORD_BLADE_DUMMY = ThemeUtils.themedItemStack(
        "PART_SWORD_BLADE_DUMMY",
        SkullTextures.PART_SWORD_BLADE,
        ThemeItemType.CAST,
        "部件: 劍刃",
        ThemeUtils.PASSIVE + "一個劍刃部件"
    );

    public static final SlimefunItemStack PART_TOOL_ROD_DUMMY = ThemeUtils.themedItemStack(
        "PART_TOOL_ROD_DUMMY",
        SkullTextures.PART_TOOL_ROD,
        ThemeItemType.CAST,
        "部件: 手柄",
        ThemeUtils.PASSIVE + "一個手柄部件"
    );

    public static final SlimefunItemStack PART_BINDING_DUMMY = ThemeUtils.themedItemStack(
        "PART_BINDING_DUMMY",
        SkullTextures.PART_BINDING,
        ThemeItemType.CAST,
        "部件: 綁定結",
        ThemeUtils.PASSIVE + "一個綁定結部件"
    );

    public static final SlimefunItemStack PART_HELM_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_HELM_PLATE_DUMMY",
        SkullTextures.PART_HELM_PLATES,
        ThemeItemType.CAST,
        "部件: 頭盔板",
        ThemeUtils.PASSIVE + "一個頭盔板部件"
    );

    public static final SlimefunItemStack PART_CHEST_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_CHEST_PLATE_DUMMY",
        SkullTextures.PART_CHEST_PLATES,
        ThemeItemType.CAST,
        "部件: 胸甲板",
        ThemeUtils.PASSIVE + "一個胸甲板部件"
    );

    public static final SlimefunItemStack PART_LEG_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_LEG_PLATE_DUMMY",
        SkullTextures.PART_LEG_PLATES,
        ThemeItemType.CAST,
        "部件: 護腿板",
        ThemeUtils.PASSIVE + "一個護腿板部件"
    );

    public static final SlimefunItemStack PART_BOOT_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_BOOT_PLATE_DUMMY",
        SkullTextures.PART_BOOTS_PLATES,
        ThemeItemType.CAST,
        "部件: 靴子板",
        ThemeUtils.PASSIVE + "一個靴子板部件"
    );

    public static final SlimefunItemStack PART_MAIL_LINKS_DUMMY = ThemeUtils.themedItemStack(
        "PART_MAIL_LINKS_DUMMY",
        SkullTextures.PART_LINKS,
        ThemeItemType.CAST,
        "部件: 盔甲接合物",
        ThemeUtils.PASSIVE + "一個盔甲接合物部件"
    );

    public static final SlimefunItemStack PART_GAMBESON_DUMMY = ThemeUtils.themedItemStack(
        "PART_GAMBESON_DUMMY",
        SkullTextures.PART_GAMBESON,
        ThemeItemType.CAST,
        "部件: 護身軟甲",
        ThemeUtils.PASSIVE + "一件盔甲內的軟甲"
    );

    public static final SlimefunItemStack PART_REPAIR_KIT_DUMMY = ThemeUtils.themedItemStack(
        "PART_REPAIR_KIT_DUMMY",
        Material.CHEST_MINECART,
        ThemeItemType.CAST,
        "部件: 修復工具",
        ThemeUtils.PASSIVE + "用於在匠魂修復台中修復損壞的裝備"
    );

    public static final SlimefunItemStack PART_AXE_HEAD = ThemeUtils.themedItemStack(
        "PART_AXE_HEAD",
        SkullTextures.PART_AXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_HOE_HEAD = ThemeUtils.themedItemStack(
        "PART_HOE_HEAD",
        SkullTextures.PART_HOE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_PICKAXE_HEAD = ThemeUtils.themedItemStack(
        "PART_PICKAXE_HEAD",
        SkullTextures.PART_PICKAXE_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_SHOVEL_HEAD = ThemeUtils.themedItemStack(
        "PART_SHOVEL_HEAD",
        SkullTextures.PART_SHOVEL_HEAD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_SWORD_BLADE = ThemeUtils.themedItemStack(
        "PART_SWORD_BLADE",
        SkullTextures.PART_SWORD_BLADE,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_TOOL_ROD = ThemeUtils.themedItemStack(
        "PART_TOOL_ROD",
        SkullTextures.PART_TOOL_ROD,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_REPAIR_KIT = ThemeUtils.themedItemStack(
        "PART_REPAIR_KIT",
        Material.CHEST_MINECART,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_BINDING_GENERAL_DISPLAY = ThemeUtils.themedItemStack(
        "PART_BINDING_GENERAL_DISPLAY",
        Material.STRING,
        ThemeItemType.CRAFTING,
        "綁定結材料",
        ThemeUtils.PASSIVE + "可以使用任意適合做綁定結的材料",
        ThemeUtils.PASSIVE + "不僅可以用線,其他適用材料都可以",
        ThemeUtils.PASSIVE + "按照這樣擺放即可"
    );

    public static final SlimefunItemStack PART_HELM_PLATES = ThemeUtils.themedItemStack(
        "PART_HELM_PLATES",
        SkullTextures.PART_HELM_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_CHEST_PLATES = ThemeUtils.themedItemStack(
        "PART_CHEST_PLATES",
        SkullTextures.PART_CHEST_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_LEG_PLATES = ThemeUtils.themedItemStack(
        "PART_LEG_PLATES",
        SkullTextures.PART_LEG_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_BOOTS_PLATES = ThemeUtils.themedItemStack(
        "PART_BOOTS_PLATES",
        SkullTextures.PART_BOOTS_PLATES,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_MAIL_LINKS = ThemeUtils.themedItemStack(
        "PART_MAIL_LINKS",
        SkullTextures.PART_LINKS,
        ThemeItemType.PART,
        DESC_ERROR,
        ThemeUtils.PASSIVE + DESC_ERROR
    );

    public static final SlimefunItemStack PART_GAMBESON_GENERAL_DISPLAY = ThemeUtils.themedItemStack(
        "PART_GAMBESON_GENERAL_DISPLAY",
        Material.STRING,
        ThemeItemType.CRAFTING,
        "護身軟甲材料",
        ThemeUtils.PASSIVE + "可以使用任意適合做護身軟甲的材料",
        ThemeUtils.PASSIVE + "不僅可以用線,其他適用材料都可以",
        ThemeUtils.PASSIVE + "按照這樣擺放即可"
    );

    // Statics for Recipes
    public static final PartTemplate SHOVEL_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_SHOVEL_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Shovel Head");
    public static final PartTemplate PICKAXE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_PICKAXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Pickaxe Head");
    public static final PartTemplate AXE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_AXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Axe Head");
    public static final PartTemplate HOE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_HOE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "Hoe Head");
    public static final PartTemplate SWORD_BLADE = new PartTemplate(ItemGroups.DUMMY, PART_SWORD_BLADE, DummySmeltery.TYPE, new ItemStack[9], "Sword Blade");
    public static final PartTemplate TOOL_ROD = new PartTemplate(ItemGroups.DUMMY, PART_TOOL_ROD, DummySmeltery.TYPE, new ItemStack[9], "Tool Rod");
    public static final RepairkitTemplate REPAIR_KIT = new RepairkitTemplate(ItemGroups.DUMMY, PART_REPAIR_KIT, DummySmeltery.TYPE, new ItemStack[9], "Repair Kit");
    public static final PartTemplate HELM_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_HELM_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Helmet Plates");
    public static final PartTemplate CHEST_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_CHEST_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Chestplate Plates");
    public static final PartTemplate LEG_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_LEG_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Legging Plates");
    public static final PartTemplate BOOT_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_BOOTS_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Boot Plates");
    public static final PartTemplate MAIL_LINKS = new PartTemplate(ItemGroups.DUMMY, PART_MAIL_LINKS, DummySmeltery.TYPE, new ItemStack[9], "Mail Links");

    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(ItemGroups.PARTS, PART_SHOVEL_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_SHOVELHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_PICKAXE_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_PICKAXEHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_AXE_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_AXEHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_HOE_HEAD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_HOEHEAD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_SWORD_BLADE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_SWORDBLADE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_TOOL_ROD_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_TOOLROD)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_BINDING_DUMMY, DummyWorkbench.TYPE, new ItemStack[]{
            PART_BINDING_GENERAL_DISPLAY, null, PART_BINDING_GENERAL_DISPLAY,
            null, PART_BINDING_GENERAL_DISPLAY, null,
            PART_BINDING_GENERAL_DISPLAY, null, PART_BINDING_GENERAL_DISPLAY
        }).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_HELM_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_HELM_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_CHEST_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_CHEST_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_LEG_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_LEG_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_BOOT_PLATE_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_BOOT_PLATE)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_MAIL_LINKS_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_MAIL_LINK)).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_GAMBESON_DUMMY, DummyWorkbench.TYPE, new ItemStack[]{
            null, PART_GAMBESON_GENERAL_DISPLAY, PART_BINDING_GENERAL_DISPLAY,
            PART_GAMBESON_GENERAL_DISPLAY, null, PART_GAMBESON_GENERAL_DISPLAY,
            PART_BINDING_GENERAL_DISPLAY, PART_GAMBESON_GENERAL_DISPLAY, null
        }).register(p);
        new UnplaceableBlock(ItemGroups.PARTS, PART_REPAIR_KIT_DUMMY, DummySmeltery.TYPE, ItemUtils.getMiddleOnlyRecipe(Casts.CAST_REPAIRKIT)).register(p);

        // Real ones, not in recipe book due to the variations
        SHOVEL_HEAD.register(p);
        PICKAXE_HEAD.register(p);
        AXE_HEAD.register(p);
        HOE_HEAD.register(p);
        SWORD_BLADE.register(p);
        TOOL_ROD.register(p);

        REPAIR_KIT.register(p);

        HELM_PLATE.register(p);
        CHEST_PLATE.register(p);
        LEG_PLATE.register(p);
        BOOT_PLATE.register(p);

    }

}
