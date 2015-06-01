package main;

import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

public class Painter extends JPanel {

	private MazeBuilder level;
	int height = 200, width = 200;

	public Painter() {
		level = new MazeLevel1Builder();
	}

	public void setLevel(MazeBuilder mazeLevel) {
		level = mazeLevel;
		repaint();
	}

	public void setMazeSize(int height, int width) {
		this.height = height;
		this.width = width;
		repaint();
	}

	public void paint(Graphics g) {
		level.createMaze(g, new Point(100, 100), height, width);
	}

}
