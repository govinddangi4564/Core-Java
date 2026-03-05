package OOP;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Govind", 19);
		Person p2 = new Person("Sunil", 20);
		
		p1.display();
		p2.display();
	}

}
