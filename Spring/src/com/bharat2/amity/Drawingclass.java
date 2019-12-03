package com.bharat2.amity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawingclass {

	public static void main(String[] args) 
	{
		ApplicationContext a1=new ClassPathXmlApplicationContext("spring3.xml");
		
		Trianglee t1=(Trianglee)a1.getBean("trianglee");
		
		t1.draw();
		t1.draw();

	}

}
