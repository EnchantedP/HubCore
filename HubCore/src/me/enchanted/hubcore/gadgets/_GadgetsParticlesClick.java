package me.enchanted.hubcore.gadgets;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.enchanted.hubcore.particles._ParticleArrays_;

public class _GadgetsParticlesClick implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e)
	{
		if(e.getInventory().getName().equals("§a§lParticle Effects"))
		{
			if(e.getSlot() == 11)
			{
				e.setCancelled(true);
				Player p = (Player) e.getWhoClicked();
				if(p.hasPermission("par.chrishat"))
				{
					_ParticleArrays_.cHT.add(p);
				}
			}
			else
			{
				e.setCancelled(true);
			}
		}
	}
}
