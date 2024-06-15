package creational.singleton;

public final class Logger {
	
	private static Logger logger;
	
	private Logger() {}
	
	public static synchronized Logger getInstance() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	public void printLog(String message) {
		System.out.println(message);
	}

}
