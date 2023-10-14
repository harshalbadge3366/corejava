package com.prasad;

public class Her {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1);
		System.out.println(".............................");
		Person p;
		p = new Person("kumar","Mumbai");
		if(p instanceof Person)
			System.out.println("person details"+p);
		
		

	}

}
