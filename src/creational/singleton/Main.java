package creational.singleton;

public class Main {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.meow();
		Dog d = new Dog();
		d.woof();
		c.printLoggerInfo();
		d.printLoggerInfo();
	}
}
