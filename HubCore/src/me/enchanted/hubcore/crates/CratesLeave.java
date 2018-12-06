package me.enchanted.hubcore.crates;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class CratesLeave implements Listener {

	@EventHandler
	public void onLeave(PlayerQuitEvent e)
	{
		Player p = e.getPlayer();
		if(CratesOpen.CrateOpen.contains(p))
		{
			CratesOpen.CrateOpen.remove(p);
			
			Location loc1 = p.getLocation();
			loc1.add(1,0,2).getBlock().setType(Material.AIR);
			Location loc2 = p.getLocation();
			loc2.add(1,0,-2).getBlock().setType(Material.AIR);
			Location loc3 = p.getLocation();
			loc3.add(-1,0,2).getBlock().setType(Material.AIR);
			Location loc4 = p.getLocation();
			loc4.add(-1,0,-2).getBlock().setType(Material.AIR);
			
			Location loc5 = p.getLocation();
			loc5.add(2,0,1).getBlock().setType(Material.AIR);
			Location loc6 = p.getLocation();
			loc6.add(2,0,-1).getBlock().setType(Material.AIR);
			Location loc7 = p.getLocation();
			loc7.add(-2,0,1).getBlock().setType(Material.AIR);
			Location loc8 = p.getLocation();
			loc8.add(-2,0,-1).getBlock().setType(Material.AIR);
			
			p.getLocation().getBlock().setType(Material.CHEST);
			Block block = p.getLocation().getBlock();
			BlockState bdata = block.getState();
			Chest chest = (Chest) bdata;
			if (OpenCratesGUI.c.get(p) == 1) {
				chest.setCustomName("§4§lCrate1");
			} else if (OpenCratesGUI.c.get(p) == 2) {
				chest.setCustomName("§4§lCrate2");
			} else if (OpenCratesGUI.c.get(p) == 3) {
				chest.setCustomName("§4§lCrate3");
			} else if (OpenCratesGUI.c.get(p) == 4) {
				chest.setCustomName("§4§lCrate4");
			}
			chest.update();
			
			for (Entity en : p.getLocation().getWorld().getEntities()) {
				if (p.getLocation().distance(en.getLocation()) <= 3) {
					if (en != p) {
						if (!(en instanceof Player)) {
							en.remove();
						}
					}
				}
			}
		}
	}
}
