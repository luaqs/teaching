package zone.luaq.helloworld;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloWorld extends JavaPlugin implements CommandExecutor{

	public void onEnable() {
		getCommand("hello").setExecutor(this);
	}
	
	public String color(String string) {
		return ChatColor.translateAlternateColorCodes('&', string);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(!(sender instanceof Player)) return false;
		Player player = (Player) sender;
		
		player.sendMessage(color("&cHello &athere!"));
		
		return true;
		/*
		 *  True = The command worked
		 *  False = The command had an error, it will send a usage message to the CommandSender
		 */
	}
	
}
