package io.github.sefiraat.slimetinker.items.templates;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import io.github.thebusybiscuit.slimefun4.libraries.dough.data.persistent.PersistentDataAPI;
import lombok.Getter;
import net.md_5.bungee.api.ChatColor;
import org.apache.commons.lang.Validate;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class PartTemplate extends UnplaceableBlock {

    @Getter
    private String materialType;

    private final String name;

    public String getName(String material) { return ThemeUtils.toTitleCase(material) + ThemeUtils.ITEM_PART + "" + name;
    }

    public List<String> getLore(String material, ChatColor color) {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add(ThemeUtils.PASSIVE + "一個工具的部分，");
        list.add(ThemeUtils.PASSIVE + "目前沒有用處，");
        list.add(ThemeUtils.PASSIVE + "但可以在裝配台，");
        list.add(ThemeUtils.PASSIVE + "組合出自己滿意的工具或武器。");
        list.add("");
        list.add(ThemeUtils.CLICK_INFO + "材質: " + color + ThemeUtils.toTitleCase(material));
        return list;
    }

    public ItemStack getStack(String material, String partClass, @Nullable String partType, ChatColor color) {
        ItemStack itemStack = this.getItem().clone();
        ItemMeta im = itemStack.getItemMeta();
        Validate.notNull(im, "Meta null, boo!");
        im.setLore(getLore(material, color));
        im.setDisplayName(color + getName(material));
        PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartMaterial(), material);
        PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartClass(), partClass);
        if (partType != null) {
            PersistentDataAPI.setString(im, SlimeTinker.inst().getKeys().getPartType(), partType);
        }
        itemStack.setItemMeta(im);
        return itemStack;
    }

    public PartTemplate(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, String name) {
        super(category, item, recipeType, recipe);
        this.name = name;
    }

}

