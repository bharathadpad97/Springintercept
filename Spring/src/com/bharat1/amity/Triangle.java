package com.bharat1.amity;

public class Triangle 
{
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	
	public void draw()
	{
		System.out.println("POINT A"+ " (" +getPointA().getX() +","+getPointA().getY()+")" );
		System.out.println("POINT B"+ " (" +getPointB().getX() +","+getPointB().getY()+")"  );
		System.out.println("POINT C"+ " (" +getPointC().getX() +","+getPointC().getY()+")"  );
	}
}
