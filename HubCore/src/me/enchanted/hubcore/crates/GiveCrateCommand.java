package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creature;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
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
			ItemStack gadgets = new ItemStack(Material.ENDER_CHEST, 1);
			ItemMeta gadgetsM = gadgets.getItemMeta();
			gadgetsM.setDisplayName("§b§lGadgets");
			gadgets.setItemMeta(gadgetsM);
			p.getInventory().setItem(4, gadgets);
			
            
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
	
	//Make entity follow player.
	/*@SuppressWarnings("deprecation")
	public void followPlayer(Player player, LivingEntity entity, double d) {
        final LivingEntity e = entity;
        final Player p = player;
        final float f = (float) d;
        entity.setMaxHealth(2048);
        Bukkit.getScheduler().scheduleSyncRepeatingTask(HubCore.getPlugin(HubCore.class), new Runnable() {
            @Override
            public void run() {
            	entity.setCollidable(false);
    			
    			entity.setHealth(2048);
            	double dis = entity.getLocation().distance(p.getLocation());
                if(dis >= 9)
                {
                	entity.teleport(p);
                }
                ((EntityInsentient) ((CraftEntity) e).getHandle()).getNavigation().a(p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ(), f);
            }
        }, 0 * 20, 1);
    }*/
	

}
