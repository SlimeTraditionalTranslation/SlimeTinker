package io.github.sefiraat.slimetinker.items.tinkermaterials.recipes;

import io.github.sefiraat.slimetinker.items.tinkermaterials.TinkerMaterial;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class CastResult {

    private final String id;
    private final int amount;
    private final Map<TinkerMaterial, ItemStack> outputs;
    private final boolean inputBurns;

    public CastResult(String id, int amount, Map<TinkerMaterial, ItemStack> outputs, boolean inputBurns) {
        this.id = id;
        this.amount = amount;
        this.outputs = outputs;
        this.inputBurns = inputBurns;
    }

    public String getId() {
        return id;
    }

    public int getAmount() {
        return amount;
    }

    public Map<TinkerMaterial, ItemStack> getOutputs() {
        return outputs;
    }

    public boolean isInputBurns() {
        return inputBurns;
    }
}
