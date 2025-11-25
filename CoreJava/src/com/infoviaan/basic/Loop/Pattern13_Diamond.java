package com.infoviaan.basic.Loop;

public class Pattern13_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		for(int i=1; i<=n; i++) {
			for(int k=n-1; k>=i; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1; i<=n-1; i++) {
			for(int k=1; k<=i; k++) {
				System.out.print(" ");
			}
			for(int j=n-1; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
