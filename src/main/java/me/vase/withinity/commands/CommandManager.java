package me.vase.withinity.commands;

import me.vase.withinity.listeners.world.JoinLeaveListener;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

public class CommandManager {
    private Plugin plugin;
    private PluginManager pluginManager;
    private CommandExecutor commandExecutor;

    public CommandManager(Plugin plugin) {
        this.plugin = plugin;
        this.pluginManager = plugin.getServer().getPluginManager();

        // Register Commands
        registerCommands(new GodModeCommand());
    }

    public void registerCommands(CommandExecutor commmands) {
        // Registers commands to the command manager

        //pluginManager.registerEvents(listener, plugin);
        //getCommand("god").setExecutor(commmands);
    }
}

