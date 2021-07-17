package io.github.sefiraat.slimetinker.items.workstations.modificationstation;

import io.github.mooy1.infinitylib.items.StackUtils;
import io.github.mooy1.infinitylib.slimefun.AbstractContainer;
import io.github.sefiraat.slimetinker.items.templates.ToolTemplate;
import io.github.sefiraat.slimetinker.modifiers.Mod;
import io.github.sefiraat.slimetinker.modifiers.Modifications;
import io.github.sefiraat.slimetinker.utils.Experience;
import io.github.sefiraat.slimetinker.utils.GUIItems;
import io.github.sefiraat.slimetinker.utils.ItemUtils;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenu;
import me.mrCookieSlime.Slimefun.api.inventory.BlockMenuPreset;
import me.mrCookieSlime.Slimefun.api.inventory.DirtyChestMenu;
import me.mrCookieSlime.Slimefun.api.item_transport.ItemTransportFlow;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;
import java.util.Map;

public class ModificationStation extends AbstractContainer {

    private static final int[] BACKGROUND_SLOTS = {0,1,2,3,4,5,6,7,8,9,11,13,15,17,18,19,20,21,22,23,24,25,26};
    private static final int INPUT_TOOL = 10;
    private static final int INPUT_MOD = 12;
    protected static final int MOD_BUTTON = 14;
    protected static final int OUTPUT_SLOT = 16;

    public ModificationStation(Category category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(category, item, recipeType, recipe);
    }

    @SuppressWarnings("SameReturnValue")
    protected boolean craft(BlockMenu blockMenu, Player player) {

        ItemStack tool = blockMenu.getItemInSlot(INPUT_TOOL);
        ItemStack modItem = blockMenu.getItemInSlot(INPUT_MOD);

        // No tool dummy!
        if (tool == null) {
            player.sendMessage(ThemeUtils.WARNING + "請在第一格欄位放入工具或武器");
            return false;
        }

        // Still no tool, nice try
        if (!ToolTemplate.isTool(tool)) {
            player.sendMessage(ThemeUtils.WARNING + "第一格欄位的物品，不是黏液工匠的工具或武器");
            return false;
        }

        // No modifier!
        if (modItem == null || !Modifications.getMODIFICATION_LIST().contains(StackUtils.getIDorType(modItem))) {
            player.sendMessage(ThemeUtils.WARNING + "請在第二格欄位放入強化素材");
            return false;
        }

        ItemMeta im = tool.getItemMeta();
        assert im != null;
        PersistentDataContainer c = im.getPersistentDataContainer();

        Map<String, Integer> modMap = Modifications.getModificationMap(c);

        Mod mod = Modifications.getMODIFICATION_DEFINITIONS().get(StackUtils.getIDorType(modItem)); // The definition of the mod being created/updated
        int modSlots = Experience.getToolModifierSlots(tool.getItemMeta().getPersistentDataContainer()); // Number of free modification slots on the tool
        int currentAmount = modMap.get(StackUtils.getIDorType(modItem)); // The current value of that material loaded into the tool (not the level)
        int currentLevel = Modifications.getModLevel(mod, tool); // The current level of this mod (or 0)

        if (!mod.getRequirementMap().containsKey(currentLevel + 1)) { // Max level
            player.sendMessage(ThemeUtils.WARNING + "此強化效果已經達到最高等級");
            return false;
        }

        int requiredAmount = mod.getRequirementMap().get(currentLevel + 1) - currentAmount; // The amount needed for the next level less the amount currently on the tool
        int leftoverAmount = 0;

        if (currentAmount <= 0) {
            if (modSlots == 0) { // New mod and no slots
                player.sendMessage(ThemeUtils.WARNING + "沒有足夠的強化次數");
                return false;
            } else { // Remove mod slot
                Experience.setToolModifierSlots(c,modSlots - 1);
            }
        }  // Or continuing on with a previous mod so we can continue without a free slot

        if (requiredAmount <= modItem.getAmount()) { // We don't need the full amount (or the full amount will level up the tool)
            leftoverAmount = modItem.getAmount() - requiredAmount; // Remove what we need
            Modifications.setModLevel(mod, c, currentLevel + 1);
            currentAmount = 0;
        } else {
            currentAmount = currentAmount + modItem.getAmount();
        }

        modMap.put(StackUtils.getIDorType(modItem), currentAmount);
        Modifications.setModificationMap(c, modMap);

        tool.setItemMeta(im);
        ItemStack newTool = tool.clone();

        if (!blockMenu.fits(newTool, OUTPUT_SLOT)) {
            player.sendMessage(ThemeUtils.WARNING + "輸出欄位有物品，將物品取下後再強化一次");
            return false;
        }

        ItemUtils.rebuildToolLore(newTool);
        blockMenu.pushItem(newTool, OUTPUT_SLOT);
        tool.setAmount(0);
        modItem.setAmount(leftoverAmount);

        return false;
    }


    @Override
    protected void setupMenu(BlockMenuPreset blockMenuPreset) {

        blockMenuPreset.drawBackground(GUIItems.menuBackground(), BACKGROUND_SLOTS);

        blockMenuPreset.addItem(MOD_BUTTON, GUIItems.menuCraftMod());
        blockMenuPreset.addMenuClickHandler(MOD_BUTTON, (player, i, itemStack, clickAction) -> false);

    }

    @Override
    protected int @NotNull [] getTransportSlots(@NotNull DirtyChestMenu dirtyChestMenu, @NotNull ItemTransportFlow itemTransportFlow, ItemStack itemStack) {
        return new int[0];
    }

    @Override
    protected void onBreak(@Nonnull BlockBreakEvent event, @Nonnull BlockMenu blockMenu, @Nonnull Location location) {
        super.onBreak(event, blockMenu, location);
        blockMenu.dropItems(location, INPUT_TOOL);
        blockMenu.dropItems(location, INPUT_MOD);
        blockMenu.dropItems(location, OUTPUT_SLOT);
    }

    @Override
    protected void onNewInstance(@Nonnull BlockMenu blockMenu, @Nonnull Block b) {
        super.onNewInstance(blockMenu, b);
        blockMenu.addMenuClickHandler(MOD_BUTTON, (player, i, itemStack, clickAction) -> craft(blockMenu, player));
    }

}
