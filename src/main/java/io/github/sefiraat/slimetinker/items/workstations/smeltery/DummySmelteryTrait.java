package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.mooy1.infinitylib.recipes.RecipeMap;
import io.github.mooy1.infinitylib.recipes.ShapedRecipe;
import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class DummySmelteryTrait {

    private DummySmelteryTrait() {
        throw new IllegalStateException("Utility class");
    }

    public static final SlimefunItemStack STACK = new SlimefunItemStack(
            "DUMMY_TINKERS_SMELTERY_PROP",
            Material.CHISELED_POLISHED_BLACKSTONE,
            ThemeUtils.ITEM_MACHINE + "說明",
            "",
            ThemeUtils.PASSIVE + "當使用此種材料製作配件時，",
            ThemeUtils.PASSIVE + "組裝後的工具或武器，",
            ThemeUtils.PASSIVE + "將會有此材料的屬性。",
            ThemeUtils.PASSIVE + "前端、手柄需要在焦黑冶煉爐用模具澆鑄而成",
            ThemeUtils.PASSIVE + "接合物要在工作台〔黏液工匠〕，以X(叉)方式擺放",

            "",
            ThemeUtils.LORE_TYPE_MACHINE
    );

    private static final RecipeMap<ItemStack> RECIPES = new RecipeMap<>(ShapedRecipe::new);
    public static final RecipeType TYPE = new RecipeType(SlimeTinker.inst().getKeys().getWsDummySmelteryA(), STACK, RECIPES::put);

}
