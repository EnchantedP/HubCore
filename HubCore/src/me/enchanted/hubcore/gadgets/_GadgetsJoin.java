package me.enchanted.hubcore.gadgets;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class _GadgetsJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e)
	{
		Player p = e.getPlayer();
		p.getInventory().clear();
		
		ItemStack g = new ItemStack(Material.ENDER_CHEST);
		ItemMeta gM = g.getItemMeta();
		gM.setDisplayName("§b§lGadgets");
		g.setItemMeta(gM);
		
		p.getInventory().setItem(3, g);
	}

}
