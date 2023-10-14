package com.Interface;

public class Bank1 implements Bank{
	public void deposit(Account account , double amount)
	{
		if(amount>DEPOSIT_LIMIT)
		{
			System.err.println("Deposit not possible");
			
		}
		else
		{
			System.out.println("deposited"+amount);
		}
		
	}
	public void withdraw(Account account,double amount)
	{
		if(account.getBalance()-amount>=MIN_BALANCE)
		{
			account.setBalance(account.getBalance()-amount);
		}
		else
		{
			System.out.println("INsufficent balance"+account.getBalance());
		}
	}

}
