package OOPM.SuperKeyword;

public class Person {
	public void changeAddress() {
		System.out.println("Person change address ");
	}
}

class Employee extends Person {
	public void changeAddress() {
		super.changeAddress();
		System.out.println("Employee change address ");
	}

}
