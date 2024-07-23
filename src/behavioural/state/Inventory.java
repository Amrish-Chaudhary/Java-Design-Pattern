package behavioural.state;

public class Inventory {

	ItemShelf [] itemShelfs ;
	
	public Inventory(int capacity) {
		itemShelfs = new ItemShelf[capacity];
		initializeEmptyInventory();
	}

	public ItemShelf[] getItemShelfs() {
		return itemShelfs;
	}


	public void setItemShelfs(ItemShelf[] itemShelfs) {
		this.itemShelfs = itemShelfs;
	}


	private void initializeEmptyInventory() {
		int itemCode = 101;
		for(int i = 0; i < itemShelfs.length; i++) {
			ItemShelf itemShelf = new ItemShelf();
			itemShelf.setCode(itemCode++);
			itemShelf.setSoldOut(true);
			itemShelfs[i] = itemShelf; 
		}
	}
	
	public void addItem(int code, Item item) {
		for(ItemShelf itemShelf : itemShelfs) {
			if(itemShelf.getCode() == code) {
				if(itemShelf.isSoldOut) {
					itemShelf.setItem(item);
					itemShelf.setSoldOut(false);
				}
			}
		}
	}
	
	public Item getItem(int itemCode) {
		for(ItemShelf itemShelf : itemShelfs) {
			if(itemShelf.getCode() == itemCode) {
				if(!itemShelf.isSoldOut) {
					itemShelf.setSoldOut(true);
					return itemShelf.getItem();
				}
				else return null;
			}
		}
		return null;
	}
	
}
