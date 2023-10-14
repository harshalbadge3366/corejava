package com.prasad;

public class Person {
	private String name;
	private String city;
	public Person() {
		System.out.println("person class default constructor");
		name="Amit";
		city="Akola";
		
	}
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	

}
