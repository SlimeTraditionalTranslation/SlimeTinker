package io.github.sefiraat.slimetinker.items.workstations.tooltable;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.mini2Dx.gettext.GetText;

public final class DummyToolTable {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_TABLE",
        Material.SMITHING_TABLE,
        ThemeItemType.MACHINE,
        GetText.tr("Tinker's Tool Table"),
        GetText.tr("This item is made on a Tinker's Tool Table.")
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_TOOL_TABLE, STACK);

    private DummyToolTable() {
        throw new IllegalStateException("Utility class");
    }
}
