package behavioural.template;

public class App {

	public static void main(String[] args) {
		
		SendMoneyToBankAccount moneyToBankAccount = new SendMoneyToBankAccount();
		moneyToBankAccount.sendMoney(1050);
		
		SendMoneyToUPI moneyToUPI = new  SendMoneyToUPI();
		moneyToUPI.sendMoney(1020);
	}
}
