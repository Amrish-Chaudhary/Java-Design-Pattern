package structural.facade;

public class Calculator {
	
	public static void main(String[] args) {
		BasicCalculator calculator = new BasicCalculator();
		calculator.addition(1,2,3,4,5,6,7,8,9);
		calculator.subtract(100, 99);
		calculator.multiply(1,2,3,4,5,6,7,8,9);
		calculator.divide(100, 10);
		
		AdvanceCalculator advanceCalculator = new AdvanceCalculator();
		advanceCalculator.getModulo(5, 2);
		advanceCalculator.getPercentage(70, 18);
	}
	
	

}
