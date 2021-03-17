package oop;

public class TestAccount {

	public static void main(String[] args) {
		 Account a1;  // object reference 
		 
		 a1 = new Account(101,"James");
		 a1.deposit(10000);
		 a1.withdraw(5000);
		 a1.print();
		 
		 Account a2 = new Account(102,"Andy");
	}

}
