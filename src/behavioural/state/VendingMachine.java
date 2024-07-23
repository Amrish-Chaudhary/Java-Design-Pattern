package behavioural.state;

public class VendingMachine {

	State state;
	Inventory inventory;
	int amount;
	Item item;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public VendingMachine() {
		state = new IdleState();
		inventory = new Inventory(10);
		amount = 0;
		item = null;
		
	}
	
	
}
