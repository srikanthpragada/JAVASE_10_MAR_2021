package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			try {
				int num = s.nextInt();
				sum += num;
			} catch (InputMismatchException ex) {
				System.out.println("Invalid number!");
				s.nextLine(); // clear buffer 
			}
		}

		System.out.println(sum);

	}

}
