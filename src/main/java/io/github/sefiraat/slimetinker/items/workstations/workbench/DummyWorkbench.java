package io.github.sefiraat.slimetinker.items.workstations.workbench;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class DummyWorkbench {

    private DummyWorkbench() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "DUMMY_TINKERS_SMELTERY",
            Material.FLETCHING_TABLE,
            ThemeUtils.ITEM_MACHINE + "ToolTable",
            "",
            ThemeUtils.PASSIVE + "該物品是在黏液工匠的工作台上製作",
            "",
            ThemeUtils.LORE_TYPE_MACHINE
    );

    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummyWorkbench(), STACK, "");

}
