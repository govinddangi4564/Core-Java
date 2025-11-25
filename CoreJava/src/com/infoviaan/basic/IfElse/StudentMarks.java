package com.infoviaan.basic.IfElse;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Govind";
		int rollNo = 62;
		int M1, M2, M3;
		M1 = 90;
		M2 = 85;
		M3 = 70;
		
		int marks = M1 + M2 + M3;
		double percentage = (marks) * 100 / 300;
		
		if(percentage >= 90) {
			System.out.println("Name = " + name + "\nRoll Number = " + rollNo + "\nTotal percentage is = " + percentage + "\nGrade is = A" + "\nResult Pass");
		} else if(percentage >= 75 && percentage < 90) {
			System.out.println("Name = " + name + "\nRoll Number = " + rollNo + "\nTotal percentage is = " + percentage + "\nGrade is = B" + "\nResult Pass");
		} else if(percentage >= 50 && percentage < 75) {
			System.out.println("Name = " + name + "\nRoll Number = " + rollNo + "\nTotal percentage is = " + percentage + "\nGrade is = C" + "\nResult Pass");
		} else if(percentage >= 35 && percentage < 50) {
			System.out.println("Name = " + name + "\nRoll Number = " + rollNo + "\nTotal percentage is = " + percentage + "\nGrade is = D" + "\nResult Pass");
		} else {
			System.out.println("Name = " + name + "\nRoll Number = " + rollNo + "\nTotal percentage is = " + percentage + "\nGrade is = E" + "\nResult Fail");
		}
	}

}
