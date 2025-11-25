
package com.infoviaan.basic.Loop;

public class Pattern25_10 {

	public static void main(String[] args) {
		for(int i =1; i<=5; i++) {
			for(int k=4; k>=i; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
					System.out.print("10");
				}	
			System.out.println();
		}
	}
}
