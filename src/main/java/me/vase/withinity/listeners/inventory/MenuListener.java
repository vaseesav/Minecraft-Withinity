package me.vase.withinity.listeners.inventory;

import me.vase.withinity.Withinity;
import me.vase.withinity.commands.GodModeCommand;
import org.bukkit.ChatColor;
import org.bukkit.Material;
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
                if (e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
                    Withinity.getPlugin().getServer().dispatchCommand(player, "god");
                } else if (e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.DIAMOND_BOOTS) {
                    Withinity.getPlugin().getServer().dispatchCommand(player, "walkingspeedmenu");
                }
                e.setCancelled(true);
            }
            // Walking Speed Menu
            if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Walking-Speed")) {
                if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Less Walking Speed")) {
                    Withinity.getPlugin().getServer().dispatchCommand(player, "setwalkingspeed " + (p.getWalkSpeed() - 0.05));
                    p.sendMessage("Your current walking speed is now " + p.getWalkSpeed());
                } else if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("More Walking Speed")) {
                    Withinity.getPlugin().getServer().dispatchCommand(player, "setwalkingspeed " + (p.getWalkSpeed() + 0.05));
                    p.sendMessage("Your current walking speed is now " + p.getWalkSpeed());
                } else if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Reset to default")) {
                    Withinity.getPlugin().getServer().dispatchCommand(player, "setwalkingspeed " + 0.2);
                    p.sendMessage("Your walking speed has been reset to default.");
                } else if (e.getCurrentItem() != null && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Back")) {
                    Withinity.getPlugin().getServer().dispatchCommand(player, "admin");
                }
                e.setCancelled(true);
            }
        }
    }
}
