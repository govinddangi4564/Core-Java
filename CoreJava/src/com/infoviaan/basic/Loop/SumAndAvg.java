package com.infoviaan.basic.Loop;

public class SumAndAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		float n = 10;
		int sum = 0;
		
		while(i <= n) {
			sum = sum + i;
			i++;
		}
		float avg = sum / n;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + avg);
	}

}
