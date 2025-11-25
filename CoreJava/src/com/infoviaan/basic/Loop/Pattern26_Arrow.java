package com.infoviaan.basic.Loop;

public class Pattern26_Arrow {
	public static void main(String[] args) {
		int n = 10;
		for (int i = 1; i <= n; i++) {
			for (int k = n - 1; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= (n / 2 + 2); j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
