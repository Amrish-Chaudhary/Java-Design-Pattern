package structural.adaptor;

public class FrenchMessageAdaptorObjectVersion implements LocalizedMessage {

	private final FrenchMessage frenchMessage;
	
	
	public FrenchMessageAdaptorObjectVersion() {
		this.frenchMessage = new FrenchMessage();
	}


	@Override
	public void sayHello() {
		frenchMessage.sayBonjour();
	}

}
