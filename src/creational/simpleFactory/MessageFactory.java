package creational.simpleFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class MessageFactory {

	public static Message getMessage(String type) {
		
//		switch (type.toUpperCase()) {
//		case "PLAIN_MESSAGE":
//			return new PlainMessage();
//		case "DIGITAL_MESSAGE":
//			return new DigitalMessage();
//		default:
//			throw new IllegalArgumentException("Message type nof found");
//		}
		
		if(messageType.containsKey(type.toUpperCase())) 
			return messageType.get(type.toUpperCase()).get();
		else throw new IllegalArgumentException("Message type not exist");
	}
	
	public static final Map<String, Supplier<Message>> messageType = new HashMap<>();
	
	static {
		messageType.put("PLAIN_MESSAGE", PlainMessage::new);
		messageType.put("DIGITAL_MESSAGE", DigitalMessage::new);
	}
}
