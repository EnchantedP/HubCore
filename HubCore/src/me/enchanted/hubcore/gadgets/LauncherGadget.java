package me.enchanted.hubcore.gadgets;

import org.bukkit.Material;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class LauncherGadget implements Listener{
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onLaunch(PlayerInteractEvent e)
	{
		Player p = e.getPlayer();
		if(p.getItemInHand().getType() == Material.IRON_BARDING)
		{
			p.launchProjectile(Fireball.class);
		}
	}
	
	@EventHandler
	public void onHit(ProjectileHitEvent e)
	{
		if(e.getHitEntity() instanceof Player)
		{
			Player p = (Player) e.getHitEntity();
			p.setVelocity(e.getEntity().getVelocity());
		}
	}
}
