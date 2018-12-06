package me.enchanted.hubcore.doublejump;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

	public static ArrayList<Player> flying = new ArrayList<>();
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender instanceof Player)
		{
			Player p = (Player) sender;
			if(p.hasPermission("essentials.fly"))
			{
				if(args.length != 1)
				{
					if(flying.contains(p))
					{
						flying.remove(p);
						p.setFlying(true);
						p.setAllowFlight(true);
						p.sendMessage("§6Enabled " + p.getName() + "'s Flight.");
					}
					else
					{
						flying.add(p);
						p.setFlying(false);
						p.setAllowFlight(true);
						p.sendMessage("§6Disabled " + p.getName() + "'s Flight.");
					}
				}
				else
				{
					Player target = Bukkit.getPlayer(args[0]);
					if(flying.contains(target))
					{
						flying.remove(target);
						target.setFlying(true);
						target.setAllowFlight(true);
						p.sendMessage("§6Enabled " + target.getName() + "'s Flight.");
					}
					else
					{
						flying.add(target);
						target.setFlying(false);
						target.setAllowFlight(true);
						p.sendMessage("§6Disabled " + target.getName() + "'s Flight.");
					}
				}
			}
		}
		return true;
	}
}
