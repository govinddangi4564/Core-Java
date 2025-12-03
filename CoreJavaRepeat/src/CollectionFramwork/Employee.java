package CollectionFramwork;

public class Employee implements Comparable<Employee>{
	private String name;
	private String eid;
	private int age;
	private double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String eid, int age, double salary) {
		super();
		this.name = name;
		this.eid = eid;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + "\t" + eid + "\t" + age + "\t" + salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		return this.getEid().compareTo(o.getEid());
//		return this.getAge() - o.getAge();
	}

}
