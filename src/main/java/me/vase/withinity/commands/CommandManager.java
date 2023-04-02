package me.vase.withinity.commands;

import me.vase.withinity.Withinity;
import org.bukkit.command.CommandExecutor;

public class CommandManager {

    public CommandManager() {
        // Register commands here:
        registerCommand("god", new GodModeCommand());
        registerCommand("test", new TestCommand());
        registerCommand("setlevel", new SetLevelCommand());
    }

    public void registerCommand(String commandName, CommandExecutor commandExecutor) {
        // registers the commands
        Withinity.getPlugin().getCommand(commandName).setExecutor(commandExecutor);
    }
}
