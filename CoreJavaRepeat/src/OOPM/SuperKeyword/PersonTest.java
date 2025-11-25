package OOPM.SuperKeyword;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person();
		Employee em = new Employee();
		
		p.changeAddress();
		
		System.out.println("----------------------------");
		
		em.changeAddress();
		
	}
}
