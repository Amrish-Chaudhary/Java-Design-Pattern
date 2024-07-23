package behavioural.memento;

//Memento
public class ItemMemento {

	String name;
	int price;
	
	ItemMemento(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	
}
