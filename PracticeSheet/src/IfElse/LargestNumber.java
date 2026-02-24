package IfElse;

public class LargestNumber {
	public static void main(String[] args) {
		int a = 100;
		int b = 24;
		int c = 75;
		
		if(a > b && a > c) {
			System.out.println("A is Largest.");
		} else if(b > a && b > c) {
			System.out.println("B is Largest.");
		}else {
			System.out.println("C is the Largest.");
		}
	}
}
