package me.vase.withinity.listeners.inventory;

import me.vase.withinity.Withinity;
import me.vase.withinity.commands.GodModeCommand;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {

    @EventHandler
    public void onMenuItemClick(InventoryClickEvent e) {
        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.RED + "Admin-Panel")) {
            if (e.getCurrentItem() != null && e.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
                Withinity.getPlugin().getServer().dispatchCommand(e.getWhoClicked(),"god");
            }
            e.setCancelled(true);
        }
    }
}
