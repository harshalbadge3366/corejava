package com.inheritance;

public class Person extends Base {
	private int rollno;
	private String collegename;
	public Person() {
		
	}
	public Person(String name, String aadharNO, String aaddress, long phNo,int rollno, String collegename) {
		
		super(name,aadharNO,aaddress,phNo);
		this.rollno = rollno;
		this.collegename = collegename;
	
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "Person [rollno=" + rollno + ", collegename=" + collegename + ", getName()=" + getName()
				+ ", getAadharNO()=" + getAadharNO() + ", getAaddress()=" + getAaddress() + ", getPhNo()=" + getPhNo()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
