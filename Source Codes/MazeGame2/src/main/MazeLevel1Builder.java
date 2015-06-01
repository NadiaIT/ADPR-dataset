package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import maze.FixedDoor;
import maze.IWall;
import maze.WoodenWall;

public class MazeLevel1Builder extends MazeBuilder {

	@Override
	public void createMaze(Graphics g, Point mazeTop, int height, int width) {
		
		g.setColor(Color.RED);
		int roomHeight = height / 2;
		int roomWidth = width / 2;
		
		IWall northWall = new WoodenWall(g, mazeTop.x, mazeTop.y, mazeTop.x+roomWidth, mazeTop.y);

		IWall westWall = new WoodenWall(g, mazeTop.x+roomWidth, mazeTop.y, mazeTop.x+roomWidth, mazeTop.y+roomHeight);

		IWall eastWall = new WoodenWall(g, mazeTop.x, mazeTop.y, mazeTop.x, mazeTop.y+roomHeight);

		IWall southWall = new WoodenWall(g, mazeTop.x, mazeTop.y+roomHeight, mazeTop.x+roomWidth,  mazeTop.y+roomHeight);
		
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		
		items.add(new FixedDoor(g, ((westWall.x1 + westWall.x2) / 2)-10/6,
				((westWall.y2 + westWall.y1) / 2)-roomHeight/6,   3,roomHeight/3));
		
		items.add(new FixedDoor(g, ((southWall.x1 + southWall.x2) / 2)-roomWidth/6,
				((southWall.y2 + southWall.y1) / 2)-10/6,   roomWidth/3,3));
		
		
		Point a =new Point();
		a.x=mazeTop.x+roomWidth;
		a.y=mazeTop.y;
		northWall = new WoodenWall(g, a.x, a.y, a.x+roomWidth, a.y);
		westWall = new WoodenWall(g, a.x+roomWidth, a.y, a.x+roomWidth, a.y+roomHeight);
		eastWall = new WoodenWall(g, a.x, a.y, a.x, a.y+roomHeight);
		southWall= new WoodenWall(g, a.x, a.y+roomHeight, a.x+roomWidth,  a.y+roomHeight);
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		
		items.add(new FixedDoor(g, ((northWall.x1 + northWall.x2) / 2)-roomWidth/6,
				((northWall.y2 + northWall.y1) / 2)-10/6,   roomWidth/3,3));
		
		items.add(new FixedDoor(g, ((southWall.x1 + southWall.x2) / 2),
				((southWall.y2 + southWall.y1) / 2),   roomWidth/2,5));
		
		
		a.x=mazeTop.x;
		a.y=mazeTop.y+roomHeight;
		northWall = new WoodenWall(g, a.x, a.y, a.x+roomWidth, a.y);
		westWall = new WoodenWall(g, a.x+roomWidth, a.y, a.x+roomWidth, a.y+roomHeight);
		eastWall = new WoodenWall(g, a.x, a.y, a.x, a.y+roomHeight);
		southWall= new WoodenWall(g, a.x, a.y+roomHeight, a.x+roomWidth,  a.y+roomHeight);
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		
		items.add(new FixedDoor(g, ((eastWall.x1 + eastWall.x2) / 2),
				((eastWall.y2 + eastWall.y1) / 2),   5,roomHeight/2));
		
		a.x=mazeTop.x+roomWidth;
		a.y=mazeTop.y+roomHeight;
		northWall = new WoodenWall(g, a.x, a.y, a.x+roomWidth, a.y);
		westWall = new WoodenWall(g, a.x+roomWidth, a.y, a.x+roomWidth, a.y+roomHeight);
		eastWall = new WoodenWall(g, a.x, a.y, a.x, a.y+roomHeight);
		southWall= new WoodenWall(g, a.x, a.y+roomHeight, a.x+roomWidth,  a.y+roomHeight);
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		draw();
	}

}
