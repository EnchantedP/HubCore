package me.enchanted.hubcore.crates;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Chest;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Firework;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import me.enchanted.hubcore.HubCore;

public class CratesOpen implements Listener {

	public static ArrayList<Player> CrateOpen = new ArrayList<>();
	public static HashMap<Player, Integer> CratesOpen = new HashMap<>();

	@SuppressWarnings("deprecation")
	@EventHandler
	public void crateOpen(PlayerInteractEvent e) {

		Player p = e.getPlayer();

		if (CrateOpen.contains(p) && !CratesOpen.get(p).equals(1)) {

			if (!(e.getClickedBlock().getState() instanceof Chest)) {
				return;
			} else if (e.getClickedBlock().getState() instanceof Chest) {
				Random rnd = new Random();
				int rndInt = rnd.nextInt(100) + 1;

				if (rndInt <= 7) {
					List<String> lore = new ArrayList<>();

					int rndLore = rnd.nextInt(10000) + 1;
					lore.add("" + rndLore);

					ItemStack is = new ItemStack(Material.BLAZE_POWDER);
					ItemMeta im = is.getItemMeta();
					is.setAmount(1);
					im.setLore(lore);

					Item item = e.getClickedBlock().getWorld()
							.dropItem(e.getClickedBlock().getLocation().add(0.5, 0, 0.5), is);
					item.setGravity(false);
					item.setPickupDelay(Integer.MAX_VALUE);
					item.setVelocity(new Vector(0, 0, 0));

					ArmorStand aS = p.getWorld()
							.spawn(new Location(p.getWorld(), e.getClickedBlock().getLocation().getX() + 0.5,
									e.getClickedBlock().getLocation().getY() - 0.7,
									e.getClickedBlock().getLocation().getZ() + 0.5), ArmorStand.class);
					aS.setVisible(false);
					aS.setGravity(false);
					aS.setCustomName("§e§lFlame Rings");
					aS.setCustomNameVisible(true);

					FireworkEffect fe = FireworkEffect.builder().withColor(Color.GREEN).withColor(Color.LIME)
							.withFade(Color.LIME).with(FireworkEffect.Type.BALL_LARGE).trail(false).flicker(true)
							.build();
					FireworkEffect fe2 = FireworkEffect.builder().withColor(Color.GREEN).withColor(Color.LIME)
							.withFade(Color.LIME).with(FireworkEffect.Type.BALL).trail(false).flicker(true).build();
					FireworkEffect fe3 = FireworkEffect.builder().withColor(Color.GREEN).withColor(Color.LIME)
							.withFade(Color.LIME).with(FireworkEffect.Type.BURST).trail(false).flicker(true).build();
					instantFirework(e.getClickedBlock().getLocation(), fe);
					instantFirework(e.getClickedBlock().getLocation(), fe2);
					instantFirework(e.getClickedBlock().getLocation(), fe3);
					Bukkit.getScheduler().scheduleSyncDelayedTask(HubCore.getPlugin(HubCore.class),
							new BukkitRunnable() {

								@Override
								public void run() {
									instantFirework(e.getClickedBlock().getLocation(), fe);
									instantFirework(e.getClickedBlock().getLocation(), fe2);
									instantFirework(e.getClickedBlock().getLocation(), fe3);

								}
							}, 2L);
					Bukkit.getScheduler().scheduleSyncDelayedTask(HubCore.getPlugin(HubCore.class),
							new BukkitRunnable() {

								@Override
								public void run() {
									instantFirework(e.getClickedBlock().getLocation(), fe);
									instantFirework(e.getClickedBlock().getLocation(), fe2);
									instantFirework(e.getClickedBlock().getLocation(), fe3);

								}
							}, 2L);
					Bukkit.getScheduler().scheduleSyncDelayedTask(HubCore.getPlugin(HubCore.class),
							new BukkitRunnable() {

								@Override
								public void run() {
									instantFirework(e.getClickedBlock().getLocation(), fe);
									instantFirework(e.getClickedBlock().getLocation(), fe2);
									instantFirework(e.getClickedBlock().getLocation(), fe3);

								}
							}, 2L);

				} else if (rndInt > 7 && rndInt <= 8) {

					List<String> lore = new ArrayList<>();

					int rndLore = rnd.nextInt(10000) + 1;
					lore.add("" + rndLore);

					ItemStack is = new ItemStack(Material.LAVA_BUCKET);
					ItemMeta im = is.getItemMeta();
					is.setAmount(1);
					im.setLore(lore);

					Item item = e.getClickedBlock().getWorld()
							.dropItem(e.getClickedBlock().getLocation().add(0.5, 0, 0.5), is);
					item.setGravity(false);
					item.setPickupDelay(Integer.MAX_VALUE);
					item.setVelocity(new Vector(0, 0, 0));

					ArmorStand aS = p.getWorld()
							.spawn(new Location(p.getWorld(), e.getClickedBlock().getLocation().getX() + 0.5,
									e.getClickedBlock().getLocation().getY() - 0.7,
									e.getClickedBlock().getLocation().getZ() + 0.5), ArmorStand.class);
					aS.setVisible(false);
					aS.setGravity(false);
					aS.setCustomName("§5§lLava Helix");
					aS.setCustomNameVisible(true);

					FireworkEffect fe = FireworkEffect.builder().withColor(Color.PURPLE).withColor(Color.FUCHSIA)
							.withFade(Color.FUCHSIA).with(FireworkEffect.Type.BALL_LARGE).trail(false).flicker(true)
							.build();
					FireworkEffect fe2 = FireworkEffect.builder().withColor(Color.PURPLE).withColor(Color.FUCHSIA)
							.withFade(Color.FUCHSIA).with(FireworkEffect.Type.BALL_LARGE).trail(false).flicker(true)
							.build();
					FireworkEffect fe3 = FireworkEffect.builder().withColor(Color.PURPLE).withColor(Color.FUCHSIA)
							.withFade(Color.FUCHSIA).with(FireworkEffect.Type.BALL_LARGE).trail(false).flicker(true)
							.build();
					instantFirework(e.getClickedBlock().getLocation(), fe);
					instantFirework(e.getClickedBlock().getLocation(), fe2);
					instantFirework(e.getClickedBlock().getLocation(), fe3);
					Bukkit.getScheduler().scheduleSyncDelayedTask(HubCore.getPlugin(HubCore.class),
							new BukkitRunnable() {

								@Override
								public void run() {
									instantFirework(e.getClickedBlock().getLocation(), fe);
									instantFirework(e.getClickedBlock().getLocation(), fe2);
									instantFirework(e.getClickedBlock().getLocation(), fe3);

								}
							}, 2L);
					Bukkit.getScheduler().scheduleSyncDelayedTask(HubCore.getPlugin(HubCore.class),
							new BukkitRunnable() {

								@Override
								public void run() {
									instantFirework(e.getClickedBlock().getLocation(), fe);
									instantFirework(e.getClickedBlock().getLocation(), fe2);
									instantFirework(e.getClickedBlock().getLocation(), fe3);

								}
							}, 2L);
					Bukkit.getScheduler().scheduleSyncDelayedTask(HubCore.getPlugin(HubCore.class),
							new BukkitRunnable() {

								@Override
								public void run() {
									instantFirework(e.getClickedBlock().getLocation(), fe);
									instantFirework(e.getClickedBlock().getLocation(), fe2);
									instantFirework(e.getClickedBlock().getLocation(), fe3);

								}
							}, 2L);
				} else if (rndInt >= 9) {
					List<String> lore = new ArrayList<>();

					int rndLore = rnd.nextInt(10000) + 1;
					lore.add("" + rndLore);

					ItemStack is = new ItemStack(Material.BARRIER);
					ItemMeta im = is.getItemMeta();
					is.setAmount(1);
					im.setLore(lore);

					Item item = e.getClickedBlock().getWorld()
							.dropItem(e.getClickedBlock().getLocation().add(0.5, 0, 0.5), is);
					item.setGravity(false);
					item.setPickupDelay(Integer.MAX_VALUE);
					item.setVelocity(new Vector(0, 0, 0));

					ArmorStand aS = p.getWorld()
							.spawn(new Location(p.getWorld(), e.getClickedBlock().getLocation().getX() + 0.5,
									e.getClickedBlock().getLocation().getY() - 0.7,
									e.getClickedBlock().getLocation().getZ() + 0.5), ArmorStand.class);
					aS.setVisible(false);
					aS.setGravity(false);
					aS.setCustomName("§8§lN§7§lo§8§lt§7§lh§8§li§7§ln§8§lg");
					aS.setCustomNameVisible(true);

				}
				
				e.setCancelled(true);

				if (!CratesOpen.get(p).equals(1)) {
					e.getClickedBlock().setType(Material.AIR);
					int toAdd = 1;
					int newCratesOpened = CratesOpen.get(p) - toAdd;
					CratesOpen.put(p, newCratesOpened);

					p.sendMessage("§c" + CratesOpen.get(p) + "");

				}
				if (CratesOpen.get(p).equals(1)) {
					e.getClickedBlock().setType(Material.AIR);
					CratesOpen.remove(p);

					Bukkit.getScheduler().scheduleSyncDelayedTask(HubCore.getPlugin(HubCore.class),
							new BukkitRunnable() {

								@Override
								public void run() {
									Location loc1 = new Location(p.getWorld(), p.getLocation().getX() - 1,
											p.getLocation().getY(), p.getLocation().getZ() + 2);
									loc1.getBlock().setType(Material.AIR);
									Location loc2 = new Location(p.getWorld(), p.getLocation().getX() + 1,
											p.getLocation().getY(), p.getLocation().getZ() + 2);
									loc2.getBlock().setType(Material.AIR);
									Location loc3 = new Location(p.getWorld(), p.getLocation().getX() + 2,
											p.getLocation().getY(), p.getLocation().getZ() - 1);
									loc3.getBlock().setType(Material.AIR);
									Location loc4 = new Location(p.getWorld(), p.getLocation().getX() + 2,
											p.getLocation().getY(), p.getLocation().getZ() + 1);
									loc4.getBlock().setType(Material.AIR);
									Location loc5 = new Location(p.getWorld(), p.getLocation().getX() - 2,
											p.getLocation().getY(), p.getLocation().getZ() + 1);
									loc5.getBlock().setType(Material.AIR);
									Location loc6 = new Location(p.getWorld(), p.getLocation().getX() - 2,
											p.getLocation().getY(), p.getLocation().getZ() - 1);
									loc6.getBlock().setType(Material.AIR);
									Location loc7 = new Location(p.getWorld(), p.getLocation().getX() - 1,
											p.getLocation().getY(), p.getLocation().getZ() - 2);
									loc7.getBlock().setType(Material.AIR);
									Location loc8 = new Location(p.getWorld(), p.getLocation().getX() + 1,
											p.getLocation().getY(), p.getLocation().getZ() - 2);
									loc8.getBlock().setType(Material.AIR);

									for (Entity e : p.getLocation().getWorld().getEntities()) {
										if (p.getLocation().distance(e.getLocation()) <= 3) {
											if (e != p) {
												if (!(e instanceof Player)) {
													e.remove();
												}
											}
										}
									}

									p.getLocation().getBlock().setType(Material.CHEST);
									Block block = p.getLocation().getBlock();
									/*
									 * Do your magic to set the block at the
									 * location you have as a chest.
									 */;
									BlockState bdata = block.getState();
									Chest chest = (Chest) bdata;
									chest.setCustomName(CrateGUI.map.get(p));
									p.teleport(p.getLocation().add(1, 0, 1));
									CrateOpen.remove(p);
									int BasicCrates = HubCore.getPlugin(HubCore.class).getConfig()
											.getInt("crates." + p.getUniqueId() + ".BasicCrates");
									int BcNew = BasicCrates - 1;
									HubCore.getPlugin(HubCore.class).getConfig()
											.set("crates." + p.getUniqueId() + ".BasicCrates", BcNew);
									HubCore.getPlugin(HubCore.class).saveConfig();

								}
							}, 70L);

				}
			}
		}
	}

