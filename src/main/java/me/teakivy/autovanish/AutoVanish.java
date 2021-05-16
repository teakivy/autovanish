package me.teakivy.autovanish;

import me.teakivy.autovanish.Events.JoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class AutoVanish extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        for (Player player : Bukkit.getOnlinePlayers()) {
            for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                player.hidePlayer(onlinePlayer);
            }
        }
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        for (Player player : Bukkit.getOnlinePlayers()) {
            for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                player.showPlayer(onlinePlayer);
            }
        }
    }
}
