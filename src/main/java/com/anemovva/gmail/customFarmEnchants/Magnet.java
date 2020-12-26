package com.anemovva.gmail.customFarmEnchants;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class Magnet implements Listener {


    @EventHandler
    public void onClick(BlockDropItemEvent event) {
        if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getLore().contains("AutoPickup")) {
            List items = event.getItems();
            for (Object item : items) {
                if (item instanceof Item) {
                    ((Item) item).setPickupDelay(0);
                    event.getPlayer().getInventory().addItem(((Item) item).getItemStack());
                    ((Item) item).remove();
                }
            }
        }

    }}
