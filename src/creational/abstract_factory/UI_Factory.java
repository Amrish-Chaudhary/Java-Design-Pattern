package creational.abstract_factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class UI_Factory {

	public static final Map<String, Supplier<UserInterface>> factoryMap = new HashMap<>();
	
	static {
		factoryMap.put("RED-UI", RedUserInterface::new);
		factoryMap.put("BLUE-UI", BlueUserInterface::new);
	}
	
	public static UserInterface getFactory(String color) {
		if(factoryMap.containsKey(color))
			return factoryMap.get(color).get();
		else throw new IllegalArgumentException("Invalid color, No UI found for this color");
	}
}
