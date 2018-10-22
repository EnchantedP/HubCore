package me.enchanted.hubcore.doublejump;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class JumpEvent implements Listener {

	@EventHandler
	public void onPlayerMove(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if ((e.getPlayer().getGameMode() != GameMode.CREATIVE) && (e.getPlayer().getGameMode() != GameMode.SPECTATOR)
				&& (p.getLocation().getBlock().getRelative(BlockFace.DOWN).getType() != Material.AIR)) {
			p.setAllowFlight(true);
		}
	}

}
