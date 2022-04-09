package io.github.sefiraat.slimetinker.items.workstations.modificationstation;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;

public final class DummyModificationStation {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_MODIFICATION_STATION",
        Material.GRINDSTONE,
        ThemeItemType.MACHINE,
        "匠魂模組工作站",
        "在匠魂模組工作站中給匠魂裝備安裝模組"
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_TOOL_TABLE, STACK);

    private DummyModificationStation() {
        throw new IllegalStateException("Utility class");
    }

}
