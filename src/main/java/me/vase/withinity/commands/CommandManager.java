package me.vase.withinity.commands;

import org.bukkit.command.CommandExecutor;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private static Map<String, CommandExecutor> commands;

    public CommandManager() {
        this.commands = new HashMap<>();

        // Register commands
        registerCommand("god", new GodModeCommand());
        registerCommand("test", new TestCommand());
    }

    private void registerCommand(String commandName, CommandExecutor commandExecutor) {
        // Store the command executor in the map
        commands.put(commandName, commandExecutor);
    }

    public static Map<String, CommandExecutor> getCommands() {
        // return the commands
        return commands;
    }
}
