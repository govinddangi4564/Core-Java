package Method_Overriding;

public class Person {
	public void changeAddress() {
		System.out.println("Person Address changed");
	}
}

class Employee extends Person{
	public void changeAddress() {
		super.changeAddress();
		System.out.println("Employee Address changed");
	}
}
