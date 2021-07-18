package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.TinkersSmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Materials {

    // region Vanilla + Core SF
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_COPPER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COPPER",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銅粒",
                    "由熔融銅製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_TIN =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_TIN",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "錫粒",
                    "由熔融錫製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_ZINC =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ZINC",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋅粒",
                    "由熔融鋅製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_ALUMINUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ALUMINUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁粒",
                    "由熔融鋁製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAGNESIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGNESIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎂粒",
                    "由熔融鎂製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_LEAD =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_LEAD",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鉛粒",
                    "由熔融鉛製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_SILVER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SILVER",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀粒",
                    "由熔融銀製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_COAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COAL",
                    Material.POLISHED_BLACKSTONE_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "煤炭粒",
                    "由熔融煤炭製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_STEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_STEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋼粒",
                    "由熔融鋼製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_DAMASCUS_STEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_DAMASCUS_STEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "大馬士革鋼粒",
                    "由熔融大馬士革鋼製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_DURALIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_DURALIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬鋁粒",
                    "由熔融硬鋁製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_BRONZE =
           ThemeUtils.themedItemStack(
                   "NUGGET_CAST_BRONZE",
                   Material.ACACIA_BUTTON,
                   ThemeUtils.ThemeItemType.CRAFTING,
                   "青銅粒",
                   "由熔融青銅製成的粒"
           );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRONZE =
          ThemeUtils.themedItemStack(
                  "NUGGET_CAST_ALU_BRONZE",
                  Material.GOLD_NUGGET,
                  ThemeUtils.ThemeItemType.CRAFTING,
                  "鋁黃銅粒",
                  "由熔融鋁黃銅製成的粒"
          );

    public static final SlimefunItemStack NUGGET_CAST_HARD_METAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_HARD_METAL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬化金屬粒",
                    "由熔融硬化金屬製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_COR_BRONZE =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COR_BRONZE",
                    Material.GOLD_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "科林斯青銅粒",
                    "由熔融柯林斯青銅製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_SOLDER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SOLDER",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焊錫粒",
                    "由熔融焊錫製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_BILLON =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_BILLON",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀銅合金粒",
                    "由熔融銀銅合金製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_BRASS =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_BRASS",
                    Material.GOLD_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黃銅粒",
                    "由熔融黃銅製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRASS =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ALU_BRASS",
                    Material.GOLD_INGOT,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁黃銅粒",
                    "由熔融鋁黃銅製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_NICKEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_NICKEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎳粒",
                    "由熔融鎳製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_COBALT =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COBALT",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鈷粒",
                    "由熔融鈷製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REINFORCED",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "強化合金粒",
                    "由熔融強化合金製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_FERROSILICON =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_FERROSILICON",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "矽鐵粒",
                    "由熔融矽鐵製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_REDSTONE_ALLOY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REDSTONE_ALLOY",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "紅石合金粒",
                    "由熔融紅石合金製成的粒"
            );
    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_COPPER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COPPER",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銅塊",
                    "由熔融銅製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_TIN =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_TIN",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "錫塊",
                    "由熔融錫製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_ZINC =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ZINC",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋅塊",
                    "由熔融鋅製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALUMINUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALUMINUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁塊",
                    "由熔融鋁製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_MAGNESIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGNESIUM",
                    Material.PINK_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎂塊",
                    "由熔融鎂製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_LEAD =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_LEAD",
                    Material.PURPLE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鉛塊",
                    "由熔融鉛製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_SILVER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SILVER",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀塊",
                    "由熔融銀製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_STEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_STEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋼塊",
                    "由熔融鋼製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_DAMASCUS_STEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_DAMASCUS_STEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "大馬士革鋼塊",
                    "由熔融大馬士革鋼製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_DURALIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_DURALIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬鋁塊",
                    "由熔融硬鋁製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "青銅塊",
                    "由熔融青銅製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALU_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁青銅塊",
                    "由熔融鋁青銅製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_HARD_METAL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_HARD_METAL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬化金屬塊",
                    "由熔融硬化金屬製成塊"
            );
    public static final SlimefunItemStack BLOCK_CAST_COR_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COR_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "科林斯青銅塊",
                    "由熔融科林斯青銅製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_SOLDER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SOLDER",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焊錫塊",
                    "由熔融焊錫製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_BILLON =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BILLON",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀銅合金塊",
                    "由熔融銀銅合金製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_BRASS =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BRASS",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黃銅塊",
                    "由熔融黃銅製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRASS =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALU_BRASS",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁黃銅塊",
                    "由熔融鋁黃銅製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_NICKEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_NICKEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎳塊",
                    "由熔融鎳製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_COBALT =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COBALT",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鈷塊",
                    "由熔融鈷製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REINFORCED",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "強化合金塊",
                    "由熔融強化合金製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_FERROSILICON =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_FERROSILICON",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "矽鐵塊",
                    "由熔融矽鐵製成塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_REDSTONE_ALLOY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REDSTONE_ALLOY",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "紅石合金塊",
                    "由熔融紅石合金製成塊"
            );
    // endregion
    // region Crafts
    public static final SlimefunItemStack MOD_PLATE =
            ThemeUtils.themedItemStack(
                    "MOD_PLATE",
                    Material.OBSIDIAN,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化黑曜石板",
                    ThemeUtils.PASSIVE + "強化素材之一",
                    ThemeUtils.PASSIVE + "減少工具或武器的耐久度消耗"
            );

    public static final SlimefunItemStack GROUT =
            ThemeUtils.themedItemStack(
                    "GROUT",
                    Material.GRAVEL,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "水泥",
                    ThemeUtils.PASSIVE + "製作焦黑磚的材料"
            );


    public static final SlimefunItemStack SEARED_BRICK =
            ThemeUtils.themedItemStack(
                    "SEARED_BRICK",
                    Material.BRICK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焦黑磚",
                    ThemeUtils.PASSIVE + "製作焦黑物品的材料"
            );

    public static final SlimefunItemStack SMELTERY_CONTROLLER =
            ThemeUtils.themedItemStack(
                    "SMELTERY_CONTROLLER",
                    Material.CHISELED_POLISHED_BLACKSTONE,
                    ThemeUtils.ThemeItemType.MACHINE,
                    "焦黑冶煉爐控制器",
                    ThemeUtils.PASSIVE + "焦黑冶煉爐的互動方塊"
            );

    public static final SlimefunItemStack SEARED_TANK =
            ThemeUtils.themedItemStack(
                    "SEARED_TANK",
                    Material.RED_NETHER_BRICK_WALL,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焦黑儲液罐",
                    ThemeUtils.PASSIVE + "用於建造焦黑冶煉爐"
            );

    public static final SlimefunItemStack SPOUT =
            ThemeUtils.themedItemStack(
                    "SPOUT",
                    Material.POLISHED_BLACKSTONE_BRICK_WALL,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焦黑流嘴",
                    ThemeUtils.PASSIVE + "用於建造焦黑冶煉爐"
            );

    public static final SlimefunItemStack SEARED_BRICK_BLOCK =
            ThemeUtils.themedItemStack(
                    "SEARED_BRICK_BLOCK",
                    Material.POLISHED_BLACKSTONE_BRICKS,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黑焦石磚",
                    ThemeUtils.PASSIVE + "用於建造焦黑冶煉爐"
            );
    // endregion
    // endregion

    // region Infinity Expansion
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_INFINITY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_INFINITY",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "無限粒",
                    "由熔融無限製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAGSTEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGSTEEL",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎂鋼粒",
                    "由熔融鎂鋼製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_TITANIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_TITANIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鈦粒",
                    "由熔融鈦製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_MYTHRIL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MYTHRIL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "秘銀粒",
                    "由熔融秘銀製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_ADAMANTITE =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ADAMANTITE",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "精金粒",
                    "由熔融精金製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAGNONIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGNONIUM",
                    Material.CRIMSON_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "磁振子元素粒",
                    "由熔融磁振子元素製成的粒"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_VOID =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_VOID",
                    Material.NETHERITE_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "虛空塊",
                    "由熔融虛空製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_INFINITY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_INFINITY",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "無限塊",
                    "由熔融無限製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_MAGSTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGSTEEL",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎂鋼塊",
                    "由熔融鎂鋼製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_TITANIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_TITANIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鈦塊",
                    "由熔融鈦製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_MYTHRIL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MYTHRIL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "秘銀塊",
                    "由熔融秘銀製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_ADAMANTITE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ADAMANTITE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "精金塊",
                    "由熔融精金製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_MAGNONIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGNONIUM",
                    Material.PURPLE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "磁振子元素塊",
                    "由熔融磁振子元素製成的塊"
            );

    // endregion
    // endregion

    // region SFWarfare
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_SLIMESTEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SLIMESTEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黏液鋼粒",
                    "由熔融黏液鋼製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_SLIMESTEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REINFORCED_SLIMESTEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "強化黏液鋼粒",
                    "由熔融強化黏液鋼製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_OSMIUM",
                    Material.WARPED_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋨粒",
                    "由熔融鋨製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM_SUPER_ALLOY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_OSMIUM_SUPER_ALLOY",
                    Material.WARPED_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋨超級合金粒",
                    "由熔融鋨超級合金製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_UNPATENTABILUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_UNPATENTABILUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "非專利能量元素粒",
                    "由熔融非專利能量元素製成的粒"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_SLIMESTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SLIMESTEEL",
                    Material.SLIME_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黏液鋼塊",
                    "由熔融黏液鋼製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_SLIMESTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REINFORCED_SLIMESTEEL",
                    Material.SLIME_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "強化黏液鋼塊",
                    "由熔融強化黏液鋼製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_OSMIUM",
                    Material.LIGHT_BLUE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋨塊",
                    "由熔融鋨製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM_SUPER_ALLOY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_OSMIUM_SUPER_ALLOY",
                    Material.BLUE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋨超級合金塊",
                    "由熔融鋨超級合金製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_UNPATENTABILUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_UNPATENTABILUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "非專利能量元素塊",
                    "由熔融非專利能量元素製成的塊"
            );

    // endregion
    // endregion

    // region DynaTech
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_STAINLESSSTEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_STAINLESSSTEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "不銹鋼粒",
                    "由熔融不銹鋼製成的粒"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_STAINLESSSTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_STAINLESSSTEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "不銹鋼塊",
                    "由熔融不鏽鋼製成的塊"
            );


    // endregion
    // endregion

    // region DynaTech
    // region Nuggets
    public static final SlimefunItemStack NUGGET_CAST_REFINED_IRON =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REFINED_IRON",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "精煉鐵粒",
                    "由熔融精煉鐵製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_MIXED_METAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MIXED_METAL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "混合金屬粒",
                    "由熔融混合金屬製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_ADVANCED_ALLOY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ADVANCED_ALLOY",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "高級合金粒",
                    "由熔融高級合金製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAG_THOR =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAG_THOR",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "釷鎂合金粒",
                    "由熔融釷鎂合金製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_SCRAP =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SCRAP",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "廢料粒",
                    "由熔融廢料製成的粒"
            );

    public static final SlimefunItemStack NUGGET_CAST_IRIDIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_IRIDIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銥粒",
                    "由熔融銥製成的粒"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_REFINED_IRON =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REFINED_IRON",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "精煉鐵塊",
                    "由熔融精煉鐵製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_MIXED_METAL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MIXED_METAL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "混合金屬塊",
                    "由熔融混合金屬製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_ADVANCED_ALLOY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ADVANCED_ALLOY",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "高級合金塊",
                    "由熔融高級合金製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_MAG_THOR =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAG_THOR",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "釷鎂合金塊",
                    "由熔融釷鎂製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_SCRAP =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SCRAP",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "廢料塊",
                    "由熔融廢料製成的塊"
            );

    public static final SlimefunItemStack BLOCK_CAST_IRIDIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_IRIDIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銥塊",
                    "由熔融銥製成的塊"
            );


    // endregion
    // endregion

    protected static final ItemStack[] RECIPE_GROUT = new ItemStack[] {
            new ItemStack(Material.CLAY), new ItemStack(Material.SAND),  new ItemStack(Material.SAND),
            new ItemStack(Material.SAND), new ItemStack(Material.SAND), new ItemStack(Material.GRAVEL),
            new ItemStack(Material.GRAVEL), new ItemStack(Material.GRAVEL),  new ItemStack(Material.GRAVEL)
    };

    protected static final ItemStack[] RECIPE_SEARED_BRICK = new ItemStack[] {
            Materials.GROUT, null, null,
            null, null, null,
            null, null, null
    };

    protected static final ItemStack[] RECIPE_SEARED_BRICK_BLOCK = new ItemStack[] {
            Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
            Materials.SEARED_BRICK, Materials.SEARED_BRICK, null,
            null, null, null
    };

    protected static final ItemStack[] RECIPE_SMELTERY_CONTROLLER = new ItemStack[] {
            Materials.SEARED_BRICK,   Materials.SEARED_BRICK,   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   null,                     Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   Materials.SEARED_BRICK,   Materials.SEARED_BRICK
    };

    protected static final ItemStack[] RECIPE_SMELTERY_SPOUT = new ItemStack[] {
            Materials.SEARED_BRICK,   null,   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   null,   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   null,   Materials.SEARED_BRICK
    };

    protected static final ItemStack[] RECIPE_SMELTERY_TANK = new ItemStack[] {
            Materials.SEARED_BRICK,   new ItemStack(Material.GLASS),   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   new ItemStack(Material.GLASS),   Materials.SEARED_BRICK,
            Materials.SEARED_BRICK,   new ItemStack(Material.GLASS),   Materials.SEARED_BRICK
    };

    protected static final ItemStack[] RECIPE_REINFORCED_PLATE = new ItemStack[] {
            Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,  Materials.BLOCK_CAST_REINFORCED,
            Materials.BLOCK_CAST_REINFORCED, new ItemStack(Material.OBSIDIAN), Materials.BLOCK_CAST_REINFORCED,
            Materials.BLOCK_CAST_REINFORCED, Materials.BLOCK_CAST_REINFORCED,  Materials.BLOCK_CAST_REINFORCED
    };



    public static void set(SlimeTinker p) {

        // Vanilla + Core SF + Tinker's General
        new UnplaceableBlock(Categories.MATERIALS, GROUT, Workbench.TYPE, RECIPE_GROUT).register(p);
        new UnplaceableBlock(Categories.MATERIALS, SEARED_BRICK, RecipeType.SMELTERY, RECIPE_SEARED_BRICK).register(p);
        new TinkersSmeltery(Categories.MATERIALS, SMELTERY_CONTROLLER, Workbench.TYPE, RECIPE_SMELTERY_CONTROLLER).register(p);
        new SlimefunItem(Categories.MATERIALS, SEARED_TANK, Workbench.TYPE, RECIPE_SMELTERY_TANK).register(p);
        new SlimefunItem(Categories.MATERIALS, SPOUT, Workbench.TYPE, RECIPE_SMELTERY_SPOUT).register(p);
        new SlimefunItem(Categories.MATERIALS, SEARED_BRICK_BLOCK, Workbench.TYPE, RECIPE_SEARED_BRICK_BLOCK).register(p);

        new UnplaceableBlock(Categories.MATERIALS, MOD_PLATE, Workbench.TYPE, RECIPE_REINFORCED_PLATE).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COPPER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_COPPER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_LEAD, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_LEAD, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_SILVER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_SILVER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ALUMINUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ALUMINUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MAGNESIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MAGNESIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ZINC, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ZINC, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_TIN, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_TIN, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_DAMASCUS_STEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_DURALIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_DURALIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ALU_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ALU_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_HARD_METAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_HARD_METAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COR_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_COR_BRONZE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_SOLDER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_SOLDER, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_BILLON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_BILLON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ALU_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ALU_BRASS, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_NICKEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_NICKEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COBALT, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_COBALT, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_REINFORCED, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_REINFORCED, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_FERROSILICON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_FERROSILICON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
        new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_REDSTONE_ALLOY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

        new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_COAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);

        // Infinity Expansion
        if (SupportedPluginsManager.INFINITY_EXPANSION) {
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_VOID, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_INFINITY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_INFINITY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MAGSTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MAGSTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_TITANIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_TITANIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MYTHRIL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MYTHRIL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ADAMANTITE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ADAMANTITE, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MAGNONIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MAGNONIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // SFWarfare
        if (SupportedPluginsManager.SLIMEFUN_WARFARE) {
            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_SLIMESTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_SLIMESTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_REINFORCED_SLIMESTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_OSMIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_OSMIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_OSMIUM_SUPER_ALLOY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_UNPATENTABILUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_UNPATENTABILUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // DynaTech
        if (SupportedPluginsManager.DYNATECH) {
            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_STAINLESSSTEEL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);
        }

        // LiteXpansion
        if (SupportedPluginsManager.LITEXPANSION) {
            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_REFINED_IRON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_REFINED_IRON, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MIXED_METAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MIXED_METAL, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_ADVANCED_ALLOY, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_MAG_THOR, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_MAG_THOR, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_SCRAP, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_SCRAP, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);

            new UnplaceableBlock(Categories.MATERIALS, NUGGET_CAST_IRIDIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_NUGGET)).register(p);
            new UnplaceableBlock(Categories.MATERIALS, BLOCK_CAST_IRIDIUM, DummySmeltery.TYPE, Parts.getDummyCastRecipe(Casts.CAST_BLOCK)).register(p);
        }


    }


}
