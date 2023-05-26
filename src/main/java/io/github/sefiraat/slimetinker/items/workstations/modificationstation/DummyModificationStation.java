package io.github.sefiraat.slimetinker.items.workstations.modificationstation;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.mini2Dx.gettext.GetText;

public final class DummyModificationStation {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_MODIFICATION_STATION",
        Material.GRINDSTONE,
        ThemeItemType.MACHINE,
        GetText.tr("Tinker's Modification Station"),
        GetText.tr("Tools are augmented on the Modification"),
        GetText.tr("station using the appropriate material."),
        GetText.tr("Once enough material has been added, the"),
        GetText.tr("modification will level.")
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_TOOL_TABLE, STACK);

    private DummyModificationStation() {
        throw new IllegalStateException("Utility class");
    }

}
