package coll;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeSet;

public class SortNamesWithTreeSet {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("d:\\classroom\\mar10\\names.txt");
		var br = Files.newBufferedReader(path);

		var names = new TreeSet<String>();

		while (true) {
			var line = br.readLine();
			if (line == null)
				break;
			names.add(line);
		}

		for (var name : names)
			System.out.println(name);
	}

}
