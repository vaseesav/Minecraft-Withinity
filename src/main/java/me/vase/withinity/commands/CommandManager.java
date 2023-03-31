package me.vase.withinity.commands;

import me.vase.withinity.Withinity;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandManager {
    private Plugin plugin;
    private PluginManager pluginManager;
    public static String commandName;
    public static CommandExecutor commandExecutor;

    public CommandManager(Plugin plugin) {
        this.plugin = plugin;
        this.pluginManager = plugin.getServer().getPluginManager();

        // Register commands
        registerCommand("god", new GodModeCommand());
        registerCommand("test", new TestCommand());
    }

    public void registerCommand(String name, CommandExecutor executor) {
        // Get the command object from the plugin
        commandName = name;
        commandExecutor = executor;
    }
}