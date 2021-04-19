package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SearchJavaPrograms {

	static boolean FileContainsString(Path path, String search) {
		try {
			return Files.readString(path).indexOf(search) >= 0;
		} catch (Exception ex) {
			return false;
		}
	}

	public static void main(String[] args) throws IOException {
		String search = "Reader";

		Files.walk(Paths.get("d:\\classroom\\mar10\\demo"))
		     .filter(p -> FileContainsString(p, search))
			 .forEach(System.out::println);
	}

}
