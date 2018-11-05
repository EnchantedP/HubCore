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
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".BasicCrates", 0);
			HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".Name", p.getName());
			if (!HubCore.getPlugin(HubCore.class).getConfig().contains("crates." + p.getUniqueId() + ".cratePieces")) {
				HubCore.getPlugin(HubCore.class).getConfig().set("crates." + p.getUniqueId() + ".cratePieces", 0);
			}
			HubCore.getPlugin(HubCore.class).saveConfig();
		}
		
	}

}
