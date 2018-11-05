package me.enchanted.hubcore.gadgets;

import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.spigotmc.event.entity.EntityDismountEvent;

public class AirPearlsGadget implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onEnder(ProjectileLaunchEvent e) {
		if (e.getEntity() instanceof EnderPearl) {
			Player p = (Player) e.getEntity().getShooter();
			e.getEntity().setPassenger(p);

		}
	}

	@EventHandler
	public void aoSair(EntityDismountEvent e) {
		
		if (e.getDismounted() instanceof EnderPearl) {
			e.getDismounted().remove();
		}

	}

}
