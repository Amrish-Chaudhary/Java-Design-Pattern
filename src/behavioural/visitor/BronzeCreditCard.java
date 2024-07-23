package behavioural.visitor;

public class BronzeCreditCard implements CreditCard{

	@Override
	public void getCardName() {
		System.out.println("It is Bronze Credit Card");
	}

	@Override
	public void accept(OfferVisitor v) {
		v.visitBronzeCreditCard(this);
		
	}

}
