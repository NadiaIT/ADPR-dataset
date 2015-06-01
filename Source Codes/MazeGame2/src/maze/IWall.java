package maze;

import java.awt.Graphics;

public abstract class IWall extends Item {

	public IDoor door;
	public int x1, x2, y1, y2;

	public IWall(Graphics g, int x1, int y1, int x2, int y2) {
		super(g);
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	public void addDoor(IDoor door) {
		this.door = door;
	}
}
