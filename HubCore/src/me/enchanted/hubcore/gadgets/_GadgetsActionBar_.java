package me.enchanted.hubcore.gadgets;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class _GadgetsActionBar_ {

	public static void start() {
		new BukkitRunnable() {

			@SuppressWarnings("deprecation")
			@Override
			public void run() {
				for (Player a : Bukkit.getOnlinePlayers()) {
					if (a.getItemInHand().getType() == Material.MELON_BLOCK) { //If you are holding the Melon gadget
						a.spigot().sendMessage(ChatMessageType.ACTION_BAR,
								new TextComponent(HubCore.getPlugin(HubCore.class).getConfig()
										.getInt("crates." + a.getUniqueId() + ".melonGadget") + " Melons Left")); //Send the ActionBar Message
					}
					else if (a.getItemInHand().getType() == Material.TNT) { //If you are holding the TNT gadget
						a.spigot().sendMessage(ChatMessageType.ACTION_BAR,
								new TextComponent(HubCore.getPlugin(HubCore.class).getConfig()
										.getInt("crates." + a.getUniqueId() + ".tntGadget") + " TNT Left")); //Send the ActionBar Message
					}
					else
					{
						//Do Nothing
					}
				}

			}
		}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0, 1);
	}
}
