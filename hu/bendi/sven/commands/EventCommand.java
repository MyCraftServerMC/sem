package hu.bendi.sven.commands;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import hu.bendi.sven.manager.EventManager;
import hu.bendi.sven.utils.ChatUtils;

public class EventCommand {
	
	private final static String HELP = 
	"SEM Help Page 1/1 \n"+
	"/event create (name) [type]   creates an event.";
	
	private static EventManager man = new EventManager();
	
	
	public static void sendHelp(CommandSender sender,String[] args) {
		ChatUtils.sendMessage((Player)sender, HELP);
	}
	
	public static void sendHelp(Player p) {
		ChatUtils.sendMessage(p, HELP);
	}
	
	public static void process(Player p, String[] args) {
		switch (args[0]) {
			case "create": 
				if (args.length < 2) {
					sendHelp(p);
				}else {
					if (args.length < 3) {
						man.create(args[1]);
					} else {
						man.create(args[1]);
						//ChatUtils.sendMessage(p, "Not implemented");
					}
				}
			break;
		}
	}
}
