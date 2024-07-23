package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PlayerGenerator {

	public static final Map<String, Player> PLAYERCACHE = new HashMap<>();
	
	public static Player generatePlayer(String playerType) {
		if (PLAYERCACHE.containsKey(playerType))
			return PLAYERCACHE.get(playerType);
		else {
			if(playerType.equalsIgnoreCase("Terrorist")) {
				PLAYERCACHE.put(playerType, new Terrorist());
				return PLAYERCACHE.get(playerType);
			}
			else if(playerType.equalsIgnoreCase("CounterTerrorist")) {
				 PLAYERCACHE.put(playerType, new CounterTerrorist());
				 return PLAYERCACHE.get(playerType);
			}
		
		}
		return null;
	}
}
