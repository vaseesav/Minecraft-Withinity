package me.vase.withinity.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodModeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player player = (Player)commandSender;

            if (player.isInvulnerable()) {
                player.setInvulnerable(false);
                player.setFoodLevel(20);
                player.setSaturation(0);
                player.sendMessage(ChatColor.RED + "God Mode has been disabled!");
            } else {
                player.setInvulnerable(true);
                player.setFoodLevel(20);
                player.setSaturation(20);
                player.sendMessage(ChatColor.GREEN + "God Mode has been enabled!");
            }
        }

        return true;
    }
}
