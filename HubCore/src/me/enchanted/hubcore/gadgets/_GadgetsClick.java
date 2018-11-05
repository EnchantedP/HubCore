package me.enchanted.hubcore.gadgets;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class _GadgetsClick implements Listener {
	
	public _GadgetsMenu gm = new _GadgetsMenu();
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onGadgetsClick(PlayerInteractEvent e)
	{
		Player p = e.getPlayer();
		if(!p.getItemInHand().hasItemMeta()) return;
		if(!p.getItemInHand().getItemMeta().hasDisplayName()) return;
		if(!p.getItemInHand().getItemMeta().getDisplayName().equals("§b§lGadgets")) return;
		gm.GadgetsInv(p);
	}

}
