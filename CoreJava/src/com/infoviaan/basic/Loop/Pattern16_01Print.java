package com.infoviaan.basic.Loop;

public class Pattern16_01Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(i == 2) {
					if(j == 1) {
						System.out.print(i % 2);
					} else {
						System.out.print(1);
					}
				} else {
					System.out.print(j % 2);
				}
			}
			System.out.println();
		}
	}

}
