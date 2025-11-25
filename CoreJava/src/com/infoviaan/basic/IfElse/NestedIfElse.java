package com.infoviaan.basic.IfElse;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		a = 820;
		b = 30;
		c = 255;
		
		if(a > b) {
			if(a > c) {
				System.out.println(a +" First Number is Largest");
			} else {
				System.out.println(c +" Third Number is Largest");
			}
	   } else {
		   if(b > c) {
			   System.out.println(b +" Second Number is Largest");
		   } else {
			   System.out.println(c +" Third number is Largest");
		   }
	   }
	}
}