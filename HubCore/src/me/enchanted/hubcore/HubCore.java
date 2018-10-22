package me.enchanted.hubcore;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.crates.CratesGUIClick;
import me.enchanted.hubcore.crates.CratesJoin;
import me.enchanted.hubcore.crates.CratesOpen;
import me.enchanted.hubcore.crates.CratesOpenMove;
import me.enchanted.hubcore.crates.GiveCrateCommand;
import me.enchanted.hubcore.crates.OpenCratesGUI;
import me.enchanted.hubcore.doublejump.DoubleJumpEvent;
import me.enchanted.hubcore.doublejump.JumpEvent;
import me.enchanted.hubcore.gadgets.GadgetsClick;
import me.enchanted.hubcore.gadgets.GadgetsMenuClick;

public class HubCore extends JavaPlugin implements Listener {

	public void onEnable() {
		registerCommands();
		registerListeners();
		DailyRewards();
		saveDefaultConfig();
	}

	public void registerCommands() {
		getCommand("test").setExecutor(new GiveCrateCommand());
	}

	public void registerListeners() {
		getServer().getPluginManager().registerEvents(new CratesOpen(), this);
		getServer().getPluginManager().registerEvents(new CratesOpenMove(), this);
		getServer().getPluginManager().registerEvents(new JumpEvent(), this);
		getServer().getPluginManager().registerEvents(new DoubleJumpEvent(), this);
		getServer().getPluginManager().registerEvents(new GadgetsClick(), this);
		getServer().getPluginManager().registerEvents(new CratesJoin(), this);
		getServer().getPluginManager().registerEvents(new OpenCratesGUI(), this);
		getServer().getPluginManager().registerEvents(new CratesGUIClick(), this);
	}

	@SuppressWarnings("deprecation")
	public void DailyRewards() {
		Bukkit.getScheduler().scheduleAsyncRepeatingTask(this, new BukkitRunnable() {

			@Override
			public void run() {
				if (getConfig().getInt("dailyTimeRemaining") == 0) {
					for (OfflinePlayer op : Bukkit.getOfflinePlayers()) {
						if (op.hasPlayedBefore()) {
							if (op.isOnline()) {

							} else {
								String UUID = op.getUniqueId().toString();
								int oldNm = getConfig().getInt("crates." + UUID + ".BasicCrates");
								int newNm = oldNm + 1;
								getConfig().set("crates." + UUID + ".BasicCrates", newNm);
								getConfig().set("crates." + UUID + ".Name", op.getName());
								saveConfig();
							}

						}
					}
					for (Player op : Bukkit.getOnlinePlayers()) {
						op.sendMessage("§c§lCrates §4§l> You got a Basic Crate");
						String UUID = op.getUniqueId().toString();
						int oldNm = getConfig().getInt("crates." + UUID + ".BasicCrates");
						int newNm = oldNm + 1;
						getConfig().set("crates." + UUID + ".BasicCrates", newNm);
						saveConfig();
					}
					getConfig().set("dailyTimeRemaining", 14400);
					saveConfig();
				}
				else
				{
					int oldRmng = getConfig().getInt("dailyTimeRemaining");
					int newRmng = oldRmng - 1;
					getConfig().set("dailyTimeRemaining", newRmng);
					saveConfig();
				}

			}
		}, 0L, 20L);

	}
}
