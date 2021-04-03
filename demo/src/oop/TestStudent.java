package oop;

class Student {
	private String name;
	int course; // default access 
	private int feepaid;
	// private Payment paydetails;

	public Student(String name, int course, int feepaid) {
		this.name = name;
		this.course = course;
		this.feepaid = feepaid;
	}

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	public Student(String name) {
		this.name = name;
		this.course = 1; // Java
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.course == 1 ? "Java" : "Python");
		System.out.println(this.feepaid);
	}

	private int totalFee() {
		return this.course == 1 ? 10000 : 8000;
	}

	public void payment(int amount) {
		if (amount > getDue())
			System.out.println("Excess fee being paid!");
		else
			this.feepaid += amount;
	}

	public int getDue() {
		return totalFee() - feepaid;
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("James");
		s1.print();
		Student s2 = new Student("Andy", 2, 8000);
		s2.print();
		s2.payment(2000);

	}

}
