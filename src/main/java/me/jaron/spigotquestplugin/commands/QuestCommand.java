package me.jaron.spigotquestplugin.commands;

import me.jaron.spigotquestplugin.Quest;
import me.jaron.spigotquestplugin.gui.QuestGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class QuestCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            QuestGUI gui = new QuestGUI(player);
            gui.open();
            return true;
        } else {
            sender.sendMessage("You must be a player to use this command.");
            return false;
        }
    }
}
