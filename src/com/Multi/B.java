package com.Multi;

public class B extends A{
	private int g;
	private int h;
	public B(int x, int y, int g, int h) {
		super(x, y);
		this.g = g;
		this.h = h;
	}
	public int getG() {
		return g;
	}
	public void setG(int g) {
		this.g = g;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	@Override
	public String toString() {
		return "B [g=" + g + ", h=" + h + "]";
	}

	
}
