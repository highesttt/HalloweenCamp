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
        getCommand("???").setExecutor(new Spook());

        // register events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents();
    }

    @Override
    public void onDisable() {
        getLogger().info("[" + getDescription().getName() + "] Plugin Unloaded!");
    }

}