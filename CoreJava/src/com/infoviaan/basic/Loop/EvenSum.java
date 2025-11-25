package com.infoviaan.basic.Loop;

public class EvenSum {
	public static void main(String[] args) {
		int n = 10;
		int evSum = 0;
		for(int i=0; i<=n; i++) {
			if(i%2 == 0) {
				evSum = evSum + i;
				System.out.print(i + " ");
				System.out.println("Even Sum = " + evSum);
			} 	
		}	
		
	}
}
