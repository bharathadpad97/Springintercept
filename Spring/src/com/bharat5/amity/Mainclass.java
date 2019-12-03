package com.bharat5.amity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mainclass {

	public static void main(String[] args) 
	{
		ApplicationContext a1=new ClassPathXmlApplicationContext("spring6.xml");
		
		Style s1=(Style)a1.getBean("polygon");
		
		s1.drawsomething();
		
		/* System.out.println( a1.getMessage("POLY",null,"default msg",null)); */
	}

}
