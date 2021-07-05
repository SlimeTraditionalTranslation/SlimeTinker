package io.github.sefiraat.slimetinker.items.templates;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;
import java.util.List;

public class RepairkitTemplate extends UnplaceableBlock {

    @Getter
    private String materialType;

    private final String name;

    public String getName(String material) {
        return ThemeUtils.toTitleCase(material) + ThemeUtils.ITEM_PART + "" + name;
    }

    public List<String> getLore(String material, ChatColor color) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add(ThemeUtils.PASSIVE + "一個維修零件，");
        list.add(ThemeUtils.PASSIVE + "可以在維修站，");
        list.add(ThemeUtils.PASSIVE + "修復對應前端材質的工具或武器。");
        list.add("");
        list.add(ThemeUtils.CLICK_INFO + "材質: " + color + ThemeUtils.toTitleCase(material));
        return list;
    }

    public ItemStack getStack(String material, String partClass, ChatColor color) {
        ItemStack itemStack = this.getItem().clone();
        itemStack.setType(Material.CHEST_MINECART);
        ItemMeta im = itemStack.getItemMeta();
        assert im != null;
        PersistentDataContainer c = im.getPersistentDataContainer();
        im.setLore(getLore(material, color));
        im.setDisplayName(color + getName(material));
        c.set(SlimeTinker.inst().getKeys().getPartInfoMaterialType(), PersistentDataType.STRING, material);
        c.set(SlimeTinker.inst().getKeys().getPartInfoClassType(), PersistentDataType.STRING, partClass);
        itemStack.setItemMeta(im);
        return itemStack;
    }

    public RepairkitTemplate(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, String name) {
        super(category, item, recipeType, recipe);
        this.name = name;
    }

    public static boolean isRepairKit(ItemStack itemStack) {
        NamespacedKey key = SlimeTinker.inst().getKeys().getPartInfoClassType();
        return itemStack.hasItemMeta() &&
                itemStack.getItemMeta().getPersistentDataContainer().has(key, PersistentDataType.STRING) &&
                itemStack.getItemMeta().getPersistentDataContainer().get(key, PersistentDataType.STRING).equals(IDStrings.REPAIR);
    }

}

