package structural.facade;

public class AdvanceCalculator extends CalculatorFacade{

	void getModulo(int a, int b) {
		System.out.println("Modulo = "+ (a % b));
	}
	void getPercentage(int a, int b) {
		int percentage = (b*100)/a;
		System.out.println("Percentage = " + percentage + "%");
	}
	
}
