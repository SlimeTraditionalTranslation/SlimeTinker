package io.github.sefiraat.slimetinker.managers;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.mini2Dx.gettext.GetText;

@SuppressWarnings("SpellCheckingInspection")
public final class SupportedPluginsManager {

    private SupportedPluginsManager() {
        throw new IllegalStateException("Utility class");
    }

    public static final boolean INFINITY_EXPANSION;
    public static final boolean SLIMEFUN_WARFARE;
    public static final boolean DYNATECH;
    public static final boolean LITEXPANSION;
    public static final boolean TRANSCENDENCE;
    public static final boolean NETWORKS;

    public static Plugin TRANSCENDENCE_PLUGIN;

    public static final String CORE_NOTE = ThemeUtils.MAIN + GetText.tr("Core SlimeTinker");
    public static final String INFINITY_EXPANSION_NOTE = ThemeUtils.ADD_INFINITY + GetText.tr("Infinity Expansion");
    public static final String SLIMEFUN_WARFARE_NOTE = ThemeUtils.ADD_SLIMEFUN_WARFARE + GetText.tr("Slimefun Warfare");
    public static final String DYNATECH_NOTE = ThemeUtils.ADD_DYNATECH + GetText.tr("DynaTech");
    public static final String LITEXPANSION_NOTE = ThemeUtils.ADD_LITEXPANSION + GetText.tr("LiteXpansion");
    public static final String TRANSCENDENCE_NOTE = ThemeUtils.ADD_TRANSCENDENCE + GetText.tr("TranscEndence");
    public static final String NETWORKS_NOTE = ThemeUtils.ADD_NETWORKS + GetText.tr("Networks");

    static {
        PluginManager pluginManager = SlimeTinker.getInstance().getServer().getPluginManager();
        INFINITY_EXPANSION = pluginManager.isPluginEnabled(GetText.tr("InfinityExpansion"));
        SLIMEFUN_WARFARE = pluginManager.isPluginEnabled(GetText.tr("SlimefunWarfare"));
        DYNATECH = pluginManager.isPluginEnabled(GetText.tr("DynaTech"));
        LITEXPANSION = pluginManager.isPluginEnabled(GetText.tr("LiteXpansion"));
        TRANSCENDENCE = pluginManager.isPluginEnabled(GetText.tr("TranscEndence"));
        NETWORKS = pluginManager.isPluginEnabled(GetText.tr("Networks"));

        if (TRANSCENDENCE) {
            TRANSCENDENCE_PLUGIN = pluginManager.getPlugin(GetText.tr("TranscEndence"));
        }
    }

    public static boolean isInfinityExpansion() {
        return INFINITY_EXPANSION;
    }

    public static boolean isSlimefunWarfare() {
        return SLIMEFUN_WARFARE;
    }

    public static boolean isDynatech() {
        return DYNATECH;
    }

    public static boolean isLitexpansion() {
        return LITEXPANSION;
    }

    public static boolean isTranscendence() {
        return TRANSCENDENCE;
    }

    public static boolean isNetworks() {
        return NETWORKS;
    }
}
