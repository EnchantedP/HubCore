package me.enchanted.hubcore.crates;

import java.util.HashMap;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.inventory.InventoryHolder;

public class OpenCratesGUI implements Listener {
	public static InventoryHolder ih1 = null;
	public static InventoryHolder ih2 = null;
	public static InventoryHolder ih3 = null;
	public static InventoryHolder ih4 = null;
	public static HashMap<Player, Integer> c = new HashMap<>();
	
	@EventHandler
	public void onInventoryOpen(InventoryOpenEvent e) {
		Player p = (Player) e.getPlayer();
		
		if (e.getInventory().getName().equals("§4§lCrate1")) {
			ih1 = e.getInventory().getHolder();
			c.put(p, 1);
			e.setCancelled(true);
			CrateGUI.openCrate1(p);
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate2")) {
			ih2 = e.getInventory().getHolder();
			c.put(p, 2);
			e.setCancelled(true);
			CrateGUI.openCrate2(p);
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate3")) {
			ih3 = e.getInventory().getHolder();
			c.put(p, 3);
			e.setCancelled(true);
			CrateGUI.openCrate3(p);
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate4")) {
			ih4 = e.getInventory().getHolder();
			c.put(p, 4);
			e.setCancelled(true);
			CrateGUI.openCrate4(p);
			return;
		} else {
			return;
		}
	}
}
