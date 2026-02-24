package IfElse;

public class LeapYear {
	public static void main(String[] args) {
		int n = 2000;
		
		if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
			System.out.println("Enterd year is Leap Year");
		}else {
			System.out.println("Not Leap Year");
		}
	}
}
