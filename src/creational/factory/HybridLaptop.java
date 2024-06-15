package creational.factory;

public class HybridLaptop extends Computer{

	public String Brand = "HP LOGAN";
	public String Computer_Type = "HYBRID Laptop";
	
	@Override
	public String getConfiguration() {
		return toString();
	}

	@Override
	public String toString() {
		return "DigitalLaptop [Brand=" + Brand + ", Computer_Type=" + Computer_Type + ", Ram=" + Ram + ", Storage="
				+ Storage + ", Storage_Type=" + Storage_Type + "]";
	}

}
