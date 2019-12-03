package com.bharat5.amity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Polygon implements Style
{
	private Index i1;
	@Autowired
	private MessageSource m1;
	
	

	public MessageSource getM1() {
		return m1;
	}

	public void setM1(MessageSource m1) {
		this.m1 = m1;
	}

	public Index getI1() {
		return i1;
	}

	public void setI1(Index i1) {
		this.i1 = i1;
	}

	@Override
	public void drawsomething() 
	{
		
		System.out.println(this.m1.getMessage("POLY",null,"default msg",null)); 
		
		System.out.println(this.m1.getMessage("POLYARRAY",new Object[] {10,20,30,40},"default msg",null)); 
		System.out.println(i1.getP()+" "+i1.getQ()+" "+i1.getR()+" "+i1.getS());
		
	}
	
	
}
