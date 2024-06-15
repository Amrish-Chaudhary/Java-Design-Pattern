package structural.bridge;

public class Circle implements Shape{

	private final Color color;
	
	public Circle(Color color) {
		this.color = color;
	}
	
	@Override
	public void getShape() {
		System.out.println("Shape: Circle");
	}

	@Override
	public Color getColor() {
		return color;
	}

	
}
