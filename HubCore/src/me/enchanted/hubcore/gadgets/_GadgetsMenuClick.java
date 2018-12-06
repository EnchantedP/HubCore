package me.enchanted.hubcore.gadgets;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class _GadgetsMenuClick implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e)
	{
		if(e.getInventory().getName().equals("�bGadgets"))
		{
			if(e.getSlot() == 1)
			{
				e.setCancelled(true);
				Player p = (Player) e.getWhoClicked();
				p.closeInventory();
				_GadgetsMenuParticles.openInv(p);
			}
			else
			{
				e.setCancelled(true);
			}
		}
	}
}
