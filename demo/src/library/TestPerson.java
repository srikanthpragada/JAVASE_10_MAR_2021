package library;

class Person
{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override 
	public String toString() {
		return this.name + "," + this.age;
	}
	
	@Override 
	public boolean equals(Object obj) {
		return false; 
	}
}
public class TestPerson {

	public static void main(String[] args) {
		 Person p1 = new Person("James",50);
		 Person p2 = new Person("James",50);
		 System.out.println(p1.equals(p2));
		 System.out.println(p1.toString());
	}
}
