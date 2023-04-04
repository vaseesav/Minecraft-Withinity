package me.vase.withinity.utils.inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class AdminPanelMenu {
    private final Inventory inventory;

    public AdminPanelMenu() {
        this.inventory = Bukkit.createInventory(null, 9, ChatColor.RED + "Admin-Panel");
        ItemStack itemGod = new ItemStack(Material.GOLDEN_APPLE, 1);
        ItemStack itemSpeed = new ItemStack(Material.DIAMOND_BOOTS, 1);
        ItemStack itemFly = new ItemStack(Material.FEATHER, 1);
        ItemMeta itemGodMeta = itemGod.getItemMeta();
        ItemMeta itemSpeedMeta = itemSpeed.getItemMeta();
        ItemMeta itemFlyMeta = itemFly.getItemMeta();

        itemGodMeta.setDisplayName("§c God-Mode");
        itemGodMeta.setLore(Collections.singletonList("Enables or Disables God-Mode"));
        itemGod.setItemMeta(itemGodMeta);

        itemSpeedMeta.setDisplayName("§b Set Walking Speed");
        itemSpeedMeta.setLore(Collections.singletonList("Set your walking speed"));
        itemSpeed.setItemMeta(itemSpeedMeta);

        itemFlyMeta.setDisplayName("§b Fly");
        itemFlyMeta.setLore(Collections.singletonList("Enables or Disables Fly"));
        itemFly.setItemMeta(itemFlyMeta);

        this.inventory.setItem(0, itemGod);
        this.inventory.setItem(1, itemSpeed);
        this.inventory.setItem(2, itemFly);
    }

    public void openInventory(Player player) {
        player.openInventory(this.inventory);
    }
}
