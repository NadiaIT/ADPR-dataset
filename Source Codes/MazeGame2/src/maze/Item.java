package maze;

import java.awt.Graphics;

public abstract class Item {

	Graphics g;

	public Item(Graphics g) {
		this.g = g;
	}

	public abstract void draw();
}
