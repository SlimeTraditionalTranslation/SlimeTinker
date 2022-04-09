package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummySmelteryTrait {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY_PROP",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "匠魂冶煉廠",
        "當對應零件使用該金屬製成時",
        "該部件會獲得此特性"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_SMELTERY_A, STACK);

    private DummySmelteryTrait() {
        throw new IllegalStateException("Utility class");
    }
}
