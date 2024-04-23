package com.nix.nixtils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;

public class Nixtils extends JavaPlugin {

    public static Nixtils instance;

    //startup logic
	public void onEnable() {
	    getLogger().info("Enabled Successfully");
    }
}
