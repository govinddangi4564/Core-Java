package OOP;

import java.util.ArrayList;

public class School {
	private ArrayList<String> students;
	private ArrayList<String> teachers;
	private ArrayList<String> classes;
	
	public School() {
		students = new ArrayList<String>();
		teachers = new ArrayList<String>();
		classes = new ArrayList<String>();
	}

	public void addStudents(String student1) {
		students.add(student1);
//		System.out.println(student1 + " added.");
	}

	public void removeStudents(String student1) {
		students.remove(student1);
//		System.out.println(student1 + " removed.");
	}

	public void displayStudents() {
		System.out.println("Students : " + students);
	}

	public void addTeachers(String teacher) {
		teachers.add(teacher);
//		System.out.println(teacher + " added.");
	}

	public void removeTeachers(String teacher) {
		teachers.remove(teacher);
//		System.out.println(teacher + " removed.");
	}

	public void displayTeachers() {
		System.out.println("Teachers : " + teachers);
	}

	public void createClasses(String class1) {
		classes.add(class1);
//		System.out.println(class1 + " created");
	}
	
	public void displayClasses() {
		System.out.println("Classes : " + classes);
	}
	
	public static void main(String[] args) {
		School sc = new School();
		
		sc.addStudents("Govind");
		sc.addStudents("Sunil");
		sc.addStudents("Akshat");
		sc.addStudents("Rizwan");
		sc.addStudents("Jay");
		
		sc.displayStudents();
		
		sc.removeStudents("Jay");
		sc.displayStudents();
		
		sc.addTeachers("Atul");
		sc.addTeachers("Avijeet");
		sc.addTeachers("Taresh");
		sc.addTeachers("Jay");
		
		sc.displayTeachers();
		
		sc.removeTeachers("Jay");
		sc.displayTeachers();
		
		sc.createClasses("DBMS");
		sc.createClasses("OS");
		sc.createClasses("SE");
		sc.createClasses("IWT");
		
		sc.displayClasses();
	}

}
