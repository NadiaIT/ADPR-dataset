package maze;

import java.awt.Graphics;

public abstract class IDoor extends Item {

	int x, y, height, width;

	public IDoor(Graphics g, int x, int y, int height, int width) {
		super(g);
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}

}
