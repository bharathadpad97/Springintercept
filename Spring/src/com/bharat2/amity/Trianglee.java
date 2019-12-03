package com.bharat2.amity;

import java.util.List;

public class Trianglee {

	private List<Pointer> points;
	

	public List<Pointer> getPoints() {
		return points;
	}
	

	public void setPoints(List<Pointer> points) {
		this.points = points;
	}

	public void draw()
	{

		for(int i=0;i<points.size();i++)
		{
			System.out.println("POINTS ARE"+ " (" +points.get(i).getX() +","+points.get(i).getY()+")" );
		}
		
	}
}
