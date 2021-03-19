package oop;

public class Account {
	// instance variables
	private int acno;
	private String ahname;
	private double balance;
	// class variable
	private static int minbal = 5000;

	// constructor
	public Account(int no, String name) {
		acno = no;
		ahname = name;
		balance = 0;
	}

	// Methods
	public void print() {
		System.out.printf("%d %s %f\n", acno, ahname, balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (balance - minbal >= amount)
			balance -= amount;
		else
			System.out.println("Insufficient Balance!");
	}
	
	public double getBalance() {
		return this.balance; 
	}
	
	static public int getMinBalance() {
		return  minbal; 
	}

}
