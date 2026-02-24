package IfElse;

public class Result {
	public static void main(String[] args) {
		int rollNo = 101;
		String name = "Govind";
		double hindi = 82.0;
		double english = 93.8;
		double maths = 88.5;
		
		double total = hindi + english + maths;
		double percentage = total / 3.0;
		
		if(percentage > 85 && percentage < 100) {
			System.out.println("Very Good.. A+ Grade  Total Marks = " + total + "  Percentage = " + percentage );
		} else if(percentage > 75 && percentage < 86) {
			System.out.println("Good..  A Grade Total Marks = " + total + "  Percentage = " + percentage);
		}else if(percentage > 45 && percentage < 76) {
			System.out.println("Fine.. B Grade Total Marks = " + total+ "  Percentage = " + percentage);
		}else if(percentage > 34 && percentage < 46) {
			System.out.println("Need Improve.. C Grade Total Marks = " + total+ "  Percentage = " + percentage);
		}else {
			System.out.println("Fail.. Total Marks = " + total+ "  Percentage = " + percentage);
		}
	}
}
