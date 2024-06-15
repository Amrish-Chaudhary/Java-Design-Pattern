package creational.builder;
import java.time.LocalDate;
import java.time.Period;

public class UserDTO {

	private String name;
	private String age;
	private String mobile;
	private String address;
	
	private void setName(String name) {
		this.name = name;
	}
	private void setAge(String age) {
		this.age = age;
	}
	private void setMobile(String mobile) {
		this.mobile = mobile;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	
	public static UserBuilder builder() {
		return new UserBuilder();
	}
	
	public static class UserBuilder {
	
		private String name;
		private String age;
		private String mobile;
		private String address;
		private UserDTO userDTO;
		
		public UserBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public UserBuilder setAge(LocalDate age) {
			this.age = Integer.toString(Period.between(age, LocalDate.now()).getYears());
			return this;
		}
		public UserBuilder setMobile(long mobile) {
			this.mobile = Long.toString(mobile);
			return this;
		}
		public UserBuilder setAddress(Address address) {
			this.address = "\n houseNo=" + address.getHouseNo() + ", \n area=" + address.getArea() + ", \n city=" + address.getCity() ;
			return this;
		}
		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(name);
			userDTO.setAge(age);
			userDTO.setMobile(mobile);
			userDTO.setAddress(address);
			return userDTO;
		}
			
	}
	
	
	
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", \n age=" + age + ", \n mobile=" + mobile + ", \n address=" + address + "]";
	}
	
	
	public static void main(String[] args) {
		User user = User.getUser("Amrish", LocalDate.of(1998, 04, 18), 81785232466l, 3417, "Sector-23", "Gurgaon");
		UserDTO build = UserDTO.builder()
				.setName(user.getName())
				.setAge(user.getDob())
				.setMobile(user.getMobile())
				.setAddress(user.getAddress())
				.build();
		System.out.println(user.toString());
		System.out.println(build.toString());
	}
	
	
}