	public void instantFirework(Location loc, FireworkEffect fe) {

		Firework f = (Firework) loc.getWorld().spawn(loc, Firework.class);
		FireworkMeta fm = f.getFireworkMeta();
		fm.addEffect(fe);
		f.setFireworkMeta(fm);
		try {
			Class<?> entityFireworkClass = CratesOpen.this.getClass("net.minecraft.server.", "EntityFireworks");
			Class<?> craftFireworkClass = CratesOpen.this.getClass("org.bukkit.craftbukkit.", "entity.CraftFirework");
			Object firework = craftFireworkClass.cast(f);
			Method handle = firework.getClass().getMethod("getHandle");
			Object entityFirework = handle.invoke(firework);
			Field expectedLifespan = entityFireworkClass.getDeclaredField("expectedLifespan");
			Field ticksFlown = entityFireworkClass.getDeclaredField("ticksFlown");
			ticksFlown.setAccessible(true);
			ticksFlown.setInt(entityFirework, expectedLifespan.getInt(entityFirework) - 1);
			ticksFlown.setAccessible(false);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private Class<?> getClass(String prefix, String nmsClassString) throws ClassNotFoundException {
		String version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3] + ".";
		String name = prefix + version + nmsClassString;
		Class<?> nmsClass = Class.forName(name);
		return nmsClass;
	}

}