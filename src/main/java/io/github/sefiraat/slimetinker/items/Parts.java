package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.templates.PartTemplate;
import io.github.sefiraat.slimetinker.items.templates.RepairkitTemplate;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.DummyWorkbench;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
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
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:鏟子前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:鏟子前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_PICKAXE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_PICKAXE_HEAD_DUMMY",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:鎬子前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:鎬子前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_AXE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_AXE_HEAD_DUMMY",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:斧頭前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:斧頭前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_HOE_HEAD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_HOE_HEAD_DUMMY",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:鋤頭前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:鋤頭前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_SWORD_BLADE_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_SWORD_BLADE_DUMMY",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:劍前端",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:劍前端"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_TOOL_ROD_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_TOOL_ROD_DUMMY",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:手柄",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:手柄"+ThemeUtils.PASSIVE+"上，即可取得"
            );

    public static final SlimefunItemStack PART_BINDING_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_DUMMY",
                    SkullTextures.PART_BINDING,
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:接合物",
                    ThemeUtils.PASSIVE + "將前端與手柄接合在一起",
                    ThemeUtils.PASSIVE + "可以作為材料的有:",
                    ThemeUtils.PASSIVE + "線、史萊姆球、藤蔓......"
            );

    public static final SlimefunItemStack PART_REPAIR_KIT_DUMMY =
            ThemeUtils.themedItemStack(
                    "PART_REPAIR_KIT_DUMMY",
                    Material.CHEST_MINECART,
                    ThemeUtils.ThemeItemType.CAST,
                    "部件:維修零件",
                    ThemeUtils.PASSIVE + "將液體澆鑄在"+ThemeUtils.ITEM_CAST+"模具:維修零件"+ThemeUtils.PASSIVE+"上，即可取得",
                    "可以在維修站消耗維修零件，將工具或武器維修"
            );

    public static final SlimefunItemStack PART_AXE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_AXE_HEAD",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_HOE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_HOE_HEAD",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_PICKAXE_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_PICKAXE_HEAD",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_SHOVEL_HEAD =
            ThemeUtils.themedItemStack(
                    "PART_SHOVEL_HEAD",
                    SkullTextures.PART_SHOVEL_HEAD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_SWORD_BLADE =
            ThemeUtils.themedItemStack(
                    "PART_SWORD_BLADE",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_TOOL_ROD =
            ThemeUtils.themedItemStack(
                    "PART_TOOL_ROD",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_REPAIR_KIT =
            ThemeUtils.themedItemStack(
                    "PART_REPAIR_KIT",
                    Material.CHEST_MINECART,
                    ThemeUtils.ThemeItemType.PART,
                    DESC_ERROR,
                    ThemeUtils.PASSIVE + DESC_ERROR
            );

    public static final SlimefunItemStack PART_BINDING_GENERAL_DISPLAY =
            ThemeUtils.themedItemStack(
                    "PART_BINDING_GENERAL_DISPLAY",
                    Material.STRING,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Binding Material",
                    ThemeUtils.PASSIVE + "A material suitable to make binding from.",
                    ThemeUtils.PASSIVE + "This is not JUST string, experiment with",
                    ThemeUtils.PASSIVE + "similar materials."
            );


    // Statics for Recipes
    public static final PartTemplate SHOVEL_HEAD = new PartTemplate(Categories.DUMMY, PART_SHOVEL_HEAD, DummySmeltery.TYPE, new ItemStack[9],"鏟子前端");
    public static final PartTemplate PICKAXE_HEAD = new PartTemplate(Categories.DUMMY, PART_PICKAXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "鎬子前端");
    public static final PartTemplate AXE_HEAD = new PartTemplate(Categories.DUMMY, PART_AXE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "斧頭前端");
    public static final PartTemplate HOE_HEAD = new PartTemplate(Categories.DUMMY, PART_HOE_HEAD, DummySmeltery.TYPE, new ItemStack[9], "鋤頭前端");
    public static final PartTemplate SWORD_BLADE = new PartTemplate(Categories.DUMMY, PART_SWORD_BLADE, DummySmeltery.TYPE, new ItemStack[9], "劍前端");
    public static final PartTemplate TOOL_ROD = new PartTemplate(Categories.DUMMY, PART_TOOL_ROD, DummySmeltery.TYPE, new ItemStack[9], "手柄");
    public static final RepairkitTemplate REPAIR_KIT = new RepairkitTemplate(Categories.DUMMY, PART_REPAIR_KIT, DummySmeltery.TYPE, new ItemStack[9], "維修零件");

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
        new UnplaceableBlock(Categories.PARTS, PART_REPAIR_KIT_DUMMY, DummySmeltery.TYPE, getDummyCastRecipe(Casts.CAST_REPAIRKIT)).register(p);

        // Real ones, not in recipe book due to the variations
        SHOVEL_HEAD.register(p);
        PICKAXE_HEAD.register(p);
        AXE_HEAD.register(p);
        HOE_HEAD.register(p);
        SWORD_BLADE.register(p);
        TOOL_ROD.register(p);
        REPAIR_KIT.register(p);

    }

}
