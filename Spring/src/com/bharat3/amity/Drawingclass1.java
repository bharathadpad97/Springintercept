package com.bharat3.amity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawingclass1 {

	public static void main(String[] args) 
	{
		ApplicationContext a1=new ClassPathXmlApplicationContext("spring4.xml");
		
		Triangle1 t1=(Triangle1)a1.getBean("triangle1");
		
	
		
		t1.draw();
		
		

	}

}
