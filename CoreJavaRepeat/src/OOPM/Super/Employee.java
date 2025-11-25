package OOPM.Super;

public class Employee extends Person{
	private String designation;
	private double salary;
	
	public Employee() {
		System.out.println("Employee default constructor.");
	}
	
	public Employee(String name, int age, String mobile, String address, String desg, double salary) {
		super(name, age, mobile, address);
		this.designation = desg;
		this.salary = salary;
		System.out.println("Employee 6 para constructor");
	}
}
