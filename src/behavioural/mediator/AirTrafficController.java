package behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class AirTrafficController implements TrafficController{

	List<AirVehicle> vehicles = new ArrayList<AirVehicle>();
	
	@Override
	public void addAirVehicle(AirVehicle airVehicle) {
		vehicles.add(airVehicle);
	}

	@Override
	public void landAirVehicle(AirVehicle airVehicle, int runway) {
		vehicles.stream().filter(v -> !airVehicle.getName().equals(v.getName()))
		.forEach(v -> v.recieveRunwayNotification(runway));
		
	}

}
