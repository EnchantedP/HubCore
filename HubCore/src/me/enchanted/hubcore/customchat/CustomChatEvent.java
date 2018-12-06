package me.enchanted.hubcore.customchat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

import com.earth2me.essentials.Essentials;

import me.enchanted.hubcore.HubCore;
import me.enchanted.hubcore.particles.Cape;
import me.enchanted.hubcore.particles.LavaHelix;

public class CustomChatEvent implements Listener {

	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		Player p = e.getPlayer();
		e.setCancelled(true);
		Essentials es = (Essentials) Bukkit.getServer().getPluginManager().getPlugin("Essentials");
		if (es.getUser(p).isMuted() == true) {

		} else {
			Bukkit.getServer().broadcastMessage(e.getPlayer().getDisplayName() + " §7" + e.getMessage());
		}
	}
}
