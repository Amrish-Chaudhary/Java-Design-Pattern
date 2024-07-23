package structural.decorator;

public class FullFurnishRoom extends RoomDecorator{

	public FullFurnishRoom(Room room) {
		super(room);
	}

	@Override
	public void printFurniture() {
		super.printFurniture();
		System.out.println("Room has TV, AC");
		System.out.println("Room has Washing Machine fitted in WashRoom");
		System.out.println("Room has all nesseray furniture");
	}
	

}
