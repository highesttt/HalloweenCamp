package com.epitech.halloweencamp;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.epitech.halloweencamp.Commandes.Spook;

public class App extends JavaPlugin {

    static App app;

    @Override
    public void onEnable() {
        app = this;
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

    public static App getApp() {
        return app;
    }

}