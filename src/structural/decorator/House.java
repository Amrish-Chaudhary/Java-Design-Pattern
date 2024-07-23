package structural.decorator;

public class House {
	
	public static void main(String[] args) {
		// Create Empty Room
		System.out.println("..........Basic-Room................");
		Room room = new BasicRoom();
		room.printFurniture();
		System.out.println("..........Semi-Furnish-Room................");
		room = new SemiFurnishRoom(room);
		room.printFurniture();
		System.out.println("..........Full-Furnish-Room................");		
		room = new FullFurnishRoom(room);
		room.printFurniture();
		System.out.println("..........................");
	}
}
