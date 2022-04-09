package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummySmelteryAlloy {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY_ALLOY",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "匠魂冶煉廠",
        "在匠魂冶煉廠中放入類型吻合的金屬",
        "然後點擊\"冶煉合金\"獲得熔融合金"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_SMELTERY_A, STACK);

    private DummySmelteryAlloy() {
        throw new IllegalStateException("Utility class");
    }
}
