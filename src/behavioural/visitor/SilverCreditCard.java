package behavioural.visitor;

public class SilverCreditCard implements CreditCard{

	@Override
	public void getCardName() {
		System.out.println("It is Silver Credit Card");	
	}

	@Override
	public void accept(OfferVisitor v) {
		v.visitSilverCreditCard(this);
		
	}

}
