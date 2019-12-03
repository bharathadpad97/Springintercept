package com.bharat.amity;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Drawing {

	public static void main(String[] args) 
	{
		//Circle circle=new Circle();

		//BeanFactory beanfac= new XmlBeanFactory(new FileSystemResource("spring1.xml"));
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring1.xml");
		
		Circle c1=(Circle)ac.getBean("circle");
		c1.draw();
	}
}
