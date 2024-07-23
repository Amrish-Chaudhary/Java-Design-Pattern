package behavioural.strategy;

public class App {

	public static void main(String[] args) {
		//Checkout flipKart = new FlipkartCheckout(new CardPayment());
		Checkout flipKart = new FlipkartCheckout();
		flipKart.selectItem();
		flipKart.makePayment(100);
		
		//Checkout amazon = new AmazonCheckout(new BankTransfer());
		Checkout amazon = new AmazonCheckout();
		amazon.selectItem();
		amazon.makePayment(10050);
	}
}
