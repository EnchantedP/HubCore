package me.enchanted.hubcore.gadgets;

import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

import me.enchanted.hubcore.HubCore;

public class TNTGadgets implements Listener {

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onLaunch(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if (!_GadgetsTimeLeft.tnttl.containsKey(p)) {
			_GadgetsTimeLeft.tnttl.put(p, 3);
		} else if (_GadgetsTimeLeft.tnttl.get(p) <= 0) {
			_GadgetsTimeLeft.tnttl.put(p, 3);
			if (p.getItemInHand().getType() != Material.TNT)
				return;

			if (!p.getItemInHand().hasItemMeta())
				return;

			if (!p.getItemInHand().getItemMeta().hasDisplayName())
				return;

			if (!p.getItemInHand().getItemMeta().getDisplayName().equals("TNT Gadget"))
				return;

			if (HubCore.getPlugin(HubCore.class).getConfig()
					.getInt("crates." + p.getUniqueId().toString() + ".tntGadget") >= 1) {
				
				Vector v = p.getLocation().getDirection();
				TNTPrimed tnt = p.getWorld().spawn(p.getEyeLocation(), TNTPrimed.class);
				tnt.setFuseTicks(60);
				tnt.setIsIncendiary(false);
				tnt.setVelocity(v.multiply(1.4));
				
				int tntGadgets = HubCore.getPlugin(HubCore.class).getConfig()
						.getInt("crates." + p.getUniqueId().toString() + ".tntGadget");
				int newTNTGadgets = tntGadgets - 1;
				HubCore.getPlugin(HubCore.class).getConfig()
						.set("crates." + p.getUniqueId().toString() + ".tntGadget", newTNTGadgets);
				HubCore.getPlugin(HubCore.class).saveConfig();
			}
		} else {

		}
	}

}
