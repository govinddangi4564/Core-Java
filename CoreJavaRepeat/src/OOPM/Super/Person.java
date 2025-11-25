package OOPM.Super;

public class Person {
	private String name;
	private int age;
	private String mobile;
	private String address;
	
	public Person() {
		System.out.println("Person default constructor");
	}
	
	public Person(String na, int age, String mobile, String address) {
		this.name = na;
		this.age = age;
		this.mobile = mobile;
		this.address = address;
		
		System.out.println("Person 4 param. Constructor");
	}
}
