package me.vase.withinity.listeners.inventory.handler;

import me.vase.withinity.Withinity;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

public class WalkingSpeedMenuClickHandler {
    public static void handleClick(InventoryClickEvent event, Player player) {
        if (event.getCurrentItem() == null) {
            return;
        }

        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Less Walking Speed")) {
            Withinity.getPlugin().getServer().dispatchCommand(player, "setwalkingspeed " + (player.getWalkSpeed() - 0.05));
            player.sendMessage("Your current walking speed is now " + player.getWalkSpeed());
        } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("More Walking Speed")) {
            Withinity.getPlugin().getServer().dispatchCommand(player, "setwalkingspeed " + (player.getWalkSpeed() + 0.05));
            player.sendMessage("Your current walking speed is now " + player.getWalkSpeed());
        } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Reset to default")) {
            Withinity.getPlugin().getServer().dispatchCommand(player, "setwalkingspeed " + 0.2);
            player.sendMessage("Your walking speed has been reset to default.");
        } else if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Back")) {
            Withinity.getPlugin().getServer().dispatchCommand(player, "admin");
        }
    }
}
