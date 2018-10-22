package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
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

	@EventHandler
	public void onInventoryOpen(InventoryOpenEvent e) {
		Player p = (Player) e.getPlayer();
		Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "sendcommand kitpvp bc hey");
		if (e.getInventory().getName().equals("§4§lCrate1")) {
			ih1 = e.getInventory().getHolder();
			e.setCancelled(true);
			CrateGUI.openCrate1(p);
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate2")) {
			ih2 = e.getInventory().getHolder();
			e.setCancelled(true);
			CrateGUI.openCrate2(p);
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate3")) {
			ih3 = e.getInventory().getHolder();
			e.setCancelled(true);
			CrateGUI.openCrate3(p);
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate4")) {
			ih4 = e.getInventory().getHolder();
			e.setCancelled(true);
			CrateGUI.openCrate4(p);
			return;
		} else {
			return;
		}
	}
}
