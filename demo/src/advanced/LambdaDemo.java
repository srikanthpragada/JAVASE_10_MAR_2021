package advanced;

class PrintNumbers implements Runnable {
	@Override
	public void run() {
		System.out.println("Print Numbers!");
	}
}

public class LambdaDemo {

	public static void main(String[] args) {
		// Normal implementation of Runnable Interface 
		Thread t = new Thread(new PrintNumbers());
		t.start();

		// Anonymous Inner class
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("Thread with Anonymous Inner Class");
			}
		});
		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("Lambda Expression"));
		t3.start();

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 10; i++)
				System.out.println(i);
		});
		t4.start();
		
		// Method reference
		Thread t5 = new Thread(LambdaDemo::printNumbers);
		t5.start();
	}

	public static void printNumbers() {
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
	}

}
