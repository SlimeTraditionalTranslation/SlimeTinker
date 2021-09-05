package io.github.sefiraat.slimetinker.items.workstations.tooltable;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class DummyToolTable {

    private DummyToolTable() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "DUMMY_TINKERS_TABLE",
            Material.SMITHING_TABLE,
            ThemeUtils.ITEM_MACHINE + "Tinker's Tool Table",
            "",
            ThemeUtils.PASSIVE + "This item is made on a Tinker's Tool Table.",
            "",
            ThemeUtils.LORE_TYPE_MACHINE
    );

    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummyToolTable(), STACK, "");

}
