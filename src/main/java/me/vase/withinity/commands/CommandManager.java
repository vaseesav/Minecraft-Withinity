package me.vase.withinity.commands;

import me.vase.withinity.Withinity;
import org.bukkit.command.CommandExecutor;

public class CommandManager {
    public CommandManager() {
        // Register commands here:
        registerCommand("god", new GodModeCommand(), true);
        registerCommand("setlevel", new SetLevelCommand(), true);
        registerCommand("admin", new AdminPanelCommand(), true);
        registerCommand("test", new TestCommand(), true);
        registerCommand("setwalkingspeed", new SetWalkingSpeedCommand(), true);
        registerCommand("walkingspeedmenu", new SetWalkingSpeedMenuCommand(), true);
    }

    public void registerCommand(String commandName, CommandExecutor commandExecutor, Boolean enabled) {
        // registers the commands
        try {
            if (enabled) Withinity.getPlugin().getCommand(commandName).setExecutor(commandExecutor);
        } catch (Exception e) {
            System.out.println("Error during the registration process of the commands " + e);
        }
    }
}
