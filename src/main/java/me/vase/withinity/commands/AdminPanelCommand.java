package me.vase.withinity.commands;

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
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            Inventory inventory = Bukkit.createInventory(p,9, ChatColor.RED + "Admin-Panel");
            ItemStack itemGod = new ItemStack(Material.GOLDEN_APPLE, 1);
            ItemMeta itemGodMeta = itemGod.getItemMeta();

            itemGodMeta.setDisplayName("§c God-Mode");
            itemGodMeta.setLore(Collections.singletonList("Enables or Disables God-Mode"));
            itemGod.setItemMeta(itemGodMeta);

            inventory.setItem(0, itemGod);

            p.openInventory(inventory);
        }

        return true;
    }
}

