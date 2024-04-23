package com.nix.nixtils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.command.PluginCommand;
import com.nix.nixtils.commands;
import org.bukkit.command.CommandExecutor;

public class Nixtils extends JavaPlugin {

    public static Nixtils instance;

    //startup logic
	public void onEnable() {

        long start = System.currentTimeMillis();
	    getLogger().info("Unpackaging mental issues");
        getLogger().info("Registering commands");
        getLogger().info("Loading events");
        getLogger().info("\n");
        float finaltime = (System.currentTimeMillis() - start) / 1000;
        getLogger().info("Successfully enabled v0.1" + " in " + finaltime);
        getCommand("nixtils").setExecutor(new NixCmd());
        
    }

    //shutdown
    public void onDisable() {

        long start = System.currentTimeMillis();
	    getLogger().info("Bottling mental issues");
        getLogger().info("Deleting commands");
        getLogger().info("Unloading events");
        getLogger().info("\n");
        float finaltime = (System.currentTimeMillis() - start) / 1000;
        getLogger().info("Successfully disabled v0.1" + " in " + finaltime);
    }
}
