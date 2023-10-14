package oops;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,city;
		int id;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the id");
		id=s.nextInt();
		System.out.println("Enter the name");
		name=s.next();
		System.out.println("Enter the city");
		city=s.next();
		 Constructer h = new Constructer();
		 h.setCustomername(name);
		 h.setCustid(id);
		 h.setCustcity(city);
		 System.out.println(h);
		 System.out.println("  ");
		 System.out.println("Enter the id");
			id=s.nextInt();
			System.out.println("Enter the name");
			name=s.next();
			System.out.println("Enter the city");
			city=s.next();
		Constructer h1 = new Constructer(name,id,city);
		 System.out.println(h1);
			
			
		 s.close();
		 
		
		

	}

}
