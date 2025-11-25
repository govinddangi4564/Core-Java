package Constructor;

public class Employee {
	String name;
	int age;
	int id;
	double salary;
	
	public void display() {
		System.out.println("-------------------------");
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("ID = " + id);
		System.out.println("Salary = " + salary);
		System.out.println("-------------------------");
	}
	
	Employee(){  // Default Constructor
		System.out.println("Default Constructor");
	}
	
	Employee(String n, int a, double s, int i){   // Parametrized Constructor 
		name = n;
		age = a;
		salary = s;
		id = i;
	}
	
	Employee(Employee cp){   // Copy Constructor
		this.name = cp.name;
		this.age = cp.age;
		this.salary = cp.salary;
		this.id = cp.id;
		
//		name = cp.n;
//		age = cp.a;
//		salary = cp.s;
//		id  = cp.i;
		
	}
}
