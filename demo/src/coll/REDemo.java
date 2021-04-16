package coll;

import java.util.regex.Pattern;

public class REDemo {

	public static void main(String[] args) {
		String st = "A1235";
		if ( Pattern.matches("[A-Z]{2}\\d{3}", st))
			System.out.println("Valid code");
		else
			System.out.println("Invalid code");
	}
}
