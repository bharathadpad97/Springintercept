package com.bharat5.amity;

public class Rhombus implements Style {
	
	private Index i2;
	
	

	public Index getI2() {
		return i2;
	}



	public void setI2(Index i2) {
		this.i2 = i2;
	}



	@Override
	public void drawsomething() {
		System.out.println("Rhombus point is :");
		System.out.println(i2.getP()+" "+i2.getQ()+" "+i2.getR()+" "+i2.getS());
		
		
	}

}
