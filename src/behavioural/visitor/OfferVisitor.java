package behavioural.visitor;

public interface OfferVisitor {
	
	void visitBronzeCreditCard(BronzeCreditCard card);
	void visitSilverCreditCard(SilverCreditCard card);
	void visitGoldCreditCard(GoldCreditCard card);

}
