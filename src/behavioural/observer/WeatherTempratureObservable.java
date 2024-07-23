package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherTempratureObservable implements Observable{

	private int temprature;
	private List<Observer> observers = new ArrayList<Observer>();
	
	@Override
	public void add(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void nofity() {
		observers.forEach(o -> o.updateData(temprature));
	}

	@Override
	public void setValue(int data) {
		if(data != temprature) {
			this.temprature = data;
			nofity();
		}
	}

	
}
