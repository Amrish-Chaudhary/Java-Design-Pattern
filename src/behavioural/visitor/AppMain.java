package behavioural.visitor;

public class AppMain {

	public static void main(String[] args) {
		
		OfferVisitor hotelBookingOffer = new HottelBookingOffer();
		OfferVisitor movieTicketOffer = new MovieTicketOffer();
		OfferVisitor flightTicketOffer = new FlightBookingOffer();
		
		CreditCard bronze = new BronzeCreditCard();
		CreditCard silver = new SilverCreditCard();
		CreditCard gold = new GoldCreditCard();
		
		bronze.getCardName();
		silver.getCardName();
		gold.getCardName();
		
		bronze.accept(hotelBookingOffer);
		silver.accept(hotelBookingOffer);
		gold.accept(hotelBookingOffer);
		
		bronze.accept(movieTicketOffer);
		silver.accept(movieTicketOffer);
		gold.accept(movieTicketOffer);
		
		bronze.accept(flightTicketOffer);
		silver.accept(flightTicketOffer);
		gold.accept(flightTicketOffer);
		
	}
}
