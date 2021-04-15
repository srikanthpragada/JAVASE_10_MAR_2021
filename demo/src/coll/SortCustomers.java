package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeMap;

public class SortCustomers {

	public static void main(String[] args) throws IOException {
		var customers = new TreeMap<String,String>();
		
		 Path path = Paths.get("d:\\classroom\\mar10\\customers.txt");
		 var lines = Files.readAllLines(path);
		 
		 for(String line : lines)
		 {
			 var parts = line.split(",");
			 customers.put(parts[0],  parts[1]);
		 }
		 
		 for(String name : customers.keySet())
		     System.out.printf("%-20s %10s\n", name, customers.get(name));
		 

	}

}
