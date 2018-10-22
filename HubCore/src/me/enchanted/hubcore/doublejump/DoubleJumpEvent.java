package me.enchanted.hubcore.doublejump;

import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class DoubleJumpEvent implements Listener {
	
	@SuppressWarnings("deprecation")
    @EventHandler
    public void onPlayerFly(PlayerToggleFlightEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() != GameMode.CREATIVE && p.getGameMode() != GameMode.SPECTATOR) {
            e.setCancelled(true);
            p.setAllowFlight(false);
            p.setFlying(false);
            p.setVelocity(p.getLocation().getDirection().multiply(2.0D).setY(0.9D));
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX(),p.getLocation().getY(),p.getLocation().getZ(), 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX(),p.getLocation().getY(),p.getLocation().getZ(), 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX()-0.3,p.getLocation().getY(),p.getLocation().getZ()-0.3, 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX()+0.3,p.getLocation().getY(),p.getLocation().getZ(), 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX()-0.3,p.getLocation().getY(),p.getLocation().getZ(), 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX()+0.3,p.getLocation().getY(),p.getLocation().getZ()+0.3, 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX(),p.getLocation().getY(),p.getLocation().getZ()-0.3, 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX(),p.getLocation().getY(),p.getLocation().getZ()+0.3, 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX()-0.3,p.getLocation().getY(),p.getLocation().getZ()+0.3, 10, 0.0d, 0.0d, 0.0d, 0.1d);
            p.spawnParticle(Particle.SNOWBALL, p.getLocation().getX()+0.3,p.getLocation().getY(),p.getLocation().getZ()-0.3, 10, 0.0d, 0.0d, 0.0d, 0.1d);
        }
    }

}
