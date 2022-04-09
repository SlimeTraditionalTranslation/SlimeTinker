package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummySmelteryMulti {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY_MULTI",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "匠魂冶煉廠",
        "這是多個方塊，構建在世界上",
        "如圖所示"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_SMELTERY_A, STACK);

    private DummySmelteryMulti() {
        throw new IllegalStateException("Utility class");
    }
}
