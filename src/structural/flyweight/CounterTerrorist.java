package structural.flyweight;

public class CounterTerrorist implements Player{

	private final String task;
	private String weapon;
	
	public CounterTerrorist() {
		this.task = "Task To defuse Bomb";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void mission() {
		System.out.println("Counter-Terrorist Created. Task is-" + task + ". Having weapon-" + weapon);
	}

	
}
