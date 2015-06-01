package maze;

import java.awt.Graphics;

public class WoodenWall extends IWall {

	public WoodenWall(Graphics g, int x1, int y1, int x2, int y2) {
		super(g, x1, y1, x2, y2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		g.drawLine(x1, y1, x2, y2);
	}
}
