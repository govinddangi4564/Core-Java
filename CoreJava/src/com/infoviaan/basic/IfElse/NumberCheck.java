package com.infoviaan.basic.IfElse;

public class NumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9382;
		int l, s;
		l = n % 10;
		n = n / 10;
		s = n % 10;
		
		if(l > s) {
			System.out.println(l + " Last Number is Greatest");
		}else {
			System.out.println(s + " Sencond last Number is Greatest");
		}

	}

}
