package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.TreeSet;

public class SortNames {

	public static void main(String[] args) throws IOException {
		 Path path = Paths.get("d:\\classroom\\mar10\\names.txt");
		 
		 Files.lines(path)
		      .sorted()
		      .forEach(System.out::println);
		 
		 // Sort names by length 
		 Files.lines(path)
	      .sorted( (s1,s2) -> s1.length() - s2.length())
	      .forEach(System.out::println);
	}

}
