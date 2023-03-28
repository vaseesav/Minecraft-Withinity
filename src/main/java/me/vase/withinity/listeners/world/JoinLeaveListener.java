package me.vase.withinity.listeners.world;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (player.hasPlayedBefore()) {
            e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + player.getDisplayName() + " welcome back!");
        } else {
            e.setJoinMessage(ChatColor.GREEN + "" + ChatColor.BOLD + player.getDisplayName() + " joined the server for the first time!");
        }
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e) {
        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.RED + "" + ChatColor.BOLD + player.getDisplayName() + " left the Server!");
    }
}
