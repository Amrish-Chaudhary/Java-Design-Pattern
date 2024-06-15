package structural.bridge;

public class App {
	
	public static void main(String[] args) {
		Shape circle = new Circle(new BlueColor());
		circle.getShape();
		circle.getColor().getColor();
		
		Shape square = new Square(new RedColor());
		square.getShape();
		square.getColor().getColor();
	}

}
