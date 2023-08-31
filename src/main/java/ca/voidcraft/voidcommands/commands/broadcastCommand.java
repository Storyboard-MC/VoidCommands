package ca.voidcraft.voidcommands.commands;


import jdk.internal.joptsimple.internal.Strings;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class broadcastCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (commandSender.hasPermission("voidcommands.broadcast")){
            if(args.length == 0){
                commandSender.sendMessage("§5VoidCraft &f| §4Please specify a message to send to the whole server!");
            } else {
                Bukkit.broadcastMessage("§5VoidCraft §f| §c" + Strings.join(args, " "));
            }
        } else {
            commandSender.sendMessage("§5VoidCraft §f| §4No Permissions!");
        }

        return true;
    }
}
