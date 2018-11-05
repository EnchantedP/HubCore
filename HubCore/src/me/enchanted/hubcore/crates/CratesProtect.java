package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
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
					for (Entity e : p.getLocation().getWorld().getEntities()) {
						if (p.getLocation().distance(e.getLocation()) <= 3) {
							if (e != p) {
								if(e instanceof Item)
								{
									
								}
								else
								{
									e.setVelocity(new Vector(1,0.5,1));
								}
								
							}
						}
					}
				}
			}
		}, 0, 2);
	}
}
