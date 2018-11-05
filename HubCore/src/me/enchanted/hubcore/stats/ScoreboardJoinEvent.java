package me.enchanted.hubcore.stats;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ScoreboardJoinEvent implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		ScoreboardStats.setScoreBoard(e.getPlayer());
	}

}
