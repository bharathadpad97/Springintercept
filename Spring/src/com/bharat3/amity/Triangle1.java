package com.bharat3.amity;

public class Triangle1 
{
	private Point1 pointA;
	private Point1 pointB;
	private Point1 pointC;
	
		
	
	public Point1 getPointA() {
		return pointA;
	}



	public void setPointA(Point1 pointA) {
		this.pointA = pointA;
	}



	public Point1 getPointB() {
		return pointB;
	}



	public void setPointB(Point1 pointB) {
		this.pointB = pointB;
	}



	
	public Point1 getPointC() {
		return pointC;
	}



	public void setPointC(Point1 pointC) {
		this.pointC = pointC;
	}



	public void draw()
	{
		System.out.println("POINT A"+ " (" +getPointA().getX() +","+getPointA().getY()+")" );
		System.out.println("POINT B"+ " (" +getPointB().getX() +","+getPointB().getY()+")"  );
		System.out.println("POINT C"+ " (" +getPointC().getX() +","+getPointC().getY()+")"  );
	}
}
