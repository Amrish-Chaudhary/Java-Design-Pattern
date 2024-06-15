package creational.factory;

public class Client {

	public static void main(String[] args) {
		createComputer(new DigitalLaptopCreator()); 
		createComputer(new HybridLaptopCreator());
	}
	
	public static void createComputer(ComputerCreator computerCreator) {
		computerCreator.getComputer();
	}
	
}
