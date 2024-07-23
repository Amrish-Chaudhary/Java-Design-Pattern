package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

//Caretaker
public class CareTakerCumMainApp {

	public List<ItemMemento> itemHistory = new ArrayList<ItemMemento>();
	
	public void addItem(ItemMemento item) {
		itemHistory.add(item);
	}
	
	public ItemMemento undoItem() {
		if(!itemHistory.isEmpty()) {
			int lastIndex = itemHistory.size() - 1;
			ItemMemento lastItem = itemHistory.get(lastIndex);
			itemHistory.remove(lastIndex);
			return lastItem;
		}
		else return null;
	}
	
	
	
	
	//Client code
	
	public static void main(String[] args) {
		CareTakerCumMainApp careTaker = new CareTakerCumMainApp();
		ItemOriginator itemOriginator = new ItemOriginator("Coke", 9);
		ItemMemento item = itemOriginator.createItem();
		careTaker.addItem(item);
		
		itemOriginator.setName("Water");
		itemOriginator.setPrice(20);
		ItemMemento item2 = itemOriginator.createItem();
		careTaker.addItem(item2);
		
		itemOriginator.setName("Beer");
		itemOriginator.setPrice(150);
		ItemMemento item3 = itemOriginator.createItem();
		careTaker.addItem(item3);
		
		System.out.println("Item Details - Item-name: " + item3.getName() + "Item-Price: " + item3.getPrice());
		
		item3 = careTaker.undoItem();
		System.out.println("Item Details - Item-name: " + item3.getName() + "Item-Price: " + item3.getPrice());
		item3 = careTaker.undoItem();
		System.out.println("Item Details - Item-name: " + item3.getName() + "Item-Price: " + item3.getPrice());
		item3 = careTaker.undoItem();
		System.out.println("Item Details - Item-name: " + item3.getName() + "Item-Price: " + item3.getPrice());
	}
}
