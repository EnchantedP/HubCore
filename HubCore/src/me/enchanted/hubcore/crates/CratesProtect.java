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
					
					for (Entity near : Bukkit.getOnlinePlayers()) {
						if(near == p) return;
						if (near.getLocation().distance(p.getLocation()) <= 5) {
							Location nearloc = near.getLocation();
							
							Location eLoc = p.getLocation();
							Location newLoc = nearloc.subtract(eLoc);
							Vector newV = new Vector(newLoc.toVector().normalize().multiply(2.0).getX(), 1.75, newLoc.toVector().normalize().multiply(2.0).getZ());
								if(near instanceof Item)
								{
									
								}
								else
								{
									near.setVelocity(newV);
								}
								
						}
					}
				}
			}
		}, 0, 2);
	}
}
