package behavioural.strategy;

public class FlipkartCheckout extends Checkout{

	FlipkartCheckout(Payment payment) {
		super(payment);
	}
	
	FlipkartCheckout() {
		super(new CardPayment());
	}

}
