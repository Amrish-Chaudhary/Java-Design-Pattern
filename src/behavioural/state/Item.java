package behavioural.state;

public class Item {

	ItemType itemType;
	int price;
	
	public ItemType getItemType() {
		return itemType;
	}
	public int getPrice() {
		return price;
	}
	
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Item(ItemType itemType, int price) {
		this.itemType = itemType;
		this.price = price;
	}
		
	
}
