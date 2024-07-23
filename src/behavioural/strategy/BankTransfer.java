package behavioural.strategy;

public class BankTransfer implements Payment{

	@Override
	public void makePayment(int amount) {
		System.out.println("Payment done by bank transfer of amount INR " + amount);
	}

}
