package com.bharat4.amity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingShape {

	public static void main(String[] args) 
	{
		ApplicationContext a1=new ClassPathXmlApplicationContext("spring5.xml");
		
		Shape s1=(Shape) a1.getBean("square");
		
	
		
	
		
		s1.draw();
	}

}
