package creational.builder;

public class Address {

	private int houseNo;
	private String area;
	private String city;
	
	public int getHouseNo() {
		return houseNo;
	}
	private void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getArea() {
		return area;
	}
	private void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	private void setCity(String city) {
		this.city = city;
	}
	
	public static Address getAddress(int houseNo, String area, String city) {
		Address address = new Address();
		address.setHouseNo(houseNo);
		address.setArea(area);
		address.setCity(city);
		return address;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", area=" + area + ", city=" + city + "]";
	}
	
	
}
