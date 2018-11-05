package me.enchanted.hubcore.gadgets;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class _GadgetsMenu {

	public void GadgetsInv(Player p){
		Inventory inv = Bukkit.createInventory(null, 54, "§bGadgets");
		ItemStack glassPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);	
		ItemMeta glassPaneMeta = glassPane.getItemMeta();
		glassPaneMeta.setDisplayName("");
		glassPane.setItemMeta(glassPaneMeta);
		for(int i = 0; i < inv.getSize(); i++)
		{
			inv.setItem(i, glassPane);
		}
		
		ItemStack particleEffect = new ItemStack(Material.NETHER_STAR, 1);
		ItemMeta particleEffectMeta = particleEffect.getItemMeta();
		particleEffectMeta.setDisplayName("§a§bParticle Effects");
		particleEffect.setItemMeta(particleEffectMeta);
		inv.setItem(1, particleEffect);
		
		p.openInventory(inv);
	}
}
