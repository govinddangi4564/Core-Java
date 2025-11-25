package com.infoviaan.basic.Loop;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int n = 4;
		int fact = 1;
		
		while(i <= n) {
			fact = fact * i;
			i++;
		}
		System.out.println(fact);
	}

}
