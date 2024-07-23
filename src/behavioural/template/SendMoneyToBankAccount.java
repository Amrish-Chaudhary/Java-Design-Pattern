package behavioural.template;

public class SendMoneyToBankAccount extends PaymentFlow{

	@Override
	public void validatePayment(int amount) {
		System.out.println("Payment has been validated for amount INR:"+ amount);
	}

	@Override
	public void debitPayment(int amount) {
		System.out.println("Account has been debit for INR:"+ amount);
	}

	@Override
	public void calculateFee(int amount) {
		System.out.println("Bank account transfer fee calculated at 2% for amount INR:"+ amount + ". Fee is "+ (double)((amount*2)/100));
	}

	@Override
	public void creditPayment(int amount) {
		System.out.println("Amount has been credited with INR:"+ amount);
	}

}
