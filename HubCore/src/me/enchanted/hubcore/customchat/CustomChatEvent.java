package me.enchanted.hubcore.customchat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;
import me.enchanted.hubcore.particles.Cape;
import me.enchanted.hubcore.particles.LavaHelix;

public class CustomChatEvent implements Listener {
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e)
	{
		Player p = e.getPlayer();
		e.setCancelled(true);
		Bukkit.getServer().broadcastMessage(e.getPlayer().getDisplayName() + " §7" + e.getMessage());
		new BukkitRunnable() {
			
			@Override
			public void run() {
				Cape.drawParticles(p.getLocation());
				
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0L, 1L);
		
	}
}
