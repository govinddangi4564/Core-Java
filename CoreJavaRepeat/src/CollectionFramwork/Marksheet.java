package CollectionFramwork;

public class Marksheet {
	private String name;
	private int age;
	private String rollNo;
	private double percentage;

	public Marksheet() {
		// TODO Auto-generated constructor stub
	}

	public Marksheet(String name, int age, String rollNo, double percentage) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return name + "\t" + age + "\t" + rollNo + "\t" + percentage;
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

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
