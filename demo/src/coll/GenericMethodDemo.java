package coll;

public class GenericMethodDemo {

	public static <T> void printArray(T[] a) {
		for (var v : a)
			System.out.println(v);
	}
	
	public static <T extends Runnable> void  process(T v) {
		
	}

	public static void main(String[] args) {
		String[] names = { "abc", "xyz" };
		Integer[] a = { 10, 20, 30 };

		printArray(names);
		printArray(a);
		
		var p = new Point(10,20);
		process(Thread.currentThread());
		

	}

}
