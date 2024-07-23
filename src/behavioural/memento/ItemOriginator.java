package behavioural.memento;

//Originator
public class ItemOriginator {

	String name;
	int price;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ItemOriginator(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public ItemMemento createItem() {
		return new ItemMemento(this.name, this.price);
	}
	
	public void restoreItem(ItemMemento item) {
		this.name = item.name;
		this.price = item.price;
	}
	
}
