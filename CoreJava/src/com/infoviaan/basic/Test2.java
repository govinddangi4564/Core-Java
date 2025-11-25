package com.infoviaan.basic;

public class Test2 {
    public static void main(String[] args) {
    	int a = 10;
    	for(int i=4; i>=1; i--) {
    		for(int j=i; j>=1; j--){
    			System.out.print(a + " ");
    			a--;
    		}
    		System.out.println();
    	}
    }
}