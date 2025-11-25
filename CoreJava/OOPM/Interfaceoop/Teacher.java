package Interfaceoop;

public class Teacher extends Person implements SocialWorker{
	private String subject;
	private  String salary;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public void helptoOther() {
		System.out.println("Teacher teach the poor or needy Students free of cost ...");
	}
	

}
