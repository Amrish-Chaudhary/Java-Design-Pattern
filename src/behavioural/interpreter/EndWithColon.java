package behavioural.interpreter;

public class EndWithColon implements Expression{
	FirstLetterCapital firstLetterCapital = new FirstLetterCapital();

	@Override
	public String interpret(String context) {
		if(!context.endsWith("."))
			context = context.concat(".");
		return firstLetterCapital.interpret(context);
	}
	
	

}
