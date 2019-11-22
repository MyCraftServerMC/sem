package hu.bendi.sven;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import hu.bendi.sven.commands.EventCommand;
import hu.bendi.sven.utils.ChatUtils;

public class Sven extends JavaPlugin {
	
	
	
	@Override
	public void onEnable() {
		System.out.println(ChatUtils.getPrefix()+"/--------------[SVEN]---------------\\");
		System.out.println(ChatUtils.getPrefix()+"|                                   |");
		System.out.println(ChatUtils.getPrefix()+"|          Loadin SVEN...           |");
		System.out.println(ChatUtils.getPrefix()+"|                                   |");
		System.out.println(ChatUtils.getPrefix()+"\\--------------[Done]--------------/");
	}
	
	@Override
	public void onDisable() {
		System.out.println(ChatUtils.getPrefix()+"/--------------[SVEN]---------------\\");
		System.out.println(ChatUtils.getPrefix()+"|                                   |");
		System.out.println(ChatUtils.getPrefix()+"|        Disableing SVEN...         |");
		System.out.println(ChatUtils.getPrefix()+"|                                   |");
		System.out.println(ChatUtils.getPrefix()+"\\--------------[Done]--------------/");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		switch (command.getName()) {
			case "sven":
				System.out.println(ChatColor.YELLOW+"[SVEN] "+ ChatColor.RESET+ "Info requested by: "+sender.getName());
				ChatUtils.sendInfo((Player)sender);
				break;
			case "event":
				if ((args.length == 0)|| (args ==null)) {
					EventCommand.sendHelp(sender,args);
				}else {
					EventCommand.process((Player) sender, args);
				}
				
				break;
		}
		return false;
	}
	
	public Sven getInstance() {
		return this;
	}

}
