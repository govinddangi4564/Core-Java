package com.infoviaan.basic.IfElse;

public class TriangleCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		a = 8;
		b = 5;
		c = 5;
		
		if(a == b && b == c) {
			System.out.println("The triangle is Equilateral.");
		} else if(a == b || b == c || a == c) {
			System.out.println("The triangle is Isosceles.");
		} else {
			System.out.println("The triangle is Scalene.");
		}
	}

}
