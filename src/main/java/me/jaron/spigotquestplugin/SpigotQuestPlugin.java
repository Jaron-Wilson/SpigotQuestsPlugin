package me.jaron.spigotquestplugin;

import me.jaron.spigotquestplugin.commands.QuestCommand;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class SpigotQuestPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        List<Reward> rewards = new ArrayList<>();
        rewards.add(new Reward(10, Material.DIAMOND));
        rewards.add(new Reward(5, Material.EMERALD));
        Quest quest = new Quest("My Quest", "Complete the task", rewards);


        // Register the command
        getCommand("quest").setExecutor(new QuestCommand());

    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
