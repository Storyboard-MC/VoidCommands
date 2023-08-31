package ca.voidcraft.voidcommands;

import ca.voidcraft.voidcommands.commands.broadcastCommand;
import ca.voidcraft.voidcommands.commands.eventCommand;
import ca.voidcraft.voidcommands.commands.mapCommand;
import ca.voidcraft.voidcommands.commands.rulesCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class VoidCommands extends JavaPlugin {
    public static VoidCommands instance;

    @Override
    public void onEnable() {
        instance = this;
        getCommand("map").setExecutor(new mapCommand());
        getCommand("rules").setExecutor(new rulesCommand());
        getCommand("broadcast").setExecutor(new broadcastCommand());
        getCommand("event").setExecutor(new eventCommand());

        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
