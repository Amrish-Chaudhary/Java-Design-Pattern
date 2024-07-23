package behavioural.observer;

public class GrowwStockObserver implements Observer{

	private Observable observable;
	private int stockPrice;
	
	public GrowwStockObserver(Observable observable, int price) {
		this.observable = observable;
		this.stockPrice = price;
	}
	
	@Override
	public void updateData(int data) {
		this.stockPrice = data;
		System.out.println("Stock price updated to " + stockPrice);
	}

}
