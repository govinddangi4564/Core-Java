package com.infoviaan.basic.Loop;

public class SumAndProOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 523;
		int digit = n;
		int sum = 0;
		int pro = 1;
		
		while(digit != 0) {
			int rem = digit % 10;
			digit = digit / 10;
			sum = sum + rem;
			pro = pro * rem;
		}
		System.out.println("Sum = " + sum);

		System.out.println("Product = " + pro);
	}

}
