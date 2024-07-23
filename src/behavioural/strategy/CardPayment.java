package behavioural.strategy;

public class CardPayment implements Payment{

	@Override
	public void makePayment(int amount) {
		System.out.println("Payment of amount INR " + amount + " done by Card");
	}
	
}
