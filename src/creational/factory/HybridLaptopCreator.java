package creational.factory;

public class HybridLaptopCreator extends ComputerCreator{

	@Override
	public Computer createComputer() {
		return new HybridLaptop();
	}

}
