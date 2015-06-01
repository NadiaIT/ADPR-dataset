package Paint;

public class Square implements IShape{
	private double height=0.0;

	public Square(double height) {
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("Square is drawing");
		
	}
	
	
}
