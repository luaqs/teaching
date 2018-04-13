package zone.luaq.multi.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import zone.luaq.multi.Multi;

public class CommandTwo implements CommandExecutor {

	// Instance of the Main Class
	private Multi plugin;
	// Constructor
	public CommandTwo(Multi plugin) {
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] args) {
		if(!(sender instanceof Player)) return false;
		Player player = (Player) sender;
		
		player.sendMessage(plugin.color("This is the &csecond command!"));
		
		return true;
	}

}
