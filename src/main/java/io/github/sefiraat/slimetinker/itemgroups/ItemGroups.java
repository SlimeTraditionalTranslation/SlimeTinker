package io.github.sefiraat.slimetinker.itemgroups;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;

@UtilityClass
public final class ItemGroups {

    public static final NestedItemGroup MAIN = new NestedItemGroup(SlimeTinker.inst().getKeys().getItemGroupMain(), new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MAIN)),
        ThemeUtils.MAIN + "黏液工匠"
    ));
    public static final SubItemGroup WORKSTATIONS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupWorkstations(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MAIN)),
        ThemeUtils.MAIN + "工作站"
    ));
    public static final SubItemGroup MATERIALS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupMaterials(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MATERIALS)),
        ThemeUtils.MAIN + "材料"
    ));
    public static final SubItemGroup MOLTEN_METALS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupMolten(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_MOLTEN)),
        ThemeUtils.MAIN + "熔融金屬"
    ));
    public static final SubItemGroup ALLOYS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupAlloys(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_ALLOYS)),
        ThemeUtils.MAIN + "合金金屬"
    ));
    public static final SubItemGroup CASTS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupCasts(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_CASTS)),
        ThemeUtils.MAIN + "鑄造"
    ));
    public static final SubItemGroup PARTS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupParts(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_PARTS)),
        ThemeUtils.MAIN + "部件製作指南"
    ));
    public static final SubItemGroup TOOLS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupTools(), MAIN, new CustomItemStack(
        Material.DIAMOND_SWORD,
        ThemeUtils.MAIN + "工具製作指南"
    ));
    public static final SubItemGroup ARMOUR = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupArmour(), MAIN, new CustomItemStack(
        Material.DIAMOND_CHESTPLATE,
        ThemeUtils.MAIN + "盔甲製作指南"
    ));
    public static final SubItemGroup TRAITS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupProperties(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.CAT_TRAITS)),
        ThemeUtils.MAIN + "金屬特性"
    ));
    public static final SubItemGroup MODIFICATIONS = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupModifications(), MAIN, new CustomItemStack(
        Material.REDSTONE,
        ThemeUtils.MAIN + "模組"
    ));
    public static final SubItemGroup PART_DICT = new SubItemGroup(SlimeTinker.inst().getKeys().getItemGroupPartDict(), MAIN, new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.PART_PICKAXE_HEAD)),
        ThemeUtils.MAIN + "部分詞典"
    ));
    public static final DummyItemGroup DUMMY = new DummyItemGroup(SlimeTinker.inst().getKeys().getItemGroupDummy(), new CustomItemStack(
        Material.BARRIER,
        ThemeUtils.MAIN + "黏液工匠假人"
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
