package structural.flyweight;

public class Terrorist implements Player{

	private final String task;
	private String weapon;
	
	public Terrorist() {
		this.task = "Task To deploy Bomb";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("Terrorist Created. Task is-" + task + ". Having weapon-" + weapon);
	}

	
}
