package com.Interface;

public class Account {
	private int accno;
	private String namee;
	private double balance;
	private Bank bank;
	public Account(int accno, String namee, double balance, Bank bank) {
		super();
		this.accno = accno;
		this.namee = namee;
		this.balance = balance;
		this.bank = bank;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getNamee() {
		return namee;
	}
	public void setNamee(String namee) {
		this.namee = namee;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", namee=" + namee + ", balance=" + balance + ", bank=" + bank + "]";
	}
	
	public void deposit(double amount) {
		bank.deposit(this,amount);
	} 
	public void withdraw(double amount) {
	     bank.withdraw(this, amount);
	 }

	
			
	
	

}
