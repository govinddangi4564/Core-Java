package Constructor;


public class Employee_Main {
	public static void main(String[] args) {
		
		Employee em = new Employee();
		
		em.name = "Govind";
		em.age = 19;
		em.id = 101;
		em.salary = 750000;

		em.display(); 
		
		Employee em2 = new Employee("Rizwan", 20,102, 800000);
		em2.display();
		
		Employee em3 = new Employee(em2);
		em3.display();
	}
}
