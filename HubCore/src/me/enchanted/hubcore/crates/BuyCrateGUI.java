package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BuyCrateGUI {

	public static void buyBasicCrate(Player p) {
		Inventory buy = Bukkit.createInventory(null, 27, "§8Buy Basic Crate");
		
		ItemStack gItem = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 8);
		ItemMeta gItemM = gItem.getItemMeta();
		gItemM.setDisplayName("§a");
		gItem.setItemMeta(gItemM);
		
		for(int g = 0; g < buy.getSize(); g++)
		{
			buy.setItem(g, gItem);
		}
		
		ItemStack bItem = new ItemStack(Material.EMERALD_BLOCK);
		ItemMeta bItemM = bItem.getItemMeta();
		bItemM.setDisplayName("§aBuy");
		bItem.setItemMeta(bItemM);
		
		for(int b = 0; b < buy.getSize(); b++)
		{
			if(b >= 0 && b < 3)
			{
				buy.setItem(b, bItem);
			}
			if(b >= 9 && b <= 11)
			{
				buy.setItem(b, bItem);
			}
			if(b >= 18 && b <= 20)
			{
				buy.setItem(b, bItem);
			}
		}
		
		ItemStack cItem = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta cItemM = cItem.getItemMeta();
		cItemM.setDisplayName("§cCancel");
		cItem.setItemMeta(cItemM);
		
		for(int c = 0; c < buy.getSize(); c++)
		{
			if(c >= 6 && c <= 8)
			{
				buy.setItem(c, cItem);
			}
			if(c >= 15 && c <= 17)
			{
				buy.setItem(c, cItem);
			}
			if(c >= 24 && c <= 26)
			{
				buy.setItem(c, cItem);
			}
		}
		
		ItemStack chItem = new ItemStack(Material.CHEST);
		ItemMeta chItemM = cItem.getItemMeta();
		chItemM.setDisplayName("§7Buy Basic Crate");
		chItem.setItemMeta(chItemM);
		
		buy.setItem(13, chItem);
		
		p.openInventory(buy);
	}
	
	public static void insufficientFunds(Player p)
	{
		Inventory iF = Bukkit.createInventory(null, 54, "§4INSUFFICIENT FUNDS");
		
		ItemStack ifItem = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta ifItemM = ifItem.getItemMeta();
		ifItemM.setDisplayName("§4INSUFFICIENT FUNDS");
		ifItem.setItemMeta(ifItemM);
		
		for(int i = 0; i < iF.getSize(); i++)
		{
			iF.setItem(i, ifItem);
		}
		
		p.openInventory(iF);
		
	}
}
