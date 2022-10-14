package com.epitech.halloweencamp.Utils;

import org.bukkit.Material;

public class Block {
    public static boolean isDoor(org.bukkit.block.Block block) {

        if (block.getType() == Material.WOODEN_DOOR || block.getType() == Material.SPRUCE_DOOR || block.getType() == Material.BIRCH_DOOR || block.getType() == Material.JUNGLE_DOOR || block.getType() == Material.ACACIA_DOOR || block.getType() == Material.DARK_OAK_DOOR || block.getType() == Material.IRON_DOOR) {
            return true;
        }
        return false;

    }
}
