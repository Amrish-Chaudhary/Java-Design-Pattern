package creational.factory;

public class DigitalLaptopCreator extends ComputerCreator{

	@Override
	public Computer createComputer() {
		return new DigitalLaptop();
	}

}
