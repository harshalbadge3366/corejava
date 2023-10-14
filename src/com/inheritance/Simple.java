package com.inheritance;

public class Simple {
	private String name;
	private String aadharNo;
	private String address;
	private long rollno;
	public Simple() {
		System.out.println("cictizen obj created");
		
	}
	public Simple(String name, String aadharNo, String address, long rollno) {
		super();
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Simple [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", rollno=" + rollno + "]";
	}
	
	
	

}
