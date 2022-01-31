package io.github.sefiraat.slimetinker.config;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;

import java.io.File;

/**
 * Basic config file manager
 */
public class ConfigManager {
    private final Config config;

    public ConfigManager(String filename) {
        File file = new File(SlimeTinker.getInstance().getDataFolder(), filename);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
            SlimeTinker.getInstance().saveResource(filename, true);
        }

        this.config = new Config(SlimeTinker.getInstance(), filename);
    }

    public Config getConfig() {
        return this.config;
    }
}
