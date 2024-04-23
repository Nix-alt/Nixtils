package com.nix.nixtils.events;

import org.bukkit.plugin.java.JavaPlugin;
import com.nix.nixtils.Nixtils;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class DamageHandler implements Listener{
    public DamageHandler(Nixtils plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void OnDamage(EntityDamageEvent event){
        if (!(event.getEntity() instanceof Player)){
            return;
        }
        double damage = event.getDamage();
        String message1 = "&cA player &a(" + Player.getDisplayName() + ")&c was damaged.";
        String message2 = "&cThey took " + damage + " damage.";
        getLogger().info(ChatColor.translateAlternateColorCodes('&', message1));
        getLogger().info(ChatColor.translateAlternateColorCodes('&', message2));
    }

}