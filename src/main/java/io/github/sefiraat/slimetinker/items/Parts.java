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
import org.mini2Dx.gettext.GetText;

public final class Parts {

    private Parts() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final String DESC_ERROR = GetText.tr("Error");

    public static final SlimefunItemStack PART_SHOVEL_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_SHOVEL_HEAD_DUMMY",
        SkullTextures.PART_SHOVEL_HEAD,
        ThemeItemType.CAST,
        GetText.tr("Part: Shovel Head"),
        ThemeUtils.PASSIVE + GetText.tr("A cast shovel head.")
    );

    public static final SlimefunItemStack PART_PICKAXE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_PICKAXE_HEAD_DUMMY",
        SkullTextures.PART_PICKAXE_HEAD,
        ThemeItemType.CAST,
        GetText.tr("Part: Pickaxe Head"),
        ThemeUtils.PASSIVE + GetText.tr("A cast pickaxe head.")
    );

    public static final SlimefunItemStack PART_AXE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_AXE_HEAD_DUMMY",
        SkullTextures.PART_AXE_HEAD,
        ThemeItemType.CAST,
        GetText.tr("Part: Axe Head"),
        ThemeUtils.PASSIVE + GetText.tr("A cast axe head.")
    );

    public static final SlimefunItemStack PART_HOE_HEAD_DUMMY = ThemeUtils.themedItemStack(
        "PART_HOE_HEAD_DUMMY",
        SkullTextures.PART_HOE_HEAD,
        ThemeItemType.CAST,
        GetText.tr("Part: Hoe Head"),
        ThemeUtils.PASSIVE + GetText.tr("A cast hoe head.")
    );

    public static final SlimefunItemStack PART_SWORD_BLADE_DUMMY = ThemeUtils.themedItemStack(
        "PART_SWORD_BLADE_DUMMY",
        SkullTextures.PART_SWORD_BLADE,
        ThemeItemType.CAST,
        GetText.tr("Part: Sword Blade"),
        ThemeUtils.PASSIVE + GetText.tr("A cast sword blade.")
    );

    public static final SlimefunItemStack PART_TOOL_ROD_DUMMY = ThemeUtils.themedItemStack(
        "PART_TOOL_ROD_DUMMY",
        SkullTextures.PART_TOOL_ROD,
        ThemeItemType.CAST,
        GetText.tr("Part: Tool Rod"),
        ThemeUtils.PASSIVE + GetText.tr("A cast tool rod.")
    );

    public static final SlimefunItemStack PART_BINDING_DUMMY = ThemeUtils.themedItemStack(
        "PART_BINDING_DUMMY",
        SkullTextures.PART_BINDING,
        ThemeItemType.CAST,
        GetText.tr("Part: Binding"),
        ThemeUtils.PASSIVE + GetText.tr("A binging to hold parts together.")
    );

    public static final SlimefunItemStack PART_HELM_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_HELM_PLATE_DUMMY",
        SkullTextures.PART_HELM_PLATES,
        ThemeItemType.CAST,
        GetText.tr("Part: Helmet Plates"),
        ThemeUtils.PASSIVE + GetText.tr("A cast helmet plate set.")
    );

    public static final SlimefunItemStack PART_CHEST_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_CHEST_PLATE_DUMMY",
        SkullTextures.PART_CHEST_PLATES,
        ThemeItemType.CAST,
        GetText.tr("Part: Chest Plates"),
        ThemeUtils.PASSIVE + GetText.tr("A cast chest plate set.")
    );

    public static final SlimefunItemStack PART_LEG_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_LEG_PLATE_DUMMY",
        SkullTextures.PART_LEG_PLATES,
        ThemeItemType.CAST,
        GetText.tr("Part: Leg Plates"),
        ThemeUtils.PASSIVE + GetText.tr("A cast legging plate set.")
    );

    public static final SlimefunItemStack PART_BOOT_PLATE_DUMMY = ThemeUtils.themedItemStack(
        "PART_BOOT_PLATE_DUMMY",
        SkullTextures.PART_BOOTS_PLATES,
        ThemeItemType.CAST,
        GetText.tr("Part: Boot Plates"),
        ThemeUtils.PASSIVE + GetText.tr("A cast legging plate set.")
    );

    public static final SlimefunItemStack PART_MAIL_LINKS_DUMMY = ThemeUtils.themedItemStack(
        "PART_MAIL_LINKS_DUMMY",
        SkullTextures.PART_LINKS,
        ThemeItemType.CAST,
        GetText.tr("Part: Mail Links"),
        ThemeUtils.PASSIVE + GetText.tr("A flexible mesh of cast metal links")
    );

    public static final SlimefunItemStack PART_GAMBESON_DUMMY = ThemeUtils.themedItemStack(
        "PART_GAMBESON_DUMMY",
        SkullTextures.PART_GAMBESON,
        ThemeItemType.CAST,
        GetText.tr("Part: Gambeson"),
        ThemeUtils.PASSIVE + GetText.tr("A fabric under-armour garment")
    );

    public static final SlimefunItemStack PART_REPAIR_KIT_DUMMY = ThemeUtils.themedItemStack(
        "PART_REPAIR_KIT_DUMMY",
        Material.CHEST_MINECART,
        ThemeItemType.CAST,
        GetText.tr("Part: Repair Kit"),
        ThemeUtils.PASSIVE + GetText.tr("Repairs broken items in the Repair Bench.")
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
        GetText.tr("Binding Material"),
        ThemeUtils.PASSIVE + GetText.tr("A material suitable to make binding from."),
        ThemeUtils.PASSIVE + GetText.tr("This is not JUST string, experiment with"),
        ThemeUtils.PASSIVE + GetText.tr("similar materials.")
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
        GetText.tr("Gambeson Material"),
        ThemeUtils.PASSIVE + GetText.tr("A material suitable to make a Gambeson."),
        ThemeUtils.PASSIVE + GetText.tr("This is not JUST string, experiment with"),
        ThemeUtils.PASSIVE + GetText.tr("similar materials.")
    );

    // Statics for Recipes
    public static final PartTemplate SHOVEL_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_SHOVEL_HEAD, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Shovel Head"));
    public static final PartTemplate PICKAXE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_PICKAXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Pickaxe Head"));
    public static final PartTemplate AXE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_AXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Axe Head"));
    public static final PartTemplate HOE_HEAD = new PartTemplate(ItemGroups.DUMMY, PART_HOE_HEAD, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Hoe Head"));
    public static final PartTemplate SWORD_BLADE = new PartTemplate(ItemGroups.DUMMY, PART_SWORD_BLADE, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Sword Blade"));
    public static final PartTemplate TOOL_ROD = new PartTemplate(ItemGroups.DUMMY, PART_TOOL_ROD, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Tool Rod"));
    public static final RepairkitTemplate REPAIR_KIT = new RepairkitTemplate(ItemGroups.DUMMY, PART_REPAIR_KIT, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Repair Kit"));
    public static final PartTemplate HELM_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_HELM_PLATES, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Helmet Plates"));
    public static final PartTemplate CHEST_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_CHEST_PLATES, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Chestplate Plates"));
    public static final PartTemplate LEG_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_LEG_PLATES, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Legging Plates"));
    public static final PartTemplate BOOT_PLATE = new PartTemplate(ItemGroups.DUMMY, PART_BOOTS_PLATES, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Boot Plates"));
    public static final PartTemplate MAIL_LINKS = new PartTemplate(ItemGroups.DUMMY, PART_MAIL_LINKS, DummySmeltery.TYPE, new ItemStack[9], GetText.tr("Mail Links"));

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
