package hu.bendi.sven.utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtils {

	public static void sendMessage(Player p, String msg) {
		p.sendMessage(getPrefix() + msg);
	}
	
	public static String getPrefix() {
		return ChatColor.DARK_GRAY+"["+ChatColor.WHITE+ChatColor.BOLD+"SKY"+ChatColor.YELLOW+"VILLAGE"+ChatColor.DARK_GRAY+"]"+ChatColor.RESET+" ";
	}
	
	public static void sendInfo(Player p) {
		p.sendMessage(getPrefix() + "Running SVEN v0.1");
	}
	
}
