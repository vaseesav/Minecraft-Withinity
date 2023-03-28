package me.vase.withinity;

import me.vase.withinity.commands.CommandManager;
import me.vase.withinity.listeners.ListenerManager;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Withinity extends JavaPlugin {

    public static String PLUGIN_NAME;
    public static String PLUGIN_VERSION;

    @Override
    public void onEnable() {
        // Plugin startup logic
        PLUGIN_NAME = getDescription().getName();
        PLUGIN_VERSION = getDescription().getVersion();
        String startupMessage = String.format("[§2%s§f]: §2has successfully loaded version %s.", PLUGIN_NAME, PLUGIN_VERSION);

        // Initialize ListenerManager
        ListenerManager listenerManager = new ListenerManager(this);
        getServer().getPluginManager().registerEvents(listenerManager, this);

        //CommandExecutor commandExecutor = new CommandManager(this);
       // getCommand().setExecutor(commandExecutor);

        // Plugin startup message
        Bukkit.getConsoleSender().sendMessage(startupMessage);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
