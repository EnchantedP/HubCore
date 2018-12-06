package me.enchanted.hubcore.particles;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class _FreeParticleJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		Player p = e.getPlayer();
		if(p.hasPermission("par.chrishat"))
		{
			
		}
		else
		{
			ConsoleCommandSender ccs = Bukkit.getConsoleSender();
			Bukkit.getServer().dispatchCommand(ccs, "pex user " + p.getName() + " add par.chrishat");
		}
	}

}
