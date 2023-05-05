package me.jaron.spigotquestplugin.gui;

import me.jaron.spigotquestplugin.Quest;
import me.jaron.spigotquestplugin.Reward;
import me.jaron.spigotquestplugin.manager.QuestManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class QuestGUI implements InventoryHolder {
    private final Player player;
    private final Inventory inventory;

    public QuestGUI(Player player) {
        this.player = player;
        this.inventory = Bukkit.createInventory(this, 9, "Quests");

        QuestManager questManager = new QuestManager();
        List<Quest> quests = questManager.getQuests();

        // Populate the inventory with quest items
        for (Quest quest : quests) {
            ItemStack item = new ItemStack(Material.PAPER);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(quest.getName());
            List<String> lore = new ArrayList<>();
            lore.add(ChatColor.GRAY + quest.getDescription());
            lore.add(ChatColor.GREEN + "Rewards:");
            for (Reward reward : quest.getRewards()) {
                String rewardString = ChatColor.GOLD + "" + reward.getAmount() + " " + reward.getMaterial().toString();
                lore.add(rewardString);
            }

            meta.setLore(lore);
            item.setItemMeta(meta);
            inventory.addItem(item);
        }
    }


    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public void open() {
        player.openInventory(inventory);
    }
}
