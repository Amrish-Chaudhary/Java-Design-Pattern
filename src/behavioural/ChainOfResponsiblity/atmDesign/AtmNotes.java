package behavioural.ChainOfResponsiblity.atmDesign;

public abstract class AtmNotes {
	public static int NOTES_2000 = 1;
	public static int NOTES_5000 = 2;
	public static int NOTES_200 = 3;
	public static int NOTES_100 = 4;
	
	private AtmNotes nextNote;
	private int totalAmount;
	private int currentAmount;
	
	public AtmNotes(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public AtmNotes getNextNote() {
		return nextNote;
	}
	public int getTotalAmount() {
		return totalAmount;
	}
	public int getCurrentAmount() {
		return currentAmount;
	}
	public void setNextNote(AtmNotes nextNote) {
		this.nextNote = nextNote;
	}
	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void setCurrentAmount(int currentAmount) {
		this.currentAmount = currentAmount;
	}
	
	public void printCash() {
		
	}
	

}
