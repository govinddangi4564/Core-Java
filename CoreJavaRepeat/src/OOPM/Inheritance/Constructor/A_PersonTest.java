package OOPM.Inheritance.Constructor;

public class A_PersonTest {
	public static void main(String[] args) {
		A_Person p1 = new A_Person();
		
		System.out.println("----------------------------------------");
		
		A_Person p2 = new A_Person("Ram", 20);
		
		System.out.println("----------------------------------------");

		A_Person p3 = new A_Person("Ram", 20, "+91 7067624444", "Indore");
		
		System.out.println("----------------------------------------");

		System.out.println(p3.getName() + "  " + p3.getAge() + "  " + p3.getMobile() + "  " + p3.getAddress());
	}

}
