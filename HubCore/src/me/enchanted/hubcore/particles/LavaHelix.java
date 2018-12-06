package me.enchanted.hubcore.particles;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class LavaHelix {
	// Lava Helix
	public static void run() {
		new BukkitRunnable() {
			double phi = 0;

			@Override
			public void run() {
				for (Player p : Bukkit.getOnlinePlayers()) {
					if (_ParticleArrays_.lHT.contains(p)) {
						phi += Math.PI / 16;
						double x;
						double y;
						double z;
						double x2;
						double z2;
						Location loc = p.getLocation();
						for (double t = 0; t <= 1.75 * Math.PI; t += Math.PI / 16) {
							for (double i = 0; i < 1; i += 1) {
								x = Math.cos(t + phi + i * Math.PI);
								y = 0.5 * t;
								z = Math.sin(t + phi + i * Math.PI);
								x2 = Math.cos(t + phi + Math.PI);
								z2 = Math.sin(t + phi + Math.PI);

								loc.add(x, y, z);
								p.spawnParticle(Particle.DRIP_LAVA, loc.getX(), loc.getY(), loc.getZ(), 0, 0 / 255,
										0 / 255, 0 / 255, 0);
								loc.subtract(x, y, z);

								loc.add(x2, y, z2);
								p.spawnParticle(Particle.DRIP_LAVA, loc.getX(), loc.getY(), loc.getZ(), 0, 0 / 255,
										0 / 255, 0 / 255, 0);
								loc.subtract(x2, y, z2);
							}
						}
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 3);
	}
}
