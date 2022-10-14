package com.epitech.halloweencamp;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.epitech.halloweencamp.Commandes.Spook;
import com.epitech.halloweencamp.Commandes.MagicWand;
import com.epitech.halloweencamp.Listeners.Join;
import com.epitech.halloweencamp.Listeners.TrickOrTreat;

public class App extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Plugin Loaded! Running version " + getDescription().getVersion());

        // register commands
        getCommand("spook").setExecutor(new Spook());
        getCommand("magicwand").setExecutor(new MagicWand());

        // register events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new Join(), this);
        pm.registerEvents(new TrickOrTreat(), this);
        pm.registerEvents(new MagicWand(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin Unloaded!");
    }

}