package com.Hate;

public class Employee {
	private String name;
	private int id;
	static String companyname = "tns";
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	

}
