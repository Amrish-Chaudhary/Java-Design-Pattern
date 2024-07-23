package behavioural.state;

public class DispenseProductState implements State{

	@Override
	public void clickButtonToInsertCash(VendingMachine machine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMoney(VendingMachine machine, int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickCancelPurchase(VendingMachine machine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickSelectItemButton(VendingMachine machine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickEnterProductCode(VendingMachine machine, int itemCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickRefundButton(VendingMachine machine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickSubmitButton(VendingMachine machine) {
		System.out.println("Submit Button Clicked");
		System.out.println("Item dispensed");
		System.out.println("Item: " + machine.getItem().getItemType().name() + " Price: " + machine.getItem().getPrice());
		machine.setAmount(0);
		machine.setItem(null);
		machine.setState(new IdleState(machine));
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int itemCode) {
		// TODO Auto-generated method stub
		
	}

}
