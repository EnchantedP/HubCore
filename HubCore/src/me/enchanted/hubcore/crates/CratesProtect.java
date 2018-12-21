package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import me.enchanted.hubcore.HubCore;

public class CratesProtect {

	@SuppressWarnings("deprecation")
	public static void crateForcefield(Player p) {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(HubCore.getPlugin(HubCore.class), new BukkitRunnable() {

			@Override
			public void run() {
				if (CratesOpen.CrateOpen.contains(p)) {

					for(Player near : Bukkit.getOnlinePlayers()) {
						if(near.getLocation().distance(p.getLocation()) <= 1.5) {
							if(p != near) {
								near.setVelocity(near.getLocation().getDirection().multiply(-10).setY(2));
							}
						}
					}
				}
			}
		}, 0, 2);
	}
}