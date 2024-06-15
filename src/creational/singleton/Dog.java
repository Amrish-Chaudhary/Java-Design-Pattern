package creational.singleton;

public class Dog {
private final Logger logger = Logger.getInstance();
	
	public void woof() {
		logger.printLog("woof....woof....");
	}

	public void printLoggerInfo() {
		System.out.println(logger.hashCode());
	}
}
