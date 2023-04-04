package me.vase.withinity.commands.menu;

import me.vase.withinity.utils.inventories.SetWalkingSpeedMenu;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetWalkingSpeedMenuCommand implements CommandExecutor {
    private SetWalkingSpeedMenu walkingSpeedMenu;
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        this.walkingSpeedMenu = new SetWalkingSpeedMenu();
        if (commandSender instanceof Player) {
            Player player = (Player)commandSender;
            this.walkingSpeedMenu.openInventory(player);
        }
        return true;
    }
}
