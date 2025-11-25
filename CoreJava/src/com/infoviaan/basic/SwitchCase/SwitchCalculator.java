package com.infoviaan.basic.SwitchCase;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 150;
		b = 10;

		int choice = 4;
		switch (choice) {
		case 1:
			c = a + b;
			System.out.println("Addition " + c);
			break;
		case 2:
			c = a - b;
			System.out.println("Subtraction " + c);
			break;
		case 3:
			c = a * b;
			System.out.println("Multiplication " + c);
			break;
		case 4:
			c = a / b;
			System.out.println("Division " + c);
			break;
		case 5:
			c = a % b;
			System.out.println("Modulo " + c);
			break;
		default:
			System.out.println("Invalid");
		}

	}

}
