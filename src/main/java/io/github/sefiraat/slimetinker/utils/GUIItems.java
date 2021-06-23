package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.items.componentmaterials.CMManager;
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

    public static CustomItem menuBackground() {
        return new CustomItem(
                Material.BLACK_STAINED_GLASS_PANE,
                " ",
                " "
        );
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
                ChatColor.GREEN + "鑄造/模具",
                " "
        );
    }

    public static CustomItem menuPreview() {
        return new CustomItem(
                Material.LIME_STAINED_GLASS_PANE,
                ChatColor.GREEN + "Preview",
                " "
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
                ChatColor.RED + "桿 輸入",
                " "
        );
    }

    public static CustomItem menuMarkerBinder() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "Binder 輸入",
                " "
        );
    }

    public static CustomItem menuMarkerHead() {
        return new CustomItem(
                Material.RED_STAINED_GLASS_PANE,
                ChatColor.RED + "頭端/刃 輸入",
                " "
        );
    }

    public static CustomItem menuLavaInfo(int fillPerc, int fillAmt, int fillMax) {
        ItemStack skull;
        if (fillPerc >= 95) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_5);
        } else if (fillPerc >= 75) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_4);
        } else if (fillPerc >= 50) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_3);
        } else if (fillPerc >= 25) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_2);
        } else if (fillPerc > 0) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_LAVA_1);
        } else {
            skull = SkullItem.fromBase64(SkullTextures.TANK_EMPTY);
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "岩漿罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "岩漿: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        return new CustomItem(
                skull,
                meta
        );
    }

    public static CustomItem menuMetalInfo(int fillPerc, int fillAmt, int fillMax, @Nullable Map<String, Integer> map) {
        ItemStack skull;
        if (fillPerc >= 95) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_5);
        } else if (fillPerc >= 75) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_4);
        } else if (fillPerc >= 50) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_3);
        } else if (fillPerc >= 25) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_2);
        } else if (fillPerc > 0) {
            skull = SkullItem.fromBase64(SkullTextures.TANK_METAL_1);
        } else {
            skull = SkullItem.fromBase64(SkullTextures.TANK_EMPTY);
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "金屬罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "總金屬: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        meta.add("");
        if (map != null) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String name =
                        ChatColor.of(CMManager.getById(e.getKey()).getColorHex()) +
                        ThemeUtils.toTitleCase(e.getKey());
                String amount = e.getValue().toString();
                meta.add(ThemeUtils.CLICK_INFO + name + ": " + ChatColor.WHITE + amount + " 單位.");
            }
        }
        meta.add("");
        meta.add(ThemeUtils.PASSIVE + "Metals pour out from the " + ChatColor.BOLD + "top" + ThemeUtils.PASSIVE + " first");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "Click to cycle metal order.");
        return new CustomItem(
                skull,
                meta
        );
    }

    public static CustomItem menuPurge() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUTTON_PURGE),
                ThemeUtils.GUI_HEAD + "清除 金屬",
                "",
                ThemeUtils.PASSIVE + "重罐清除您不需要的金屬",
                "",
                ThemeUtils.CLICK_INFO + "左鍵點擊: " + ChatColor.WHITE + "移除最上面的金屬",
                ThemeUtils.CLICK_INFO + "右鍵點擊: " + ChatColor.WHITE + "移除所有金屬"
        );
    }

    public static CustomItem menuAlloy() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUTTON_ALLOY),
                ThemeUtils.GUI_HEAD + "Alloy Metals",
                "",
                ThemeUtils.PASSIVE + "Mixes up the metals in the tank to",
                ThemeUtils.PASSIVE + "try to create an alloy."
        );
    }

    public static CustomItem menuPour() {
        return new CustomItem(
                SkullItem.fromBase64(SkullTextures.BUCKET_ORANGE),
                ThemeUtils.GUI_HEAD + "Pour content",
                "",
                ThemeUtils.PASSIVE + "Pours the first metal into the",
                ThemeUtils.PASSIVE + "cast. After cooling, outputs the",
                ThemeUtils.PASSIVE + "final product."
        );
    }

    public static CustomItem menuCraftWorkbench() {
        return new CustomItem(
                Material.FLETCHING_TABLE,
                ThemeUtils.GUI_HEAD + "Craft",
                "",
                ThemeUtils.PASSIVE + "Let's get crafting!"
        );
    }

    public static CustomItem menuCraftTable() {
        return new CustomItem(
                Material.SMITHING_TABLE,
                ThemeUtils.GUI_HEAD + "Form Tool",
                "",
                ThemeUtils.PASSIVE + "Forms a tool from the three given",
                ThemeUtils.PASSIVE + "parts (Rod, Binding and Head/Blade)"
        );
    }

    public static CustomItem menuCraftRepair() {
        return new CustomItem(
                Material.CARTOGRAPHY_TABLE,
                ThemeUtils.GUI_HEAD + "Repair",
                "",
                ThemeUtils.PASSIVE + "Repairs the tool in the first slot",
                ThemeUtils.PASSIVE + "using the repair kit in the second."
        );
    }

    public static CustomItem menuCraftMod() {
        return new CustomItem(
                Material.GRINDSTONE,
                ThemeUtils.GUI_HEAD + "Apply Modification",
                "",
                ThemeUtils.PASSIVE + "Apply the modification to the tool."
        );
    }

    public static CustomItem menuCraftSwap() {
        return new CustomItem(
                Material.SCAFFOLDING,
                ThemeUtils.GUI_HEAD + "Swap out part",
                "",
                ThemeUtils.PASSIVE + "Swap tool parts."
        );
    }

}
