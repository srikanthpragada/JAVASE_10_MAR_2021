package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadNames {

	public static void main(String[] args) throws IOException {
		var fr = new FileReader("d:\\classroom\\mar10\\names.txt");
        var br = new BufferedReader(fr);
		while(true)
		{
		   var name = br.readLine(); 
		   if(name == null) // EOF
			   break;
		   System.out.println(name);
		}
		
		br.close();
		fr.close(); 
	}

}
