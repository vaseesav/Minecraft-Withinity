package me.vase.withinity.commands;

import me.vase.withinity.utils.inventories.AdminPanelMenu;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class AdminPanelCommand implements CommandExecutor {
    private AdminPanelMenu adminPanelMenu;
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        this.adminPanelMenu = new AdminPanelMenu();
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;
            this.adminPanelMenu.openInventory(player);
        }
        return true;
    }
}

