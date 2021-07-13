package io.github.sefiraat.slimetinker.items.componentmaterials;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.events.EventFriend;
import io.github.sefiraat.slimetinker.items.Casts;
import io.github.sefiraat.slimetinker.items.templates.PartTemplate;
import io.github.sefiraat.slimetinker.items.workstations.smeltery.DummySmeltery;
import io.github.sefiraat.slimetinker.items.workstations.workbench.Workbench;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.sefiraat.slimetinker.utils.enums.TraitEventType;
import io.github.sefiraat.slimetinker.utils.enums.TraitPartType;
import lombok.Data;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.annotation.Nullable;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

@Data
public class ComponentMaterial {

    private final CMIdentity cmIdentity;
    @Nullable
    private final List<SlimefunItemStack> alloyRecipe;
    private final CMToolMakeup cmToolMakeup;
    private final CMForms cmForms;
    @Nullable
    private final CMLiquid cmLiquid;
    @Nullable
    private final CMAlloy cmAlloy;
    @Nullable
    private final CMTraits cmTraits;
    private final Map<TraitEventType, Map<TraitPartType, Consumer<EventFriend>>> cmEventMap = new EnumMap<>(TraitEventType.class);

    /**
     *
     * @param cmIdentity Defines the ID, Displayed ItemStack for recipes, SkullTexture for liquids and the Color for theming lore and names
     * @param alloyRecipe List of material IDs that can be found in the CMMap used to build alloy recipes
     * @param cmToolMakeup Defines what parts this material can be formed into
     * @param cmForms Defines the solid forms of metals that can be used for input
     * @param cmTraits A collection of cmTraits for each potential part
     */
    public ComponentMaterial(CMIdentity cmIdentity,
                             @Nullable List<SlimefunItemStack> alloyRecipe,
                             CMToolMakeup cmToolMakeup,
                             CMForms cmForms,
                             @Nullable CMTraits cmTraits) {

        this.cmIdentity = cmIdentity;
        this.alloyRecipe = alloyRecipe;
        this.cmToolMakeup = cmToolMakeup;
        this.cmForms = cmForms;

        if (cmIdentity.getLiquidTexture()  != null) {
            this.cmLiquid = new CMLiquid(cmIdentity.getLiquidTexture());
            cmLiquid.setupLiquid(this);
        } else {
            this.cmLiquid = null;
        }

        if (alloyRecipe != null) {
            this.cmAlloy = new CMAlloy(alloyRecipe);
            cmAlloy.setupAlloy(this);
        } else {
            this.cmAlloy = null;
        }

        if (cmTraits != null) {
            this.cmTraits = cmTraits;
            cmTraits.setupTraits(this);
        } else {
            this.cmTraits = null;
        }

        registerParts();


    }

