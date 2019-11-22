package hu.bendi.sven.manager;

import org.bukkit.Bukkit;

import hu.bendi.sven.Sven;
import hu.skyvillage.skycore.db.Database;

public class EventManager {

	Database db = new Database();
	
	@SuppressWarnings("deprecation")
	public void create(String name) {
		int id = Integer.getInteger(db.get("events/count"));
		
		Bukkit.getScheduler().runTaskLater(new Sven().getInstance(), new Runnable() {

			@Override
			public void run() {
				System.out.println(id);
				db.set("events/count", "" + id + 1);
				db.set("events/"+name.toLowerCase()+"/name", name);
				db.set("events/"+name.toLowerCase()+"/id", ""+id);
			}
			
		},30L);
		
	}
}
