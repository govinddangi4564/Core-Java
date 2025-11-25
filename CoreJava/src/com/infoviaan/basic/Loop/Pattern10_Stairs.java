package com.infoviaan.basic.Loop;

public class Pattern10_Stairs {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
        	for(int j = 1; j <= 3; j++) {
        		if(j == 1 || j == 3) {
        			System.out.print("|");
        		} else {
        			System.out.print("--");
        		}
        	}
        	System.out.println();
        }
	}
}
