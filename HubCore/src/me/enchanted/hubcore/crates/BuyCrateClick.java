package me.enchanted.hubcore.crates;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.enchanted.hubcore.HubCore;

public class BuyCrateClick implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getName().equals("§8Buy Basic Crate")) {
			if (e.getCurrentItem().getType() == Material.REDSTONE_BLOCK) {

				e.setCancelled(true);
				p.closeInventory();
				if (OpenCratesGUI.c.get(p).equals(1)) {
					CrateGUI.openCrate1(p);
				} else if (OpenCratesGUI.c.get(p).equals(2)) {
					CrateGUI.openCrate2(p);
				} else if (OpenCratesGUI.c.get(p).equals(3)) {
					CrateGUI.openCrate3(p);
				} else if (OpenCratesGUI.c.get(p).equals(4)) {
					CrateGUI.openCrate4(p);
				}
			} else if (e.getCurrentItem().getType() == Material.EMERALD_BLOCK) {
				
				
				int toRemove = 1000;
				int cratePieces = HubCore.getPlugin(HubCore.class).getConfig()
						.getInt("crates." + p.getUniqueId().toString() + ".cratePieces");
				int newCratePieces = cratePieces - toRemove;
				HubCore.getPlugin(HubCore.class).getConfig()
						.set("crates." + p.getUniqueId().toString() + ".cratePieces", newCratePieces);

				
				int basicCrates = HubCore.getPlugin(HubCore.class).getConfig()
						.getInt("crates." + p.getUniqueId().toString() + ".BasicCrates");
				int toAdd = 1;
				int newBasic = basicCrates + toAdd;

				HubCore.getPlugin(HubCore.class).getConfig()
						.set("crates." + p.getUniqueId().toString() + ".BasicCrates", newBasic);

				
				HubCore.getPlugin(HubCore.class).saveConfig();
				
				e.setCancelled(true);
				p.closeInventory();
				if (OpenCratesGUI.c.get(p).equals(1)) {
					CrateGUI.openCrate1(p);
				} else if (OpenCratesGUI.c.get(p).equals(2)) {
					CrateGUI.openCrate2(p);
				} else if (OpenCratesGUI.c.get(p).equals(3)) {
					CrateGUI.openCrate3(p);
				} else if (OpenCratesGUI.c.get(p).equals(4)) {
					CrateGUI.openCrate4(p);
				}
			} else {
				e.setCancelled(true);
			}

		} else if (e.getInventory().getName().equals("§4INSUFFICIENT FUNDS")) {

			e.setCancelled(true);
			p.closeInventory();
			if (OpenCratesGUI.c.get(p).equals(1)) {
				CrateGUI.openCrate1(p);
			} else if (OpenCratesGUI.c.get(p).equals(2)) {
				CrateGUI.openCrate2(p);
			} else if (OpenCratesGUI.c.get(p).equals(3)) {
				CrateGUI.openCrate3(p);
			} else if (OpenCratesGUI.c.get(p).equals(4)) {
				CrateGUI.openCrate4(p);
			}

		}
	}

}
