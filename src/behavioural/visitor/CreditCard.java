package behavioural.visitor;

public interface CreditCard {
	
	void getCardName();
	void accept(OfferVisitor v);

}
