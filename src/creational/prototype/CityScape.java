package creational.prototype;

import java.util.List;

public class CityScape {
	
	public static void main(String[] args) {
		BuildingType buildingType = new BuildingType("LowRise Floors");
		Building building1 = new Building(10, buildingType);
		Building building2 = building1.clone();
		Building building3 = building1.clone();
		Building building4 = building1.clone();
		Building building5 = building1.clone();
		List<Building> lowRise = List.of(building1, building2, building3, building4, building5);
		buildingType.setType("High-Rise Tower");
		
		Building building11 = new Building(10, buildingType);
		Building building12 = building11.clone();
		Building building13 = building11.clone();
		Building building14 = building11.clone();
		Building building15 = building11.clone();
		List<Building> highRise = List.of(building11, building12, building13, building14, building15);
		System.out.println(lowRise.toString());
		System.out.println(highRise.toString());
	}

}
