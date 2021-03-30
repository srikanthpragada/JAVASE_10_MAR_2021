package library;

import java.util.Scanner;

public class LargestString {

	public static void main(String[] args) {
		 
		String largest = "";
		String name;
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter name [end to stop]:");
			name = s.nextLine(); 
			if (name.toLowerCase().equals("end"))
				break;
			
			if ( name.compareTo(largest) > 0)
				 largest = name;
		}
		
		System.out.println(largest);
	}

}
