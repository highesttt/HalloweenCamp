package com.epitech.halloweencamp.Listeners;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.epitech.halloweencamp.Utils.Block;

public class TrickOrTreat implements Listener {
    int counter = 0;

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        // si un joueur clic droit sur une porte 3 fois alors ça lui donne un objet
    }
}
