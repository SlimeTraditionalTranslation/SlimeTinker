package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.templates.PartTemplate;
import io.github.sefiraat.slimetinker.items.templates.RepairkitTemplate;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.DummyWorkbench;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Parts {

    public static final String DESC_ERROR = "錯誤";

    protected static ItemStack[] getDummyCastRecipe(ItemStack cast) {
        return new ItemStack[]{
                null, null, null,
                null, cast, null,
                null, null, null
        };
    }

    public static final SlimefunItemStack PART_SHOVEL_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_SHOVEL_HEAD_DUMMY",
                    SkullTextures.PART_SHOVEL_HEAD,
                    ThemeItemType.CAST,
                    "部件:鏟子前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:鏟子前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_PICKAXE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_PICKAXE_HEAD_DUMMY",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeItemType.CAST,
                    "部件:鎬子前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:鎬子前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_AXE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_AXE_HEAD_DUMMY",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeItemType.CAST,
                    "部件:斧頭前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:斧頭前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_HOE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_HOE_HEAD_DUMMY",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeItemType.CAST,
                    "部件:鋤頭前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:鋤頭前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_SWORD_BLADE_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_SWORD_BLADE_DUMMY",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeItemType.CAST,
                    "部件:劍前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:劍前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_TOOL_ROD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_TOOL_ROD_DUMMY",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeItemType.CAST,
                    "部件:手柄",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:手柄"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_BINDING_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_DUMMY",
                    SkullTextures.PART_BINDING,
                    ThemeItemType.CAST,
                    "部件:接合物",
                    ThemeUtils.PASSIVE + "將前端與手柄接合在一起",
                    ThemeUtils.PASSIVE + "可以作為材料的有:",
                    ThemeUtils.PASSIVE + "線、史萊姆球、藤蔓......"
            );

    public static final SlimefunItemStack PART_HELM_PLATE_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_HELM_PLATE_DUMMY",
                    SkullTextures.PART_HELM_PLATES,
                    ThemeItemType.CAST,
                    "Part: Helmet Plates",
                    ThemeUtils.PASSIVE + "A cast helmet plate set."
            );

    public static final SlimefunItemStack PART_CHEST_PLATE_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_CHEST_PLATE_DUMMY",
                    SkullTextures.PART_CHEST_PLATES,
                    ThemeItemType.CAST,
                    "Part: Chest Plates",
                    ThemeUtils.PASSIVE + "A cast chest plate set."
            );

    public static final SlimefunItemStack PART_LEG_PLATE_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_LEG_PLATE_DUMMY",
                    SkullTextures.PART_LEG_PLATES,
                    ThemeItemType.CAST,
                    "Part: Leg Plates",
                    ThemeUtils.PASSIVE + "A cast legging plate set."
            );

    public static final SlimefunItemStack PART_BOOT_PLATE_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_BOOT_PLATE_DUMMY",
                    SkullTextures.PART_BOOTS_PLATES,
                    ThemeItemType.CAST,
                    "Part: Boot Plates",
                    ThemeUtils.PASSIVE + "A cast legging plate set."
            );

    public static final SlimefunItemStack PART_MAIL_LINKS_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_MAIL_LINKS_DUMMY",
                    SkullTextures.PART_LINKS,
                    ThemeItemType.CAST,
                    "Part: Mail Links",
                    ThemeUtils.PASSIVE + "A flexible mesh of cast metal links"
            );

    public static final SlimefunItemStack PART_GAMBESON_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_GAMBESON_DUMMY",
                    SkullTextures.PART_GAMBESON,
                    ThemeItemType.CAST,
                    "Part: Gambeson",
                    ThemeUtils.PASSIVE + "A fabric under-armour garment"
            );

    public static final SlimefunItemStack PART_REPAIR_KIT_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_REPAIR_KIT_DUMMY",
                    Material.CHEST_MINECART,
                    ThemeItemType.CAST,
                    "部件:修復零件",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:修復零件"+ThemeUtils.PASSIVE+"上，即可取得",
                    "可以在修復台消耗修復零件，將工具或武器修復"
            );

    public static final SlimefunItemStack PART_AXE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_AXE_HEAD",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_HOE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_HOE_HEAD",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_PICKAXE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_PICKAXE_HEAD",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_SHOVEL_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_SHOVEL_HEAD",
                    SkullTextures.PART_SHOVEL_HEAD,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_SWORD_BLADE =
            ThemeUtils.themedItemStack(
                    "PART_SWORD_BLADE",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_TOOL_ROD =
            ThemeUtils.themedItemStack(
                    "PART_TOOL_ROD",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_REPAIR_KIT =
            ThemeUtils.themedItemStack(
                    "PART_REPAIR_KIT",
                    Material.CHEST_MINECART,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_BINDING_GENERAL_DISPLAY =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_GENERAL_DISPLAY",
                    Material.STRING,
                    ThemeItemType.CRAFTING,
                    "接合物材料",
                    ThemeUtils.PASSIVE + "一種適合做接合物的材料.",
                    ThemeUtils.PASSIVE + "這並不是單純只能用線合成, 可以用其他",
                    ThemeUtils.PASSIVE + "類似的材料 並擺放的像這樣即可."
            );

    public static final SlimefunItemStack PART_HELM_PLATES =
            ThemeUtils.themedItemStack(
                    "PART_HELM_PLATES",
                    SkullTextures.PART_HELM_PLATES,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_CHEST_PLATES =
            ThemeUtils.themedItemStack(
                    "PART_CHEST_PLATES",
                    SkullTextures.PART_CHEST_PLATES,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_LEG_PLATES =
            ThemeUtils.themedItemStack(
                    "PART_LEG_PLATES",
                    SkullTextures.PART_LEG_PLATES,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_BOOTS_PLATES =
            ThemeUtils.themedItemStack(
                    "PART_BOOTS_PLATES",
                    SkullTextures.PART_BOOTS_PLATES,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_MAIL_LINKS =
            ThemeUtils.themedItemStack(
                    "PART_MAIL_LINKS",
                    SkullTextures.PART_LINKS,
                    ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_GAMBESON_GENERAL_DISPLAY =
            ThemeUtils.themedItemStack(
                    "PART_GAMBESON_GENERAL_DISPLAY",
                    Material.STRING,
                    ThemeItemType.CRAFTING,
                    "Gambeson Material",
                    ThemeUtils.PASSIVE + "A material suitable to make a Gambeson.",
                    ThemeUtils.PASSIVE + "This is not JUST string, experiment with",
                    ThemeUtils.PASSIVE + "similar materials."
            );


    // Statics for Recipes
    public static final PartTemplate SHOVEL_HEAD = new PartTemplate(Categories.DUMMY, PART_SHOVEL_HEAD, DummySmeltery.TYPE, new ItemStack[9], "鏟子前端");
    public static final PartTemplate PICKAXE_HEAD = new PartTemplate(Categories.DUMMY, PART_PICKAXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "鎬子前端");
    public static final PartTemplate AXE_HEAD = new PartTemplate(Categories.DUMMY, PART_AXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "斧頭前端");
    public static final PartTemplate HOE_HEAD = new PartTemplate(Categories.DUMMY, PART_HOE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "鋤頭前端");
    public static final PartTemplate SWORD_BLADE = new PartTemplate(Categories.DUMMY, PART_SWORD_BLADE, DummySmeltery.TYPE, new ItemStack[9], "劍前端");
    public static final PartTemplate TOOL_ROD = new PartTemplate(Categories.DUMMY, PART_TOOL_ROD, DummySmeltery.TYPE, new ItemStack[9], "手柄");
    public static final RepairkitTemplate REPAIR_KIT = new RepairkitTemplate(Categories.DUMMY, PART_REPAIR_KIT, DummySmeltery.TYPE, new ItemStack[9], "修復零件");

    public static final PartTemplate HELM_PLATE = new PartTemplate(Categories.DUMMY, PART_HELM_PLATES, DummySmeltery.TYPE, new ItemStack[9],"Helmet Plates");
    public static final PartTemplate CHEST_PLATE = new PartTemplate(Categories.DUMMY, PART_CHEST_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Chestplate Plates");
    public static final PartTemplate LEG_PLATE = new PartTemplate(Categories.DUMMY, PART_LEG_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Legging Plates");
    public static final PartTemplate BOOT_PLATE = new PartTemplate(Categories.DUMMY, PART_BOOTS_PLATES, DummySmeltery.TYPE, new ItemStack[9], "Boot Plates");
    public static final PartTemplate MAIL_LINKS = new PartTemplate(Categories.DUMMY, PART_MAIL_LINKS, DummySmeltery.TYPE, new ItemStack[9], "Mail Links");

    public static void set(SlimeTinker p) {

        // Dummies for the recipe book
        new UnplaceableBlock(Categories.PARTS, PART_SHOVEL_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_SHOVELHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_PICKAXE_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_PICKAXEHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_AXE_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_AXEHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_HOE_HEAD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_HOEHEAD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_SWORD_BLADE_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_SWORDBLADE)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_TOOL_ROD_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_TOOLROD)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_BINDING_DUMMY, DummyWorkbench.TYPE, new ItemStack[]{
                PART_BINDING_GENERAL_DISPLAY, null,   PART_BINDING_GENERAL_DISPLAY,
                null,   PART_BINDING_GENERAL_DISPLAY, null,
                PART_BINDING_GENERAL_DISPLAY, null,   PART_BINDING_GENERAL_DISPLAY
        }).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_HELM_PLATE_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_HELM_PLATE)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_CHEST_PLATE_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_CHEST_PLATE)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_LEG_PLATE_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_LEG_PLATE)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_BOOT_PLATE_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_BOOT_PLATE)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_MAIL_LINKS_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_MAIL_LINK)).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_GAMBESON_DUMMY, DummyWorkbench.TYPE, new ItemStack[]{
                null, PART_GAMBESON_GENERAL_DISPLAY,   PART_BINDING_GENERAL_DISPLAY,
                PART_GAMBESON_GENERAL_DISPLAY,   null, PART_GAMBESON_GENERAL_DISPLAY,
                PART_BINDING_GENERAL_DISPLAY, PART_GAMBESON_GENERAL_DISPLAY,   null
        }).register(p);
        new UnplaceableBlock(Categories.PARTS, PART_REPAIR_KIT_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_REPAIRKIT)).register(p);

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
