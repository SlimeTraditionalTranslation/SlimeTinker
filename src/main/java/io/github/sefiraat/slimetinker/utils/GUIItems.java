package io.github.sefiraat.slimetinker.utils;

import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterialManager;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class GUIItems {

    private GUIItems() {
        throw new IllegalStateException("Utility class");
    }

    public static final CustomItemStack MENU_BACKGROUND_INPUT = new CustomItemStack(
        Material.LIGHT_BLUE_STAINED_GLASS_PANE,
        ChatColor.BLUE + "輸入",
        " "
    );

    public static final CustomItemStack MENU_BACKGROUND_OUTPUT = new CustomItemStack(
        Material.ORANGE_STAINED_GLASS_PANE,
        ChatColor.RED + "輸出",
        " "
    );

    public static final CustomItemStack MENU_BACKGROUND_CAST = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        ChatColor.GREEN + "模具/模具原型",
        " "
    );

    public static final CustomItemStack MENU_PREVIEW = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        ChatColor.GREEN + "預覽",
        " "
    );

    public static final CustomItemStack MENU_BACKGROUND_PREVIEW = new CustomItemStack(
        Material.LIME_STAINED_GLASS_PANE,
        ChatColor.GREEN + "預覽",
        " "
    );

    public static final CustomItemStack MENU_MARKER_ROD = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "放入手柄",
        ThemeUtils.PASSIVE + "在下麵的欄位放入手柄部件"
    );


    public static final CustomItemStack MENU_MARKER_BINDER = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "放入綁定結",
        ThemeUtils.PASSIVE + "在下麵的欄位放入綁定結部件"
    );

    public static final CustomItemStack MENU_MARKER_HEAD = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "放入工具/武器頭",
        ThemeUtils.PASSIVE + "在下麵的欄位放入工具/武器頭部件"
    );

    public static final CustomItemStack MENU_MARKER_LINKS = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "放入盔甲接合物",
        ThemeUtils.PASSIVE + "在下麵的欄位放入盔甲接合物部件"
    );

    public static final CustomItemStack MENU_MARKER_GAMBESON = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "放入護身軟甲",
        ThemeUtils.PASSIVE + "在下麵的欄位放入護身軟甲"
    );


    public static final CustomItemStack MENU_MARKER_PLATES = new CustomItemStack(
        Material.RED_STAINED_GLASS_PANE,
        ChatColor.RED + "放入盔甲板",
        ThemeUtils.PASSIVE + "在下麵的欄位放入盔甲板"
    );

    public static final CustomItemStack MENU_PURGE = new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUTTON_PURGE)),
        ThemeUtils.GUI_HEAD + "清除金屬",
        "",
        ThemeUtils.PASSIVE + "可以從金屬罐中直接清除不需要的金屬",
        "",
        ThemeUtils.CLICK_INFO + "左鍵點擊" + ChatColor.WHITE + "移除最上層金屬",
        ThemeUtils.CLICK_INFO + "右鍵點擊" + ChatColor.WHITE + "移除所有金屬"
    );

    public static final CustomItemStack MENU_ALLOY = new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUTTON_ALLOY)),
        ThemeUtils.GUI_HEAD + "冶煉合金",
        "",
        ThemeUtils.PASSIVE + "混合金屬罐中的液體",
        ThemeUtils.PASSIVE + "來嘗試冶煉合金"
    );

    public static final CustomItemStack MENU_POUR = new CustomItemStack(
        PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.BUCKET_ORANGE)),
        ThemeUtils.GUI_HEAD + "澆鑄",
        "",
        ThemeUtils.PASSIVE + "將最上層的金屬進行澆鑄",
        ThemeUtils.PASSIVE + "模具將決定熔融金屬的樣式",
        ThemeUtils.PASSIVE + "成品將在輸出欄中"
    );

    public static final CustomItemStack MENU_CRAFT_WORKBENCH = new CustomItemStack(
        Material.FLETCHING_TABLE,
        ThemeUtils.GUI_HEAD + "合成",
        "",
        ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "合成物品"
    );

    public static final CustomItemStack MENU_CRAFT_TOOL_TABLE = new CustomItemStack(
        Material.SMITHING_TABLE,
        ThemeUtils.GUI_HEAD + "組裝工具/武器",
        "",
        ThemeUtils.PASSIVE + "將三個部件組裝成工具/武器:",
        ThemeUtils.PASSIVE + "手柄,綁定結,工具/武器頭",
        ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "組裝"
    );

    public static final CustomItemStack MENU_CRAFT_ARMOUR_TABLE = new CustomItemStack(
        Material.SMITHING_TABLE,
        ThemeUtils.GUI_HEAD + "組裝防具",
        "",
        ThemeUtils.PASSIVE + "將三個部件組裝成防具:",
        ThemeUtils.PASSIVE + "盔甲板,護身軟甲,盔甲接合物",
        ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "組裝"
    );

    public static final CustomItemStack MENU_CRAFT_REPAIR = new CustomItemStack(
        Material.CARTOGRAPHY_TABLE,
        ThemeUtils.GUI_HEAD + "修復",
        "",
        ThemeUtils.PASSIVE + "在第一格中放入需要修復的匠魂裝備",
        ThemeUtils.PASSIVE + "在第二格中放入工具頭/盔甲板對應材質的修復工具",
        ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "修復"
    );

    public static final CustomItemStack MENU_CRAFT_MOD = new CustomItemStack(
        Material.GRINDSTONE,
        ThemeUtils.GUI_HEAD + "安裝模組",
        "",
        ThemeUtils.PASSIVE + "在第一格中放入匠魂裝備",
        ThemeUtils.PASSIVE + "在第二格中放入要安裝的模組",
        ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "安裝模組"
    );

    public static final CustomItemStack MENU_CRAFT_SWAP = new CustomItemStack(
        Material.LOOM,
        ThemeUtils.GUI_HEAD + "更換零件",
        "",
        ThemeUtils.PASSIVE + "在第一格中放入匠魂裝備",
        ThemeUtils.PASSIVE + "在第二格中放入要更換的零件",
        ThemeUtils.CLICK_INFO + "點擊此處" + ChatColor.WHITE + "更換零件"
    );

    @Nonnull
    public static CustomItemStack menuLavaInfo(int fillPercent, int fillAmt, int fillMax) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_5));
        } else if (fillPercent >= 75) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_4));
        } else if (fillPercent >= 50) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_3));
        } else if (fillPercent >= 25) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_2));
        } else if (fillPercent > 0) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_LAVA_1));
        } else {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_EMPTY));
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "岩漿罐");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "岩漿: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        return new CustomItemStack(
            skull,
            meta
        );
    }

    @Nonnull
    public static CustomItemStack menuMetalInfo(int fillPercent, int fillAmt, int fillMax, @Nullable Map<String, Integer> map) {
        ItemStack skull;
        if (fillPercent >= 95) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_5));
        } else if (fillPercent >= 75) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_4));
        } else if (fillPercent >= 50) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_3));
        } else if (fillPercent >= 25) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_2));
        } else if (fillPercent > 0) {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_METAL_1));
        } else {
            skull = PlayerHead.getItemStack(PlayerSkin.fromBase64(SkullTextures.TANK_EMPTY));
        }
        List<String> meta = new ArrayList<>();
        meta.add(ThemeUtils.GUI_HEAD + "Metals Tank");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "Total Metal: " + ChatColor.WHITE + fillAmt + " / " + fillMax);
        meta.add("");
        if (map != null) {
            for (Map.Entry<String, Integer> e : map.entrySet()) {
                String name =
                    TinkerMaterialManager.getById(e.getKey()).getColor() +
                        ThemeUtils.toTitleCase(e.getKey());
                String amount = e.getValue().toString();
                meta.add(ThemeUtils.CLICK_INFO + name + ": " + ChatColor.WHITE + amount + " units.");
            }
        }
        meta.add("");
        meta.add(ThemeUtils.PASSIVE + "澆鑄將從" + ChatColor.BOLD + "最上層" + ThemeUtils.PASSIVE + "的金屬開始");
        meta.add("");
        meta.add(ThemeUtils.CLICK_INFO + "點擊" + ChatColor.WHITE + "將最上層的金屬移至最下層");
        return new CustomItemStack(
            skull,
            meta
        );
    }
}
