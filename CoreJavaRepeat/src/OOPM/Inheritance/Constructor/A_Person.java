package OOPM.Inheritance.Constructor;

public class A_Person {
	private String name;
	private int age;
	private String mobile;
	private String address;

	A_Person() {
		System.out.println("Person default Constructor...");
	}
	
	A_Person(String name, int age) {
		this();
		this.name = name;
		this.age = age;
		System.out.println("Person two Constructor...");
	}

	A_Person(String name, int age, String mobile, String address) {
		this(name, age);
		this.mobile = mobile;
		this.address = address;
		System.out.println("Person four Constructor...");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAddress() {
		return address;
	}

}
