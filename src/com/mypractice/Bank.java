package com.mypractice;
/**
 * This class is used for performing operations on Bank
 * @author reddy yamini
 * @version 1.0
 */
public class Bank {
	/*
	 *This used for denoting the current balance in bank account
	 *it gives the information for user
	 */
//	This used for denoting the current balance in bank account
	
	static int currentBalance = 10000;
	
	public static void greetCustomet() {
		//method body
		System.out.println("Hello Welcome to the Banking Application");
	
	}
	/**
	 * This method is used for getting the balance  from bank accounts
	 * @param amount this is used for depositing
	 * @param a this a test param
	 */
	public void deposit(int amount, int a) {
		currentBalance = currentBalance + amount;
		System.out.println(amount+"Amount is deposited successfully");

	}
	public static void withdraw(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println(amount+"Amount is withdrawed successfully");
		
		
	}
	/**
	 * This method is used for getting the balance  from bank accounts
	 * @return gets the current balance of a bank account
	 */
	public int getCurrentBalance() {
		return currentBalance;
		
	}
	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomet();
		System.out.println("currentBalance = "+bank.getCurrentBalance());
		//bank.deposit(800);
		System.out.println("currentBalance = "+bank.getCurrentBalance());
		withdraw(1000);
		System.out.println("currentBalance = "+bank.getCurrentBalance());
	}

}
