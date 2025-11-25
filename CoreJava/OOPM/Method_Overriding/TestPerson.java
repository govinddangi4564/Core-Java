package Method_Overriding;

public class TestPerson {
	public static void main(String[] args) {
		Person p = new Employee();
		p.changeAddress();
		System.out.println("---------------------");
		
		Employee e = new Employee();
		e.changeAddress();
	}
}
