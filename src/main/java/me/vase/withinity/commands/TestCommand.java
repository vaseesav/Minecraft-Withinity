package me.vase.withinity.commands;

import me.vase.withinity.Withinity;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;
            Inventory inventory = Bukkit.createInventory(p,9, "Admin-Panel");

            ItemStack itemGod = new ItemStack(Material.LEGACY_GOLDEN_APPLE, 1);
            ItemMeta itemGodMeta = itemGod.getItemMeta();

            itemGodMeta.setDisplayName("Set God Mode");
            itemGod.setItemMeta(itemGodMeta);
            inventory.setItem(0, itemGod);

            p.openInventory(inventory);
        }

        return true;
    }
}
