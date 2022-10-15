package com.epitech.halloweencamp.Commandes;

import org.bukkit.Bukkit;
import org.bukkit.Particle;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spook implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // si l'argument contient un joueur en ligne, on lui fait peur!
            if (args.length == 1) {
                // si le joueur est en ligne
                if (Bukkit.getPlayer(args[0]) == null) {
                    player.sendMessage("Le joueur n'est pas en ligne");
                    return false;
                } else {
                    Player target = Bukkit.getPlayer(args[0]);
                    player.getWorld().spawnParticle(Particle.MOB_APPEARANCE, player.getLocation(), 1);
                    player.sendMessage("Tu as effrayé " + target.getName());
                    return true;
                }
            } else {
                player.sendMessage("§cErreur: /spook <player>");
            }
        }
        return true;
    }
}
