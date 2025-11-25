package Super_Keyword;

public class Basic {
	public static class student {
		String name;
		int age;
		int rollNo;
		int id;

		public student(String name, int age, int rollNo, int id) {
			this.name = name;
			this.age = age;
			this.rollNo = rollNo;
			this.id = id;
		}
		public void display() {
			System.out.println("Name = " + name);
			System.out.println("Age = " + age);
			System.out.println("RollNo= " + rollNo);
			System.out.println("ID = " + id);
		}

	}

	public static class student1 extends student {
		
		public student1(String name, int age, int rollNo, int id) {
			super(name, age, rollNo, id);
		}

		public void display() {
			System.out.println("Name = " + name);
			System.out.println("Age = " + age);
			System.out.println("RollNo= " + rollNo);
			System.out.println("ID = " + id);
		}

	}

	public static void main(String[] args) {
		student st = new student("Govind", 18, 62, 101);
		st.display();

		student1 st1 = new student1("Akshat", 19, 15, 102);
		st1.display();

	}
}
