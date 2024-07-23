package behavioural.interpreter;

public class FirstLetterCapital implements Expression{

	@Override
	public String interpret(String context) {
		return context.substring(0, 1).toUpperCase().concat(context.substring(1));
	}
	
	

}
