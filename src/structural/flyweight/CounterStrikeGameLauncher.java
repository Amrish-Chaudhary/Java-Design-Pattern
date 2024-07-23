package structural.flyweight;

import java.util.Random;

public class CounterStrikeGameLauncher {

	private static String[] playerType = {"Terrorist", "CounterTerrorist"};
	private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
		Player player = PlayerGenerator.generatePlayer(getRandomPlayerType());
		player.mission();
		player.assignWeapon(getWeaponsType());
		player.mission();
		System.out.println("hashcode= " + player.hashCode());
		}
		
	}
	private static String getRandomPlayerType() {
		Random random = new Random();
		int index = random.nextInt(playerType.length);
		return playerType[index];
	}
	
	private static String getWeaponsType() {
		Random random = new Random();
		int index = random.nextInt(weapons.length);
		return weapons[index];
	}
}
