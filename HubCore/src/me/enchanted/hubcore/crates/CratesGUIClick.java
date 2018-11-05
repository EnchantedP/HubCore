package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

import me.enchanted.hubcore.HubCore;

public class CratesGUIClick implements Listener {

	@EventHandler
	public void onInvClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();
		if (e.getInventory().getName().equals("§4§lCrate GUI§1")) {
			if (e.getSlot() != 11) {
				e.setCancelled(true);
			} else {
				if (e.getClick().isRightClick()) {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId().toString() + ".cratePieces") >= 1000) {
						e.setCancelled(true);
						BuyCrateGUI.buyBasicCrate(p);
					} else {
						BuyCrateGUI.insufficientFunds(p);
					}
				} else {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId() + ".BasicCrates") >= 1) {

						InventoryHolder ih = OpenCratesGUI.ih1;
						HubCore.getPlugin(HubCore.class).getLogger().info(ih.getClass().toString());
						if (ih instanceof Chest) {

							Location loc = ((Chest) ih).getLocation();
							p.teleport(loc.add(0.5f, 0, 0.5f));
							loc.getBlock().setType(Material.AIR);
							BasicCrates.SpawnBasicCrate1(p);
							e.setCancelled(true);
							p.closeInventory();

							CrateGUI.map.put(p, "§4§lCrate1");
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.closeInventory();
							}

							return;
						}
					} else {
						e.setCancelled(true);
					}
				}
			}
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate GUI§2")) {
			if (e.getSlot() != 11) {
				e.setCancelled(true);
			} else {
				if (e.getClick().isRightClick()) {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId().toString() + ".cratePieces") >= 1000) {
						e.setCancelled(true);
						BuyCrateGUI.buyBasicCrate(p);
					} else {
						BuyCrateGUI.insufficientFunds(p);
					}
				} else {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId() + ".BasicCrates") >= 1) {

						InventoryHolder ih = OpenCratesGUI.ih2;
						HubCore.getPlugin(HubCore.class).getLogger().info(ih.getClass().toString());
						if (ih instanceof Chest) {

							Location loc = ((Chest) ih).getLocation();
							p.teleport(loc.add(0.5f, 0, 0.5f));
							loc.getBlock().setType(Material.AIR);
							BasicCrates.SpawnBasicCrate2(p);
							e.setCancelled(true);
							p.closeInventory();

							CrateGUI.map.put(p, "§4§lCrate2");
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.closeInventory();
							}
							return;
						}
					} else {
						e.setCancelled(true);
					}
				}
			}
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate GUI§3")) {
			if (e.getSlot() != 11) {
				e.setCancelled(true);
			} else {
				if (e.getClick().isRightClick()) {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId().toString() + ".cratePieces") >= 1000) {
						e.setCancelled(true);
						BuyCrateGUI.buyBasicCrate(p);
					} else {
						BuyCrateGUI.insufficientFunds(p);
					}
				} else {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId() + ".BasicCrates") >= 1) {
						;
						InventoryHolder ih = OpenCratesGUI.ih3;
						HubCore.getPlugin(HubCore.class).getLogger().info(ih.getClass().toString());
						if (ih instanceof Chest) {

							Location loc = ((Chest) ih).getLocation();
							p.teleport(loc.add(0.5f, 0, 0.5f));
							loc.getBlock().setType(Material.AIR);
							BasicCrates.SpawnBasicCrate2(p);
							e.setCancelled(true);
							p.closeInventory();

							CrateGUI.map.put(p, "§4§lCrate3");
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.closeInventory();
							}
							return;
						}
					} else {
						e.setCancelled(true);
					}
				}
			}
			return;
		} else if (e.getInventory().getName().equals("§4§lCrate GUI§4")) {
			if (e.getSlot() != 11) {
				e.setCancelled(true);
			} else {
				if (e.getClick().isRightClick()) {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId().toString() + ".cratePieces") >= 1000) {
						e.setCancelled(true);
						BuyCrateGUI.buyBasicCrate(p);
					} else {
						BuyCrateGUI.insufficientFunds(p);
					}
				} else {
					if (HubCore.getPlugin(HubCore.class).getConfig()
							.getInt("crates." + p.getUniqueId() + ".BasicCrates") >= 1) {

						InventoryHolder ih = OpenCratesGUI.ih4;
						HubCore.getPlugin(HubCore.class).getLogger().info(ih.getClass().toString());
						if (ih instanceof Chest) {

							Location loc = ((Chest) ih).getLocation();
							p.teleport(loc.add(0.5f, 0, 0.5f));
							loc.getBlock().setType(Material.AIR);
							BasicCrates.SpawnBasicCrate2(p);
							e.setCancelled(true);
							p.closeInventory();

							CrateGUI.map.put(p, "§4§lCrate4");
							for (Player all : Bukkit.getOnlinePlayers()) {
								all.closeInventory();
							}
							return;
						}
					} else {
						e.setCancelled(true);
					}
				}
			}
			return;
		}
	}

}
