package me.vase.withinity;

import me.vase.withinity.commands.CommandManager;
import me.vase.withinity.listeners.ListenerManager;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Map;

public final class Withinity extends JavaPlugin {

    public static String PLUGIN_NAME;
    public static String PLUGIN_VERSION;

    @Override
    public void onEnable() {
        // Plugin startup logic
        PLUGIN_NAME = getDescription().getName();
        PLUGIN_VERSION = getDescription().getVersion();

        String startupMessage = String.format("[§2%s§f]: §2has successfully loaded version %s.", PLUGIN_NAME, PLUGIN_VERSION);
        ListenerManager listenerManager = new ListenerManager(this);
        CommandManager commandManager = new CommandManager();

        // Initialize ListenerManager
        getServer().getPluginManager().registerEvents(listenerManager, this);

        // Initialize CommandManager
        try {
            Map<String, CommandExecutor> commands = commandManager.getCommands();
            for (String name : commands.keySet()) {
                getCommand(name).setExecutor(commands.get(name));
            }
        } catch (Exception e) {
            throw new RuntimeException("An error happened during the registration process of the commands.", e);
        }

        // Plugin startup message
        Bukkit.getConsoleSender().sendMessage(startupMessage);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
