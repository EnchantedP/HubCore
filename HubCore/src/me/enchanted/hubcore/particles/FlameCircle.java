package me.enchanted.hubcore.particles;

import java.rmi.activation.ActivationInstantiator;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class FlameCircle {

	//Flame Circle
	public static void createFlameCircle(Player p) {
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
						y = 1;
						z = Math.sin(t + phi + i * Math.PI);
						loc.add(x, y, z);
						p.spawnParticle(Particle.FLAME, loc.getX(), loc.getY(), loc.getZ(), 0, 255 / 255, 0 / 255,
								0 / 255, 0);
						loc.subtract(x, y, z);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 1);
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
						x = Math.cos(t + phi + Math.PI);
						y = 1;
						z = Math.sin(t + phi + Math.PI);
						loc.add(x, y, z);
						p.spawnParticle(Particle.FLAME, loc.getX(), loc.getY(), loc.getZ(), 0, 255 / 255, 0 / 255,
								0 / 255, 0);
						/*double note = 6 / 24D; // 6 is the value of the red note
						p.spawnParticle(Particle.NOTE, loc, 0, note, 0, 0, 1);*/
						loc.subtract(x, y, z);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 1);
	}
}
