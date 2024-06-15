package creational.abstract_factory;

public class App {

	public static void main(String[] args) {
		UserInterface redUI = UI_Factory.getFactory("RED-UI");
		UserInterface blueUI = UI_Factory.getFactory("BLUE-UI");
		
		System.out.println(redUI);
		System.out.println(blueUI);
	}
	
}
