package com.infoviaan.basic.Loop;

public class SumAndAvgOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		int digit = n;
		int sum = 0;
		int count = 0;
		
		while(digit != 0) {
			int rem = digit % 10;
			digit = digit / 10;
			sum = sum + rem;
			count++;
		}
		System.out.println("Sum = " + sum);
		int avg = sum / count;
		System.out.println("Average = " + avg);
	}

}
