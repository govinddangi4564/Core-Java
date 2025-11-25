package com.infoviaan.basic.Loop;

public class Pattern12_StarArrow {
	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
        	for(int j = 1; j <= 7; j++) {
        		if(i == 3 || i == 4 || j == 5) {
        			System.out.print("* ");
        		} else {
        			System.out.print("  ");
        		}
        	}
        	System.out.println();
        }
	}
}
