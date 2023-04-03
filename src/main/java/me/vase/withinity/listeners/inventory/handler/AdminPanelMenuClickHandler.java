package me.vase.withinity.listeners.inventory.handler;

import me.vase.withinity.Withinity;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class AdminPanelMenuClickHandler implements Listener {

    public static void handleClick(InventoryClickEvent event, Player player) {
        if (event.getCurrentItem() == null) {
            return;
        }

        if (event.getCurrentItem().getType() == Material.GOLDEN_APPLE) {
            Withinity.getPlugin().getServer().dispatchCommand(player, "god");
        } else if (event.getCurrentItem().getType() == Material.DIAMOND_BOOTS) {
            Withinity.getPlugin().getServer().dispatchCommand(player, "walkingspeedmenu");
        }
    }
}
