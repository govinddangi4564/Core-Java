package com.infoviaan.basic.Method;

public class MyMethod {
		
	int[] square(int x[]) {
		int tt[] = new int[x.length];
		for(int i = 0; i < x.length; i++) {
			tt[i] = x[i] * x[i];
		}
		return tt;
	}
	
	public static void main(String[] args) {
		int pp[] = {4, 66, 5, 2, 8, 9, 7};
		
		MyMethod obj = new MyMethod();
		
		int gg[] = obj.square(pp);
		
		for(int k : gg) {
			System.out.println("Square is : " + k);
		}
	}
 
}
