package behavioural.state;

public class MainApp {

	public static void main(String[] args) {
		
		VendingMachine machine = new VendingMachine();
		System.out.println("---- Machine is loading -----");
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		loadInventory(machine);
		System.out.println("----Machine display under process-----");
		try { Thread.sleep(1000); } catch (InterruptedException e) {}
		displayInventory(machine);
		System.out.println("---------Welcome-------");
		
		State state = machine.getState();
		state.clickButtonToInsertCash(machine);
		
		machine.getState().insertMoney(machine, 10);
		machine.getState().insertMoney(machine, 50);
		
		machine.getState().clickSelectItemButton(machine);
		machine.getState().clickEnterProductCode(machine, 101);
		
		machine.getState().clickSubmitButton(machine);
		
		
	}
	
	static void loadInventory(VendingMachine machine) {
		ItemShelf[] itemShelfs = machine.getInventory().getItemShelfs();
		int itemCode = 101;
		for(int i = 0; i < itemShelfs.length; i++) {
			Item item = null;
			 if(i >= 0 && i < 3)
				 item = new Item(ItemType.COKE_CAN, 40);
			 else if(i >=3 && i < 6)
				 item = new Item(ItemType.PEPSI_CAN, 40);
			 else if(i >=6 && i < 9)
				 item = new Item(ItemType.REDBULL_CAN, 100);
			 else if(i >=9 && i < 12)
				 item = new Item(ItemType.WATER_BOTTLE, 20);
			 itemShelfs[i].setItem(item);
			 itemShelfs[i].setCode(itemCode++);
			 itemShelfs[i].setSoldOut(false);
		}
		
		
	}
	
	static void displayInventory(VendingMachine machine) {
		ItemShelf[] itemShelfs = machine.getInventory().getItemShelfs();
		for(int i = 0; i < itemShelfs.length; i++) {
			ItemShelf itemShelf = itemShelfs[i];
			Item item = itemShelf.getItem();
			System.out.println("Item Type: "+ item.getItemType() + "Item Price: " + item.getPrice() + "Item Code: "
					+ itemShelf.getCode() + "Stock Available: " + !itemShelf.isSoldOut());
		}
	}
}
