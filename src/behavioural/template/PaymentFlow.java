package behavioural.template;

public abstract class PaymentFlow {

	public abstract void validatePayment(int amount);
	public abstract void debitPayment(int amount);
	public abstract void calculateFee(int amount);
	public abstract void creditPayment(int amount);
	
	public final void sendMoney(int amount) {
		//step-1
		validatePayment(amount);
		//step-2
		debitPayment(amount);
		//step-3
		calculateFee(amount);
		//step-4
		creditPayment(amount);
	}
	
}
