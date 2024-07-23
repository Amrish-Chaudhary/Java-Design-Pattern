package behavioural.state;

public class SelectProductState implements State{

	public SelectProductState() {
		System.out.println("Machine is in SelectProduct-State");
		System.out.println("Please Enter the Item-Code");
	}
	
	public SelectProductState(VendingMachine machine) {
		System.out.println("Machine is in SelectProduct-State");
		System.out.println("Please Enter the Item-Code");
	}
	
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
		System.out.println("Selected item is :" + itemCode); 
		Item item = machine.getInventory().getItem(itemCode);
		int itemPrice = item.getPrice();
		int depositAmount = machine.getAmount();
		if(depositAmount < itemPrice) {
			System.out.println("InSufficient Amount");
			System.out.println("Amount: "+ machine.getAmount() + "and Item Price: " + itemPrice);
		}
		else if(depositAmount > itemPrice) {
			System.out.println("Please collect the extra amount :" + (depositAmount - itemPrice));
			machine.setAmount(depositAmount - itemPrice);
		}
		else System.out.println("Item will be dispatched soon...");
		machine.setItem(item);
		machine.setState(new DispenseProductState());
	}

	@Override
	public void clickRefundButton(VendingMachine machine) {
		System.out.println("You have selected To Refund Money");
		System.out.println("Money Refunded: " + machine.getAmount() + "INR");
		machine.setAmount(0);
		System.out.println("Money has been refunded successfully");
		
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
