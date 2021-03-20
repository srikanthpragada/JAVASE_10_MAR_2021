package oop;

class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}

}

class MyStudent extends Person {
	protected String course;

	public MyStudent(String name, String email, String course) {
		super(name, email);
		this.course = course;
	}
	
    // Overriding 
	@Override 
	public void print() {
		super.print();
		System.out.println(this.course);
	}
}

class MyEmployee extends Person {
	protected String job;

	public MyEmployee(String name, String email, String job) {
		super(name, email);
		this.job = job;
	}

	public void print() {
		super.print();
		System.out.println(this.job);
	}

}

public class TestPerson {

	public static void main(String[] args) {
		MyStudent s = new MyStudent("James", "james@sun.com", "Java");
		s.print();

	}

}
