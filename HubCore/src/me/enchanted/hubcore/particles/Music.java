package me.enchanted.hubcore.particles;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class Music {
	

	public static void createMusic(Player p) {
		new BukkitRunnable() {
			double phi = 0;
			int color = 0;
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
						// 6 is the value of the red note
						if(color == 6){
							p.spawnParticle(Particle.NOTE, loc, 0, 15/24D, 0, 0, 1);
							color = 0;
						} else if(color == 5){
							p.spawnParticle(Particle.NOTE, loc, 0, 5/24D, 0, 0, 1);
							color += 1;
						} else if(color == 4){
							p.spawnParticle(Particle.NOTE, loc, 0, 14/24D, 0, 0, 1);
							color += 1;
						} else if(color == 3){
							p.spawnParticle(Particle.NOTE, loc, 0, 23/24D, 0, 0, 1);
							color += 1;
						} 
						else if (color == 2) {
							p.spawnParticle(Particle.NOTE, loc, 0, 22/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 1) {
							p.spawnParticle(Particle.NOTE, loc, 0, 7/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 0) {
							p.spawnParticle(Particle.NOTE, loc, 0, 6/24D, 0, 0, 1);
							color += 1;
							return;
						}

						loc.subtract(x, y, z);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 10);
		new BukkitRunnable() {
			double phi = 0;
			int color = 0;
			@Override
			public void run() {
				phi += Math.PI / 16;
				double x;
				double y;
				double z;
				Location loc = p.getLocation();
				for (double t = 0; t <= 0.05 * Math.PI; t += Math.PI / 16) {
					for (double i = 0; i < 1; i += 1) {
						x = Math.cos((t + phi + i * Math.PI)+1.5);
						y = 1;
						z = Math.sin((t + phi + i * Math.PI)+1.5);
						loc.add(x, y, z);
						// 6 is the value of the red note
						if(color == 6){
							p.spawnParticle(Particle.NOTE, loc, 0, 15/24D, 0, 0, 1);
							color = 0;
						} else if(color == 5){
							p.spawnParticle(Particle.NOTE, loc, 0, 5/24D, 0, 0, 1);
							color += 1;
						} else if(color == 4){
							p.spawnParticle(Particle.NOTE, loc, 0, 14/24D, 0, 0, 1);
							color += 1;
						} else if(color == 3){
							p.spawnParticle(Particle.NOTE, loc, 0, 23/24D, 0, 0, 1);
							color += 1;
						} 
						else if (color == 2) {
							p.spawnParticle(Particle.NOTE, loc, 0, 22/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 1) {
							p.spawnParticle(Particle.NOTE, loc, 0, 7/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 0) {
							p.spawnParticle(Particle.NOTE, loc, 0, 6/24D, 0, 0, 1);
							color += 1;
							return;
						}

						loc.subtract(x, y, z);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 10);
		new BukkitRunnable() {
			double phi = 0;
			int color = 0;
			@Override
			public void run() {
				phi += Math.PI / 16;
				double x;
				double y;
				double z;
				Location loc = p.getLocation();
				for (double t = 0; t <= 0.05 * Math.PI; t += Math.PI / 16) {
					for (double i = 0; i < 1; i += 1) {
						x = Math.cos((t + phi + i * Math.PI)+3);
						y = 1;
						z = Math.sin((t + phi + i * Math.PI)+3);
						loc.add(x, y, z);
						// 6 is the value of the red note
						if(color == 6){
							p.spawnParticle(Particle.NOTE, loc, 0, 15/24D, 0, 0, 1);
							color = 0;
						} else if(color == 5){
							p.spawnParticle(Particle.NOTE, loc, 0, 5/24D, 0, 0, 1);
							color += 1;
						} else if(color == 4){
							p.spawnParticle(Particle.NOTE, loc, 0, 14/24D, 0, 0, 1);
							color += 1;
						} else if(color == 3){
							p.spawnParticle(Particle.NOTE, loc, 0, 23/24D, 0, 0, 1);
							color += 1;
						} 
						else if (color == 2) {
							p.spawnParticle(Particle.NOTE, loc, 0, 22/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 1) {
							p.spawnParticle(Particle.NOTE, loc, 0, 7/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 0) {
							p.spawnParticle(Particle.NOTE, loc, 0, 6/24D, 0, 0, 1);
							color += 1;
							return;
						}

						loc.subtract(x, y, z);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 10);
		new BukkitRunnable() {
			double phi = 0;
			int color = 0;
			@Override
			public void run() {
				phi += Math.PI / 16;
				double x;
				double y;
				double z;
				Location loc = p.getLocation();
				for (double t = 0; t <= 0.05 * Math.PI; t += Math.PI / 16) {
					for (double i = 0; i < 1; i += 1) {
						x = Math.cos((t + phi + i * Math.PI)+4.5);
						y = 1;
						z = Math.sin((t + phi + i * Math.PI)+4.5);
						loc.add(x, y, z);
						// 6 is the value of the red note
						if(color == 6){
							p.spawnParticle(Particle.NOTE, loc, 0, 15/24D, 0, 0, 1);
							color = 0;
						} else if(color == 5){
							p.spawnParticle(Particle.NOTE, loc, 0, 5/24D, 0, 0, 1);
							color += 1;
						} else if(color == 4){
							p.spawnParticle(Particle.NOTE, loc, 0, 14/24D, 0, 0, 1);
							color += 1;
						} else if(color == 3){
							p.spawnParticle(Particle.NOTE, loc, 0, 23/24D, 0, 0, 1);
							color += 1;
						} 
						else if (color == 2) {
							p.spawnParticle(Particle.NOTE, loc, 0, 22/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 1) {
							p.spawnParticle(Particle.NOTE, loc, 0, 7/24D, 0, 0, 1);
							color += 1;
							return;
						} else if (color == 0) {
							p.spawnParticle(Particle.NOTE, loc, 0, 6/24D, 0, 0, 1);
							color += 1;
							return;
						}

						loc.subtract(x, y, z);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 10);
	}
}
