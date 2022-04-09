package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummySmelteryMolten {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY_MOLTEN",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        "匠魂冶煉廠",
        "熔融金屬是將對應的金屬物品",
        "放入冶煉廠中熔化得到的產物",
        "需要有岩漿才能熔化金屬"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_SMELTERY_M, STACK);

    private DummySmelteryMolten() {
        throw new IllegalStateException("Utility class");
    }
}
