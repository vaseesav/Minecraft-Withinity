package me.vase.withinity.commands;

import me.vase.withinity.Withinity;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class SetLevelCommand implements CommandExecutor {
    Plugin plugin = Withinity.getPlugin();
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length > 0) {
                Player target = Bukkit.getServer().getPlayerExact(args[0]);

                if (target == null) {
                    player.sendMessage("§c The player is not online!");
                } else {
                    try {
                        target.setLevel(Integer.parseInt(args[1]));
                    } catch (CommandException ce) {
                        System.out.print("Something went wrong performing the setlevel command! " + ce);
                        typoMessage(player);
                    } catch (Exception e) {
                        System.out.println("Something went wrong performing the setlevel command! " + e);
                        typoMessage(player);
                    }
                }
            } else {
                typoMessage(player);
            }
        } else {
            System.out.println("Integration of console command was not done so far.");
        }

        return true;
    }

    private void typoMessage(Player player){
        player.sendMessage("§c Something went wrong!");
        player.sendMessage("§2 Example: /setlevel <player> <level>");
    }
}
