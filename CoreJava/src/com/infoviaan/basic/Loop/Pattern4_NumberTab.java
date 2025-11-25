package com.infoviaan.basic.Loop;

public class Pattern4_NumberTab {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i*j + "\t");
			}
			System.out.println();
		}	
	}
}
