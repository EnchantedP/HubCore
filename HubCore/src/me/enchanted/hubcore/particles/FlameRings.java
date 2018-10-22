package me.enchanted.hubcore.particles;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class FlameRings {

	//Flame Rings
		public static void createFlameRings(Player p)
	    {
	        new BukkitRunnable() {
	            double phi = 0;

	            @Override
	            public void run() {
	                phi += Math.PI / 16;
	                double x;
	                double y;
	                double z;
	                Location loc = p.getLocation();
	                for (double t = 0; t <= 0.05 * Math.PI; t += Math.PI / 16) {
	                    for (double i = 0; i < 1; i += 1) {
	                        x = Math.cos(t + phi + i * Math.PI);
	                        y = Math.sin(phi) + 1;
	                        z = Math.sin(t + phi + i * Math.PI);
	                        loc.add(x, y, z);
	                      
	                        p.spawnParticle(Particle.FLAME, loc.getX(),loc.getY(),loc.getZ(), 0, 0.0d, 0.0d, 0.0d, 0.1d);
	                        loc.subtract(x, y, z);
	                    }
	                }
	            }
	        }.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 1);
	        new BukkitRunnable() {
	            double phi = 0;

	            @Override
	            public void run() {
	                phi -= Math.PI / 16;
	                double x;
	                double y;
	                double z;
	                Location loc = p.getLocation();
	                for (double t = 0; t <= 0.05 * Math.PI; t += Math.PI / 16) {
	                    for (double i = 0; i < 1; i += 1) {
	                        x = Math.cos(t + phi + Math.PI);
	                        y = Math.sin(phi) + 1;
	                        z = Math.sin(t + phi + Math.PI);
	                        loc.add(x, y, z);
	                        p.spawnParticle(Particle.FLAME, loc.getX(),loc.getY(),loc.getZ(), 0, 0.0d, 0.0d, 0.0d, 0.1d);
	                        loc.subtract(x, y, z);
	                    }
	                }
	            }
	        }.runTaskTimer(HubCore.getPlugin(HubCore.class), 18, 1);
	    }
}
