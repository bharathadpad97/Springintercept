package com.bharat.J2EE;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainclassJ2EE {
	
	
	public static void main(String[] args) 
	{
		AbstractApplicationContext a1 = new ClassPathXmlApplicationContext("SpringJ2EE.xml");

		Connect con = (Connect) a1.getBean("connect");
		con.execute();
	}

}

