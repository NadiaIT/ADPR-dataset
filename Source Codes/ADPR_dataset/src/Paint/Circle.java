package Paint;

public class Circle implements IShape{
	private double r=0.0;
	
	public Circle(double r) {
		this.r=r;
	}

	@Override
	public void draw() {
		System.out.println("Circle is drawing");
		
	}
}
