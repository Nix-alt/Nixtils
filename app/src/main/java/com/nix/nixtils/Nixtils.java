package com.nix.nixtils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Nixtils extends JavaPlugin {
	    public void onEnable() {
            Bukkit.getlogger().info("Enabled");
        }

        public void onDisable() {
            Bukkit.getlogger().info("Disabled");
        }
}
