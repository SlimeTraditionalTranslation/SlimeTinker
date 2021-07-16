package io.github.sefiraat.slimetinker.items.workstations.modificationstation;

import io.github.mooy1.infinitylib.recipes.RecipeMap;
import io.github.mooy1.infinitylib.recipes.ShapedRecipe;
import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class DummyModificationStation {

    private DummyModificationStation() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "DUMMY_MODIFICATION_STATION",
            Material.GRINDSTONE,
            ThemeUtils.ITEM_MACHINE + "強化台",
            "",
            ThemeUtils.PASSIVE + "強化素材是指冒號後面的物品，",
            ThemeUtils.PASSIVE + "可以讓工具或武器獲得對應的強化效果，",
            ThemeUtils.PASSIVE + "或是升級對應的強化效果。",
            ThemeUtils.PASSIVE + "每個強化效果都有等級上限，",
            ThemeUtils.PASSIVE + "到了上限就無法繼續升級強化效果。",
            "",
            ThemeUtils.LORE_TYPE_MACHINE
    );

    private static final RecipeMap<ItemStack> RECIPES = new RecipeMap<>(ShapedRecipe::new);
    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummyTable(), STACK, RECIPES::put);

}
