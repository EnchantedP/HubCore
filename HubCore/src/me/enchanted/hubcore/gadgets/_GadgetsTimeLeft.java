package me.enchanted.hubcore.gadgets;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;

public class _GadgetsTimeLeft {

	public static void tntTime()
	{
		new BukkitRunnable() {
			
			@Override
			public void run() {
				for(Player all : Bukkit.getOnlinePlayers())
				{
					if(TNTGadgets.timeleft.containsKey(all) && !(TNTGadgets.timeleft.get(all).equals(0)))
					{
						int toSubtract = 1;
						int timeLeft = TNTGadgets.timeleft.get(all);
						int newTL = timeLeft - toSubtract;
						TNTGadgets.timeleft.put(all, newTL);
					}
				}
			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 20);
	}
}
