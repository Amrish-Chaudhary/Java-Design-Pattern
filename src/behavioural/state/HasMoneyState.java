package behavioural.state;

public class HasMoneyState implements State{

	public HasMoneyState() {
		System.out.println("Machine is in HasMoney-State");	
		System.out.println("Machine can accept INR");
	}
	
	public HasMoneyState(VendingMachine machine) {
		System.out.println("Machine is in HasMoney-State");
		System.out.println("Machine can accept INR");
	}

	@Override
	public void clickButtonToInsertCash(VendingMachine machine) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMoney(VendingMachine machine, int amount) {
		machine.setAmount(machine.getAmount() + amount);
		System.out.println("Money Accepted INR:" + amount);
	}

	@Override
	public void clickCancelPurchase(VendingMachine machine) {
		System.out.println("You have canceled the Item purchase");
		System.out.println("Money Refunded: " + machine.getAmount() + "INR");
		machine.setAmount(0);
		System.out.println("Money has been refunded successfully");
	}

	@Override
	public void clickSelectItemButton(VendingMachine machine) {
		System.out.println("Select the Item shown in shelf");
		machine.setState(new SelectProductState());
		
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
		// TODO Auto-generated method stub
		
	}

}
