package com.infoviaan.basic.Loop;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evSum = 0, odSum = 0;
		
		for(int i=0; i<=100; i++) {
			if(i % 2 == 0)
				evSum += i;
			else
				odSum += i;
		}
		System.out.println("Even Sum = " + evSum);
		System.out.println("Odd Sum = "+ odSum);
	}

}
