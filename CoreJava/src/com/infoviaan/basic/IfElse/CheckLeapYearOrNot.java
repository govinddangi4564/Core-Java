package com.infoviaan.basic.IfElse;

public class CheckLeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2004;
		
		if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
			System.out.println("The Month is Leap Year");
		} else {
			System.out.println("The Month is not a Laep Year");
		}

	}

}
