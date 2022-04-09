package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummySmeltery {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "匠魂冶煉廠",
        "這個物品是在匠魂冶煉廠中",
        "使用特定的模具",
        "澆鑄相應的熔融金屬/液體獲得"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_SMELTERY, STACK);

    private DummySmeltery() {
        throw new IllegalStateException("Utility class");
    }
}
