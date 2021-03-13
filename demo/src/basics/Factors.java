package basics;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {

		// Take a number from user
		System.out.print("Enter a number :");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				System.out.println(i);
		}

	}

}
