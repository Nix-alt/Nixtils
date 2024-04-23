package com.nix.nixtils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Nixtils extends JavaPlugin {

	public void onEnable() {
        getlogger().info("Enabled");
    }
    public void onDisable() {
        getlogger().info("Disabled");
    }
}
