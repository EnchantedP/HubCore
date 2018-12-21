package me.enchanted.hubcore.particles;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.material.Skull;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class ChristmasHat {

	public static void run() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(HubCore.getPlugin(HubCore.class), new Runnable() {
			public void run() {
				for (Player player : Bukkit.getOnlinePlayers()) {
					if (_ParticleArrays_.cHT.contains(player)) {
						Location lochat = player.getEyeLocation().add(0.0D, 0.25D, 0.0D);
						for (int i = 0; i < 12; i++) {
							white(lochat.clone().add(0.35D * Math.cos(Math.toRadians(30.0D * i)), 0.0D,
									0.35D * Math.sin(Math.toRadians(30.0D * i))));
							red(lochat.clone().add(0.25D * Math.cos(Math.toRadians(30.0D * i)), 0.1D,
									0.25D * Math.sin(Math.toRadians(30.0D * i))));
							red(lochat.clone().add(0.16D * Math.cos(Math.toRadians(30.0D * i)), 0.2D,
									0.16D * Math.sin(Math.toRadians(30.0D * i))));
							red(lochat.clone().add(0.07D * Math.cos(Math.toRadians(30.0D * i)), 0.3D,
									0.07D * Math.sin(Math.toRadians(30.0D * i))));
							red(lochat.clone().add(0.07D * Math.cos(Math.toRadians(30.0D * i)), 0.4D,
									0.07D * Math.sin(Math.toRadians(30.0D * i))));
						}
						for (int i = 0; i < 5; i++) {
							white(lochat.clone().add((Math.random() - 0.5D) / 10.0D, 0.53D,
									(Math.random() - 0.5D) / 10.0D));
						}
					}
				}
			}
		}, 4L, 4L);
	}

	
	
	public static void white(Location loc) {
		
		loc.getWorld().spawnParticle(Particle.REDSTONE, loc, 0, 1, 1, 1, 1);
	}

	@SuppressWarnings("deprecation")
	public static void red(Location loc) {
		
		loc.getWorld().spawnParticle(Particle.REDSTONE, loc, 0, 1, 0, 0, 1);
	}
}
