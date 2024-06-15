package creational.factory;

public class DigitalLaptop extends Computer{

	public String Brand = "HP ELIOTEBOOK";
	public String Computer_Type = "Digital Laptop";
	
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
