package me.enchanted.hubcore.crates;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Chest;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;
import me.enchanted.hubcore.bungeecord.SendToBungeecord;

public class BasicCrates {

	static int i1 = 0;
	static int armorstands1;

	@SuppressWarnings("deprecation")
	public static void SpawnBasicCrate1(Player p) {
		
		CratesOpen.CrateOpen.add(p);
		CratesOpen.CratesOpen.put(p, 5);

		ItemStack chest = new ItemStack(Material.CHEST);

		ArmorStand armorStand1 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);
		armorStand1.setHelmet(chest);
		armorStand1.setVisible(false);
		armorStand1.setGravity(false);

		ArmorStand armorStand2 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);

		armorStand2.setHelmet(chest);
		armorStand2.setVisible(false);
		armorStand2.setGravity(false);

		ArmorStand armorStand3 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand3.setHelmet(chest);
		armorStand3.setVisible(false);
		armorStand3.setGravity(false);

		ArmorStand armorStand4 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand4.setHelmet(chest);
		armorStand4.setVisible(false);
		armorStand4.setGravity(false);

		ArmorStand armorStand5 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);
		armorStand5.setHelmet(chest);
		armorStand5.setVisible(false);
		armorStand5.setGravity(false);

		ArmorStand armorStand6 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);

		armorStand6.setHelmet(chest);
		armorStand6.setVisible(false);
		armorStand6.setGravity(false);

		ArmorStand armorStand7 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand7.setHelmet(chest);
		armorStand7.setVisible(false);
		armorStand7.setGravity(false);

		ArmorStand armorStand8 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand8.setHelmet(chest);
		armorStand8.setVisible(false);
		armorStand8.setGravity(false);

		i1 = 0;
		armorstands1 = Bukkit.getScheduler().scheduleSyncRepeatingTask(HubCore.getPlugin(HubCore.class),
				new BukkitRunnable() {

					@Override
					public void run() {
						Location loc1 = armorStand1.getLocation();
						loc1.setYaw(armorStand1.getLocation().getYaw() + 30);
						loc1.setY(loc1.getY() - 0.1);
						armorStand1.teleport(loc1);

						Location loc2 = armorStand2.getLocation();
						loc2.setYaw(armorStand2.getLocation().getYaw() + 30);
						loc2.setY(loc2.getY() - 0.1);
						armorStand2.teleport(loc2);

						Location loc3 = armorStand3.getLocation();
						loc3.setYaw(armorStand3.getLocation().getYaw() + 30);
						loc3.setY(loc3.getY() - 0.1);
						armorStand3.teleport(loc3);

						Location loc4 = armorStand4.getLocation();
						loc4.setYaw(armorStand4.getLocation().getYaw() + 30);
						loc4.setY(loc4.getY() - 0.1);
						armorStand4.teleport(loc4);

						Location loc5 = armorStand5.getLocation();
						loc5.setYaw(armorStand5.getLocation().getYaw() + 30);
						loc5.setY(loc5.getY() - 0.1);
						armorStand5.teleport(loc5);

						Location loc6 = armorStand6.getLocation();
						loc6.setYaw(armorStand6.getLocation().getYaw() + 30);
						loc6.setY(loc6.getY() - 0.1);
						armorStand6.teleport(loc6);

						Location loc7 = armorStand7.getLocation();
						loc7.setYaw(armorStand7.getLocation().getYaw() + 30);
						loc7.setY(loc7.getY() - 0.1);
						armorStand7.teleport(loc7);

						Location loc8 = armorStand8.getLocation();
						loc8.setYaw(armorStand8.getLocation().getYaw() + 30);
						loc8.setY(loc8.getY() - 0.1);
						armorStand8.teleport(loc8);
						
						i1++;

						if (i1 >= 35) {
							Bukkit.getScheduler().cancelTask(armorstands1);
							armorStand1.remove();
							loc1.add(0, 2, 0).getBlock().setType(Material.CHEST);

							armorStand2.remove();

							loc2.add(0, 2, 0).getBlock().setType(Material.CHEST); p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);
							p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);
							armorStand3.remove();
							Block Chest3 = loc3.add(0, 2, 0).getBlock();
							Chest3.setType(Material.CHEST);
							BlockState chest3State = Chest3.getState();
							chest3State.setData(new Chest(BlockFace.WEST)); //
							chest3State.update();

							armorStand4.remove();
							Block Chest4 = loc4.add(0, 2, 0).getBlock();
							Chest4.setType(Material.CHEST);
							BlockState chest4State = Chest4.getState();
							chest4State.setData(new Chest(BlockFace.WEST)); //
							chest4State.update();

							armorStand5.remove();
							Block Chest5 = loc5.add(0, 2, 0).getBlock();
							Chest5.setType(Material.CHEST);
							BlockState chest5State = Chest5.getState();
							chest5State.setData(new Chest(BlockFace.SOUTH));
							chest5State.update();

							armorStand6.remove();
							Block Chest6 = loc6.add(0, 2, 0).getBlock();
							Chest6.setType(Material.CHEST);
							BlockState chest6State = Chest6.getState();
							chest6State.setData(new Chest(BlockFace.SOUTH));
							chest6State.update();

							armorStand7.remove();
							Block Chest7 = loc7.add(0, 2, 0).getBlock();
							Chest7.setType(Material.CHEST);
							BlockState chest7State = Chest7.getState();
							chest7State.setData(new Chest(BlockFace.EAST)); //
							chest7State.update();

							armorStand8.remove();
							Block Chest8 = loc8.add(0, 2, 0).getBlock();
							Chest8.setType(Material.CHEST);
							BlockState chest8State = Chest8.getState();
							chest8State.setData(new Chest(BlockFace.EAST)); //
							chest8State.update();

						}
					}
				}, 0L, 1L);

	}

	public static int i2;
	public static int armorstands2;

	@SuppressWarnings("deprecation")
	public static void SpawnBasicCrate2(Player p) {
		CratesOpen.CrateOpen.add(p);
		CratesOpen.CratesOpen.put(p, 5);

		ItemStack chest = new ItemStack(Material.CHEST);

		ArmorStand armorStand1 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);
		armorStand1.setHelmet(chest);
		armorStand1.setVisible(false);
		armorStand1.setGravity(false);

		ArmorStand armorStand2 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);

		armorStand2.setHelmet(chest);
		armorStand2.setVisible(false);
		armorStand2.setGravity(false);

		ArmorStand armorStand3 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand3.setHelmet(chest);
		armorStand3.setVisible(false);
		armorStand3.setGravity(false);

		ArmorStand armorStand4 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand4.setHelmet(chest);
		armorStand4.setVisible(false);
		armorStand4.setGravity(false);

		ArmorStand armorStand5 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);
		armorStand5.setHelmet(chest);
		armorStand5.setVisible(false);
		armorStand5.setGravity(false);

		ArmorStand armorStand6 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);

		armorStand6.setHelmet(chest);
		armorStand6.setVisible(false);
		armorStand6.setGravity(false);

		ArmorStand armorStand7 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand7.setHelmet(chest);
		armorStand7.setVisible(false);
		armorStand7.setGravity(false);

		ArmorStand armorStand8 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand8.setHelmet(chest);
		armorStand8.setVisible(false);
		armorStand8.setGravity(false);

		i2 = 0;
		armorstands2 = Bukkit.getScheduler().scheduleSyncRepeatingTask(HubCore.getPlugin(HubCore.class),
				new BukkitRunnable() {

					@Override
					public void run() {
						Location loc1 = armorStand1.getLocation();
						loc1.setYaw(armorStand1.getLocation().getYaw() + 30);
						loc1.setY(loc1.getY() - 0.1);
						armorStand1.teleport(loc1);

						Location loc2 = armorStand2.getLocation();
						loc2.setYaw(armorStand2.getLocation().getYaw() + 30);
						loc2.setY(loc2.getY() - 0.1);
						armorStand2.teleport(loc2);

						Location loc3 = armorStand3.getLocation();
						loc3.setYaw(armorStand3.getLocation().getYaw() + 30);
						loc3.setY(loc3.getY() - 0.1);
						armorStand3.teleport(loc3);

						Location loc4 = armorStand4.getLocation();
						loc4.setYaw(armorStand4.getLocation().getYaw() + 30);
						loc4.setY(loc4.getY() - 0.1);
						armorStand4.teleport(loc4);

						Location loc5 = armorStand5.getLocation();
						loc5.setYaw(armorStand5.getLocation().getYaw() + 30);
						loc5.setY(loc5.getY() - 0.1);
						armorStand5.teleport(loc5);

						Location loc6 = armorStand6.getLocation();
						loc6.setYaw(armorStand6.getLocation().getYaw() + 30);
						loc6.setY(loc6.getY() - 0.1);
						armorStand6.teleport(loc6);

						Location loc7 = armorStand7.getLocation();
						loc7.setYaw(armorStand7.getLocation().getYaw() + 30);
						loc7.setY(loc7.getY() - 0.1);
						armorStand7.teleport(loc7);

						Location loc8 = armorStand8.getLocation();
						loc8.setYaw(armorStand8.getLocation().getYaw() + 30);
						loc8.setY(loc8.getY() - 0.1);
						armorStand8.teleport(loc8);

						i2++;

						if (i2 >= 35) {
							Bukkit.getScheduler().cancelTask(armorstands2);
							armorStand1.remove();
							loc1.add(0, 2, 0).getBlock().setType(Material.CHEST);

							armorStand2.remove();
							loc2.add(0, 2, 0).getBlock().setType(Material.CHEST); p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);

							armorStand3.remove();
							Block Chest3 = loc3.add(0, 2, 0).getBlock();
							Chest3.setType(Material.CHEST);
							BlockState chest3State = Chest3.getState();
							chest3State.setData(new Chest(BlockFace.WEST)); //
							chest3State.update();

							armorStand4.remove();
							Block Chest4 = loc4.add(0, 2, 0).getBlock();
							Chest4.setType(Material.CHEST);
							BlockState chest4State = Chest4.getState();
							chest4State.setData(new Chest(BlockFace.WEST)); //
							chest4State.update();

							armorStand5.remove();
							Block Chest5 = loc5.add(0, 2, 0).getBlock();
							Chest5.setType(Material.CHEST);
							BlockState chest5State = Chest5.getState();
							chest5State.setData(new Chest(BlockFace.SOUTH));
							chest5State.update();

							armorStand6.remove();
							Block Chest6 = loc6.add(0, 2, 0).getBlock();
							Chest6.setType(Material.CHEST);
							BlockState chest6State = Chest6.getState();
							chest6State.setData(new Chest(BlockFace.SOUTH));
							chest6State.update();

							armorStand7.remove();
							Block Chest7 = loc7.add(0, 2, 0).getBlock();
							Chest7.setType(Material.CHEST);
							BlockState chest7State = Chest7.getState();
							chest7State.setData(new Chest(BlockFace.EAST)); //
							chest7State.update();

							armorStand8.remove();
							Block Chest8 = loc8.add(0, 2, 0).getBlock();
							Chest8.setType(Material.CHEST);
							BlockState chest8State = Chest8.getState();
							chest8State.setData(new Chest(BlockFace.EAST)); //
							chest8State.update();

						}
					}
				}, 0L, 1L);

	}
	
	public static int i3;
	public static int armorstands3;
	
	@SuppressWarnings("deprecation")
	public static void SpawnBasicCrate3(Player p) {
		CratesOpen.CrateOpen.add(p);
		CratesOpen.CratesOpen.put(p, 5);

		ItemStack chest = new ItemStack(Material.CHEST);

		ArmorStand armorStand1 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);
		armorStand1.setHelmet(chest);
		armorStand1.setVisible(false);
		armorStand1.setGravity(false);

		ArmorStand armorStand2 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);

		armorStand2.setHelmet(chest);
		armorStand2.setVisible(false);
		armorStand2.setGravity(false);

		ArmorStand armorStand3 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand3.setHelmet(chest);
		armorStand3.setVisible(false);
		armorStand3.setGravity(false);

		ArmorStand armorStand4 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand4.setHelmet(chest);
		armorStand4.setVisible(false);
		armorStand4.setGravity(false);

		ArmorStand armorStand5 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);
		armorStand5.setHelmet(chest);
		armorStand5.setVisible(false);
		armorStand5.setGravity(false);

		ArmorStand armorStand6 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);

		armorStand6.setHelmet(chest);
		armorStand6.setVisible(false);
		armorStand6.setGravity(false);

		ArmorStand armorStand7 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand7.setHelmet(chest);
		armorStand7.setVisible(false);
		armorStand7.setGravity(false);

		ArmorStand armorStand8 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand8.setHelmet(chest);
		armorStand8.setVisible(false);
		armorStand8.setGravity(false);

		i3 = 0;
		armorstands3 = Bukkit.getScheduler().scheduleSyncRepeatingTask(HubCore.getPlugin(HubCore.class),
				new BukkitRunnable() {

					@Override
					public void run() {
						Location loc1 = armorStand1.getLocation();
						loc1.setYaw(armorStand1.getLocation().getYaw() + 30);
						loc1.setY(loc1.getY() - 0.1);
						armorStand1.teleport(loc1);

						Location loc2 = armorStand2.getLocation();
						loc2.setYaw(armorStand2.getLocation().getYaw() + 30);
						loc2.setY(loc2.getY() - 0.1);
						armorStand2.teleport(loc2);

						Location loc3 = armorStand3.getLocation();
						loc3.setYaw(armorStand3.getLocation().getYaw() + 30);
						loc3.setY(loc3.getY() - 0.1);
						armorStand3.teleport(loc3);

						Location loc4 = armorStand4.getLocation();
						loc4.setYaw(armorStand4.getLocation().getYaw() + 30);
						loc4.setY(loc4.getY() - 0.1);
						armorStand4.teleport(loc4);

						Location loc5 = armorStand5.getLocation();
						loc5.setYaw(armorStand5.getLocation().getYaw() + 30);
						loc5.setY(loc5.getY() - 0.1);
						armorStand5.teleport(loc5);

						Location loc6 = armorStand6.getLocation();
						loc6.setYaw(armorStand6.getLocation().getYaw() + 30);
						loc6.setY(loc6.getY() - 0.1);
						armorStand6.teleport(loc6);

						Location loc7 = armorStand7.getLocation();
						loc7.setYaw(armorStand7.getLocation().getYaw() + 30);
						loc7.setY(loc7.getY() - 0.1);
						armorStand7.teleport(loc7);

						Location loc8 = armorStand8.getLocation();
						loc8.setYaw(armorStand8.getLocation().getYaw() + 30);
						loc8.setY(loc8.getY() - 0.1);
						armorStand8.teleport(loc8);

						i3++;

						if (i3 >= 35) {
							Bukkit.getScheduler().cancelTask(armorstands3);
							armorStand1.remove();
							loc1.add(0, 2, 0).getBlock().setType(Material.CHEST);

							armorStand2.remove();
							loc2.add(0, 2, 0).getBlock().setType(Material.CHEST); p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);

							armorStand3.remove();
							Block Chest3 = loc3.add(0, 2, 0).getBlock();
							Chest3.setType(Material.CHEST);
							BlockState chest3State = Chest3.getState();
							chest3State.setData(new Chest(BlockFace.WEST)); //
							chest3State.update();

							armorStand4.remove();
							Block Chest4 = loc4.add(0, 2, 0).getBlock();
							Chest4.setType(Material.CHEST);
							BlockState chest4State = Chest4.getState();
							chest4State.setData(new Chest(BlockFace.WEST)); //
							chest4State.update();

							armorStand5.remove();
							Block Chest5 = loc5.add(0, 2, 0).getBlock();
							Chest5.setType(Material.CHEST);
							BlockState chest5State = Chest5.getState();
							chest5State.setData(new Chest(BlockFace.SOUTH));
							chest5State.update();
							
							armorStand6.remove();
							Block Chest6 = loc6.add(0, 2, 0).getBlock();
							Chest6.setType(Material.CHEST);
							BlockState chest6State = Chest6.getState();
							chest6State.setData(new Chest(BlockFace.SOUTH));
							chest6State.update();

							armorStand7.remove();
							Block Chest7 = loc7.add(0, 2, 0).getBlock();
							Chest7.setType(Material.CHEST);
							BlockState chest7State = Chest7.getState();
							chest7State.setData(new Chest(BlockFace.EAST)); //
							chest7State.update();

							armorStand8.remove();
							Block Chest8 = loc8.add(0, 2, 0).getBlock();
							Chest8.setType(Material.CHEST);
							BlockState chest8State = Chest8.getState();
							chest8State.setData(new Chest(BlockFace.EAST)); //
							chest8State.update();

						}
					}
				}, 0L, 1L);

	}
	
	public static int i4;
	public static int armorstands4;
	
	@SuppressWarnings("deprecation")
	public static void SpawnBasicCrate4(Player p) {
		CratesOpen.CrateOpen.add(p);
		CratesOpen.CratesOpen.put(p, 5);

		ItemStack chest = new ItemStack(Material.CHEST);

		ArmorStand armorStand1 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);
		armorStand1.setHelmet(chest);
		armorStand1.setVisible(false);
		armorStand1.setGravity(false);

		ArmorStand armorStand2 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 2), ArmorStand.class);

		armorStand2.setHelmet(chest);
		armorStand2.setVisible(false);
		armorStand2.setGravity(false);

		ArmorStand armorStand3 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand3.setHelmet(chest);
		armorStand3.setVisible(false);
		armorStand3.setGravity(false);

		ArmorStand armorStand4 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand4.setHelmet(chest);
		armorStand4.setVisible(false);
		armorStand4.setGravity(false);

		ArmorStand armorStand5 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);
		armorStand5.setHelmet(chest);
		armorStand5.setVisible(false);
		armorStand5.setGravity(false);

		ArmorStand armorStand6 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() + 1,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 2), ArmorStand.class);

		armorStand6.setHelmet(chest);
		armorStand6.setVisible(false);
		armorStand6.setGravity(false);

		ArmorStand armorStand7 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() - 1), ArmorStand.class);

		armorStand7.setHelmet(chest);
		armorStand7.setVisible(false);
		armorStand7.setGravity(false);

		ArmorStand armorStand8 = p.getWorld().spawn(new Location(p.getWorld(), p.getLocation().getX() - 2,
				p.getLocation().getY() + 2, p.getLocation().getZ() + 1), ArmorStand.class);

		armorStand8.setHelmet(chest);
		armorStand8.setVisible(false);
		armorStand8.setGravity(false);

		i4 = 0;
		armorstands4 = Bukkit.getScheduler().scheduleSyncRepeatingTask(HubCore.getPlugin(HubCore.class),
				new BukkitRunnable() {

					@Override
					public void run() {
						Location loc1 = armorStand1.getLocation();
						loc1.setYaw(armorStand1.getLocation().getYaw() + 30);
						loc1.setY(loc1.getY() - 0.1);
						armorStand1.teleport(loc1);

						Location loc2 = armorStand2.getLocation();
						loc2.setYaw(armorStand2.getLocation().getYaw() + 30);
						loc2.setY(loc2.getY() - 0.1);
						armorStand2.teleport(loc2);

						Location loc3 = armorStand3.getLocation();
						loc3.setYaw(armorStand3.getLocation().getYaw() + 30);
						loc3.setY(loc3.getY() - 0.1);
						armorStand3.teleport(loc3);

						Location loc4 = armorStand4.getLocation();
						loc4.setYaw(armorStand4.getLocation().getYaw() + 30);
						loc4.setY(loc4.getY() - 0.1);
						armorStand4.teleport(loc4);

						Location loc5 = armorStand5.getLocation();
						loc5.setYaw(armorStand5.getLocation().getYaw() + 30);
						loc5.setY(loc5.getY() - 0.1);
						armorStand5.teleport(loc5); 

						Location loc6 = armorStand6.getLocation();
						loc6.setYaw(armorStand6.getLocation().getYaw() + 30);
						loc6.setY(loc6.getY() - 0.1);
						armorStand6.teleport(loc6);

						Location loc7 = armorStand7.getLocation();
						loc7.setYaw(armorStand7.getLocation().getYaw() + 30);
						loc7.setY(loc7.getY() - 0.1);
						armorStand7.teleport(loc7);

						Location loc8 = armorStand8.getLocation();
						loc8.setYaw(armorStand8.getLocation().getYaw() + 30);
						loc8.setY(loc8.getY() - 0.1);
						armorStand8.teleport(loc8);

						i4++;

						if (i4 >= 35) {
							Bukkit.getScheduler().cancelTask(armorstands4);
							armorStand1.remove();
							loc1.add(0, 2, 0).getBlock().setType(Material.CHEST);

							armorStand2.remove();
							loc2.add(0, 2, 0).getBlock().setType(Material.CHEST); p.playSound(p.getLocation(), Sound.ENTITY_BLAZE_HURT, 100, 1);

							armorStand3.remove();
							Block Chest3 = loc3.add(0, 2, 0).getBlock();
							Chest3.setType(Material.CHEST);
							BlockState chest3State = Chest3.getState();
							chest3State.setData(new Chest(BlockFace.WEST)); //
							chest3State.update();

							armorStand4.remove();
							Block Chest4 = loc4.add(0, 2, 0).getBlock();
							Chest4.setType(Material.CHEST);
							BlockState chest4State = Chest4.getState();
							chest4State.setData(new Chest(BlockFace.WEST)); //
							chest4State.update();

							armorStand5.remove();
							Block Chest5 = loc5.add(0, 2, 0).getBlock();
							Chest5.setType(Material.CHEST);
							BlockState chest5State = Chest5.getState();
							chest5State.setData(new Chest(BlockFace.SOUTH));
							chest5State.update();
							
							armorStand6.remove();
							Block Chest6 = loc6.add(0, 2, 0).getBlock();
							Chest6.setType(Material.CHEST);
							BlockState chest6State = Chest6.getState();
							chest6State.setData(new Chest(BlockFace.SOUTH));
							chest6State.update();

							armorStand7.remove();
							Block Chest7 = loc7.add(0, 2, 0).getBlock();
							Chest7.setType(Material.CHEST);
							BlockState chest7State = Chest7.getState();
							chest7State.setData(new Chest(BlockFace.EAST)); //
							chest7State.update();

							armorStand8.remove();
							Block Chest8 = loc8.add(0, 2, 0).getBlock();
							Chest8.setType(Material.CHEST);
							BlockState chest8State = Chest8.getState();
							chest8State.setData(new Chest(BlockFace.EAST)); //
							chest8State.update();

						}
					}
				}, 0L, 1L);

	}
}