    public void registerParts() {

        // Tool Rods
        if (cmToolMakeup.isValidRod()) {
            //CMManager.getMAP_CAST_TOOLROD().put(this, Parts.TOOL_ROD.getStack(cmIdentity.getId(), ROD, null, getColor()));
            new PartTemplate(Categories.PART_DICT, rodStack(cmIdentity.getId()), DummySmeltery.TYPE, headRecipe(Casts.CAST_TOOLROD, getLiquidItemStack(1)), cmIdentity.getId()).register(SlimeTinker.inst());
        }

        // Heads (and repair kits)
        if (cmToolMakeup.isValidHead()) {
            //CMManager.getMAP_CAST_SWORDBLADE().put(this, Parts.SWORD_BLADE.getStack(cmIdentity.getId(), HEAD, SWORD, getColor()));
            new PartTemplate(Categories.PART_DICT, headStack(cmIdentity.getId(), "劍", SkullTextures.PART_SWORD_BLADE), DummySmeltery.TYPE, headRecipe(Casts.CAST_SWORDBLADE, getLiquidItemStack(2)), cmIdentity.getId()).register(SlimeTinker.inst());
        }
        if (cmToolMakeup.isValidHead()) {
            //CMManager.getMAP_CAST_HOEHEAD().put(this, Parts.HOE_HEAD.getStack(cmIdentity.getId(), HEAD, HOE, getColor()));
            new PartTemplate(Categories.PART_DICT, headStack(cmIdentity.getId(), "鋤頭", SkullTextures.PART_HOE_HEAD), DummySmeltery.TYPE, headRecipe(Casts.CAST_HOEHEAD, getLiquidItemStack(1)), cmIdentity.getId()).register(SlimeTinker.inst());
        }
        if (cmToolMakeup.isValidHead()) {
            //CMManager.getMAP_CAST_AXEHEAD().put(this, Parts.AXE_HEAD.getStack(cmIdentity.getId(), HEAD, AXE, getColor()));
            new PartTemplate(Categories.PART_DICT, headStack(cmIdentity.getId(), "斧頭", SkullTextures.PART_AXE_HEAD), DummySmeltery.TYPE, headRecipe(Casts.CAST_AXEHEAD, getLiquidItemStack(1)), cmIdentity.getId()).register(SlimeTinker.inst());
        }
        if (cmToolMakeup.isValidHead()) {
            //CMManager.getMAP_CAST_PICKAXEHEAD().put(this, Parts.PICKAXE_HEAD.getStack(cmIdentity.getId(), HEAD, PICKAXE, getColor()));
            new PartTemplate(Categories.PART_DICT, headStack(cmIdentity.getId(), "鎬子", SkullTextures.PART_PICKAXE_HEAD), DummySmeltery.TYPE, headRecipe(Casts.CAST_PICKAXEHEAD, getLiquidItemStack(1)), cmIdentity.getId()).register(SlimeTinker.inst());
        }
        if (cmToolMakeup.isValidHead()) {
            //CMManager.getMAP_CAST_SHOVELHEAD().put(this, Parts.SHOVEL_HEAD.getStack(cmIdentity.getId(), HEAD, SHOVEL, getColor()));
            new PartTemplate(Categories.PART_DICT, headStack(cmIdentity.getId(), "鏟子", SkullTextures.PART_SHOVEL_HEAD), DummySmeltery.TYPE, headRecipe(Casts.CAST_SHOVELHEAD, getLiquidItemStack(1)), cmIdentity.getId()).register(SlimeTinker.inst());
        }
        if (cmToolMakeup.isValidHead()) {
            //CMManager.getMAP_CAST_REPAIRKIT().put(this, Parts.REPAIR_KIT.getStack(cmIdentity.getId(), REPAIR, getColor()));
            new PartTemplate(Categories.PART_DICT, repairStack(cmIdentity.getId()), DummySmeltery.TYPE, headRecipe(Casts.CAST_REPAIRKIT, getLiquidItemStack(3)), cmIdentity.getId()).register(SlimeTinker.inst());
        }

        // Binders
        if (this.cmToolMakeup.isValidBinder()) {
            PartTemplate binder = new PartTemplate(Categories.DUMMY, bindingStack(cmIdentity.getId()), Workbench.TYPE, bindingRecipe(cmIdentity.getRepresentativeStack()), cmIdentity.getId());
            binder.setHidden(true);
            binder.register(SlimeTinker.inst());
        }

    }

    public SlimefunItemStack headStack(String name, String type, String skullTexture) {
        String titName = ThemeUtils.toTitleCase(name);
        return ThemeUtils.themedItemStack(
                "PART_HEAD_" + type + name,
                skullTexture,
                ThemeUtils.ThemeItemType.PART,
                getColor() + titName + ThemeUtils.ITEM_PART + ThemeUtils.toTitleCase(type) + "前端",
        ThemeUtils.PASSIVE + "由" + titName + "製成的前端"
        );
    }

    // TODO This is now very disjointed. Needs all wrapping in - to resolve the this == this issue
    public SlimefunItemStack bindingStack(String name) {
        String titName = ThemeUtils.toTitleCase(name);
        SlimefunItemStack i = ThemeUtils.themedItemStack(
                "PART_BINDING_" + name,
                SkullTextures.PART_BINDING,
                ThemeUtils.ThemeItemType.PART,
                getColor() + titName + ThemeUtils.ITEM_PART +  "接合物",
                ThemeUtils.PASSIVE + "由" + titName + "製成的接合物"
        );
        ItemMeta im = i.getItemMeta();
        assert im != null;
        PersistentDataContainer c = im.getPersistentDataContainer();
        c.set(SlimeTinker.inst().getKeys().getPartInfoMaterialType(), PersistentDataType.STRING, name);
        c.set(SlimeTinker.inst().getKeys().getPartInfoClassType(), PersistentDataType.STRING, IDStrings.BINDING);
        i.setItemMeta(im);
        return i;
    }

