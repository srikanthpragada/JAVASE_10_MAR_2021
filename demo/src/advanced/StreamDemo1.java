package advanced;

import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
   	    String names[] = {"Java","Python","JavaScript","C",
				 "C#","TypeScript","VB.NET"};
		Arrays.stream(names).filter( s -> s.length() > 3)
		                    .sorted()
		                    // .forEach(s -> System.out.println(s));
		                    .forEach(System.out::println);
	}

}
