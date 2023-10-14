package com.Overloading;

public class Harshal {
	 int x;
	 int y;
	
	public int Harshal(int x,int y)
	{
		return x+y;
	}
	public float Harshal(float x,float y)
	{
		return x+y;
	}
	
}
class Meth{
	Harshal obj = new Harshal();
	obj.Harshal(10,20);
	obj.Harshal(5.5f,0.1f);
}