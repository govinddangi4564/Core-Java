package Encapsulation;

import java.util.Scanner;

public class Student_Management {
	private String name;
	private int age;
	private int rollNo;
	private int Pmark;
	private int Cmark;
	private int Mmark;

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

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getPmarks() {
		return Pmark;
	}

	public void setPmarks(int pmark) {
		this.Pmark = pmark;
	}

	public int getCmarks() {
		return Cmark;
	}

	public void setCmarks(int cmark) {
		this.Cmark = cmark;
	}

	public int getMmarks() {
		return Mmark;
	}

	public void setMmarks(int mmark) {
		this.Mmark = mmark;
	}

	public double getPercentage() {
		return (Pmark + Cmark + Mmark) / 3.0;
	}

	public void display() {
		System.out.println("Name : " + getName());
		System.out.println("Age : " + getAge());
		System.out.println("Roll No. : " + getRollNo());
		System.out.println("Physics : " + getPmarks());
		System.out.println("Chemistry : " + getCmarks());
		System.out.println("Maths : " + getMmarks());
		System.out.println("Percentage : " + getPercentage());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		sc.nextLine();

		Student_Management[] students = new Student_Management[n];

		for (int i = 0; i < n; i++) {
			students[i] = new Student_Management();
			System.out.println("\nEnter details for Student " + (i + 1) + ":");

			System.out.print("Enter Student name: ");
			students[i].setName(sc.nextLine());

			System.out.print("Enter Student Age: ");
			students[i].setAge(sc.nextInt());

			System.out.print("Enter Student Roll Number: ");
			students[i].setRollNo(sc.nextInt());

			System.out.print("Enter Physics Marks: ");
			students[i].setPmarks(sc.nextInt());

			System.out.print("Enter Chemistry Marks: ");
			students[i].setCmarks(sc.nextInt());

			System.out.print("Enter Mathematics Marks: ");
			students[i].setMmarks(sc.nextInt());

			sc.nextLine();
		}

		for (Student_Management student : students) {
			student.display();
		}

		sc.close();
	}
}
