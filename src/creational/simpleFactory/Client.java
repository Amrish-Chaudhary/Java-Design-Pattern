package creational.simpleFactory;

public class Client {

	public static void main(String[] args) {
		Message message = MessageFactory.getMessage("plain_Message");
		System.out.println(message.toString());
		Message message2 = MessageFactory.getMessage("digital_Message");
		System.out.println(message2.toString());
	}
}
