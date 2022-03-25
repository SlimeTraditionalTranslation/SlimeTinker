package io.github.sefiraat.slimetinker.items.tinkermaterials.setup;

import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterial;
import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("SpellCheckingInspection")
public final class TinkersMaterialsLiteXpansion {

    private TinkersMaterialsLiteXpansion() {
        throw new UnsupportedOperationException("Utility Class");
    }

    private static final Map<String, TinkerMaterial> CM_MAP = new HashMap<>();

    private static final TinkerMaterial RUBBER = new TinkerMaterial(Ids.RUBBER, SlimefunItem.getById("橡膠").getItem(), "#38414d")
        .setTraitToolBinder(Traits.LITE_RUBBER_BINDING)
        .setTraitArmorGambeson(Traits.LITE_RUBBER_GAMBESON)
        .setFormGem("橡膠")
        .build();

    private static final TinkerMaterial REFINED_IRON = new TinkerMaterial(Ids.REFINED_IRON, SlimefunItem.getById("精煉鐵").getItem(), "#ababab")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.LITE_REFINED_IRON_HEAD)
        .setTraitToolRod(Traits.LITE_REFINED_IRON_ROD)
        .setTraitArmorPlates(Traits.LITE_REFINED_IRON_PLATES)
        .setTraitArmorLinks(Traits.LITE_REFINED_IRON_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_REFINED_IRON.getItemId())
        .setFormIngot("精煉鐵")
        .setFormBlock(Materials.BLOCK_CAST_REFINED_IRON.getItemId())
        .build();

    private static final TinkerMaterial MIXED_METAL = new TinkerMaterial(Ids.MIXED_METAL, SlimefunItem.getById("混合金屬錠").getItem(), "#6e7a66")
        .setLiquidTexture(SkullTextures.ALLOY_SILVER)
        .setTraitToolHead(Traits.LITE_MIXED_METAL_HEAD)
        .setTraitToolRod(Traits.LITE_MIXED_METAL_ROD)
        .setTraitArmorPlates(Traits.LITE_MIXED_METAL_PLATES)
        .setTraitArmorLinks(Traits.LITE_MIXED_METAL_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_MIXED_METAL.getItemId())
        .setFormIngot("混合金屬錠")
        .setFormBlock(Materials.BLOCK_CAST_MIXED_METAL.getItemId())
        .addAlloyRecipe(
            REFINED_IRON.getLiquidItemStack(3),
            TinkersMaterialsCore.getCmMap().get(Ids.BRONZE).getLiquidItemStack(3),
            TinkersMaterialsCore.getCmMap().get(Ids.TIN).getLiquidItemStack(3)
        )
        .build();

    private static final TinkerMaterial ADVANCED_ALLOY = new TinkerMaterial(Ids.ADVANCED_ALLOY, SlimefunItem.getById("高級合金").getItem(), "#78aba2")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.LITE_ADVANCED_ALLOY_HEAD)
        .setTraitToolRod(Traits.LITE_ADVANCED_ALLOY_ROD)
        .setTraitArmorPlates(Traits.LITE_ADVANCED_ALLOY_PLATES)
        .setTraitArmorLinks(Traits.LITE_ADVANCED_ALLOY_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_ADVANCED_ALLOY.getItemId())
        .setFormIngot("高級合金")
        .setFormBlock(Materials.BLOCK_CAST_ADVANCED_ALLOY.getItemId())
        .build();

    private static final TinkerMaterial THORIUM = new TinkerMaterial(Ids.THORIUM, SlimefunItem.getById("釷").getItem(), "#33de4d")
        .setLiquidTexture(SkullTextures.ALLOY_GREEN)
        .setFormGem("釷")
        .build();

    private static final TinkerMaterial MAG_THOR = new TinkerMaterial(Ids.MAG_THOR, SlimefunItem.getById("磁雷神").getItem(), "#33de4d")
        .setLiquidTexture(SkullTextures.ALLOY_BLUE_PALE)
        .setTraitToolHead(Traits.LITE_MAG_THOR_HEAD)
        .setTraitToolRod(Traits.LITE_MAG_THOR_ROD)
        .setTraitArmorPlates(Traits.LITE_MAG_THOR_PLATES)
        .setTraitArmorLinks(Traits.LITE_MAG_THOR_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_MAG_THOR.getItemId())
        .setFormIngot("磁雷神")
        .setFormBlock(Materials.BLOCK_CAST_MAG_THOR.getItemId())
        .addAlloyRecipe(
            TinkersMaterialsCore.getCmMap().get(Ids.REINFORCED_ALLOY).getLiquidItemStack(1),
            THORIUM.getLiquidItemStack(1),
            TinkersMaterialsCore.getCmMap().get(Ids.MAGNESIUM).getLiquidItemStack(1),
            TinkersMaterialsCore.getCmMap().get(Ids.ZINC).getLiquidItemStack(1)
        )
        .build();

    private static final TinkerMaterial CARBON_MESH = new TinkerMaterial(Ids.CARBON_MESH, SlimefunItem.getById("原碳網").getItem(), "#192927")
        .setTraitToolBinder(Traits.LITE_CARBON_MESH_BINDING)
        .setTraitArmorGambeson(Traits.LITE_CARBON_MESH_GAMBESON)
        .build();

    private static final TinkerMaterial SCRAP = new TinkerMaterial(Ids.SCRAP, SlimefunItem.getById("廢料").getItem(), "#5c451d")
        .setLiquidTexture(SkullTextures.ALLOY_BROWN)
        .setTraitToolHead(Traits.LITE_SCRAP_HEAD)
        .setTraitToolRod(Traits.LITE_SCRAP_ROD)
        .setTraitArmorPlates(Traits.LITE_SCRAP_PLATES)
        .setTraitArmorLinks(Traits.LITE_SCRAP_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_SCRAP.getItemId())
        .setFormIngot("廢料")
        .setFormBlock(Materials.BLOCK_CAST_SCRAP.getItemId())
        .build();

    private static final TinkerMaterial IRIDIUM = new TinkerMaterial(Ids.IRIDIUM, SlimefunItem.getById("銥").getItem(), "#c999c9")
        .setLiquidTexture(SkullTextures.ALLOY_PINK)
        .setTraitToolHead(Traits.LITE_IRIDIUM_HEAD)
        .setTraitToolRod(Traits.LITE_IRIDIUM_ROD)
        .setTraitArmorPlates(Traits.LITE_IRIDIUM_PLATES)
        .setTraitArmorLinks(Traits.LITE_IRIDIUM_LINKS)
        .setFormNugget(Materials.NUGGET_CAST_IRIDIUM.getItemId())
        .setFormIngot("銥")
        .setFormBlock(Materials.BLOCK_CAST_IRIDIUM.getItemId())
        .build();

    static {
        CM_MAP.put(Ids.RUBBER, RUBBER);
        CM_MAP.put(Ids.REFINED_IRON, REFINED_IRON);
        CM_MAP.put(Ids.MIXED_METAL, MIXED_METAL);
        CM_MAP.put(Ids.ADVANCED_ALLOY, ADVANCED_ALLOY);
        CM_MAP.put(Ids.THORIUM, THORIUM);
        CM_MAP.put(Ids.MAG_THOR, MAG_THOR);
        CM_MAP.put(Ids.CARBON_MESH, CARBON_MESH);
        CM_MAP.put(Ids.SCRAP, SCRAP);
        CM_MAP.put(Ids.IRIDIUM, IRIDIUM);
    }

    public static Map<String, TinkerMaterial> getCmMap() {
        return CM_MAP;
    }
}
