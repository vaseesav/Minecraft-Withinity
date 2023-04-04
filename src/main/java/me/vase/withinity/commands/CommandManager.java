package me.vase.withinity.commands;

import me.vase.withinity.Withinity;
import me.vase.withinity.commands.menu.AdminPanelCommand;
import me.vase.withinity.commands.menu.SetWalkingSpeedMenuCommand;
import org.bukkit.command.CommandExecutor;

public class CommandManager {
    public CommandManager() {
        // Register commands here:
        registerCommand("god", new GodModeCommand(), true);
        registerCommand("setlevel", new SetLevelCommand(), true);
        registerCommand("admin", new AdminPanelCommand(), true);
        registerCommand("test", new TestCommand(), false);
        registerCommand("setwalkingspeed", new SetWalkingSpeedCommand(), true);
        registerCommand("walkingspeedmenu", new SetWalkingSpeedMenuCommand(), true);
        registerCommand("fly", new FlightCommand(), true);
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
