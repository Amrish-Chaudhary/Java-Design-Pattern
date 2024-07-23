package behavioural.observer;

public class App {
	
	public static void main(String[] args) {
		
		Observable observable = new StockExchangeObservable();
		
		Observer stockBroker1 = new GrowwStockObserver(observable, 100);
		Observer stockBroker2 = new GrowwStockObserver(observable, 200);
		Observer stockBroker3 = new GrowwStockObserver(observable, 300);
		Observer stockBroker4 = new GrowwStockObserver(observable, 400);
		
		observable.add(stockBroker1);
		observable.add(stockBroker2);
		observable.add(stockBroker3);
		observable.add(stockBroker4);
		
		observable.setValue(1000);
		
		
		Observable weatherObservable = new WeatherTempratureObservable();
		
		Observer mobileObserver = new WeatherAppMobile(weatherObservable, 25);
		Observer laptopObserver = new WeatherAppLaptop(weatherObservable, 20);
		weatherObservable.add(laptopObserver);
		weatherObservable.add(mobileObserver);
		weatherObservable.setValue(40);
		weatherObservable.setValue(40);
	}

}
