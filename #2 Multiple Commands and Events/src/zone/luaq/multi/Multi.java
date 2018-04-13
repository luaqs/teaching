package zone.luaq.multi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import zone.luaq.multi.commands.CommandOne;
import zone.luaq.multi.commands.CommandTwo;
import zone.luaq.multi.events.EventsClass;

public class Multi extends JavaPlugin{

	public void onEnable() {
		getCommand("command1").setExecutor(new CommandOne(this));
		getCommand("command2").setExecutor(new CommandTwo(this));
		
		PluginManager pm = Bukkit.getPluginManager();
		// Same as Bukkit.getPluginManager().registerEvents(new EventsClass(), this);
		pm.registerEvents(new EventsClass(), this);
	}
	
	public String color(String s) {
		return ChatColor.translateAlternateColorCodes('&', s);
	}
	
}
