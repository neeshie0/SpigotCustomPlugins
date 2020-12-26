package com.anemovva.gmail.customFarmEnchants;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Field;

public class CustomFarmEnchants extends JavaPlugin {
    public static CustomFarmEnchants plugin;

    @Override
    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new Magnet(), this);
        getServer().getPluginManager().registerEvents(new AutoPlant(), this);

    }

    @Override
    public void onDisable() {
    }


}
