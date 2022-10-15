package com.epitech.halloweencamp.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class Join implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.getInventory().getHelmet() == null) {
            player.getInventory().setHelmet(new ItemStack(Material.JACK_O_LANTERN));
        }
    }
}
