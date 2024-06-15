package structural.bridge;

public class Square implements Shape{

	private final Color color;
	
	public Square(Color color) {
		this.color = color;
	}
	
	@Override
	public void getShape() {
		System.out.println("Shape: Square");
	}

	@Override
	public Color getColor() {
		return color;
	}
}
