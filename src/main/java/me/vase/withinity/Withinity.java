package me.vase.withinity;

import me.vase.withinity.commands.CommandManager;
import me.vase.withinity.listeners.ListenerManager;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

public final class Withinity extends JavaPlugin {
    private static Withinity plugin;

    public static String PLUGIN_NAME;
    public static String PLUGIN_VERSION;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        PLUGIN_NAME = getDescription().getName();
        PLUGIN_VERSION = getDescription().getVersion();

        String startupMessage = String.format("[§2%s§f]: §2has successfully loaded version %s.", PLUGIN_NAME, PLUGIN_VERSION);
        ListenerManager listenerManager = new ListenerManager(this);

        // Initialize configuration file
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        // Initialize ListenerManager
        getServer().getPluginManager().registerEvents(listenerManager, this);

        // Initialize CommandManager
        new CommandManager();

        // Plugin startup message
        Bukkit.getConsoleSender().sendMessage(startupMessage);
    }

    public static Withinity getPlugin() {
        // Passing the plugin instance
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
