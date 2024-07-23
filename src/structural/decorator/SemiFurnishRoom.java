package structural.decorator;

public class SemiFurnishRoom extends RoomDecorator{

	public SemiFurnishRoom(Room room) {
		super(room);
	}

	@Override
	public void printFurniture() {
		super.printFurniture();
		System.out.println("Room has Light, Fan");
		System.out.println("Room has all Bath fittings");
		System.out.println("Room has basic furniture");
	}
	

}
