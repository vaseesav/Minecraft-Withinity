package me.vase.withinity.listeners;

import me.vase.withinity.listeners.inventory.MenuListener;
import me.vase.withinity.listeners.world.JoinLeaveListener;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class ListenerManager implements Listener {
    private Plugin plugin;
    private PluginManager pluginManager;

    public ListenerManager(Plugin plugin) {
        this.plugin = plugin;
        this.pluginManager = plugin.getServer().getPluginManager();

        // Register listeners
        registerListeners(new JoinLeaveListener());
        registerListeners(new MenuListener());
    }

    public void registerListeners(Listener listener) {
        // Registers listeners to the plugin manager

        pluginManager.registerEvents(listener, plugin);
    }
}
