package me.vase.withinity.listeners.inventory;

import me.vase.withinity.listeners.inventory.handler.AdminPanelMenuClickHandler;
import me.vase.withinity.listeners.inventory.handler.WalkingSpeedMenuClickHandler;
import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onMenuItemClick(InventoryClickEvent e) {
        HumanEntity player = e.getWhoClicked();

        if (player instanceof Player) {
            Player p = (Player) player;

            // Admin Panel Menu
            if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Admin-Panel")) {
                AdminPanelMenuClickHandler.handleClick(e, p);
                e.setCancelled(true);
            }

            // Walking Speed Menu
            if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Walking-Speed")) {
                WalkingSpeedMenuClickHandler.handleClick(e, p);
                e.setCancelled(true);
            }
        }
    }
}
