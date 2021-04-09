package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNames {

	public static void main(String[] args) throws IOException {
		var fw = new FileWriter("d:\\classroom\\mar10\\names.txt");
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter name [end to stop] :");
			String name = s.nextLine();
			if (name.equals("end"))
				break;
			fw.write(name + "\n");
		}
		
		fw.close();
	}

}
