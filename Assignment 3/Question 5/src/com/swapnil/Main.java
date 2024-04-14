package com.swapnil;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		Thread depositThread = new Thread(() -> {

			for (int i = 0; i < 100; i++) {
				account.deposit(10);
			}
		});
		Thread withdrawThread = new Thread(() -> {

			for (int i = 0; i < 100; i++) {
				account.withdraw(10);
			}
		});

		depositThread.start();
		withdrawThread.start();
		
		try {
			depositThread.join();
			withdrawThread.join();
		}catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Final Balance: "+account.getBalance());
	}

}
