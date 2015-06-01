package main;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import maze.Item;

public abstract class MazeBuilder {

	
	ArrayList<Item> items = new ArrayList<Item>();
	
	public void draw() {
		for (Item shape : items) {
			shape.draw();
		}
	}
	
	public abstract void createMaze(Graphics g,Point mazeTop,int height,int width);
}
