package me.vase.withinity.commands;

import org.bukkit.Color;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;

                p.setDisplayName(Color.RED + p.getDisplayName());
                p.setPlayerListName(Color.RED + p.getDisplayName());
                p.setCustomName(Color.RED + p.getDisplayName());
        }

        return true;
    }
}
