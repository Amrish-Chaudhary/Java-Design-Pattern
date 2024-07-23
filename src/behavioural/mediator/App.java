package behavioural.mediator;

public class App {
	
	public static void main(String[] args) {
		TrafficController atc = new AirTrafficController();
		AirVehicle vehicle1 = new Aeroplane("Delhi-To-Thailand", atc);
		AirVehicle vehicle2 = new Aeroplane("Delhi-To-Indonesia", atc);
		AirVehicle vehicle3 = new Aeroplane("Delhi-To-Vietnam", atc);
		AirVehicle vehicle4 = new Aeroplane("Delhi-To-Singapore", atc);
		
		vehicle1.landAirVehicle(5);
		vehicle2.landAirVehicle(2);
		vehicle3.landAirVehicle(10);
		vehicle4.landAirVehicle(12);
	}

}
