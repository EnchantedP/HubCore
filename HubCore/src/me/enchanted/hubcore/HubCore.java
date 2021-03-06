package me.enchanted.hubcore;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.crates.BuyCrateClick;
import me.enchanted.hubcore.crates.CratesGUIClick;
import me.enchanted.hubcore.crates.CratesJoin;
import me.enchanted.hubcore.crates.CratesLeave;
import me.enchanted.hubcore.crates.CratesOpen;
import me.enchanted.hubcore.crates.CratesOpenMove;
import me.enchanted.hubcore.crates.CratesProtect;
import me.enchanted.hubcore.crates.GiveCrateCommand;
import me.enchanted.hubcore.crates.OpenCratesGUI;
import me.enchanted.hubcore.customchat.CustomChatEvent;
import me.enchanted.hubcore.doublejump.DoubleJumpEvent;
import me.enchanted.hubcore.doublejump.FlyCommand;
import me.enchanted.hubcore.doublejump.JumpEvent;
import me.enchanted.hubcore.gadgets._GadgetsClick;
import me.enchanted.hubcore.gadgets._GadgetsJoin;
import me.enchanted.hubcore.gadgets._GadgetsMenuClick;
import me.enchanted.hubcore.gadgets._GadgetsParticlesClick;
import me.enchanted.hubcore.gadgets.AirPearlsGadget;
import me.enchanted.hubcore.gadgets.GunGadget;
import me.enchanted.hubcore.gadgets.LauncherGadget;
import me.enchanted.hubcore.gadgets.MelonGadget;
import me.enchanted.hubcore.gadgets.TNTGadgets;
import me.enchanted.hubcore.gadgets.TNTGadgetsExplode;
import me.enchanted.hubcore.gadgets._GadgetsActionBar_;
import me.enchanted.hubcore.gadgets._GadgetsTimeLeft;
import me.enchanted.hubcore.particles._FreeParticleJoin;
import me.enchanted.hubcore.particles._ParticleArrays_;
import me.enchanted.hubcore.particles._ParticlesLeave;
import me.enchanted.hubcore.particles._RegisterParticles;
import me.enchanted.hubcore.stats.ScoreboardJoinEvent;
import me.enchanted.hubcore.stats.ScoreboardUpdate;

public class HubCore extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		for (Player p : Bukkit.getOnlinePlayers()) {
			CratesProtect.crateForcefield(p);
			FlyCommand.flying.add(p);
		}
		registerScoreboard();
		registerCommands();
		registerListeners();
		registerTimeLeft();
		DailyRewards();
		_RegisterParticles.redgisterParticles();
		_GadgetsActionBar_.start();
		saveDefaultConfig(); 
		
	}
	
	private void registerTimeLeft() {
		_GadgetsTimeLeft.tntTime();
		_GadgetsTimeLeft.melonTime();
		_GadgetsTimeLeft.despawnItems();
	}

	public void registerScoreboard()
	{
		getServer().getPluginManager().registerEvents(new ScoreboardJoinEvent(), this);
		ScoreboardUpdate.update();
	}
	
	public void registerCommands() {
		getCommand("givecrate").setExecutor(new GiveCrateCommand());
		getCommand("fly").setExecutor(new FlyCommand());
	}

	public void registerListeners() {
		getServer().getPluginManager().registerEvents(new BuyCrateClick(), this);
		getServer().getPluginManager().registerEvents(new CratesOpen(), this);
		getServer().getPluginManager().registerEvents(new CratesOpenMove(), this);
		getServer().getPluginManager().registerEvents(new JumpEvent(), this);
		getServer().getPluginManager().registerEvents(new DoubleJumpEvent(), this);
		getServer().getPluginManager().registerEvents(new _GadgetsClick(), this);
		getServer().getPluginManager().registerEvents(new _GadgetsMenuClick(), this);
		getServer().getPluginManager().registerEvents(new _GadgetsParticlesClick(), this);
		getServer().getPluginManager().registerEvents(new _GadgetsJoin(), this);
		getServer().getPluginManager().registerEvents(new _FreeParticleJoin(), this);
		getServer().getPluginManager().registerEvents(new _ParticlesLeave(), this);
		getServer().getPluginManager().registerEvents(new CratesJoin(), this);
		getServer().getPluginManager().registerEvents(new OpenCratesGUI(), this);
		getServer().getPluginManager().registerEvents(new CratesGUIClick(), this);
		getServer().getPluginManager().registerEvents(new CratesLeave(), this);
		getServer().getPluginManager().registerEvents(new CustomChatEvent(), this);
		getServer().getPluginManager().registerEvents(new TNTGadgets(), this);
		getServer().getPluginManager().registerEvents(new TNTGadgetsExplode(), this);
		getServer().getPluginManager().registerEvents(new AirPearlsGadget(), this);
		getServer().getPluginManager().registerEvents(new GunGadget(), this);
		getServer().getPluginManager().registerEvents(new LauncherGadget(), this);
		getServer().getPluginManager().registerEvents(new MelonGadget(), this);
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
						op.sendMessage("�c�lCrates �4�l> You got a Basic Crate");
						String UUID = op.getUniqueId().toString();
						int oldNm = getConfig().getInt("crates." + UUID + ".BasicCrates");
						int newNm = oldNm + 1;
						getConfig().set("crates." + UUID + ".BasicCrates", newNm);
						saveConfig();
					}
					getConfig().set("dailyTimeRemaining", 14400);
					saveConfig();
				} else {
					int oldRmng = getConfig().getInt("dailyTimeRemaining");
					int newRmng = oldRmng - 1;
					getConfig().set("dailyTimeRemaining", newRmng);
					saveConfig();
				}

			}
		}, 0L, 20L);

	}
}
