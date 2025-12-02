package CollectionFramwork;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("Govind", 19, "0863CS231062", "B.tech");
		Student s2 = new Student("Akshat", 20, "0863CS231015", "M.tech");
		Student s3 = new Student("Rizwan", 21, "0863CS231088", "Java");
		Student s4 = new Student("Gopal", 18, "0863CS231010", "BE");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("Name \t Age \t RollNo \t Course \n----------------------------------------------------");
		
		for(Student st : al) {
			System.out.println(st.getName() + "\t" + st.getAge() + "\t" + st.getRollNo() + "\t" + st.getCourse());
		}
	}
}
