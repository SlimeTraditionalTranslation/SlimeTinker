package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.items.workstations.armourtable.ArmourTable;
import io.github.sefiraat.slimetinker.items.workstations.modificationstation.ModificationStation;
import io.github.sefiraat.slimetinker.items.workstations.repairbench.RepairBench;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmelteryMulti;
import io.github.sefiraat.slimetinker.items.workstations.swappingstation.SwappingStation;
import io.github.sefiraat.slimetinker.items.workstations.tooltable.ToolTable;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public final class Workstations {

    // Tinkers Smeltery
    public static final SlimefunItemStack TINKERS_SMELTERY_CORE =
            ThemeUtils.themedItemStack(
                    "TINKERS_SMELTERY_CORE",
                    Material.CHISELED_POLISHED_BLACKSTONE,
                    ThemeItemType.MACHINE,
                    "焦黑冶煉爐",
                    "需要岩漿作為燃料，",
                    "將金屬熔化成液體後，",
                    "可以用來製作合金，",
                    "然後利用模具澆鑄成指定的樣式。"
            );

    // Workbench
    public static final SlimefunItemStack TINKERS_WORKBENCH =
            ThemeUtils.themedItemStack(
                    "TINKERS_WORKBENCH",
                    Material.FLETCHING_TABLE,
                    ThemeItemType.MACHINE,
                    "工作台〔黏液工匠〕",
                    "用於製作黏液工匠的各種物品和零件，",
                    "也可當作「工作台〔黏液科技〕」來使用。"
            );

    // Tool Table
    public static final SlimefunItemStack TINKERS_TABLE =
            ThemeUtils.themedItemStack(
                    "TINKERS_TABLE",
                    Material.SMITHING_TABLE,
                    ThemeItemType.MACHINE,
                    "裝配台"+ThemeUtils.TOOL+"(工具和武器)",
                    "裝配台",
                    "將部件組裝成工具或武器"
            );

    // Armour Table
    public static final SlimefunItemStack TINKERS_ARMOUR_TABLE =
            ThemeUtils.themedItemStack(
                    "TINKERS_ARMOUR_TABLE",
                    Material.SMITHING_TABLE,
                    ThemeItemType.MACHINE,
                    "裝配台"+ThemeUtils.ARMOUR+"(裝備)",
                    "Combines parts into armour pieces."
            );

    // Repair
    public static final SlimefunItemStack TINKERS_REPAIR_BENCH =
            ThemeUtils.themedItemStack(
                    "TINKERS_REPAIR_BENCH",
                    Material.CARTOGRAPHY_TABLE,
                    ThemeItemType.MACHINE,
                    "修復台",
                    "修理工具或武器",
                    "註:如果有自動鐵砧",
                    "   也可以用它來修理"
            );

    // Swapping
    public static final SlimefunItemStack TINKERS_SWAPPING_STATION =
            ThemeUtils.themedItemStack(
                    "TINKERS_SWAPPING_STATION",
                    Material.LOOM,
                    ThemeItemType.MACHINE,
                    "更換台",
                    "將新部件更換到工具或武器上"
            );

    // Modification
    public static final SlimefunItemStack TINKERS_MOD_STATION =
            ThemeUtils.themedItemStack(
                    "TINKERS_MOD_STATION",
                    Material.GRINDSTONE,
                    ThemeItemType.MACHINE,
                    "強化台",
                    "將工具或武器進行強化",
                    "新增或升級強化項目，將會消耗1次強化次數",
                    "可以利用大量素材提供強化項目經驗"
            );

    protected static final ItemStack[] RECIPE_TINKERS_SMELTERY_MULTI = new ItemStack[] {
            Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,
            Materials.SEARED_TANK,          Materials.SMELTERY_CONTROLLER,  Materials.SPOUT,
            Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK,   Materials.SEARED_BRICK_BLOCK
    };
    protected static final ItemStack[] RECIPE_TINKERS_WORKBENCH = new ItemStack[] {
            new ItemStack(Material.IRON_BLOCK),   new ItemStack(Material.IRON_BLOCK),       new ItemStack(Material.IRON_BLOCK),
            new ItemStack(Material.OAK_PLANKS),   new ItemStack(Material.CRAFTING_TABLE),   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   new ItemStack(Material.DISPENSER),        new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_TABLE = new ItemStack[] {
            Materials.BLOCK_CAST_STEEL,   Materials.BLOCK_CAST_STEEL,   Materials.BLOCK_CAST_STEEL,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_ARMOUR_TABLE = new ItemStack[] {
            Materials.BLOCK_CAST_DAMASCUS_STEEL,   Materials.BLOCK_CAST_DAMASCUS_STEEL,   Materials.BLOCK_CAST_DAMASCUS_STEEL,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_REPAIR_BENCH = new ItemStack[] {
            Materials.BLOCK_CAST_ALUMINUM,   Materials.BLOCK_CAST_ALUMINUM,   Materials.BLOCK_CAST_ALUMINUM,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_SWAPPING_STATION = new ItemStack[] {
            Materials.BLOCK_CAST_COR_BRONZE,   Materials.BLOCK_CAST_COR_BRONZE,   Materials.BLOCK_CAST_COR_BRONZE,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_WORKBENCH,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };
    protected static final ItemStack[] RECIPE_TINKERS_MOD_STATION = new ItemStack[] {
            Materials.BLOCK_CAST_REINFORCED,   Materials.BLOCK_CAST_REINFORCED,   Materials.BLOCK_CAST_REINFORCED,
            new ItemStack(Material.OAK_PLANKS),   Workstations.TINKERS_TABLE,   new ItemStack(Material.OAK_PLANKS),
            new ItemStack(Material.OAK_PLANKS),   SlimefunItems.POWER_CRYSTAL,   new ItemStack(Material.OAK_PLANKS)
    };


    public static void set(SlimeTinker p) {

        // Setting the workbench to the plugin so during the first tick we can load additional recipes from other plugins
        p.setWorkbench(new Workbench(Categories.WORKSTATIONS, TINKERS_WORKBENCH, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_TINKERS_WORKBENCH));
        p.getWorkbench().register(p);

        new UnplaceableBlock(Categories.WORKSTATIONS, TINKERS_SMELTERY_CORE, DummySmelteryMulti.TYPE, RECIPE_TINKERS_SMELTERY_MULTI).register(p);
        new ToolTable(Categories.WORKSTATIONS, TINKERS_TABLE, Workbench.TYPE, RECIPE_TINKERS_TABLE).register(p);
        new ArmourTable(Categories.WORKSTATIONS, TINKERS_ARMOUR_TABLE, Workbench.TYPE, RECIPE_TINKERS_ARMOUR_TABLE).register(p);
        new RepairBench(Categories.WORKSTATIONS, TINKERS_REPAIR_BENCH, Workbench.TYPE, RECIPE_TINKERS_REPAIR_BENCH).register(p);
        new SwappingStation(Categories.WORKSTATIONS, TINKERS_SWAPPING_STATION, Workbench.TYPE, RECIPE_TINKERS_SWAPPING_STATION).register(p);
        new ModificationStation(Categories.WORKSTATIONS, TINKERS_MOD_STATION, Workbench.TYPE, RECIPE_TINKERS_MOD_STATION).register(p);

    }


}
