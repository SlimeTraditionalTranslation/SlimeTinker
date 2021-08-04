package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.items.componentmaterials.factories.CMManager;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public final class GUIItems {

    private GUIItems() {
        throw new IllegalStateException("Utility class");
    }

    public static CustomItem menuBackgroundInput() {
        return new CustomItem(
                Material.LIGHT_BLUE_STAINED_GLASS_PANE,
                ChatColor.BLUE + "輸入",
                " "
        );
    }

    public static CustomItem menuBackgroundOutput() {
        return new CustomItem(
                Material.ORANGE_STAINED_GLASS_PANE,
                ChatColor.RED + "輸出",
                " "
        );
    }

    public static CustomItem menuBackgroundCast() {
        return new CustomItem(
                Material.LIME_STAINED_GLASS_PANE,
                ChatColor.GREEN + "模具",
                " "
        );
    }

    public static CustomItem menuPreview() {
        return new CustomItem(
                Material.LIME_STAINED_GLASS_PANE,
                ChatColor.GREEN + "預覽格",
                "此處可以預覽工具或武器的資訊"
        );
    }

    public static CustomItem menuBackgroundPreview() {
        return new CustomItem(
                Material.LIME_STAINED_GLASS_PANE,
                ChatColor.GREEN + "預覽",
                " "
        );
    }

    public static CustomItem menuMarkerRod() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "手柄",
                "請將手柄部件放置下方欄位"
        );
    }

    public static CustomItem menuMarkerBinder() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "接合物",
                "請將接合物部件放置下方欄位"
        );
    }

    public static CustomItem menuMarkerHead() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "前端",
                "請將前端部件放置下方欄位"
        );
    }

    public static CustomItem menuLavaInfo(int fillPercent, int fillAmt, int fillMax) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_5);
        } else if (fillPercent >= 75) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_4);
        } else if (fillPercent >= 50) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_3);
        } else if (fillPercent >= 25) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_2);
        } else if (fillPercent > 0) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_1);
        } else {
            skull = SkullItem.fromBase64(SkullTextures.TANK_EMPTY);
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "岩漿罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "岩漿容量: " + ChatColor.WHITE + fillAmt + "/" + fillMax);
        return new CustomItem(
                skull,
                meta
        );
    }

    public static CustomItem menuMetalInfo(int fillPercent, int fillAmt, int fillMax, @Nullable Map<String, Integer> map) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_5);
        } else if (fillPercent >= 75) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_4);
        } else if (fillPercent >= 50) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_3);
        } else if (fillPercent >= 25) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_2);
        } else if (fillPercent > 0) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_1);
        } else {
            skull = SkullItem.fromBase64(SkullTextures.TANK_EMPTY);
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "金屬罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "金屬容量: " + ChatColor.WHITE + fillAmt + "/" + fillMax);
        meta.add("");
        if (map != null) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String name =
                        CMManager.getById(e.getKey()).getColor() +
                        ThemeUtils.toTitleCase(e.getKey());
                String amount = e.getValue().toString();
                meta.add(ThemeUtils.CLICK_INFO + name + ": " + ChatColor.WHITE + amount + " 單位");
            }
        }
        meta.add("");
        meta.add(ThemeUtils.PASSIVE + "澆鑄會先從" + ChatColor.BOLD + "最上層" + ThemeUtils.PASSIVE + "的金屬開始");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "將最上層的金屬移至最下層");
        return new CustomItem(
                skull,
                meta
        );
    }

    public static CustomItem menuPurge() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUTTON_PURGE),
                ThemeUtils.GUI_HEAD + "清除金屬",
                "",
                ThemeUtils.PASSIVE + "可以清除你不需要的金屬(直接移除)",
                "",
                ThemeUtils.CLICK_INFO + "左鍵點擊: " + ChatColor.WHITE + "移除最上層的金屬",
                ThemeUtils.CLICK_INFO + "右鍵點擊: " + ChatColor.WHITE + "移除所有金屬"
        );
    }

    public static CustomItem menuAlloy() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUTTON_ALLOY),
                ThemeUtils.GUI_HEAD + "製作合金",
                "",
                ThemeUtils.PASSIVE + "混合金屬罐中可以製作合金的金屬",
                "",
                ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "自動混合金屬"
        );
    }

    public static CustomItem menuPour() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUCKET_ORANGE),
                ThemeUtils.GUI_HEAD + "澆鑄",
                "",
                ThemeUtils.PASSIVE + "將最上層的金屬進行澆鑄，",
                ThemeUtils.PASSIVE + "模具會決定熔融金屬的樣式，",
                ThemeUtils.PASSIVE + "成品會放在輸出欄位。",
                "",
                ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "將最上層液體進行澆鑄"
        );
    }

    public static CustomItem menuCraftWorkbench() {
        return new CustomItem(
                Material.FLETCHING_TABLE,
                ThemeUtils.GUI_HEAD + "合成",
                "",
                ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "開始合成"
        );
    }

    public static CustomItem menuCraftTable() {
        return new CustomItem(
                Material.SMITHING_TABLE,
                ThemeUtils.GUI_HEAD + "組裝",
                "",
                ThemeUtils.PASSIVE + "將三個部件(手柄、接合物、前端)，",
                ThemeUtils.PASSIVE + "組裝成一個工具或武器",
                ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "開始組裝"
        );
    }

    public static CustomItem menuCraftRepair() {
        return new CustomItem(
                Material.CARTOGRAPHY_TABLE,
                ThemeUtils.GUI_HEAD + "修復",
                "",
                ThemeUtils.PASSIVE + "第一格放入要修復的工具或武器",
                ThemeUtils.PASSIVE + "第二格放入對應前端材質的修復零件",
                ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "開始修復"
        );
    }

    public static CustomItem menuCraftMod() {
        return new CustomItem(
                Material.GRINDSTONE,
                ThemeUtils.GUI_HEAD + "強化",
                "",
                ThemeUtils.PASSIVE + "第一格放入要強化的工具或武器",
                ThemeUtils.PASSIVE + "第二格放入對應的強化素材",
                ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "開始強化"
        );
    }

    public static CustomItem menuCraftSwap() {
        return new CustomItem(
                Material.LOOM,
                ThemeUtils.GUI_HEAD + "更換部件",
                "",
                ThemeUtils.PASSIVE + "第一格放入要更換的工具或武器",
                ThemeUtils.PASSIVE + "第二格放入要更換的部件",
                ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "開始更換"
        );
    }

}
