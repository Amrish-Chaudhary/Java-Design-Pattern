package behavioural.visitor;

public class GoldCreditCard implements CreditCard{

	@Override
	public void getCardName() {
		System.out.println("It is Gold Credit Card");
		
	}

	@Override
	public void accept(OfferVisitor v) {
		v.visitGoldCreditCard(this);
		
	}

}
