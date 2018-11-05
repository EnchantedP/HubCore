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

public class TNTGadgets implements Listener {

	public static HashMap<Player, Integer> timeleft = new HashMap<>();

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onLaunch(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		
		if(!timeleft.containsKey(p))
		{
			timeleft.put(p, 3);
		}
		
		if (timeleft.get(p) <= 0) {
			timeleft.put(p, 3);
			if (p.getItemInHand().getType() == Material.TNT) {
				Vector v = p.getLocation().getDirection();
				TNTPrimed tnt = p.getWorld().spawn(p.getLocation(), TNTPrimed.class);
				tnt.setFuseTicks(60);
				tnt.setIsIncendiary(false);
				tnt.setVelocity(v.multiply(1.4));
			}
		}
		else
		{
			
		}
	}

}
