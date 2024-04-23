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
        String name = event.getEntity().getDisplayName();
        getLogger().info(ChatColor.translateAlternateColorCodes('&', "&cA player &a(" + name + ")&c was damaged."));
        getLogger().info(ChatColor.translateAlternateColorCodes('&', "&cThey took " + damage + " damage."));
    }

}