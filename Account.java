
//1.3) Create Class Account with data member As Balance. 
//Create two constructors (no argument and two arguments) and perform following task,
//a) method to deposit the amount to the account.
//b) method to withdraw the amount from the account.
//c) method to display the Balance.

package com.demo.task.two;

public class Account {
	private double balance;

	public Account() {
		this.balance = 0;
	}

	public Account(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposit successful. New balance: " + balance);
		} else {
			System.out.println("Invalid amount. Deposit failed.");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawal successful. New balance: " + balance);
		} else {
			System.out.println("Invalid amount. Withdrawal failed.");
		}
	}

	public void displayBalance() {
		System.out.println("Current balance: " + balance);
	}

	public static void main(String[] args) {

		Account account = new Account(1000);

		account.deposit(500);

		account.withdraw(200);

		account.displayBalance();
	}
}