    public SlimefunItemStack rodStack(String name) {
        String titName = ThemeUtils.toTitleCase(name);
        return ThemeUtils.themedItemStack(
                "PART_ROD_" + name,
                SkullTextures.PART_TOOL_ROD,
                ThemeUtils.ThemeItemType.PART,
                getColor() + titName + ThemeUtils.ITEM_PART + "手柄",
                ThemeUtils.PASSIVE + "由" + titName + "製成的手柄."
        );
    }

    public SlimefunItemStack repairStack(String name) {
        String titName = ThemeUtils.toTitleCase(name);
        return ThemeUtils.themedItemStack(
                "PART_REPAIR_KIT_" + name,
                Material.CHEST_MINECART,
                ThemeUtils.ThemeItemType.PART,
                getColor() + titName + ThemeUtils.ITEM_PART + "維修零件",
                ThemeUtils.PASSIVE + "修復工具或武器的耗材",
                "由" + titName + "製成的維修零件"
        );
    }

    public ItemStack[] headRecipe(ItemStack i, ItemStack i2) {
        return new ItemStack[] {
            null,   null,   null,
            i,     null,   i2,
            null,   null,   null
        };
    }

    public ItemStack[] bindingRecipe(ItemStack i) {
        return new ItemStack[] {
            i,      null,   i,
            null,   i,      null,
            i,      null,   i
        };
    }

    public ChatColor getColor() {
        return ChatColor.of(cmIdentity.getColorHex());
    }

    public boolean isValidToolHead() {
        return cmToolMakeup.isValidHead();
    }

    public boolean isValidToolBinder() {
        return cmToolMakeup.isValidBinder();
    }

    public boolean isValidToolRod() {
        return cmToolMakeup.isValidRod();
    }

    public String getFormNugget() {
        return cmForms.getFormNugget();
    }

    public String getFormIngot() {
        return cmForms.getFormIngot();
    }

    public String getFormBlock() {
        return cmForms.getFormBlock();
    }

    public String getFormOre() {
        return cmForms.getFormOre();
    }

    public String getFormGem() {
        return cmForms.getFormGem();
    }

    public String getFormDust() {
        return cmForms.getFormDust();
    }

    public String getFormBoot() {
        return cmForms.getFormBoot();
    }

    public String getFormLeg() {
        return cmForms.getFormLeg();
    }

    public String getFormChest() {
        return cmForms.getFormChest();
    }

    public String getFormHelm() {
        return cmForms.getFormHelm();
    }

    public SlimefunItemStack getLiquidItemStack(int amount) {
        return new SlimefunItemStack(cmLiquid.getItemStack(), amount);
    }

    public String getId() {
        return cmIdentity.getId();
    }

    public String getLiquidTexture() {
        return cmIdentity.getLiquidTexture();
    }

    public ItemStack getRepresentativeStack() {
        return cmIdentity.getRepresentativeStack();
    }

    /**
     *
     * Runs an event based on the type of event the listener is requesting and the tool part.
     * If an event does not exist, nothing happens.
     *
     * @param type "The type of event that will be triggered. Different cmEventMap can fire based on the listener (tick event) raising
     * @param part "The tool part to be tested against this material type"
     * @param friend "The EventFriend to be carried through the cmEventMap to the settle phase"
     */
    public void runEvent(TraitEventType type, TraitPartType part, EventFriend friend) {
        if(!cmEventMap.containsKey(type)) {
            return;
        }
        Map<TraitPartType, Consumer<EventFriend>> map = cmEventMap.get(type);
        if (!map.containsKey(part)) {
            return;
        }
        map.get(part).accept(friend);
    }

    public void addEvent(TraitEventType eventType, TraitPartType partType, Consumer<EventFriend> consumer) {
        Map<TraitPartType, Consumer<EventFriend>> map;
        if (cmEventMap.containsKey(eventType)) {
            map = cmEventMap.get(eventType);
        } else {
            map = new EnumMap<>(TraitPartType.class);
        }
        map.put(partType, consumer);
        cmEventMap.put(eventType, map);
    }

}
