package io.github.sefiraat.slimetinker.items.workstations.smeltery;

import io.github.sefiraat.slimetinker.utils.Keys;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.ThemeItemType;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Material;
import org.mini2Dx.gettext.GetText;

public final class DummySmeltery {

    public static final SlimefunItemStack STACK = ThemeUtils.themedItemStack(
        "DUMMY_TINKERS_SMELTERY",
        Material.CHISELED_POLISHED_BLACKSTONE,
        ThemeItemType.MACHINE,
        GetText.tr("Tinker's Smeltery"),
        GetText.tr("This item is cast out from the"),
        GetText.tr("tinkers smeltery using the"),
        GetText.tr("relevant cast and metal/liquid.")
    );
    public static final RecipeType TYPE = new RecipeType(Keys.WS_DUMMY_SMELTERY, STACK);

    private DummySmeltery() {
        throw new IllegalStateException("Utility class");
    }
}
