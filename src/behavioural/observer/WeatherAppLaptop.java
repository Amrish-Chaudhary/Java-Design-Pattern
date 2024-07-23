package behavioural.observer;

public class WeatherAppLaptop implements Observer{

	Observable observable;
	int temprature;
	
	public WeatherAppLaptop(Observable observable, int temprature) {
		this.observable = observable;
		this.temprature = temprature;
	}

	@Override
	public void updateData(int data) {
		this.temprature = data;
		System.out.println("Temprature updated on Laptop :" + temprature + "°C");
	}

}
