package io.github.sefiraat.slimetinker.items.componentmaterials.cmfactories;

import io.github.sefiraat.slimetinker.events.EntityDamageEvents;
import io.github.sefiraat.slimetinker.events.PlayerDamagedEvents;
import io.github.sefiraat.slimetinker.events.RightClickEvents;
import io.github.sefiraat.slimetinker.events.TickEvents;
import io.github.sefiraat.slimetinker.events.friend.TraitEventType;
import io.github.sefiraat.slimetinker.events.friend.TraitPartType;
import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.componentmaterials.ComponentMaterial;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMForms;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMIdentity;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMToolMakeup;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMTrait;
import io.github.sefiraat.slimetinker.items.componentmaterials.cmelements.CMTraits;
import io.github.sefiraat.slimetinker.managers.SupportedPluginsManager;
import io.github.sefiraat.slimetinker.utils.IDStrings;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import lombok.Getter;
import lombok.experimental.UtilityClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@SuppressWarnings("SpellCheckingInspection")
@UtilityClass
public final class CMDynaTech {


    @Getter
    private static final Map<String, ComponentMaterial> map = new HashMap<>();

    static {
        map.put(IDStrings.STAINLESS_STEEL,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.STAINLESS_STEEL, Objects.requireNonNull(SlimefunItem.getById("STAINLESS_STEEL")).getItem(), SkullTextures.ALLOY_SILVER, "#d1d1d1"),
                                Arrays.asList(
                                        CMCore.getMap().get(IDStrings.IRON).getLiquidItemStack(2),
                                        CMCore.getMap().get(IDStrings.ZINC).getLiquidItemStack(1)
                                ),
                                new CMToolMakeup(true, false, true, true, false, true),
                                new CMForms(
                                    Materials.NUGGET_CAST_STAINLESSSTEEL.getItemId(),
                                    SlimefunItem.getById("STAINLESS_STEEL").getId(),
                                    Materials.BLOCK_CAST_STAINLESSSTEEL.getItemId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.STAINLESS_STEEL,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "超級不鏽鋼",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(不銹鋼)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*就像鋼或鎂鋼一樣,",
                                                ThemeUtils.PASSIVE+" 但更加的荒唐.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "刀具",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(不銹鋼)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*攻擊動物將會直接食用它. 喔不",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        new CMTrait(
                                                CMTraits.PROP_PLATES,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "The Standard",
                                                "Damage taken reduced by 5%"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_LINKS,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Water Safe",
                                                "Gives you water breathing"
                                        ))
                        ));

        map.put(IDStrings.VEX_GEM,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.VEX_GEM, Objects.requireNonNull(SlimefunItem.getById("VEX_GEM")).getItem(), SkullTextures.ALLOY_BLUE, "#38c0c2"),
                                null,
                                new CMToolMakeup(false, true, false, false, true, false),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    SlimefunItem.getById("VEX_GEM").getId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.VEX_GEM,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "穿越性",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(惱鬼寶石)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*按住右鍵來隨機傳送.",
                                                ThemeUtils.PASSIVE+" (五分鐘冷卻)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_GAMBESON,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Annoying",
                                                "Vex gems shouldn't be used like this!"
                                        ),
                                        null)
                        ));

        map.put(IDStrings.STARDUST,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.STARDUST, Objects.requireNonNull(SlimefunItem.getById("STAR_DUST")).getItem(), SkullTextures.ALLOY_SILVER, "#fdff96"),
                                null,
                                new CMToolMakeup(true, false, true, true, false, true),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    Objects.requireNonNull(SlimefunItem.getById("STARDUST_METEOR")).getId(),
                                    Objects.requireNonNull(SlimefunItem.getById("STAR_DUST")).getId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.STARDUST,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "光明之怒",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(星塵)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*攻擊時會眩目與失明.",
                                                ThemeUtils.PASSIVE+"*50%更加強大.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "伊薇",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(星塵)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*散發出空靈的光芒,",
                                                ThemeUtils.PASSIVE+" 使村民對你更友好.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        new CMTrait(
                                                CMTraits.PROP_PLATES,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Starshine",
                                                "5% chance to heal 1/2 heart during the night"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_LINKS,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Brightburn",
                                                "Gives on stack of Burning Bright! With 4 ",
                                                "stacks, hostile mobs are repelled (not bosses)."
                                        ))
                        ));

        map.put(IDStrings.GHOSTLY_ESSENCE,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.GHOSTLY_ESSENCE, Objects.requireNonNull(SlimefunItem.getById("GHOSTLY_ESSENCE")).getItem(), SkullTextures.ALLOY_BROWN, "#d4ffef"),
                                null,
                                new CMToolMakeup(false, true, true, false, true, true),
                                new CMForms(
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    Objects.requireNonNull(SlimefunItem.getById("GHOSTLY_ESSENCE")).getId(),
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.GHOSTLY_ESSENCE,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_BINDING,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "虛無性",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"接合物(幽靈精華)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*投擲物直接穿過你.",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        new CMTrait(
                                                CMTraits.PROP_ROD,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "超立方體 [B]",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"手柄(幽靈精華)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*Shift + 右鍵 儲存位置",
                                                ThemeUtils.PASSIVE+"*右鍵 來回傳儲存位置",
                                                ThemeUtils.PASSIVE+" (十分鐘冷卻)",
                                                ThemeUtils.PASSIVE+" (需要同時有超立方體 A與B)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_GAMBESON,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Ghost in the shell",
                                                "Slowly damaged all nearby mobs at the cost of durability"
                                        ),
                                        new CMTrait(
                                                CMTraits.PROP_LINKS,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Ghostly",
                                                "Hover like a ghost"
                                        ))
                        ));

        map.put(IDStrings.TESSERACT,
                new ComponentMaterial
                        (
                                new CMIdentity(IDStrings.TESSERACT, Objects.requireNonNull(SlimefunItem.getById("TESSERACTING_OBJ")).getItem(), SkullTextures.ALLOY_TAN, "#c7ba9f"),
                                null,
                                new CMToolMakeup(true, false, true, true, false, true),
                                new CMForms(
                                    null,
                                    null,
                                    Objects.requireNonNull(SlimefunItem.getById("TESSERACTING_OBJ")).getId(),
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null,
                                    null
                                ),
                                new CMTraits(
                                        IDStrings.TESSERACT,
                                        new CMTrait(
                                                CMTraits.PROP_HEAD,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "超立方體 [A]",
                                                ThemeUtils.ITEM_MACHINE+"需求部件:",
                                                ThemeUtils.PASSIVE+"前端(光學傳輸材料)",
                                                ThemeUtils.ITEM_MACHINE+"屬性效果:",
                                                ThemeUtils.PASSIVE+"*Shift + 右鍵 儲存位置",
                                                ThemeUtils.PASSIVE+"*右鍵 來回傳儲存位置",
                                                ThemeUtils.PASSIVE+" (十分鐘冷卻)",
                                                ThemeUtils.PASSIVE+" (需要同時有超立方體 A與B)",
                                                "",
                                                ThemeUtils.ITEM_MOLTEN_METAL+"必須手持工具或武器才有效果"
                                        ),
                                        null,
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_PLATES,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Hyberbolic Tesseration",
                                                "When in your personal home, you store energy.",
                                                "Damage taken is removed from this energy pool.",
                                                "Required 8x pieces to function and caps at 50."
                                        ),
                                        null,
                                        new CMTrait(
                                                CMTraits.PROP_LINKS,
                                                SupportedPluginsManager.DYNATECH_NOTE,
                                                "Hyberbolic Tesseration",
                                                "When in your personal home, you store energy.",
                                                "Damage taken is removed from this energy pool.",
                                                "Required 8x pieces to function and caps at 50",
                                                "per peice."
                                        ))
                        ));

        setupToolConsumers();
        setupArmourConsumers();

    }

    public static void setupToolConsumers() {

        map.get(IDStrings.STARDUST).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headStarDust);                    // Bright Fury
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.ROD, EntityDamageEvents::rodStainlessSteel);         // Cutlery
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.HEAD, RightClickEvents::headTessMat);                         // HyperCube [A]
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.ROD, RightClickEvents::rodGhostly);                     // HyperCube [B]
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.BINDER, PlayerDamagedEvents::bindGhostly);           // Incorporeal
        map.get(IDStrings.VEX_GEM).addEvent(TraitEventType.RIGHT_CLICK, TraitPartType.BINDER, RightClickEvents::bindVex);                             // NoClip
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.ENTITY_DAMAGED, TraitPartType.HEAD, EntityDamageEvents::headStainlessSteel);       // Super Dooper Stainless
        map.get(IDStrings.STARDUST).addEvent(TraitEventType.TICK, TraitPartType.ROD, TickEvents::rodStarDust);                                        // Yvaine

    }

    public static void setupArmourConsumers() {

        map.get(IDStrings.VEX_GEM).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonVex);                                     // Annoying
        map.get(IDStrings.STARDUST).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::brightBurn);                                        // Brightburn (CO)
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.TICK, TraitPartType.GAMBESON, TickEvents::gambesonGhostly);                         // Ghost in the Shell
        map.get(IDStrings.GHOSTLY_ESSENCE).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksGhostly);                               // Ghostly
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::hyperbolic);                                       // Hyperbolic Tesseration - Links - Store
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.LINKS, PlayerDamagedEvents::hyperbolic);                    // Hyperbolic Tesseration - Links - Absorb
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::hyperbolic);                                       // Hyperbolic Tesseration - Plate - Store
        map.get(IDStrings.TESSERACT).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::hyperbolic);                    // Hyperbolic Tesseration - Plate - Absorb
        map.get(IDStrings.STARDUST).addEvent(TraitEventType.TICK, TraitPartType.PLATE, TickEvents::plateStardust);                                     // Starshine
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.PLAYER_DAMAGED, TraitPartType.PLATE, PlayerDamagedEvents::plateStainlessSteel);     // The Standard
        map.get(IDStrings.STAINLESS_STEEL).addEvent(TraitEventType.TICK, TraitPartType.LINKS, TickEvents::linksStainlessSteel);                        // Water Safe

    }

}
