package behavioural.strategy;

public class AmazonCheckout extends Checkout{

	AmazonCheckout(Payment payment) {
		super(payment);
	}
	
	AmazonCheckout() {
		super(new BankTransfer());
	}

}
