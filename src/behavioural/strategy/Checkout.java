package behavioural.strategy;

public class Checkout {

	Payment payment;
	
	Checkout(Payment payment) {
		this.payment = payment;
	}
	void selectItem() {
		System.out.println("Item selected");
	}
	
	void makePayment(int amount) {
		payment.makePayment(amount);
	}
}
