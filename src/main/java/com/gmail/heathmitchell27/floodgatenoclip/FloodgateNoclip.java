package com.gmail.heathmitchell27.floodgatenoclip;

import net.minecraft.server.v1_16_R3.DedicatedServerProperties;
import org.bukkit.craftbukkit.v1_16_R3.CraftServer;
import org.bukkit.plugin.java.JavaPlugin;
import org.spigotmc.SpigotConfig;

import java.lang.reflect.Field;
import java.util.logging.Logger;

public class FloodgateNoclip extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listener(getLogger()), this);
        getLogger().info("Enabled floodgate-noclip!");
        getLogger().warning("Warning: floodgate-noclip disables all vanilla anticheat for Bedrock players and loosens anticheat for Java players! Only use it on private servers.");
    }
}
