package zone.luaq.multi.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EventsClass implements Listener {

	@EventHandler
	public void eventFunction(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		player.sendMessage("Hello there! Welcome to the server.");
	}
	
	// You can add as many events as you possibly can to this class. All events can be found here: https://jd.bukkit.org/
	
}
