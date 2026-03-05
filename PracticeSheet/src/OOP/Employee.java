package OOP;

public class Employee {
	private String name;
	private String destination;
	private double salary;

	public Employee(String name, String destination, double salary) {
		super();
		this.name = name;
		this.destination = destination;
		this.salary = salary;
	}
	
	double calculateSalary() {
		return salary * 12;
	}

	void updateSalary(double newSalary) {
		salary = newSalary;
	}
	
	void display() {
		System.out.println("Name : " + name);
		System.out.println("Destination : " + destination);
		System.out.println("Salary : " + salary);
	}
	
	public static void main(String[] args) {
		Employee ee = new Employee("Jay", "Indore", 10000.00);
		ee.display();
		System.out.println("Annual Salary : " + ee.calculateSalary());
		
		System.out.println("Updated salary Details : ");
		ee.updateSalary(5000.0);
		ee.display();
	}

}
