package maze;

import java.awt.Graphics;

public class FixedDoor extends IDoor {

	public FixedDoor(Graphics g, int x, int y, int height, int width) {
		super(g, x, y, height, width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		g.fillRect(x, y, height, width);

	}

}
