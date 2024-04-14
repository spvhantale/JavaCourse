package com.swapnil;

public class BankAccount {

	private double balance;
	
	public BankAccount(double balance) {
		this.balance=balance;
	}
	
	public synchronized void deposit(double amount) {
		balance+=amount;
	}
	
	public synchronized void withdraw(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("Insufficient Amount");
		}
	}
	
	public synchronized double getBalance() {
		return balance;
	}
}
