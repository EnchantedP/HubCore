package me.enchanted.hubcore.bungeecord;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.bukkit.entity.Player;

import me.enchanted.hubcore.HubCore;

public class SendToBungeecord {

	public static void send(Player p, String channel, String command){
        ByteArrayOutputStream b = new ByteArrayOutputStream();
        DataOutputStream out = new DataOutputStream(b);
        try {
            out.writeUTF(channel);
            out.writeUTF(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        p.sendPluginMessage(HubCore.getPlugin(HubCore.class), "BungeeCord", b.toByteArray());
    }
}
