package com.infoviaan.basic.IfElse;

public class MonthCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		
		if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
			System.out.println("Total days in the moth is = 31");
		} else if(n == 4 || n == 6 || n == 9 || n == 11) {
			System.out.println("Total days in the month is = 30");
		} else if(n == 2) {
			if((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
				System.out.println("It is a leaf year, Total days of the month is 29");
			} else {
				System.out.println("It is not a leaf year, Total days of the month is 28");
			}
		} else {
			System.out.println("You entred Invalid Month");
		}

	}

}
