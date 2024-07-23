package behavioural.state;

public interface State {

	void clickButtonToInsertCash(VendingMachine machine); 

	void insertMoney(VendingMachine machine, int amount);
	
	void clickCancelPurchase(VendingMachine machine);
	
	void clickSelectItemButton(VendingMachine machine);

	void clickEnterProductCode(VendingMachine machine, int itemCode);
	
	void clickRefundButton(VendingMachine machine);
	
	void clickSubmitButton(VendingMachine machine);
	
	void updateInventory(VendingMachine machine, Item item, int itemCode);
}
