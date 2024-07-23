package behavioural.mediator;

public class Aeroplane implements AirVehicle{

	private final String name;
	private TrafficController trafficController;
	
	public Aeroplane(String name, TrafficController trafficController) {
		this.name = name;
		this.trafficController = trafficController;
		trafficController.addAirVehicle(this);
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void landAirVehicle(int runway) {
		trafficController.landAirVehicle(this, runway);
	}

	@Override
	public void recieveRunwayNotification(int runway) {
		System.out.println("Flight- " + this.name + " notified for runway-" + runway +" is occupied, Right now not available for landing");
	}

}
