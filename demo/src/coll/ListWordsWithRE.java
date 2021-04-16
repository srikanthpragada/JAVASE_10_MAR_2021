package coll;

import java.util.regex.Pattern;

public class ListWordsWithRE {

	public static void main(String[] args) {
		var st = "This is string. Abc, Xyz 123-pqr";
		
		var p = Pattern.compile("\\W+"); // non-word char
		var words = p.split(st);
		
		for(var w : words)
			System.out.println(w);

	}

}
