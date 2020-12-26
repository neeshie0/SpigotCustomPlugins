package com.anemovva.gmail.customFarmEnchants;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Ageable;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.inventory.ItemStack;


public class AutoPlant implements Listener {
    @EventHandler
    public void onBlockBreakEvent(BlockBreakEvent event) {
        if (event.getBlock().getBlockData() instanceof Ageable) {
            Block block = event.getBlock();
            event.setCancelled(true);
            Ageable age = (Ageable) block.getBlockData();
            age.setAge(0); // Setting the crop's state back to when it was planted
            block.setBlockData((BlockData) age);
        }
    }
}
