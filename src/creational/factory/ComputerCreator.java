package creational.factory;

public abstract class ComputerCreator {
	
	public abstract Computer createComputer();
	
	public Computer getComputer() {
		Computer computer = createComputer();
		computer.upgradeRam();
		computer.encryptHardDisk();
		System.out.println(computer.toString());
		return computer;
	}
	
}
