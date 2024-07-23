package behavioural.interpreter;

public class App {
	
	public static void main(String[] args) {
		String context = "hello world";
		System.out.println("Before Interpret = " + context);
		Expression expression = new EndWithColon();
		context = expression.interpret(context);
		System.out.println("After Interpret = " + context);
	}

}
