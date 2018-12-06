package me.enchanted.hubcore.gadgets;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class _GadgetsTimeLeft {

	public static HashMap<Player, Integer> tnttl = new HashMap<>();
	public static HashMap<Player, Integer> mlntl = new HashMap<>();

	public static void tntTime() {
		for (Player all : Bukkit.getOnlinePlayers()) {
			_GadgetsTimeLeft.tnttl.put(all, 5);
		}
		new BukkitRunnable() {

			@Override
			public void run() {
				for (Player all : Bukkit.getOnlinePlayers()) {
					
					if (tnttl.containsKey(all) && !(tnttl.get(all).equals(0))) {
						int toSubtract = 1;
						int tl = tnttl.get(all);
						int newTL = tl - toSubtract;
						tnttl.put(all, newTL);
					}
					if (tnttl.containsKey(all) && !(tnttl.get(all).equals(0))) {
						int toSubtract = 1;
						int tl = tnttl.get(all);
						int newTL = tl - toSubtract;
						tnttl.put(all, newTL);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 20);
	}

	public static void melonTime() {
		for (Player all : Bukkit.getOnlinePlayers()) {
			_GadgetsTimeLeft.mlntl.put(all, 5);
		}
		new BukkitRunnable() {

			@Override
			public void run() {
				for (Player all : Bukkit.getOnlinePlayers()) {

					if (mlntl.containsKey(all) && !(mlntl.get(all).equals(0))) {
						int toSubtract = 1;
						int tl = mlntl.get(all);
						int newTL = tl - toSubtract;
						mlntl.put(all, newTL);
					}
					if (mlntl.containsKey(all) && !(mlntl.get(all).equals(0))) {
						int toSubtract = 1;
						int tl = mlntl.get(all);
						int newTL = tl - toSubtract;
						mlntl.put(all, newTL);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 20);
	}

	public static void despawnItems() {
		new BukkitRunnable() {

			@Override
			public void run() {
				for (Entity e : Bukkit.getWorld("world").getEntities()) {
					if (e instanceof Item) {
						Item i = (Item) e;
						if (i.getType() == EntityType.DROPPED_ITEM) {
							i.remove();
						}
					}
				}

			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 400);

	}
}
