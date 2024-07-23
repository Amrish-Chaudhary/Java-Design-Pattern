package structural.facade;

public abstract class CalculatorFacade {
	
	void addition(int... num) {
		int totalSum = 0;
		for(int n : num)
			totalSum+=n;
		System.out.println("Add = " + totalSum);
	}
	
	void subtract(int a, int b) {
		System.out.println("Subtract = " + (a - b));
	}
	
	void multiply(int... num) {
		int result = 1;
		for(int n : num)
			result*=n;
		System.out.println("Multiply = " + result);
	}
	
	void divide(int a, int b) {
		System.out.println("Division = " + (a / b));
	}

}
