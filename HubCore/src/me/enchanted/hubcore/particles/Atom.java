package me.enchanted.hubcore.particles;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class Atom {

	public static void run() {
		new BukkitRunnable() {
			double phi = 0;

			@Override
			public void run() {
				for (Player p : Bukkit.getOnlinePlayers()) {
					if (_ParticleArrays_.atomT.contains(p)) {
						phi += Math.PI / 16;
						double x1;
						double y;
						double z1;
						double x2;
						double z2;
						Location loc = p.getLocation();
						for (double t = 0; t <= 0.05 * Math.PI; t += Math.PI / 16) {
							for (double i = 0; i < 1; i += 1) {
								x1 = Math.cos((t + phi + i * Math.PI));
								y = 1;
								z1 = Math.sin((t + phi + i * Math.PI));

								x2 = Math.cos((t + phi + i * Math.PI) + 3);
								z2 = Math.sin((t + phi + i * Math.PI) + 3);

								loc.add(x1, y, z1);
								p.getWorld().spawnParticle(Particle.REDSTONE, loc.getX(), loc.getY(), loc.getZ(), 0,
										Float.MIN_NORMAL, 0.2f, 1f, 1);
								loc.subtract(x1, y, z1);

								loc.add(x2, y, z2);
								p.getWorld().spawnParticle(Particle.REDSTONE, loc.getX(), loc.getY(), loc.getZ(), 0,
										Float.MIN_NORMAL, 0.2f, 1f, 1);
								loc.subtract(x2, y, z2);
							}
						}
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 2);
	}
}
