package Switch;

import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String[] args) {
		double a = 10;
		double b = 5;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for Addition \nEnter 2 for Subtraction \nEnter 3 for Division \nEnter 4 for Multiplication..");
		int result = sc.nextInt();
		
		switch (result) {
		
		case 1:
			System.out.println("a + b = " + (a + b));
			break;
		case 2:
			System.out.println("a - b = " + (a - b));
			break;
		case 3:
			System.out.println("a / b = " + (a / b));
			break;
		case 4:
			System.out.println("a * b = " + (a * b));
			break;
		}
	}
}
