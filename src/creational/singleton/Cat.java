package creational.singleton;

public class Cat {
	
	private final Logger logger = Logger.getInstance();
	
	public void meow() {
		logger.printLog("meow....meow....");
	}
	
	public void printLoggerInfo() {
		System.out.println(logger.hashCode());
	}

}
