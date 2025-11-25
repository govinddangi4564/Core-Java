package Interfaceoop;

public class Student extends Person implements Richmen,  SocialWorker {
	private  String rollNo;
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
	public void helptoOther() {
		System.out.println("Student Help to child by Distribute his old book.");
	}
	@Override
	public void earnMoney() {
		System.out.println("Student Earn Money 1,00,000 K per Month.");
		
	}
	@Override
	public void Party() {
		System.out.println("Student Give party to his friends. ");
	}
	@Override
	public void donation() {
		System.out.println("Student Donates his 30% Money to the Cherity.");
		
	}
}
