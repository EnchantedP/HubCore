package me.enchanted.hubcore.crates;

import java.util.concurrent.TimeUnit;

import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class CratesOpenMove implements Listener {

	@EventHandler
	public void click(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if (CratesOpen.CrateOpen.contains(p)) {
			if (e.getFrom().getX() != e.getTo().getX() || e.getFrom().getY() != e.getTo().getY()
					|| e.getFrom().getZ() != e.getTo().getZ()) {
				e.setCancelled(true);
			}
		}
	}

}
