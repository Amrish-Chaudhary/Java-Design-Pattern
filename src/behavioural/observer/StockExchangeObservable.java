package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class StockExchangeObservable implements Observable{

	List<Observer> observers = new ArrayList<Observer>();
	private int stockPrice;
	
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
		observers.forEach(observer -> observer.updateData(stockPrice));
	}

	@Override
	public void setValue(int data) {
		if(stockPrice != data) {
		this.stockPrice = data;
		nofity();
		}
	}

}
