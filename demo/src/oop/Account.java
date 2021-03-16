package oop;

public class Account {
   // instance variables 
   private int acno;
   private String ahname;
   private double balance;
   
   // methods
   public void open(int no, String name) {
	   acno = no;
	   ahname = name;
	   balance = 0;
   }
   
   public void print() {
	   System.out.printf("%d %s %f\n", acno,ahname,balance);
   }
   
   public void deposit(double amount) {
	   balance += amount;
   }
   
   public void withdraw(double amount) {
	   balance -= amount;
   }
   
}
