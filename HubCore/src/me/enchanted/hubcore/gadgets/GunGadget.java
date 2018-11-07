package me.enchanted.hubcore.gadgets;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class GunGadget implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onShoot(PlayerInteractEvent e)
	{
		Player p = e.getPlayer();
		if(p.getItemInHand().getType() == Material.GOLD_BARDING)
		{
			Snowball sb = p.getWorld().spawn(p.getLocation(), Snowball.class);
			
			Vector v = p.getLocation().getDirection();
			sb.setVelocity(v.multiply(1.7)); 
			
		}
	}

}
