package Collection_Framwork;

public class Marksheet {
	private String name;
	private int age;
	private String rollNo;
	private int Marks;
	
	public Marksheet() {
		
	}

	public Marksheet(String name, int age, String rollNo, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		Marks = marks;
	}

	@Override
	public String toString() {
		return name + " \t" + age + "\t" + rollNo + "\t" + Marks;
	}

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

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	
}
