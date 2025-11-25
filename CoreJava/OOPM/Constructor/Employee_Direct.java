package Constructor;

public class Employee_Direct {
	String name;
	int age;
	int id;
	double salary;

	public static void main(String[] args) {
		Employee_Direct em = new Employee_Direct();
		em.name = "Govind";
		em.age = 19;
		em.id = 1005;
		em.salary = 1000000;
		
		System.out.println(em.name);
		System.out.println(em.age);
		System.out.println(em.id);
		System.out.println(em.salary);
	}
}
