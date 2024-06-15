package structural.adaptor;

public class FrenchMessageAdaptorClassVersion extends FrenchMessage implements LocalizedMessage {

	@Override
	public void sayHello() {
		sayBonjour();
	}

}
