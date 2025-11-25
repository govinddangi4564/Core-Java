package Inheritence;

class Person {
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

class Student extends Person {
	private int Marks;
	private int RollNo;

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
}

public class PersonOrStudent {
	public static void main(String[] args) {
		Student st = new Student();
		st.setAddress("Indore");
		st.setAge(19);
		st.setName("Akshat");
		st.setMarks(99);
		st.setRollNo(15);
	}

}
