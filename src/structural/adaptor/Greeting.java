package structural.adaptor;

public class Greeting {

	private final LocalizedMessage localizedMessage;

	public Greeting(LocalizedMessage localizedMessage) {
		this.localizedMessage = localizedMessage;
	}
	
	public void printMessage() {
		localizedMessage.sayHello();
	}
	
	
}
