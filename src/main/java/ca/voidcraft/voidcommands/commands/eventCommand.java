package ca.voidcraft.voidcommands.commands;



import org.apache.commons.lang3.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class eventCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String label, String[] args) {
        if (commandSender.hasPermission("voidcommands.event")){
            if(args.length == 0){
                commandSender.sendMessage("§5VoidCraft §f| §4Please tell the event to be sent to the players!");
            } else {
                Bukkit.broadcastMessage("§5VoidCraft §f| " + "§6§lEVENT§f: " + StringUtils.join(args, " "));
            }
        } else {
            commandSender.sendMessage("§5VoidCraft §f| §4No Permission!");
        }

        return true;
    }
}
