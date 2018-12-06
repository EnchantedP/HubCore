package me.enchanted.hubcore.crates;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.enchanted.hubcore.HubCore;

public class CratesJoin implements Listener {

	@EventHandler
	public void onFirstJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId())) {
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".BasicCrates", 2);
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".Name", p.getName());
		}
		if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId() + ".cratePieces")) {
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".cratePieces", 0);
		}
		if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId() + ".launcherGadget")) {
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".launcherGadget", 0);
		}
		if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId() + ".melonGadget")) {
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".melonGadget", 0);
		}
		if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId() + ".gunGadget")) {
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".gunGadget", 0);
		}
		if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId() + ".airPearlGadget")) {
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".airPearlGadget", 0);
		}
		if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId() + ".tntGadget")) {
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".tntGadget", 0);
		}
		HubCore.getPlugin(HubCore.class).saveConfig();
	}

}
