package OOPM.Interface;

public class A_Teacher extends A_Person implements A_SocialWorker {
	private String subject;
	private int salary;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public void helpToOther() {
		System.out.println("Teacher help to other by give free education.");
	}

}
