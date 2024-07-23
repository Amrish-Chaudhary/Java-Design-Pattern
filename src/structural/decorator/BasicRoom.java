package structural.decorator;

public class BasicRoom implements Room{

	@Override
	public void printFurniture() {
		System.out.println("Basic Wooden Flooring");
		System.out.println("All Wall Painted");
	}

}
