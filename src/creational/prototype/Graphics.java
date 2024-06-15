package creational.prototype;

public abstract class Graphics {
	
	private int  height;
	
	public Graphics(int height) {
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public abstract Graphics clone();

}
