package advanced;

import java.util.Arrays;

public class ListMoreThanAverageMarks {

	public static void main(String[] args) {
		int [] marks = {90,60,50,66,77,80,34,56,70,80};
		
		var avg = Arrays.stream(marks).average().getAsDouble();
		
		System.out.println(avg);
		
		Arrays.stream(marks)
		      .filter( m -> m > avg)
		      .sorted()
		      .forEach(m -> System.out.println(m - avg));
		

	}

}
