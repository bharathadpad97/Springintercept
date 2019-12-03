package com.bharat1.amity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Drawing1 {

	public static void main(String[] args) 
	{
		ApplicationContext a1=new ClassPathXmlApplicationContext("Spring2.xml");
		
		Triangle t1=(Triangle)a1.getBean("triangle");
		
		t1.draw();
		
		
	}

}
