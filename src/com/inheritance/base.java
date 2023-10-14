package com.inheritance;

public class Base {
	private String name;
	private String aadharNO;
	private String aaddress;
	private long phNo;
	public Base() {
		System.out.println("obj created");
		
	}
	public Base(String name, String aadharNO, String aaddress, long phNo) {
		super();
		this.name = name;
		this.aadharNO = aadharNO;
		this.aaddress = aaddress;
		this.phNo = phNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadharNO() {
		return aadharNO;
	}
	public void setAadharNO(String aadharNO) {
		this.aadharNO = aadharNO;
	}
	public String getAaddress() {
		return aaddress;
	}
	public void setAaddress(String aaddress) {
		this.aaddress = aaddress;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Base [name=" + name + ", aadharNO=" + aadharNO + ", aaddress=" + aaddress + ", phNo=" + phNo + "]";
	}
	
	
}
