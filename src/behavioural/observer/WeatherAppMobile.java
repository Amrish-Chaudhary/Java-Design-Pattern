package behavioural.observer;

public class WeatherAppMobile implements Observer{

	Observable observable;
	int temprature;
	
	public WeatherAppMobile(Observable observable, int temprature) {
		this.observable = observable;
		this.temprature = temprature;
	}

	@Override
	public void updateData(int data) {
		this.temprature = data;
		System.out.println("Temprature updated on Mobile :" + temprature + "°C");
	}

}
