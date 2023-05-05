package me.jaron.spigotquestplugin;

import java.util.List;

public class Quest {
    private String name;
    private String description;
    private List<Reward> rewards;

    public Quest(String name, String description, List<Reward> rewards) {
        this.name = name;
        this.description = description;
        this.rewards = rewards;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Reward> getRewards() {
        return rewards;
    }
}