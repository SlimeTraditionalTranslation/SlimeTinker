package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.mooy1.infinitylib.recipes.RecipeMap;
import io.github.mooy1.infinitylib.recipes.ShapedRecipe;
import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class DummySmelteryMolten {

    private DummySmelteryMolten() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "DUMMY_TINKERS_SMELTERY_MOLTEN",
            Material.CHISELED_POLISHED_BLACKSTONE,
            ThemeUtils.ITEM_MACHINE + "焦黑冶煉爐",
            "",
            ThemeUtils.PASSIVE + "將固體金屬(塊、錠、粒)放入焦黑冶煉爐，",
            ThemeUtils.PASSIVE + "並消耗岩漿把金屬熔化",
            "",
            ThemeUtils.LORE_TYPE_MACHINE
    );

    private static final RecipeMap<ItemStack> RECIPES = new RecipeMap<>(ShapedRecipe::new);
    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummySmelteryM(), STACK, RECIPES::put);

}
