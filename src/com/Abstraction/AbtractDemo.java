package com.Abstraction;

public class AbtractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq= new Square();
		Rectangle re = new Rectangle();
		sq.calArea();
		sq.show();
		
		re.calArea();
		re.show();
		System.out.println("..........");
		Shape shape;
		shape = new Square(12.5f);
		shape.calArea();
		shape.show();
		
		
		shape = new Rectangle(10,20);
		shape.calArea();
		shape.show();
		
		

	}

}
