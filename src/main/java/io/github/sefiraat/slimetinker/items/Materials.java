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
                    "A nugget made from solid copper"
            );

    public static final SlimefunItemStack NUGGET_CAST_TIN =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_TIN",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "錫粒",
                    "A nugget made from solid tin"
            );

    public static final SlimefunItemStack NUGGET_CAST_ZINC =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ZINC",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋅粒",
                    "A nugget made from solid zinc"
            );

    public static final SlimefunItemStack NUGGET_CAST_ALUMINUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ALUMINUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁粒",
                    "A nugget made from solid aluminum"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAGNESIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGNESIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎂粒",
                    "A nugget made from solid magnesium"
            );

    public static final SlimefunItemStack NUGGET_CAST_LEAD =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_LEAD",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鉛粒",
                    "A nugget made from solid lead"
            );

    public static final SlimefunItemStack NUGGET_CAST_SILVER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SILVER",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀粒",
                    "A nugget made from solid silver"
            );

    public static final SlimefunItemStack NUGGET_CAST_COAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COAL",
                    Material.POLISHED_BLACKSTONE_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "煤炭粒",
                    "A nugget made from liquifacted coal"
            );

    public static final SlimefunItemStack NUGGET_CAST_STEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_STEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋼粒",
                    "A nugget made from solid steel"
            );

    public static final SlimefunItemStack NUGGET_CAST_DAMASCUS_STEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_DAMASCUS_STEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "大馬士革鋼粒",
                    "A nugget made from damascus steel"
            );

    public static final SlimefunItemStack NUGGET_CAST_DURALIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_DURALIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬鋁粒",
                    "A nugget made from duralium"
            );

    public static final SlimefunItemStack NUGGET_CAST_BRONZE =
           ThemeUtils.themedItemStack(
                   "NUGGET_CAST_BRONZE",
                   Material.ACACIA_BUTTON,
                   ThemeUtils.ThemeItemType.CRAFTING,
                   "青銅粒",
                   "A nugget made from bronze"
           );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRONZE =
          ThemeUtils.themedItemStack(
                  "NUGGET_CAST_ALU_BRONZE",
                  Material.GOLD_NUGGET,
                  ThemeUtils.ThemeItemType.CRAFTING,
                  "鋁黃銅粒",
                  "A nugget made from aluminum bronze"
          );

    public static final SlimefunItemStack NUGGET_CAST_HARD_METAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_HARD_METAL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬化金屬粒",
                    "A nugget made from hardened metal"
            );

    public static final SlimefunItemStack NUGGET_CAST_COR_BRONZE =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COR_BRONZE",
                    Material.GOLD_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "科林斯青銅粒",
                    "A nugget made from corinthian bronze"
            );

    public static final SlimefunItemStack NUGGET_CAST_SOLDER =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SOLDER",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焊錫粒",
                    "A nugget made from solder"
            );

    public static final SlimefunItemStack NUGGET_CAST_BILLON =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_BILLON",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀銅合金粒",
                    "A nugget made from billon"
            );

    public static final SlimefunItemStack NUGGET_CAST_BRASS =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_BRASS",
                    Material.GOLD_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黃銅粒",
                    "A nugget made from brass"
            );

    public static final SlimefunItemStack NUGGET_CAST_ALU_BRASS =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ALU_BRASS",
                    Material.GOLD_INGOT,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁黃銅粒",
                    "A nugget made from aluminum brass"
            );

    public static final SlimefunItemStack NUGGET_CAST_NICKEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_NICKEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎳粒",
                    "A nugget made from nickel"
            );

    public static final SlimefunItemStack NUGGET_CAST_COBALT =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_COBALT",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鈷粒",
                    "A nugget made from cobalt"
            );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REINFORCED",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "強化合金粒",
                    "A nugget made from reinforced alloy"
            );

    public static final SlimefunItemStack NUGGET_CAST_FERROSILICON =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_FERROSILICON",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "矽鐵粒",
                    "A nugget made from ferrosilicon"
            );

    public static final SlimefunItemStack NUGGET_CAST_REDSTONE_ALLOY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REDSTONE_ALLOY",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "紅石合金粒",
                    "A nugget made from redstone alloy"
            );
    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_COPPER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COPPER",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Copper 塊",
                    "A block made from solid copper"
            );

    public static final SlimefunItemStack BLOCK_CAST_TIN =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_TIN",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "錫塊",
                    "A block made from solid tin"
            );

    public static final SlimefunItemStack BLOCK_CAST_ZINC =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ZINC",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Zinc 塊",
                    "A block made from solid zinc"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALUMINUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALUMINUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁塊",
                    "A block made from solid aluminum"
            );

    public static final SlimefunItemStack BLOCK_CAST_MAGNESIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGNESIUM",
                    Material.PINK_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎂塊",
                    "A block made from solid magnesium"
            );

    public static final SlimefunItemStack BLOCK_CAST_LEAD =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_LEAD",
                    Material.PURPLE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鉛塊",
                    "A block made from solid lead"
            );

    public static final SlimefunItemStack BLOCK_CAST_SILVER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SILVER",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀塊",
                    "A block made from solid silver"
            );

    public static final SlimefunItemStack BLOCK_CAST_STEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_STEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋼塊",
                    "A block made from solid steel"
            );

    public static final SlimefunItemStack BLOCK_CAST_DAMASCUS_STEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_DAMASCUS_STEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "大馬士革鋼塊",
                    "A block made from damascus steel"
            );

    public static final SlimefunItemStack BLOCK_CAST_DURALIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_DURALIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬鋁塊",
                    "A block made from duralium"
            );

    public static final SlimefunItemStack BLOCK_CAST_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "青銅塊",
                    "A block made from bronze"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALU_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁青銅塊",
                    "A block made from aluminum bronze"
            );

    public static final SlimefunItemStack BLOCK_CAST_HARD_METAL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_HARD_METAL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "硬化金屬塊",
                    "A block made from hardened metal"
            );
    public static final SlimefunItemStack BLOCK_CAST_COR_BRONZE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COR_BRONZE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "科林斯青銅塊",
                    "A block made from corinthian bronze"
            );

    public static final SlimefunItemStack BLOCK_CAST_SOLDER =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SOLDER",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "焊錫塊",
                    "A block made from solder"
            );

    public static final SlimefunItemStack BLOCK_CAST_BILLON =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BILLON",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "銀銅合金塊",
                    "A block made from billon"
            );

    public static final SlimefunItemStack BLOCK_CAST_BRASS =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_BRASS",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "黃銅塊",
                    "A block made from brass"
            );

    public static final SlimefunItemStack BLOCK_CAST_ALU_BRASS =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ALU_BRASS",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鋁黃銅塊",
                    "A block made from aluminum brass"
            );

    public static final SlimefunItemStack BLOCK_CAST_NICKEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_NICKEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鎳塊",
                    "A block made from nickel"
            );

    public static final SlimefunItemStack BLOCK_CAST_COBALT =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_COBALT",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "鈷塊",
                    "A block made from cobalt"
            );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REINFORCED",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "強化合金塊",
                    "A block made from reinforced alloy"
            );

    public static final SlimefunItemStack BLOCK_CAST_FERROSILICON =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_FERROSILICON",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "矽鐵塊",
                    "A block made from ferrosilicon"
            );

    public static final SlimefunItemStack BLOCK_CAST_REDSTONE_ALLOY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REDSTONE_ALLOY",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "紅石合金塊",
                    "A block made from redstone alloy"
            );
    // endregion
    // region Crafts
    public static final SlimefunItemStack MOD_PLATE =
            ThemeUtils.themedItemStack(
                    "MOD_PLATE",
                    Material.OBSIDIAN,
                    ThemeUtils.ThemeItemType.MOD,
                    "強化板",
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
                    "Infinity 粒",
                    "A nugget made from solid infinity... yup!"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAGSTEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGSTEEL",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "MagSteel 粒",
                    "A nugget made from solid MagSteel"
            );

    public static final SlimefunItemStack NUGGET_CAST_TITANIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_TITANIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Titanium 粒",
                    "A nugget made from solid Titanium"
            );

    public static final SlimefunItemStack NUGGET_CAST_MYTHRIL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MYTHRIL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Mythril 粒",
                    "A nugget made from solid Mythril"
            );

    public static final SlimefunItemStack NUGGET_CAST_ADAMANTITE =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ADAMANTITE",
                    Material.ACACIA_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Adamantite 粒",
                    "A nugget made from solid Adamantite"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAGNONIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAGNONIUM",
                    Material.CRIMSON_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Magnonium 粒",
                    "A nugget made from solid Magnonium"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_VOID =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_VOID",
                    Material.NETHERITE_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Void 塊",
                    "A block made from ... void?"
            );

    public static final SlimefunItemStack BLOCK_CAST_INFINITY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_INFINITY",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Infinity 塊",
                    "A block made from *sigh* infinity."
            );

    public static final SlimefunItemStack BLOCK_CAST_MAGSTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGSTEEL",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "MagSteel 塊",
                    "A block made from MagSteel."
            );

    public static final SlimefunItemStack BLOCK_CAST_TITANIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_TITANIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Titanium 塊",
                    "A block made from Titanium."
            );

    public static final SlimefunItemStack BLOCK_CAST_MYTHRIL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MYTHRIL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Mythril 塊",
                    "A block made from Mythril."
            );

    public static final SlimefunItemStack BLOCK_CAST_ADAMANTITE =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ADAMANTITE",
                    Material.TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Adamanitite 塊",
                    "A block made from Adamanitite."
            );

    public static final SlimefunItemStack BLOCK_CAST_MAGNONIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAGNONIUM",
                    Material.PURPLE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Magnonium 塊",
                    "A block made from Magnonium."
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
                    "Slimesteel 粒",
                    "A nugget of slimesteel"
            );

    public static final SlimefunItemStack NUGGET_CAST_REINFORCED_SLIMESTEEL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_REINFORCED_SLIMESTEEL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Reinforced Slimesteel 粒",
                    "A nugget of reinforced slimesteel"
            );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_OSMIUM",
                    Material.WARPED_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Osmium 粒",
                    "A nugget of osmium"
            );

    public static final SlimefunItemStack NUGGET_CAST_OSMIUM_SUPER_ALLOY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_OSMIUM_SUPER_ALLOY",
                    Material.WARPED_BUTTON,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Osmium Superalloy 粒",
                    "A nugget of osmium superalloy"
            );

    public static final SlimefunItemStack NUGGET_CAST_UNPATENTABILUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_UNPATENTABILUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Unpatentabilum 粒",
                    "A nugget of unpatentabilum"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_SLIMESTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SLIMESTEEL",
                    Material.SLIME_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Slimesteel 塊",
                    "A block of slimesteel"
            );

    public static final SlimefunItemStack BLOCK_CAST_REINFORCED_SLIMESTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REINFORCED_SLIMESTEEL",
                    Material.SLIME_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Reinforced Slimesteel 塊",
                    "A block of reinforced slimesteel"
            );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_OSMIUM",
                    Material.LIGHT_BLUE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Osmium 塊",
                    "A block of osmium"
            );

    public static final SlimefunItemStack BLOCK_CAST_OSMIUM_SUPER_ALLOY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_OSMIUM_SUPER_ALLOY",
                    Material.BLUE_TERRACOTTA,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Osmium Superalloy 塊",
                    "A block of osmium superalloy"
            );

    public static final SlimefunItemStack BLOCK_CAST_UNPATENTABILUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_UNPATENTABILUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Unpatentabilum 塊",
                    "A block of unpatentabilum"
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
                    "Stainless Steel 粒",
                    "A nugget of stainless steel"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_STAINLESSSTEEL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_STAINLESSSTEEL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Stainless Steel 塊",
                    "A block of stainless"
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
                    "Refined Iron 粒",
                    "A nugget of refined iron"
            );

    public static final SlimefunItemStack NUGGET_CAST_MIXED_METAL =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MIXED_METAL",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Mixed Metal 粒",
                    "A nugget of mixed metal"
            );

    public static final SlimefunItemStack NUGGET_CAST_ADVANCED_ALLOY =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_ADVANCED_ALLOY",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Advanced Alloy 粒",
                    "A nugget of advanced alloy"
            );

    public static final SlimefunItemStack NUGGET_CAST_MAG_THOR =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_MAG_THOR",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Mag-Thor 粒",
                    "A nugget of mag-thor"
            );

    public static final SlimefunItemStack NUGGET_CAST_SCRAP =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_SCRAP",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Scrap 粒",
                    "A nugget of scrap"
            );

    public static final SlimefunItemStack NUGGET_CAST_IRIDIUM =
            ThemeUtils.themedItemStack(
                    "NUGGET_CAST_IRIDIUM",
                    Material.IRON_NUGGET,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Stainless Steel 粒",
                    "A nugget of stainless steel"
            );

    // endregion
    // region Blocks
    public static final SlimefunItemStack BLOCK_CAST_REFINED_IRON =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_REFINED_IRON",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Refined Iron 塊",
                    "A block of refined iron"
            );

    public static final SlimefunItemStack BLOCK_CAST_MIXED_METAL =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MIXED_METAL",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Mixed Metal 塊",
                    "A block of mixed metal"
            );

    public static final SlimefunItemStack BLOCK_CAST_ADVANCED_ALLOY =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_ADVANCED_ALLOY",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Advanced Alloy 塊",
                    "A block of advacned alloy"
            );

    public static final SlimefunItemStack BLOCK_CAST_MAG_THOR =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_MAG_THOR",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Mag-Thor 塊",
                    "A block of mag-thor"
            );

    public static final SlimefunItemStack BLOCK_CAST_SCRAP =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_SCRAP",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Scrap 塊",
                    "A block of scrap"
            );

    public static final SlimefunItemStack BLOCK_CAST_IRIDIUM =
            ThemeUtils.themedItemStack(
                    "BLOCK_CAST_IRIDIUM",
                    Material.IRON_BLOCK,
                    ThemeUtils.ThemeItemType.CRAFTING,
                    "Iridium 塊",
                    "A block of iridium"
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
