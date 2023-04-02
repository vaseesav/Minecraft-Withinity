package me.vase.withinity.commands;

import me.vase.withinity.Withinity;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandManager {
    public static String commandName;
    public static CommandExecutor commandExecutor;

    public CommandManager() {
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