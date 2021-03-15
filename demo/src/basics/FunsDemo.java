package basics;

public class FunsDemo {
	
	public static void wish(String name, String message) {
		System.out.printf("%s, %s\n",  message, name);
	}
	
	public static void greet(String message, String ... names) {
		for(String name : names)
		   System.out.printf("%s, %s\n",  message, name);
	}

	public static void main(String[] args) {
	    wish("James", "Hello");	 
	    greet("Hi","James","Mike","Joe");
	    greet("Good Evening","Jack","Joe");
	}

}
