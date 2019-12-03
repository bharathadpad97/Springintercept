package com.bharat4.amity;

public class Rectangle implements Shape
{
	Points trianglepoint;

	public Points getTrianglepoint() {
		return trianglepoint;
	}

	public void setTrianglepoint(Points trianglepoint) {
		this.trianglepoint = trianglepoint;
	}

	@Override
	public void draw()
	{
	System.out.println("Reactangle Length is:"+" "+getTrianglepoint().getLength()+" "+"Reactangle Breadth is:"+" "+getTrianglepoint().getBreadth());
	}

}
