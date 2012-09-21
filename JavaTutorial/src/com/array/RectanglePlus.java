package com.array;

public class RectanglePlus implements Relatable {

	public int width =0;
	public int height = 0;
	public Point origin;
	
	// Four Constructors
	
	public RectanglePlus(){
		origin =new  Point(0,0);
	}
	
	public RectanglePlus(Point p){
		origin = p;
	}
	public RectanglePlus(int width,int height) {
		origin = new Point(0,0);
		this.width = width;
		this.height = height;
	}
	public RectanglePlus(Point p,int width,int height) {
		origin = p;
		this.width = width;
		this.height = height;
	}
	
	// method for moving rectangle
	
	public void move(int x,int y){
		origin.x = x;
		origin.y = y;
	}
	
	// methos for area of rectagle
	
	public int getArea() {
		
		return width * height;
	}
	
	// method for required to implement the relatable interface
	
	public int isLargerThan(Relatable other) {
		
		RectanglePlus otherRect = (RectanglePlus) other;
		
		if(this.getArea() < otherRect.getArea())
		
			return -1;
		else if(this.getArea() >otherRect.getArea())
			return 1;
		else 
			return 0;
		
	}
}
