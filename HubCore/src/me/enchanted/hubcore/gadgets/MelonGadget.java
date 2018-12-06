package me.enchanted.hubcore.gadgets;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import me.enchanted.hubcore.HubCore;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

@SuppressWarnings("deprecation")
public class MelonGadget implements Listener {

	@EventHandler
	public void onThrow(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if (!_GadgetsTimeLeft.mlntl.containsKey(p)) {
			_GadgetsTimeLeft.mlntl.put(p, 3);
		} else if (_GadgetsTimeLeft.mlntl.get(p) <= 0) {
			
			_GadgetsTimeLeft.mlntl.put(p, 5);
			if (p.getItemInHand().getType() != Material.MELON_BLOCK)
				return;
			
			if (!p.getItemInHand().hasItemMeta())
				return;
			
			if (!p.getItemInHand().getItemMeta().hasDisplayName())
				return;
			
			if (!p.getItemInHand().getItemMeta().getDisplayName().equals("Melon Gadget"))
				return;

			
			if (HubCore.getPlugin(HubCore.class).getConfig()
					.getInt("crates." + p.getUniqueId().toString() + ".melonGadget") >= 1) {

				
				Vector v = p.getLocation().getDirection();
				FallingBlock fb = p.getWorld().spawnFallingBlock(p.getLocation().add(new Vector(0, 2, 0)),
						Material.MELON_BLOCK, (byte) 0);
				fb.setDropItem(false);

				fb.setVelocity(v.multiply(1.4));

				new BukkitRunnable() {

					@Override
					public void run() {
						if (fb.getLocation().subtract(0, 0.5, 0).getBlock().getType() != Material.AIR) {
							fb.remove();

							double rInt = +-4 + Math.random() * (4 - -4);
							double rInt2 = +-4 + Math.random() * (4 - -4);
							double rInt3 = +-4 + Math.random() * (4 - -4);
							double rInt4 = +-4 + Math.random() * (4 - -4);
							double rInt5 = +-4 + Math.random() * (4 - -4);

							Location fb1 = fb.getLocation().clone().add(new Vector(rInt5, 2, rInt));
							Location fb2 = fb.getLocation().clone().add(new Vector(rInt5, 2, rInt3));
							Location fb3 = fb.getLocation().clone().add(new Vector(rInt3, 2, rInt4));
							Location fb4 = fb.getLocation().clone().add(new Vector(rInt2, 2, rInt));
							Location fb5 = fb.getLocation().clone().add(new Vector(rInt, 2, rInt3));

							ItemStack m1 = new ItemStack(Material.SPECKLED_MELON);
							ItemStack m2 = new ItemStack(Material.SPECKLED_MELON);
							ItemStack m3 = new ItemStack(Material.SPECKLED_MELON);
							ItemStack m4 = new ItemStack(Material.SPECKLED_MELON);
							ItemStack m5 = new ItemStack(Material.SPECKLED_MELON);
							ItemMeta m1m = m1.getItemMeta();
							ItemMeta m2m = m2.getItemMeta();
							ItemMeta m3m = m3.getItemMeta();
							ItemMeta m4m = m4.getItemMeta();
							ItemMeta m5m = m5.getItemMeta();

							List<String> m1l = new ArrayList<>();
							List<String> m2l = new ArrayList<>();
							List<String> m3l = new ArrayList<>();
							List<String> m4l = new ArrayList<>();
							List<String> m5l = new ArrayList<>();

							m1l.add(rInt + "");
							m2l.add(rInt2 + "");
							m3l.add(rInt3 + "");
							m4l.add(rInt4 + "");
							m5l.add(rInt5 + "");

							m1m.setLore(m1l);
							m2m.setLore(m2l);
							m3m.setLore(m3l);
							m4m.setLore(m4l);
							m5m.setLore(m5l);

							m1.setItemMeta(m1m);
							m2.setItemMeta(m2m);
							m3.setItemMeta(m3m);
							m4.setItemMeta(m4m);
							m5.setItemMeta(m5m);

							p.getWorld().dropItem(fb1, m1);
							p.getWorld().dropItem(fb2, m2);
							p.getWorld().dropItem(fb3, m3);
							p.getWorld().dropItem(fb4, m4);
							p.getWorld().dropItem(fb5, m5);
							fb.getLocation().add(0, 0.5, 0);
							this.cancel();
						}

					}
				}.runTaskTimer(HubCore.getPlugin(HubCore.class), 0L, 1L);

				int melonGadgets = HubCore.getPlugin(HubCore.class).getConfig()
						.getInt("crates." + p.getUniqueId().toString() + ".melonGadget");
				int newMelonGadgets = melonGadgets - 1;
				HubCore.getPlugin(HubCore.class).getConfig()
						.set("crates." + p.getUniqueId().toString() + ".melonGadget", newMelonGadgets);
				HubCore.getPlugin(HubCore.class).saveConfig();
			}
		}
	}

	@EventHandler
	public void onPickUp(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		if (e.getItem().getItemStack().getType() != Material.SPECKLED_MELON)
			return;
		e.setCancelled(true);
		e.getItem().remove();
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 2));

	}

}
