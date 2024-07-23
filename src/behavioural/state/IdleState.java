package behavioural.state;

public class IdleState implements State{
	
	public IdleState() {
		System.out.println("Machine is in Idle-State");
	}
	
	public IdleState(VendingMachine machine) {
		System.out.println("Machine is in Idle-State");
	}

	@Override
	public void clickButtonToInsertCash(VendingMachine machine) {
		machine.setState(new HasMoneyState());
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateInventory(VendingMachine machine, Item item, int itemCode) {
		machine.getInventory().addItem(itemCode, item);
	}

	
}
