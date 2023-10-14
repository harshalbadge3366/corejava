package com.Hate;

public class Myclasss {
	private int section;
	private static int srno;
	static 
	{
		System.out.println("...........within static......");
		srno=1000;
		
	}
	public Myclasss() {
		System.out.println("within default constructor");
		srno++;
		section++;
		
	
	}
	@Override
	public String toString() {
		return "Myclasss [section=" + section + "]"; 67760 
	}
	
	
}
