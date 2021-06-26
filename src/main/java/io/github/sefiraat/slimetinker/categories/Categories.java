package io.github.sefiraat.slimetinker.categories;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;

@UtilityClass
public final class Categories {

    public static final MultiCategory MAIN = new MultiCategory(SlimeTinker.inst().getKeys().getCategoryMain(), new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MAIN),
            ThemeUtils.MAIN + "黏液打鐵"
    ));
    public static final SubCategory WORKSTATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryWorkstations(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MAIN),
            ThemeUtils.MAIN + "工作站"
    ));
    public static final SubCategory MATERIALS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryMaterials(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MATERIALS),
            ThemeUtils.MAIN + "材料"
    ));
    public static final SubCategory MOLTEN_METALS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryMolten(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_MOLTEN),
            ThemeUtils.MAIN + "Molten Metals"
    ));
    public static final SubCategory ALLOYS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryAlloys(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_ALLOYS),
            ThemeUtils.MAIN + "和金金屬"
    ));
    public static final SubCategory TRAITS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryProperties(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_PROPERTIES),
            ThemeUtils.MAIN + "金屬特性"
    ));
    public static final SubCategory CASTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryCasts(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_CASTS),
            ThemeUtils.MAIN + "鍛造"
    ));
    public static final SubCategory PARTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryParts(), MAIN, new CustomItem(
            SkullItem.fromBase64(SkullTextures.CAT_PARTS),
            ThemeUtils.MAIN + "部件"
    ));
    public static final SubCategory TOOLS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryTools(), MAIN, new CustomItem(
            Material.DIAMOND_SWORD,
            ThemeUtils.MAIN + "工具"
    ));
    public static final SubCategory MODIFICATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryModifications(), MAIN, new CustomItem(
            Material.REDSTONE,
            ThemeUtils.MAIN + "模塊"
    ));
    public static final DummyCategory DUMMY = new DummyCategory(SlimeTinker.inst().getKeys().getCategoryDummy(), new CustomItem(
            Material.BARRIER,
            ThemeUtils.MAIN + "黏液打鐵 假人"
    ));

    public static void set(SlimeTinker p) {
        MAIN.register(p);
        WORKSTATIONS.register(p);
        MATERIALS.register(p);
        MOLTEN_METALS.register(p);
        ALLOYS.register(p);
        TRAITS.register(p);
        CASTS.register(p);
        PARTS.register(p);
        TOOLS.register(p);
        MODIFICATIONS.register(p);
    }

}
