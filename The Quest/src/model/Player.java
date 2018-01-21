package model;

import java.awt.Point;

public class Player {
	
	private Point position;
	
	public Player(){
		position = new Point(12, 12);
	}
	
	public Point getPosition(){
		return position;
	}

}
