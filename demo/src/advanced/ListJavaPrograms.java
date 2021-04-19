package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ListJavaPrograms {

	public static void main(String[] args) throws IOException {
        Files.walk(Paths.get("d:\\classroom\\mar10\\demo"))
             .filter(p -> p.toString().endsWith(".java"))
             .forEach(System.out::println);
	}

}
