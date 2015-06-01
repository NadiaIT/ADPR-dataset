package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import maze.GlassWall;
import maze.IWall;
import maze.SlidingDoor;

public class MazeLevel2Builder extends MazeBuilder {

	@Override
	public void createMaze(Graphics g, Point mazeTop, int height, int width) {

		g.setColor(Color.BLUE);
		
		int roomHeight = height / 2;
		int roomWidth = width / 2;
		
		IWall northWall = new GlassWall(g, mazeTop.x, mazeTop.y, mazeTop.x+roomWidth, mazeTop.y);

		IWall westWall = new GlassWall(g, mazeTop.x+roomWidth, mazeTop.y, mazeTop.x+roomWidth, mazeTop.y+roomHeight);

		IWall eastWall = new GlassWall(g, mazeTop.x, mazeTop.y, mazeTop.x, mazeTop.y+roomHeight);

		IWall southWall = new GlassWall(g, mazeTop.x, mazeTop.y+roomHeight, mazeTop.x+roomWidth,  mazeTop.y+roomHeight);
		
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		
		items.add(new SlidingDoor(g, ((westWall.x1 + westWall.x2) / 2)-10/6,
				((westWall.y2 + westWall.y1) / 2)-roomHeight/6,   3,roomHeight/3));
		
		items.add(new SlidingDoor(g, ((southWall.x1 + southWall.x2) / 2)-roomWidth/6,
				((southWall.y2 + southWall.y1) / 2)-10/6,   roomWidth/3,3));
		
		
		Point a =new Point();
		a.x=mazeTop.x+roomWidth;
		a.y=mazeTop.y;
		northWall = new GlassWall(g, a.x, a.y, a.x+roomWidth, a.y);
		westWall = new GlassWall(g, a.x+roomWidth, a.y, a.x+roomWidth, a.y+roomHeight);
		eastWall = new GlassWall(g, a.x, a.y, a.x, a.y+roomHeight);
		southWall= new GlassWall(g, a.x, a.y+roomHeight, a.x+roomWidth,  a.y+roomHeight);
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		
		items.add(new SlidingDoor(g, ((northWall.x1 + northWall.x2) / 2)-roomWidth/6,
				((northWall.y2 + northWall.y1) / 2)-10/6,   roomWidth/3,3));
		
		items.add(new SlidingDoor(g, ((southWall.x1 + southWall.x2) / 2),
				((southWall.y2 + southWall.y1) / 2),   roomWidth/2,5));
		
		
		a.x=mazeTop.x;
		a.y=mazeTop.y+roomHeight;
		northWall = new GlassWall(g, a.x, a.y, a.x+roomWidth, a.y);
		westWall = new GlassWall(g, a.x+roomWidth, a.y, a.x+roomWidth, a.y+roomHeight);
		eastWall = new GlassWall(g, a.x, a.y, a.x, a.y+roomHeight);
		southWall= new GlassWall(g, a.x, a.y+roomHeight, a.x+roomWidth,  a.y+roomHeight);
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		
		items.add(new SlidingDoor(g, ((eastWall.x1 + eastWall.x2) / 2),
				((eastWall.y2 + eastWall.y1) / 2),   5,roomHeight/2));
		
		a.x=mazeTop.x+roomWidth;
		a.y=mazeTop.y+roomHeight;
		northWall = new GlassWall(g, a.x, a.y, a.x+roomWidth, a.y);
		westWall = new GlassWall(g, a.x+roomWidth, a.y, a.x+roomWidth, a.y+roomHeight);
		eastWall = new GlassWall(g, a.x, a.y, a.x, a.y+roomHeight);
		southWall= new GlassWall(g, a.x, a.y+roomHeight, a.x+roomWidth,  a.y+roomHeight);
		items.add(northWall);
		items.add(westWall);
		items.add(eastWall);
		items.add(southWall);
		draw();
	}

}
