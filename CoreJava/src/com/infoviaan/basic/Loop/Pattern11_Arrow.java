package com.infoviaan.basic.Loop;

public class Pattern11_Arrow {
	public static void main(String[] args) {
		for (int i = 1; i <= 2; i++) {
        	for(int j = 1; j <= 6; j++) {
        		if(j <= 5) {
        			System.out.print("-");
        		} else {
        			if(i == 1) {
        				System.out.print(")");
        			} else
        			System.out.print("/");
        		}
        	}
        	System.out.println();
        }
	}
}
