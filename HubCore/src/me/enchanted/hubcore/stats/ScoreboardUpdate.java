package me.enchanted.hubcore.stats;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.Scoreboard;

import me.enchanted.hubcore.HubCore;

public class ScoreboardUpdate {

	@SuppressWarnings("deprecation")
	public static void update()
	{
		Bukkit.getScheduler().runTaskTimer(HubCore.getPlugin(HubCore.class), new BukkitRunnable() {
			
			@Override
			public void run() {
				for(Player p : Bukkit.getOnlinePlayers()){
					
					Scoreboard board = (Scoreboard) p.getScoreboard();
		        
					if(Bukkit.getOnlinePlayers().size() == 0) {
						board.getTeam("onlineCounter").setPrefix("§8» §e0" + "§6/§e" + Bukkit.getServer().getMaxPlayers());
					} else {
						board.getTeam("onlineCounter").setPrefix("§8» §e" + Bukkit.getOnlinePlayers().size() + "§6/§e" +  Bukkit.getServer().getMaxPlayers());
					}
		        
					board.getTeam("cratePCounter").setPrefix("§8» §b" + HubCore.getPlugin(HubCore.class).getConfig().getInt("crates." + p.getUniqueId().toString() + ".cratePieces"));
					
				}
			}
		}, 0L, 20L);
	}
}
