package me.enchanted.hubcore.particles;

import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class WolfTail {

	static boolean x = true;
    static boolean o = false;

    public static boolean[][] shape = {
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, x, x, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, x, x, x, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, x, x, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, x, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o}};

    public static boolean[][] shape2 = {
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, x, o, o, o},
            {o, o, o, o, o, o, o, o, o, x, o, x, x, o, o, o},
            {o, o, o, o, o, o, o, o, x, x, x, x, x, o, o, o},
            {o, o, o, o, o, o, o, o, x, x, x, x, o, o, o, o},
            {o, o, o, o, o, o, o, o, x, x, x, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o}};
    
    public static boolean[][] shape3 = {
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, x, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, x, x, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, x, x, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, x, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o},
            {o, o, o, o, o, o, o, o, o, o, o, o, o, o, o, o}};
    
    public static void drawParticles(Location location) {
        double space = 0.20;
        double defX = location.getX()-1.1;
        double x = defX;
        double y = location.clone().getY() + 2.8;
        double z = location.getZ();
        double fire = -((location.getYaw() + 180) / 60);
        fire += (location.getYaw() < -180 ? 3.25 : 2.985);

        for (int i = 0; i < shape.length; i++) {
            for (int j = 0; j < shape[i].length; j++) {
                if (shape[i][j]) {

                	Location target = location.clone();
                	target.setX(x);
                	target.setY(y);
                	target.setZ(z);

                    Vector v = target.toVector().subtract(location.toVector());
                    Vector v2 = getBackVector(location);
                    v = rotateAroundAxisY(v, fire);
                    v2.setY(0).multiply(-0.05);

                    location.add(v);
                    location.add(v2);
                    for (int k = 0; k < 3; k++)
                    	location.getWorld().spawnParticle(Particle.FLAME, location.getX(), location.getY(), location.getZ(), 0, 0, 0, 0, 0);
                    location.subtract(v2);
                    location.subtract(v);
                }
                x += space;
            }
            y -= space;
            z -= 0.05f;
            x = defX;
        }
        
        double space2 = 0.20;
        double defX2 = location.getX()-1.1;
        double x2 = defX2;
        double y2 = location.clone().getY() + 2.8;
        double z2 = location.getZ();
        double fire2 = -((location.getYaw() + 180) / 60);
        fire2 += (location.getYaw() < -180 ? 3.25 : 2.985);
        for (int i = 0; i < shape2.length; i++) {
            for (int j = 0; j < shape2[i].length; j++) {
                if (shape2[i][j]) {

                	Location target = location.clone();
                	target.setX(x2);
                	target.setY(y2);
                	target.setZ(z2);

                    Vector v = target.toVector().subtract(location.toVector());
                    Vector v2 = getBackVector(location);
                    v = rotateAroundAxisY(v, fire2);
                    v2.setY(0).multiply(-0.05);

                    location.add(v);
                    location.add(v2);
                    for (int k = 0; k < 3; k++)
                    	location.getWorld().spawnParticle(Particle.REDSTONE, location.getX(), location.getY(), location.getZ(), 0, 125/255, 125/255, 125/255, 0);
                    location.subtract(v2);
                    location.subtract(v);
                }
                x2 += space2;
            }
            y2 -= space2;
            z2 -= 0.05f;
            x2 = defX2;
        }
        
        double space3 = 0.20;
        double defX3 = location.getX()-1.1;
        double x3 = defX3;
        double y3 = location.clone().getY() + 2.8;
        double z3 = location.getZ();
        double fire3 = -((location.getYaw() + 180) / 60);
        fire3 += (location.getYaw() < -180 ? 3.25 : 2.985);
        for (int i = 0; i < shape3.length; i++) {
            for (int j = 0; j < shape3[i].length; j++) {
                if (shape3[i][j]) {

                	Location target = location.clone();
                	target.setX(x3);
                	target.setY(y3);
                	target.setZ(z3);

                    Vector v = target.toVector().subtract(location.toVector());
                    Vector v2 = getBackVector(location);
                    v = rotateAroundAxisY(v, fire3);
                    v2.setY(0).multiply(-0.05);

                    location.add(v);
                    location.add(v2);
                    for (int k = 0; k < 3; k++)
                    	location.getWorld().spawnParticle(Particle.FLAME, location.getX(), location.getY(), location.getZ(), 0, 0, 0, 0, 0);
                    location.subtract(v2);
                    location.subtract(v);
                }
                x3 += space3;
            }
            y3 -= space3;
            z3 -= 0.05f;
            x3 = defX3;
        }
    }

    public static Vector rotateAroundAxisY(Vector v, double fire) {
        double x, z, cos, sin;
        cos = Math.cos(fire);
        sin = Math.sin(fire);
        x = v.getX() * cos + v.getZ() * sin;
        z = v.getX() * -sin + v.getZ() * cos;
        return v.setX(x).setZ(z);
    }

    public static Vector getBackVector(Location loc) {
        final float newZ = (float) (loc.getZ() + (1 * Math.sin(Math.toRadians(loc.getYaw() + 90 * 1))));
        final float newX = (float) (loc.getX() + (1 * Math.cos(Math.toRadians(loc.getYaw() + 90 * 1))));
        return new Vector(newX - loc.getX(), 0, newZ - loc.getZ());
    }
}
