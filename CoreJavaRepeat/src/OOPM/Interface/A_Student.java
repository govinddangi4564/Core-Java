package OOPM.Interface;

public class A_Student extends A_Person implements A_Richman, A_SocialWorker {
	private String rollNo;
	private String course;

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public void helpToOther() {
		System.out.println("Student help to others by donate old books.");

	}

	@Override
	public void earnMoney() {
		System.out.println("Student Earn't 50k Per Month.");
	}

	@Override
	public void party() {
		System.out.println("Student throw party.");

	}

	@Override
	public void donation() {
		System.out.println("Student donate 5k.");

	}

}
