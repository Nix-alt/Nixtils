package com.nix.nixtils;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Nixtils extends JavaPlugin {

    @Override
	public void onEnable() {
        getlogger().info("Enabled");
    }

    @Override
    public void onDisable() {
        getlogger().info("Disabled");
    }
}
