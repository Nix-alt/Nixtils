package com.nix.nixtils.events;

import org.bukkit.plugin.java.JavaPlugin;
import com.nix.nixtils.Nixtils;
import org.bukkit.Event;
import org.bukkit.Event.Listener;
import org.bukkit.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.entity.Player;
import org.bukkit.ChatColor;

public class DamagerHandler implements Listener{
    public DamagerHandler(Nixtils plugin){
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void OnDamage(EntityDamageEvent event){
        if (!(event.getEntity instanceof Player)){
            return;
        }
        float damage = event.getDamage();
        Player player = (player) event.getEntity;
        String name = Player.getDisplayName();
        getLogger().info(ChatColor.translateAlternateColorCodes('&', "&cA player &a(" + name + ")&c was damaged."));
        getLogger().info(ChatColor.translateAlternateColorCodes('&', "&cThey took " + damage + " damage."));
    }

}