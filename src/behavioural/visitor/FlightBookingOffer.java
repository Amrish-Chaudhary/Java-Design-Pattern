package behavioural.visitor;

public class FlightBookingOffer implements OfferVisitor{

	@Override
	public void visitBronzeCreditCard(BronzeCreditCard card) {
		System.out.println("Get 5% discount on flight ticket booking on your Bronze Credit Card");
		
	}

	@Override
	public void visitSilverCreditCard(SilverCreditCard card) {
		System.out.println("Get 15% discount on flight ticket booking on your Silver Credit Card");
		
	}

	@Override
	public void visitGoldCreditCard(GoldCreditCard card) {
		System.out.println("Get 20% discount on flight ticket booking on your Gold Credit Card");
		
	}

}
