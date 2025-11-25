package com.infoviaan.basic.Loop;

public class WhileSum1To10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int evensum = 0;
		int oddsum = 0;
		
		while(i<=100) {
			if(i % 2 == 0)	
				evensum = evensum + i;
			else
				oddsum = oddsum + i;
			i++;
		}
		System.out.println(evensum);
		System.out.println(oddsum);
	}

}
