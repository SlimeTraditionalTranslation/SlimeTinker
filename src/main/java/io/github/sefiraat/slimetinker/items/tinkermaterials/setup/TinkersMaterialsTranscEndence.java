package io.github.sefiraat.slimetinker.items.tinkermaterials.setup;

import io.github.sefiraat.slimetinker.items.Materials;
import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterial;
import io.github.sefiraat.slimetinker.utils.Ids;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("SpellCheckingInspection")
public final class TinkersMaterialsTranscEndence {

    private TinkersMaterialsTranscEndence() {
        throw new UnsupportedOperationException("Utility Class");
    }

    private static final Map<String, TinkerMaterial> CM_MAP = new HashMap<>();

    private static final TinkerMaterial DAXI_STRENGTH = new TinkerMaterial(Ids.DAXI_STRENGTH, SlimefunItem.getById("大曦之力量").getItem(), "#8321cf")
        .setLiquidTexture(SkullTextures.ALLOY_RED)
        .setTraitToolHead(Traits.TNS_DAXI_STRENGTH)
        .setFormNugget(Materials.NUGGET_CAST_DAXI_STRENGTH.getItemId())
        .setFormIngot(Materials.INGOT_CAST_DAXI_STRENGTH.getItemId())
        .setFormBlock("大曦之力量")
        .build();

    private static final TinkerMaterial DAXI_ABSORPTION = new TinkerMaterial(Ids.DAXI_ABSORPTION, SlimefunItem.getById("大曦之吸收").getItem(), "#8321cf")
        .setLiquidTexture(SkullTextures.ALLOY_RED)
        .setTraitArmorPlates(Traits.TNS_DAXI_ABSORPTION)
        .setFormNugget(Materials.NUGGET_CAST_DAXI_ABSORPTION.getItemId())
        .setFormIngot(Materials.INGOT_CAST_DAXI_ABSORPTION.getItemId())
        .setFormBlock("大曦之吸收")
        .build();

    private static final TinkerMaterial DAXI_FORTITUDE = new TinkerMaterial(Ids.DAXI_FORTITUDE, SlimefunItem.getById("大曦之剛毅").getItem(), "#8321cf")
        .setLiquidTexture(SkullTextures.ALLOY_RED)
        .setTraitArmorPlates(Traits.TNS_DAXI_FORTITUDE)
        .setFormNugget(Materials.NUGGET_CAST_DAXI_FORTITUDE.getItemId())
        .setFormIngot(Materials.INGOT_CAST_DAXI_FORTITUDE.getItemId())
        .setFormBlock("大曦之剛毅")
        .build();

    private static final TinkerMaterial DAXI_SATURATION = new TinkerMaterial(Ids.DAXI_SATURATION, SlimefunItem.getById("大曦之飽和").getItem(), "#8321cf")
        .setLiquidTexture(SkullTextures.ALLOY_RED)
        .setTraitArmorPlates(Traits.TNS_DAXI_SATURATION)
        .setFormNugget(Materials.NUGGET_CAST_DAXI_SATURATION.getItemId())
        .setFormIngot(Materials.INGOT_CAST_DAXI_SATURATION.getItemId())
        .setFormBlock("大曦之飽和")
        .build();

    private static final TinkerMaterial DAXI_REGENERATION = new TinkerMaterial(Ids.DAXI_REGENERATION, SlimefunItem.getById("大曦之再生").getItem(), "#8321cf")
        .setLiquidTexture(SkullTextures.ALLOY_RED)
        .setTraitArmorPlates(Traits.TNS_DAXI_REGENERATION)
        .setFormNugget(Materials.NUGGET_CAST_DAXI_REGENERATION.getItemId())
        .setFormIngot(Materials.INGOT_CAST_DAXI_REGENERATION.getItemId())
        .setFormBlock("大曦之再生")
        .build();

    static {
        CM_MAP.put(Ids.DAXI_STRENGTH, DAXI_STRENGTH);
        CM_MAP.put(Ids.DAXI_ABSORPTION, DAXI_ABSORPTION);
        CM_MAP.put(Ids.DAXI_FORTITUDE, DAXI_FORTITUDE);
        CM_MAP.put(Ids.DAXI_SATURATION, DAXI_SATURATION);
        CM_MAP.put(Ids.DAXI_REGENERATION, DAXI_REGENERATION);
    }

    public static Map<String, TinkerMaterial> getCmMap() {
        return CM_MAP;
    }
}
