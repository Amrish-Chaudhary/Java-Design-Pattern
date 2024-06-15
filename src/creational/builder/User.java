package creational.builder;
import java.time.LocalDate;

public class User {

	private String name;
	private Address address;
	private LocalDate dob;
	private long mobile;
	
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public long getMobile() {
		return mobile;
	}
	private void setName(String name) {
		this.name = name;
	}
	private void setAddress(Address address) {
		this.address = address;
	}
	private void setDob(LocalDate dob) {
		this.dob = dob;
	}
	private void setMobile(long mobile) {
		this.mobile = mobile;
	}
	
	public static User getUser(String name, LocalDate dob, long mobile, int houseNo, String area, String city) {
		User user = new User();
		user.setName(name);
		user.setMobile(mobile);
		user.setDob(dob);
		user.setAddress(Address.getAddress(houseNo, area, city));
		return user;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", dob=" + dob + ", mobile=" + mobile + "]";
	}
	
	
}
