package com.Interface;

public class Bankapp {
	public static void main(String args[]) {
		Bank bank = new Bank1();
		Account account = new Account(1234,"gg",44,bank);
		account.deposit(200);
		System.out.println(account);
		account.withdraw(1000);
		System.out.println(account);
		
	}

}
