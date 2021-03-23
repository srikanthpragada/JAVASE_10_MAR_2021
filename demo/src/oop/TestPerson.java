package oop;

abstract class Person {
	protected String name, email;

	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public void print() {
		System.out.println(this.name);
		System.out.println(this.email);
	}
	
	public abstract String getOccupation();
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
	
	@Override 
	public String getOccupation() {
		return "Course = " + this.course; 
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
	
	public String getOccupation() {
		return "Job = " + this.job;
	}
}

public class TestPerson {

	public static void main(String[] args) {
		Person p = new MyStudent("James", "james@sun.com", "Java");
		p.print(); // Runtime Polymorphism 
		System.out.println(p.getOccupation());
		
		p = new MyEmployee("Mark","marks@gmail.com","Programmer");
		p.print(); // Runtime Polymorphism 
		System.out.println(p.getOccupation());
	}

}
