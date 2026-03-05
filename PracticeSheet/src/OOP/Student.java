package OOP;

import java.util.ArrayList;

public class Student {
	private String name;
	private char garde;
	private ArrayList<String> courses;

	public Student(String name, char garde) {
		this.name = name;
		this.garde = garde;
		courses = new ArrayList<String>();
	}

	public void addCourse(String course) {
		courses.add(course);
		System.out.println(course + " added.");
	}

	public void removeCourse(String course) {
		courses.remove(course);
		System.out.println(course + " removed");
	}

	public void displayCourses() {
		System.out.println("Courses : " + courses);
	}

	public static void main(String[] args) {
		Student st = new Student("Govind", 'A');
		
		st.addCourse("Java");
		st.addCourse("HTML");
		st.addCourse("DBMS");
		st.addCourse("JS");
		st.displayCourses();
		
		st.removeCourse("JS");
		st.displayCourses();

	}
}
