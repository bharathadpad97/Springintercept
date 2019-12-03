package com.bharat4.amity;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class Square implements Shape
{

	private Points squarepoint;
	
	
	
	public Points getSquarepoint() {
		return squarepoint;
	}


	/*
	 * @Autowired
	 * 
	 * @Qualifier("bharat")
	 */
	@Resource(name="squarevalues")
	public void setSquarepoint(Points squarepoint) {
		this.squarepoint = squarepoint;
	}

	
	public void draw() 
	{
		System.out.println("Square Length is:"+" "+getSquarepoint().getLength()+" "+"Square Breadth is:"+" "+getSquarepoint().getBreadth());
		
	}

}
