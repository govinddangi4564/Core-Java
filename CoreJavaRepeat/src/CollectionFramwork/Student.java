package CollectionFramwork;

public class Student {
	private String name;
	private int age;
	private String RollNo;
	private String course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(String name, int age, String rollNo, String course) {
		super();
		this.name = name;
		this.age = age;
		RollNo = rollNo;
		this.course = course;
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
		return RollNo;
	}
	public void setRollNo(String rollNo) {
		RollNo = rollNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}
