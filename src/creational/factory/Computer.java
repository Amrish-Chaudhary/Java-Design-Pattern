package creational.factory;

public abstract class Computer {

	public int Ram = 2;
	public String Brand;
	public int Storage = 250;
	public String Storage_Type = "HDD";
	public String Computer_Type = "Basic";
	
	public abstract String getConfiguration();
	
	public void upgradeRam() {
		Ram = Ram*2;
		System.out.println("Ram has been updated");
	}
	
	public void encryptHardDisk() {
		System.out.println("done");
	}
}
