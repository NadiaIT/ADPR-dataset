package Paint;

import java.util.Scanner;

public class Paint {
	public static void main(String[] args) {
		int shapeType;
		Scanner scanner = new Scanner(System.in);
		shapeType = scanner.nextInt();
		if (shapeType == 1) {
			IShape shape1 = new Circle(2.0);
			IColor c1 = new Red();

			shape1.draw();
			c1.fill();
		} else if (shapeType == 2) {
			IShape shape2 = new Rectangle(2.0, 3.0);
			IColor c2 = new Blue();

			shape2.draw();
			c2.fill();
		} else {
			IShape shape3 = new Square(3.0);
			IColor c3 = new Green();
			shape3.draw();
			c3.fill();
		}

	}
}
