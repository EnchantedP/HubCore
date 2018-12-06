package me.enchanted.hubcore.particles;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class _ParticlesLeave implements Listener{

	@EventHandler
	public void onLeave(PlayerQuitEvent e)
	{
		Player p = e.getPlayer();
		_ParticleArrays_.cHT.remove(p);
		_ParticleArrays_.lHT.remove(p);
	}
}
