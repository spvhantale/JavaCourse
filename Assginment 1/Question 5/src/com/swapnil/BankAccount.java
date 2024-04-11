package com.swapnil;

public class BankAccount {

	private Integer accountNumber;
	private Integer balance;


	protected Integer getAccountNumber() {
		return accountNumber;
	}

	protected void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	protected Integer getBalance() {
		return balance;
	}

	protected void setBalance(Integer balance) {
		if(balance>=0) {
			this.balance = balance;
		}else {
			throw new IllegalArgumentException("Value must be greater than 0");
		}
		
		
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

}
