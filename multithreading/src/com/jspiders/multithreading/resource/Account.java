package com.jspiders.multithreading.resource;

public class Account {
	double accountBalance;

	public Account(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double checkBalance() {
		return this.accountBalance;
	}

	public synchronized void deposit(double amount) {
		System.out.println("Depositing " + amount + "in the account");
		accountBalance += amount;
		System.out.println("current Balance :" + checkBalance());
	}

	public synchronized void withdraw(double amount) {
		System.out.println("withdrawing " + amount + " from the account");
		accountBalance -= amount;
		System.out.println("current Balance :" + checkBalance());

	}
}
