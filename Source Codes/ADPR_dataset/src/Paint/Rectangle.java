package Paint;

public class Rectangle implements IShape{
	private double height=0.0;
	private double width=0.0;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}

	@Override
	public void draw() {
		System.out.println("Rectangle is drawing");
		
	}
	
	
}
