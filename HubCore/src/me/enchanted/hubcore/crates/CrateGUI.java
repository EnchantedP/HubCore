package me.enchanted.hubcore.crates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.enchanted.hubcore.HubCore;

public class CrateGUI {

	public static HashMap<Player,String> map = new HashMap<>();
	
	public static void openCrate1(Player p)
	{
		Inventory crateGUI = Bukkit.createInventory(null, 27, "§4§lCrate GUI§1");
		
		ItemStack glassPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);	
		ItemMeta glassPaneMeta = glassPane.getItemMeta();
		glassPaneMeta.setDisplayName("§4");
		glassPane.setItemMeta(glassPaneMeta);
		
		for(int i = 0; i < crateGUI.getSize(); i++)
		{
			crateGUI.setItem(i, glassPane);
		}
		
		ItemStack bscrate = new ItemStack(Material.CHEST, 1);
		ItemMeta bscrateMeta = bscrate.getItemMeta();
		bscrateMeta.setDisplayName("§7Open Basic Crate");
		List<String> bslore = new ArrayList<String>();
		bslore.add("§7You Currently Have §a" + HubCore.getPlugin(HubCore.class).getConfig().getInt("crates." + p.getUniqueId().toString() + ".BasicCrates") + " §7Basic Crates!");
		bslore.add("§9");
		bslore.add("§9Craftable for §31000 §9Chest Pieces");
		bslore.add("§8");
		bslore.add("§aLeft-Click §8To Open.");
		bslore.add("§aRight-Click §8To Buy."); 
		bscrateMeta.setLore(bslore);
		bscrate.setItemMeta(bscrateMeta);
		
		crateGUI.setItem(11, bscrate);
		
		p.openInventory(crateGUI);
		map.put(p, "§4§lCrate1");
		
	}
	
	public static void openCrate2(Player p)
	{
		
		Inventory crateGUI = Bukkit.createInventory(null, 27, "§4§lCrate GUI§2");
		
		ItemStack glassPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);	
		ItemMeta glassPaneMeta = glassPane.getItemMeta();
		glassPaneMeta.setDisplayName("§4");
		glassPane.setItemMeta(glassPaneMeta);
		
		for(int i = 0; i < crateGUI.getSize(); i++)
		{
			crateGUI.setItem(i, glassPane);
		}
		
		ItemStack bscrate = new ItemStack(Material.CHEST, 1);
		ItemMeta bscrateMeta = bscrate.getItemMeta();
		bscrateMeta.setDisplayName("§7Open Basic Crate");
		List<String> bslore = new ArrayList<String>();
		bslore.add("§7You Currently Have §a" + HubCore.getPlugin(HubCore.class).getConfig().getInt("crates." + p.getUniqueId().toString() + ".BasicCrates") + " §7Basic Crates!");
		bslore.add("§9");
		bslore.add("§9Craftable for §31000 §9Chest Pieces");
		bslore.add("§8");
		bslore.add("§aLeft-Click §8To Open.");
		bslore.add("§aRight-Click §8To Buy."); 
		
		bscrateMeta.setLore(bslore);
		bscrate.setItemMeta(bscrateMeta);
		
		crateGUI.setItem(11, bscrate);
		
		p.openInventory(crateGUI);
		map.put(p, "§4§lCrate2");
	}
	
	public static void openCrate3(Player p)
	{
		Inventory crateGUI = Bukkit.createInventory(null, 27, "§4§lCrate GUI§3");
		
		ItemStack glassPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);	
		ItemMeta glassPaneMeta = glassPane.getItemMeta();
		glassPaneMeta.setDisplayName("§4");
		glassPane.setItemMeta(glassPaneMeta);
		
		for(int i = 0; i < crateGUI.getSize(); i++)
		{
			crateGUI.setItem(i, glassPane);
		}
		
		ItemStack bscrate = new ItemStack(Material.CHEST, 1);
		ItemMeta bscrateMeta = bscrate.getItemMeta();
		bscrateMeta.setDisplayName("§7Open Basic Crate");
		List<String> bslore = new ArrayList<String>();
		bslore.add("§7You Currently Have §a" + HubCore.getPlugin(HubCore.class).getConfig().getInt("crates." + p.getUniqueId().toString() + ".BasicCrates") + " §7Basic Crates!");
		bslore.add("§9");
		bslore.add("§9Craftable for §31000 §9Chest Pieces");
		bslore.add("§8");
		bslore.add("§aLeft-Click §8To Open.");
		bslore.add("§aRight-Click §8To Buy."); 
		bscrateMeta.setLore(bslore);
		bscrate.setItemMeta(bscrateMeta);
		
		crateGUI.setItem(11, bscrate);
		
		p.openInventory(crateGUI);
		map.put(p, "§4§lCrate3");
	}
	
	public static void openCrate4(Player p)
	{
		Inventory crateGUI = Bukkit.createInventory(null, 27, "§4§lCrate GUI§4");
		
		ItemStack glassPane = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);	
		ItemMeta glassPaneMeta = glassPane.getItemMeta();
		glassPaneMeta.setDisplayName("§4");
		glassPane.setItemMeta(glassPaneMeta);
		
		for(int i = 0; i < crateGUI.getSize(); i++)
		{
			crateGUI.setItem(i, glassPane);
		}
		
		ItemStack bscrate = new ItemStack(Material.CHEST, 1);
		ItemMeta bscrateMeta = bscrate.getItemMeta();
		bscrateMeta.setDisplayName("§7Open Basic Crate");
		List<String> bslore = new ArrayList<String>();
		bslore.add("§7You Currently Have §a" + HubCore.getPlugin(HubCore.class).getConfig().getInt("crates." + p.getUniqueId().toString() + ".BasicCrates") + " §7Basic Crates!");
		bslore.add("§9");
		bslore.add("§9Craftable for §31000 §9Chest Pieces");
		bslore.add("§8");
		bslore.add("§aLeft-Click §8To Open.");
		bslore.add("§aRight-Click §8To Buy."); 
		bscrateMeta.setLore(bslore);
		bscrate.setItemMeta(bscrateMeta);
		
		crateGUI.setItem(11, bscrate);
		
		p.openInventory(crateGUI);
		map.put(p, "§4§lCrate4");
	}
}
