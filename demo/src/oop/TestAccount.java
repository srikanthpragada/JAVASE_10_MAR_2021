package oop;

public class TestAccount {

	public static void main(String[] args) {
		 Account a1;  // object reference 
		 
		 a1 = new Account();   // object
		 a1.open(101,"James");
		 a1.deposit(10000);
		 a1.withdraw(5000);
		 a1.print();
	}

}
