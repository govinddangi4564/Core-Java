package com.infoviaan.basic.Loop;

public class FactorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 60;
		
		for(int i=1; i<=n; i++) {
			
			if(n % i == 0) {
			
			System.out.print(i + " ");
			}
		}

	}

}
