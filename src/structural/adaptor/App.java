package structural.adaptor;

public class App {

	public static void main(String[] args) {
		LocalizedMessage englishMessage = new EnglishMessage();
		Greeting greeting = new Greeting(englishMessage);
		greeting.printMessage();
		
		LocalizedMessage frenchMessage = new FrenchMessageAdaptorClassVersion();
		Greeting greeting2 = new Greeting(frenchMessage);
		greeting2.printMessage();
		
		LocalizedMessage frenchMessage2 = new FrenchMessageAdaptorObjectVersion();
		Greeting greeting3 = new Greeting(frenchMessage2);
		greeting3.printMessage();
	}
}
