package me.enchanted.hubcore.particles;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class WolfTail {

	public static void createwolfTail(Player p){
		Vector temp = p.getLocation().getDirection().multiply(-0.5);
		temp.setY(0);
		p.spawnParticle(Particle.REDSTONE, loc.getDirection().subtract(0,1,0), y, z, count, offsetX, offsetY, offsetZ, extra, data);
	}
}
