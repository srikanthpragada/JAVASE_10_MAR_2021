package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;

public class SortNames {

	public static void main(String[] args) throws IOException {
		 Path path = Paths.get("d:\\classroom\\mar10\\names.txt");
		 var lines = Files.readAllLines(path);
		 
		 Collections.sort(lines);
		 
		 for(var line : lines)
			 System.out.println(line);
	}

}
