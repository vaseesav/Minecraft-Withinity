package me.vase.withinity.utils.inventories;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class SetWalkingSpeedMenu {
    private final Inventory inventory;

    public SetWalkingSpeedMenu() {
        this.inventory = Bukkit.createInventory(null, 9, ChatColor.AQUA + "Walking-Speed");

        ItemStack itemLess = new ItemStack(Material.STONE_BUTTON, 1);
        ItemStack itemMore = new ItemStack(Material.STONE_BUTTON, 1);
        ItemStack itemDefault = new ItemStack(Material.SPRUCE_SIGN, 1);
        ItemStack itemBack = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);

        ItemMeta itemLessMeta = itemLess.getItemMeta();
        ItemMeta itemMoreMeta = itemMore.getItemMeta();
        ItemMeta itemDefaultMeta = itemDefault.getItemMeta();
        ItemMeta itemBackMeta = itemBack.getItemMeta();

        itemLessMeta.setDisplayName("Less Walking Speed");
        itemLess.setItemMeta(itemLessMeta);

        itemMoreMeta.setDisplayName("More Walking Speed");
        itemMore.setItemMeta(itemMoreMeta);

        itemDefaultMeta.setDisplayName("Reset to default");
        itemDefault.setItemMeta(itemDefaultMeta);

        itemBackMeta.setDisplayName("Back");
        itemBack.setItemMeta(itemBackMeta);

        this.inventory.setItem(3, itemLess);
        this.inventory.setItem(4, itemDefault);
        this.inventory.setItem(5, itemMore);
        this.inventory.setItem(8, itemBack);
    }

    public void openInventory(Player player) {
        player.openInventory(this.inventory);
    }
}
