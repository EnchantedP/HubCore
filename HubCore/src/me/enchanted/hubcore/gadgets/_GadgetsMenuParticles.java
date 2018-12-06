package me.enchanted.hubcore.gadgets;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class _GadgetsMenuParticles {

	public static void openInv(Player p){
		Inventory inv = Bukkit.createInventory(null, 54, "§a§lParticle Effects");
		ItemStack glassPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);	
		ItemMeta glassPaneMeta = glassPane.getItemMeta();
		glassPaneMeta.setDisplayName("");
		glassPane.setItemMeta(glassPaneMeta);
		
		
		
		for(int i = 0; i < inv.getSize(); i++)
		{
			inv.setItem(i, glassPane);
			
		}
		
		ItemStack none = new ItemStack(Material.INK_SACK, 1, (byte) 8);	
		ItemMeta noneMeta = none.getItemMeta();
		noneMeta.setDisplayName("§c§l???");
		none.setItemMeta(noneMeta);
		
		for(int i = 0; i < inv.getSize(); i++)
		{
			if(i >= 11 && i <= 15)
			{
				inv.setItem(i, none);
			}
			else if(i >= 20 && i <= 24)
			{
				inv.setItem(i, none);
			}
			else if(i >= 29 && i <= 33)
			{
				inv.setItem(i, none);
			}
			else if(i >= 38 && i <= 42)
			{
				inv.setItem(i, none);
			}
		}
		
		ItemStack cHE = null;
		ItemMeta cHEM = null;
		if(p.hasPermission("par.chrishat"))
		{
			cHE = new ItemStack(Material.REDSTONE, 1);
			cHEM = cHE.getItemMeta();
			cHEM.setDisplayName("§4§lChristmas Hat");
		}
		else
		{
			cHE = new ItemStack(Material.INK_SACK, 1, (byte) 8);
			cHEM = cHE.getItemMeta();
			cHEM.setDisplayName("§c§l???");
		}
		cHE.setItemMeta(cHEM);
		inv.setItem(11, cHE);
		
		ItemStack mE = new ItemStack(Material.NOTE_BLOCK, 1);
		ItemMeta mEM = mE.getItemMeta();
		mEM.setDisplayName("§c§lMusical");
		mE.setItemMeta(mEM);
		inv.setItem(12, mE);
		
		ItemStack l = new ItemStack(Material.LAVA_BUCKET, 1);
		ItemMeta lM = l.getItemMeta();
		lM.setDisplayName("§6§lLava Helix");
		l.setItemMeta(lM);
		inv.setItem(13, l);
		
		p.openInventory(inv);
	}
}
