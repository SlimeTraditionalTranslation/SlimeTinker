package io.github.sefiraat.slimetinker.categories;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.core.categories.MultiCategory;
import io.github.thebusybiscuit.slimefun4.core.categories.SubCategory;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Material;

public final class Categories {

    private Categories() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItem catMain() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.CAT_MAIN),
                ThemeUtils.MAIN + "黏液打鐵"
        );
    }

    public static CustomItem catWorkstations() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.CAT_MAIN),
                ThemeUtils.MAIN + "工作站"
        );
    }

    public static CustomItem catMaterials() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.CAT_MATERIALS),
                ThemeUtils.MAIN + "材料"
        );
    }

    public static CustomItem catAlloys() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.CAT_ALLOYS),
                ThemeUtils.MAIN + "合金金屬"
        );
    }

    public static CustomItem catProperties() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.CAT_PROPERTIES),
                ThemeUtils.MAIN + "金屬道具"
        );
    }

    public static CustomItem catCasts() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.CAT_CASTS),
                ThemeUtils.MAIN + "鑄造"
        );
    }

    public static CustomItem catParts() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.CAT_PARTS),
                ThemeUtils.MAIN + "部件"
        );
    }

    public static CustomItem catTools() {
        return new CustomItem(
                Material.DIAMOND_SWORD,
                ThemeUtils.MAIN + "工具"
        );
    }

    public static CustomItem catModifications() {
        return new CustomItem(
                Material.REDSTONE,
                ThemeUtils.MAIN + "模塊"
        );
    }

    public static CustomItem catDummy() {
        return new CustomItem(
                Material.BARRIER,
                ThemeUtils.MAIN + "黏液打鐵 假人"
        );
    }

    public static final MultiCategory MAIN = new MultiCategory(SlimeTinker.inst().getKeys().getCategoryMain(), catMain());
    public static final SubCategory WORKSTATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryWorkstations(), MAIN, catWorkstations());
    public static final SubCategory MATERIALS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryMaterials(), MAIN, catMaterials());
    public static final SubCategory ALLOYS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryAlloys(), MAIN, catAlloys());
    public static final SubCategory PROPERTIES = new SubCategory(SlimeTinker.inst().getKeys().getCategoryProperties(), MAIN, catProperties());
    public static final SubCategory CASTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryCasts(), MAIN, catCasts());
    public static final SubCategory PARTS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryParts(), MAIN, catParts());
    public static final SubCategory TOOLS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryTools(), MAIN, catTools());
    public static final SubCategory MODIFICATIONS = new SubCategory(SlimeTinker.inst().getKeys().getCategoryModifications(), MAIN, catModifications());
    public static final DummyCategory DUMMY = new DummyCategory(SlimeTinker.inst().getKeys().getCategoryDummy(), catDummy());

    public static void set(SlimeTinker p) {
        MAIN.register(p);
        WORKSTATIONS.register(p);
        MATERIALS.register(p);
        ALLOYS.register(p);
        PROPERTIES.register(p);
        CASTS.register(p);
        PARTS.register(p);
        TOOLS.register(p);
        MODIFICATIONS.register(p);
    }

}
