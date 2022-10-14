package com.epitech.halloweencamp;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.epitech.halloweencamp.Commandes.Spook;
import com.epitech.halloweencamp.Listeners.Join;

public class App extends JavaPlugin {

    static App app;

    @Override
    public void onEnable() {
        app = this;
        getLogger().info("[" + getDescription().getName() + "] Plugin Loaded! Running version " + getDescription().getVersion());

        // register commands
        getCommand("spook").setExecutor(new Spook());

        // register events
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new Join(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("[" + getDescription().getName() + "] Plugin Unloaded!");
    }

    public static App getApp() {
        return app;
    }

}