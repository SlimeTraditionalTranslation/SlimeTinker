package io.github.sefiraat.slimetinker.items.tinkermaterials.setup;

import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterial;
import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("SpellCheckingInspection")
public final class TinkersMaterialsInfinity {

    private TinkersMaterialsInfinity() {
        throw new UnsupportedOperationException("Utility Class");
    }

    private static final Map<String, TinkerMaterial> CM_MAP = new HashMap<>();

    private static final TinkerMaterial VOID = new TinkerMaterial(Ids.VOID, SlimefunItem.getById("空錠").getItem(), "#5c5756")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE_DEEP)
        .setTraitToolHead(Traits.INFINITY_VOID_HEAD)
        .setTraitToolRod(Traits.INFINITY_VOID_ROD)
        .setTraitArmorPlates(Traits.INFINITY_VOID_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_VOID_LINKS)
        .setFormNugget("空隙粉塵")
        .setFormIngot("空錠")
        .setFormBlock(Materials.BLOCK_CAST_VOID.getItemId())
        .build();

    private static final TinkerMaterial MAGSTEEL = new TinkerMaterial(Ids.MAGSTEEL, SlimefunItem.getById("磁鋼").getItem(), "#730000")
        .setLiquidTexture(SkullTextures.ALLOY_BROWN)
        .setTraitToolHead(Traits.INFINITY_MAGSTEEL_HEAD)
        .setTraitToolRod(Traits.INFINITY_MAGSTEEL_ROD)
        .setTraitArmorPlates(Traits.INFINITY_MAGSTEEL_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_MAGSTEEL_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_MAGSTEEL.getItemId())
        .setFormIngot("磁鋼")
        .setFormBlock(Materials.BLOCK_CAST_MAGSTEEL.getItemId())
        .addAlloyRecipe(
            TinkersMaterialsCore.getCmMap().get(Ids.MAGNESIUM).getLiquidItemStack(2),
            TinkersMaterialsCore.getCmMap().get(Ids.STEEL).getLiquidItemStack(1)
        )
        .build();

    private static final TinkerMaterial TITANIUM = new TinkerMaterial(Ids.TITANIUM, SlimefunItem.getById("鈦").getItem(), "#adadad")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_TITANIUM_HEAD)
        .setTraitToolRod(Traits.INFINITY_TITANIUM_ROD)
        .setTraitArmorPlates(Traits.INFINITY_TITANIUM_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_TITANIUM_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_TITANIUM.getItemId())
        .setFormIngot("鈦")
        .setFormBlock(Materials.BLOCK_CAST_TITANIUM.getItemId())
        .addAlloyRecipe(
            TinkersMaterialsCore.getCmMap().get(Ids.REINFORCED_ALLOY).getLiquidItemStack(1),
            TinkersMaterialsCore.getCmMap().get(Ids.DAMASCUS_STEEL).getLiquidItemStack(1),
            TinkersMaterialsCore.getCmMap().get(Ids.HARDENED_METAL).getLiquidItemStack(1)
        )
        .build();

    private static final TinkerMaterial IRON_SINGULARITY = new TinkerMaterial(Ids.IRON_SINGULARITY, SlimefunItem.getById("鐵奇點").getItem(), "#8c8c8c")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_IRON_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_IRON_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_IRON_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_IRON_SINGULARITY_LINKS)
        .setFormBlock("鐵奇點")
        .build();

    private static final TinkerMaterial GOLD_SINGULARITY = new TinkerMaterial(Ids.GOLD_SINGULARITY, SlimefunItem.getById("黃金奇點").getItem(), "#ffe138")
        .setLiquidTexture(SkullTextures.ALLOY_TAN)
        .setTraitToolHead(Traits.INFINITY_GOLD_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_GOLD_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_GOLD_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_GOLD_SINGULARITY_LINKS)
        .setFormBlock("黃金奇點")
        .build();

    private static final TinkerMaterial COPPER_SINGULARITY = new TinkerMaterial(Ids.COPPER_SINGULARITY, SlimefunItem.getById("銅奇點").getItem(), "#c99732")
        .setLiquidTexture(SkullTextures.ALLOY_BROWN)
        .setTraitToolHead(Traits.INFINITY_COPPER_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_COPPER_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_COPPER_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_COPPER_SINGULARITY_LINKS)
        .setFormBlock("銅奇點")
        .build();

    private static final TinkerMaterial LEAD_SINGULARITY = new TinkerMaterial(Ids.LEAD_SINGULARITY, SlimefunItem.getById("鉛奇點").getItem(), "#9043ba")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE)
        .setTraitToolHead(Traits.INFINITY_LEAD_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_LEAD_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_LEAD_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_LEAD_SINGULARITY_LINKS)
        .setFormBlock("鉛奇點")
        .build();

    private static final TinkerMaterial SILVER_SINGULARITY = new TinkerMaterial(Ids.SILVER_SINGULARITY, SlimefunItem.getById("銀奇點").getItem(), "#d4d4d4")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_SILVER_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_SILVER_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_SILVER_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_SILVER_SINGULARITY_LINKS)
        .setFormBlock("銀奇點")
        .build();

    private static final TinkerMaterial ALUMINUM_SINGULARITY = new TinkerMaterial(Ids.ALUMINUM_SINGULARITY, SlimefunItem.getById("鋁奇點").getItem(), "#b0b0b0")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_ALUMINUM_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_ALUMINUM_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_ALUMINUM_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_ALUMINUM_SINGULARITY_LINKS)
        .setFormBlock("鋁奇點")
        .build();

    private static final TinkerMaterial TIN_SINGULARITY = new TinkerMaterial(Ids.TIN_SINGULARITY, SlimefunItem.getById("錫奇點").getItem(), "#a89b9b")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_TIN_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_TIN_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_TIN_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_TIN_SINGULARITY_LINKS)
        .setFormBlock("錫奇點")
        .build();

    private static final TinkerMaterial ZINC_SINGULARITY = new TinkerMaterial(Ids.ZINC_SINGULARITY, SlimefunItem.getById("鋅奇點").getItem(), "#9ba8a6")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_ZINC_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_ZINC_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_ZINC_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_ZINC_SINGULARITY_LINKS)
        .setFormBlock("鋅奇點")
        .build();

    private static final TinkerMaterial MAGNESIUM_SINGULARITY = new TinkerMaterial(Ids.MAGNESIUM_SINGULARITY, SlimefunItem.getById("鎂奇點").getItem(), "#e8cef5")
        .setLiquidTexture(SkullTextures.ALLOY_PINK)
        .setTraitToolHead(Traits.INFINITY_MAGNESIUM_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_MAGNESIUM_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_MAGNESIUM_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_MAGNESIUM_SINGULARITY_LINKS)
        .setFormBlock("鎂奇點")
        .build();

    private static final TinkerMaterial DIAMOND_SINGULARITY = new TinkerMaterial(Ids.DIAMOND_SINGULARITY, SlimefunItem.getById("鑽石奇點").getItem(), "#e8cef5")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE)
        .setFormBlock("鑽石奇點")
        .build();

    private static final TinkerMaterial MYTHRIL = new TinkerMaterial(Ids.MYTHRIL, SlimefunItem.getById("秘銀礦;").getItem(), "#4ebdc7")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.INFINITY_MYTHRIL_HEAD)
        .setTraitToolRod(Traits.INFINITY_MYTHRIL_ROD)
        .setTraitArmorPlates(Traits.INFINITY_MYTHRIL_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_MYTHRIL_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_MYTHRIL.getItemId())
        .setFormIngot("秘銀礦;")
        .setFormBlock(Materials.BLOCK_CAST_MYTHRIL.getItemId())
        .build();

    private static final TinkerMaterial ADAMANTITE = new TinkerMaterial(Ids.ADAMANTITE, SlimefunItem.getById("金剛石").getItem(), "#c93ec2")
        .setLiquidTexture(SkullTextures.ALLOY_TAN)
        .setTraitToolHead(Traits.INFINITY_ADAMANTITE_HEAD)
        .setTraitToolRod(Traits.INFINITY_ADAMANTITE_ROD)
        .setTraitArmorPlates(Traits.INFINITY_ADAMANTITE_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_ADAMANTITE_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_ADAMANTITE.getItemId())
        .setFormIngot("金剛石")
        .setFormBlock(Materials.BLOCK_CAST_ADAMANTITE.getItemId())
        .build();

    private static final TinkerMaterial MAGNONIUM = new TinkerMaterial(Ids.MAGNONIUM, SlimefunItem.getById("鎂").getItem(), "#4a0446")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE)
        .setTraitToolHead(Traits.INFINITY_MAGNONIUM_HEAD)
        .setTraitToolRod(Traits.INFINITY_MAGNONIUM_ROD)
        .setTraitArmorPlates(Traits.INFINITY_MAGNONIUM_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_MAGNONIUM_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_MAGNONIUM.getItemId())
        .setFormIngot("鎂")
        .setFormBlock(Materials.BLOCK_CAST_MAGNONIUM.getItemId())
        .build();

    private static final TinkerMaterial FORTUNE_SINGULARITY = new TinkerMaterial(Ids.FORTUNE_SINGULARITY, SlimefunItem.getById("幸運奇點").getItem(), "#f0d541")
        .setLiquidTexture(SkullTextures.ALLOY_PURPLE)
        .setTraitToolHead(Traits.INFINITY_FORTUNE_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_FORTUNE_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_FORTUNE_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_FORTUNE_SINGULARITY_LINKS)
        .setFormGem("幸運奇點")
        .build();

    private static final TinkerMaterial MAGIC_SINGULARITY = new TinkerMaterial(Ids.MAGIC_SINGULARITY, SlimefunItem.getById("魔法奇點").getItem(), "#c941e8")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE)
        .setTraitToolHead(Traits.INFINITY_MAGIC_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_MAGIC_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_MAGIC_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_MAGIC_SINGULARITY_LINKS)
        .setFormGem("魔法奇點")
        .build();

    private static final TinkerMaterial EARTH_SINGULARITY = new TinkerMaterial(Ids.EARTH_SINGULARITY, SlimefunItem.getById("地球奇點").getItem(), "#44e34f")
        .setLiquidTexture(SkullTextures.ALLOY_GREEN)
        .setTraitToolHead(Traits.INFINITY_EARTH_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_EARTH_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_EARTH_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_EARTH_SINGULARITY_LINKS)
        .setFormGem("地球奇點")
        .build();

    private static final TinkerMaterial METAL_SINGULARITY = new TinkerMaterial(Ids.METAL_SINGULARITY, SlimefunItem.getById("金屬奇點").getItem(), "#5b615b")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.INFINITY_METAL_SINGULARITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_METAL_SINGULARITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_METAL_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_METAL_SINGULARITY_LINKS)
        .setFormGem("金屬奇點")
        .build();

    private static final TinkerMaterial INFINITY = new TinkerMaterial(Ids.INFINITY, SlimefunItem.getById("無限錠").getItem(), "#d1ebf0")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.INFINITY_INFINITY_HEAD)
        .setTraitToolRod(Traits.INFINITY_INFINITY_ROD)
        .setTraitArmorPlates(Traits.INFINITY_INFINITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_INFINITY_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_INFINITY.getItemId())
        .setFormIngot("無限錠")
        .setFormBlock(Materials.BLOCK_CAST_INFINITY.getItemId())
        .build();

    private static final TinkerMaterial INFINITY_SINGULARITY = new TinkerMaterial(Ids.INFINITY_SINGULARITY, SlimefunItem.getById("無限奇點").getItem(), "#e8cef5")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.INFINITY_INFINITY_SINGULARITY_HEAD)
        .setTraitArmorPlates(Traits.INFINITY_INFINITY_SINGULARITY_PLATES)
        .setTraitArmorLinks(Traits.INFINITY_INFINITY_SINGULARITY_LINKS)
        .setFormBlock("無限奇點")
        .build();

    static {
        CM_MAP.put(Ids.VOID, VOID);
        CM_MAP.put(Ids.MAGSTEEL, MAGSTEEL);
        CM_MAP.put(Ids.TITANIUM, TITANIUM);
        CM_MAP.put(Ids.IRON_SINGULARITY, IRON_SINGULARITY);
        CM_MAP.put(Ids.GOLD_SINGULARITY, GOLD_SINGULARITY);
        CM_MAP.put(Ids.COPPER_SINGULARITY, COPPER_SINGULARITY);
        CM_MAP.put(Ids.LEAD_SINGULARITY, LEAD_SINGULARITY);
        CM_MAP.put(Ids.SILVER_SINGULARITY, SILVER_SINGULARITY);
        CM_MAP.put(Ids.ALUMINUM_SINGULARITY, ALUMINUM_SINGULARITY);
        CM_MAP.put(Ids.TIN_SINGULARITY, TIN_SINGULARITY);
        CM_MAP.put(Ids.ZINC_SINGULARITY, ZINC_SINGULARITY);
        CM_MAP.put(Ids.MAGNESIUM_SINGULARITY, MAGNESIUM_SINGULARITY);
        CM_MAP.put(Ids.DIAMOND_SINGULARITY, DIAMOND_SINGULARITY);
        CM_MAP.put(Ids.MYTHRIL, MYTHRIL);
        CM_MAP.put(Ids.ADAMANTITE, ADAMANTITE);
        CM_MAP.put(Ids.MAGNONIUM, MAGNONIUM);
        CM_MAP.put(Ids.FORTUNE_SINGULARITY, FORTUNE_SINGULARITY);
        CM_MAP.put(Ids.MAGIC_SINGULARITY, MAGIC_SINGULARITY);
        CM_MAP.put(Ids.EARTH_SINGULARITY, EARTH_SINGULARITY);
        CM_MAP.put(Ids.METAL_SINGULARITY, METAL_SINGULARITY);
        CM_MAP.put(Ids.INFINITY, INFINITY);
        CM_MAP.put(Ids.INFINITY_SINGULARITY, INFINITY_SINGULARITY);
    }

    public static Map<String, TinkerMaterial> getCmMap() {
        return CM_MAP;
    }
}
