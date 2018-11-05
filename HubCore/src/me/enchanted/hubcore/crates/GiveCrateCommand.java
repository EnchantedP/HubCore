package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creature;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class GiveCrateCommand implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			Creature cow = (Creature) Bukkit.getWorld("world").spawnEntity(p.getLocation(), EntityType.COW);
			new BukkitRunnable() {
				
				@Override
				public void run() {
					
					cow.setLeashHolder(p);
					cow.getLeashHolder().
					
				}
			}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 1);
			
			
			if(p.hasPermission("enchanted.givecrate"))
			{
				if(args.length != 1)
				{
					p.sendMessage("§cUsage: /givecrate [Number]");
				}
				else
				{
					if(args[0].equalsIgnoreCase("1"))
					{
						ItemStack crate = new ItemStack(Material.CHEST, 1);
						ItemMeta crateMeta = crate.getItemMeta();
						crateMeta.setDisplayName("§4§lCrate1");
						crate.setItemMeta(crateMeta);
						p.getInventory().addItem(crate);
					}
					else if(args[0].equalsIgnoreCase("2"))
					{
						ItemStack crate = new ItemStack(Material.CHEST, 1);
						ItemMeta crateMeta = crate.getItemMeta();
						crateMeta.setDisplayName("§4§lCrate2");
						crate.setItemMeta(crateMeta);
						p.getInventory().addItem(crate);
					} else if(args[0].equalsIgnoreCase("3"))
					{
						ItemStack crate = new ItemStack(Material.CHEST, 1);
						ItemMeta crateMeta = crate.getItemMeta();
						crateMeta.setDisplayName("§4§lCrate3");
						crate.setItemMeta(crateMeta);
						p.getInventory().addItem(crate);
					} else if(args[0].equalsIgnoreCase("4"))
					{
						ItemStack crate = new ItemStack(Material.CHEST, 1);
						ItemMeta crateMeta = crate.getItemMeta();
						crateMeta.setDisplayName("§4§lCrate4");
						crate.setItemMeta(crateMeta);
						p.getInventory().addItem(crate);
					} else
					{
						
					}
				}
			}
		}
		return true;
	}

}
