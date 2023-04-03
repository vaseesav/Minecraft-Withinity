package me.vase.withinity.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class SetWalkingSpeedCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player)commandSender;

            try {
                player.setWalkSpeed(Float.parseFloat(args[0]));
            } catch (Exception e) {
                typoMessage(player, e);
            }
        }

        return true;
    }

    private void typoMessage(Player player, Exception e){
        player.sendMessage("§c Something went wrong!");
        player.sendMessage("§2 Example: /setwalkingspeed <speed>");
        System.out.println("Something went wrong performing the setwalkingspeed command! " + e);
    }
}
