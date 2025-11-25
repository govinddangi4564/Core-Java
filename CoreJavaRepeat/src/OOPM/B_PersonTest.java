package OOPM;

public class B_PersonTest {
	public static void main(String[] args) {
		B_Person p1 = new B_Person();
		B_Person p2 = new B_Person();
		B_Person p3 = new B_Person();

		p1.setName("Govind");
		p1.setAge(19);
		p1.setNumber("7067624564");
		p1.setAddress("Teen Imli, Indore");

		p2.setName("Akshat");
		p2.setAge(20);
		p2.setNumber("9589776215");
		p2.setAddress("Peepliyana, Indore");

		p3.setName("Rizwan");
		p3.setAge(18);
		p3.setNumber("9617809022");
		p3.setAddress("Naytamundla, Indore");

		System.out.println("Person 1 Details are : ");
		System.out.println(p1.getName() + "  " + p1.getAge() + "  " + p1.getNumber() + "  " + p1.getAddress());
		
		System.out.println("Person 2 Details are : ");
		System.out.println(p2.getName() + "  " + p2.getAge() + "  " + p2.getNumber() + "  " + p2.getAddress());
		
		System.out.println("Person 3 Details are : ");
		System.out.println(p3.getName() + "  " + p3.getAge() + "  " + p3.getNumber() + "  " + p3.getAddress());
	}
}
