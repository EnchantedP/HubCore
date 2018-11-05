package me.enchanted.hubcore.stats;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class ScoreboardStats {

	public static void setScoreBoard(Player p) {
        Scoreboard board = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective obj = board.registerNewObjective("ServerName", "dummy");
        obj.setDisplaySlot(DisplaySlot.SIDEBAR);
        obj.setDisplayName("§4---=== §5ESBlock §4===---");
        
        Score blank4 = obj.getScore("§8»§4");
        blank4.setScore(10);
        
        Score serverTitle = obj.getScore("§8» §6§lServer");
        serverTitle.setScore(9);
        
        Score serverName = obj.getScore("§8» §eHub");
        serverName.setScore(8);
        
        Score blank3 = obj.getScore("§8»§3");
        blank3.setScore(7);
        
        
        Score onlineName = obj.getScore("§8» §3§lOnline");
        onlineName.setScore(6);
        
        Team onlineCounter = board.registerNewTeam("onlineCounter");
        
        onlineCounter.addEntry("§0" + "§f");
        
        if(Bukkit.getOnlinePlayers().size() == 0) 
        {
            board.getTeam("onlineCounter").setPrefix("§8» §60" + "§8/§e" + Bukkit.getServer().getMaxPlayers());
        } 
        else 
        {
            board.getTeam("onlineCounter").setPrefix("§8» §e" + Bukkit.getOnlinePlayers().size() + "§8/§e" +  Bukkit.getServer().getMaxPlayers());
        }
        
        obj.getScore("§0" + "§f").setScore(5);
        
        Score blank2 = obj.getScore("§8»§2");
        blank2.setScore(4);
        
        Score crate = obj.getScore("§8» §9§lCrate Pieces");
        crate.setScore(3);

        Team chestPiecesCounter = board.registerNewTeam("cratePCounter");
        chestPiecesCounter.addEntry("§c" + "§f");
        chestPiecesCounter.setPrefix("§8» " );
        obj.getScore("§c" + "§f").setScore(2);
        
        Score blank1 = obj.getScore("§8»§1");
        blank1.setScore(1);
        
        p.setScoreboard(board);
  }
}
