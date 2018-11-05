package me.enchanted.hubcore.gadgets;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.MaterialData;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import me.enchanted.hubcore.HubCore;

public class MelonGadget implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onThrow(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if (p.getItemInHand().getType() == Material.MELON_BLOCK) {
			Vector v = p.getLocation().getDirection();
			FallingBlock fb = p.getWorld().spawnFallingBlock(p.getLocation(), Material.MELON_BLOCK, (byte) 0);
			fb.setVelocity(v.multiply(1.3));
			new BukkitRunnable() {
				
				@Override
				public void run() {
					Random r = new Random();
					double rInt = r.nextInt((int) 0.5) - 1.0;
					fb.remove();
					
					p.getWorld().dropItem(fb.getLocation(), new ItemStack(Material.MELON));
					
				}
			}.runTaskLater(HubCore.getPlugin(HubCore.class), 5L);
		}
	}

}
