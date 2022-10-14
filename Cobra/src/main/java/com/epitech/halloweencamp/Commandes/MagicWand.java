package com.epitech.halloweencamp.Commandes;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class MagicWand implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack item = new ItemStack(Material.STICK);
            ItemMeta meta = item.getItemMeta();
            meta.setDisplayName(ChatColor.DARK_PURPLE + "Baguette Magique");
            item.setItemMeta(meta);

            player.getInventory().addItem(item);
            player.sendMessage("Baguette Magique ajoutée à votre inventaire");
        }
        return true;
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Action action = event.getAction();

        if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {

            ItemStack item = event.getItem();
            String itemname = item.getItemMeta().getDisplayName();

            if (item.getType() == Material.STICK && itemname.equals(ChatColor.DARK_PURPLE + "Baguette Magique")) {

                World world = player.getWorld();
                Location loc = player.getLocation();

                world.spawnEntity(loc, EntityType.WITCH);
                for (int i = 0; i < 15; i++) {
                    world.spawnEntity(loc, EntityType.BAT);
                }

            }

        }

    }
}
