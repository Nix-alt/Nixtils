package com.nix.nixtils.commands;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.ChatColor;



//Register command class
public class NixCmd implements CommandExecutor { //implement command execution

    //Boolean for when command is run
    public boolean onCommand(CommandSender sender, Command command, String label, String [] args){
        //Atleast 1 argument
        if (args.length > 0){
            //arg-1 is "info"
            if (args[0].equals("info")){
                //send messages with color codes
                String message = "&9--------Nixtils info--------";
                String message1 = "&6Version: 0.1\n&6Author: Nix\n&6Commands: (use /nixtils help)\nmore info soon";
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message1));
            }
            else if (args[0].equals("help")){
                String message = "&3All Nixtils commands:\n&7/nixtils\n&7/gmc /gms /gmsp /gma\n&7/gm (or /gamemode)\n&7/tp\n&7/god\n&7/list\n&7/find\n/afk";
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            }
            else if (args[0].equals("reload")){
                //not yet complete
                //note: run on disable and on enable
                String message = "&cFunctionality coming soon";
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
            }
        }
        //if no arguments
        else{
            String message = "&cYou must input proper arguments!\n&7/nixtils help\n&7/nixtils info\n&7/nixtils reload";
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
        }  
        //so the code knows everything went right
        return true;
    }
}