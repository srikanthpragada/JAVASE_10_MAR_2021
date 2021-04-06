package oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfNumbers2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int sum = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("Enter number :");
			try {
				int num = Integer.parseInt(s.nextLine());
				sum += num;
			} catch (NumberFormatException ex) {
				System.out.println("Invalid number!");
			}
		}

		System.out.println(sum);

	}

}
