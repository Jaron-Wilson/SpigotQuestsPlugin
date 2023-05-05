package me.jaron.spigotquestplugin;

import org.bukkit.Material;

public class Reward {
    private int amount;
    private Material material;

    public Reward(int amount, Material material) {
        this.amount = amount;
        this.material = material;
    }

    public int getAmount() {
        return amount;
    }

    public Material getMaterial() {
        return material;
    }
}
