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
        if (event.getAction() == Action.LEFT_CLICK_BLOCK && Block.isDoor(event.getClickedBlock())) {
            counter++;
            if (counter == 3) {
                counter = 0;
                event.getPlayer().getInventory().addItem(new ItemStack(Material.EMERALD));
            }
        } else {
            counter = 0;
        }
    }
}