package io.github.sefiraat.slimetinker.itemgroups;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import org.bukkit.Material;
import org.mini2Dx.gettext.GetText;

public final class ItemGroups {

    private ItemGroups() {
        throw new UnsupportedOperationException("Utility Class");
    }

    public static final MainFlexGroup MAIN = new MainFlexGroup(Keys.ITEM_GROUP_MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MAIN)),
        ThemeUtils.MAIN + "SlimeTinker"
    ));
    public static final DummyItemGroup WORKSTATIONS = new DummyItemGroup(Keys.ITEM_GROUP_WORKSTATIONS, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MAIN)),
        ThemeUtils.MAIN + GetText.tr("Workstations")
    ));
    public static final DummyItemGroup MATERIALS = new DummyItemGroup(Keys.ITEM_GROUP_MATERIALS, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MATERIALS)),
        ThemeUtils.MAIN + GetText.tr("Materials")
    ));
    public static final DummyItemGroup MOLTEN_METALS = new DummyItemGroup(Keys.ITEM_GROUP_MOLTEN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MOLTEN)),
        ThemeUtils.MAIN + GetText.tr("Molten Metals")
    ));
    public static final DummyItemGroup ALLOYS = new DummyItemGroup(Keys.ITEM_GROUP_ALLOYS, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_ALLOYS)),
        ThemeUtils.MAIN + GetText.tr("Alloy Metals")
    ));
    public static final DummyItemGroup CASTS = new DummyItemGroup(Keys.ITEM_GROUP_CASTS, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_CASTS)),
        ThemeUtils.MAIN + GetText.tr("Casts")
    ));
    public static final DummyItemGroup PARTS = new DummyItemGroup(Keys.ITEM_GROUP_PARTS, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_PARTS)),
        ThemeUtils.MAIN + GetText.tr("Part Building Guide")
    ));
    public static final DummyItemGroup TOOLS = new DummyItemGroup(Keys.ITEM_GROUP_TOOLS, new CustomItemStack(
        Material.DIAMOND_SWORD,
        ThemeUtils.MAIN + GetText.tr("Tool Building Guide")
    ));
    public static final DummyItemGroup ARMOUR = new DummyItemGroup(Keys.ITEM_GROUP_ARMOUR, new CustomItemStack(
        Material.DIAMOND_CHESTPLATE,
        ThemeUtils.MAIN + GetText.tr("Armour Building Guide")
    ));
    public static final DummyItemGroup TRAITS = new DummyItemGroup(Keys.ITEM_GROUP_PROPERTIES, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_TRAITS)),
        ThemeUtils.MAIN + GetText.tr("Metal Traits")
    ));
    public static final DummyItemGroup MODIFICATIONS = new DummyItemGroup(Keys.ITEM_GROUP_MODIFICATIONS, new CustomItemStack(
        Material.REDSTONE,
        ThemeUtils.MAIN + GetText.tr("Mods")
    ));
    public static final DummyItemGroup PART_DICT = new DummyItemGroup(Keys.ITEM_GROUP_PART_DICT, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.PART_PICKAXE_HEAD)),
        ThemeUtils.MAIN + GetText.tr("Part Dictionary")
    ));
    public static final DummyItemGroup DUMMY = new DummyItemGroup(Keys.ITEM_GROUP_DUMMY, new CustomItemStack(
        Material.BARRIER,
        ThemeUtils.MAIN + GetText.tr("SlimeTinker Dummy")
    ));

    public static void set(SlimeTinker p) {
        MAIN.register(p);
        WORKSTATIONS.register(p);
        MATERIALS.register(p);
        MOLTEN_METALS.register(p);
        ALLOYS.register(p);
        CASTS.register(p);
        PARTS.register(p);
        TOOLS.register(p);
        ARMOUR.register(p);
        TRAITS.register(p);
        MODIFICATIONS.register(p);
        PART_DICT.register(p);
    }

}
