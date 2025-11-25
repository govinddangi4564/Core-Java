package com.infoviaan.basic.Array;

public class ArrayForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aa[] = {11, 22, 33, 44, 55};
		
		System.out.println(aa[0]);
		System.out.println(aa.length);
		System.out.println("----------------------");
		
		for(int i=0; i<aa.length; i++) {
			System.out.println(aa[i]);
		}
		 System.out.println("------------------");
		 
		 for(int q : aa) {
			 System.out.println("----> " + q);
		 }
		 
		 System.out.println("----------------");
		 
		 String names[] = {"Aaa", "bbbb", "cccc"};
		 
		 for(String x : names) {
			 System.out.println(x);
		 }
	}

}
