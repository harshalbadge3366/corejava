package com.Multi;

public class C extends B {
	int tot;

	public C(int x, int y, int g, int h) {
		super(x, y, g, h);
		// TODO Auto-generated constructor stub
		 tot =x+y+g+h;
		
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	@Override
	public String toString() {
		return "C [tot=" + tot + ", getG()=" + getG() + ", getH()=" + getH() + ", toString()=" + super.toString()
				+ ", getX()=" + getX() + ", getY()=" + getY() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	  
}
