package com.infoviaan.basic.Loop;

public class RoundLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean hello = true;
		int round = 1;
		
		while(hello) {
			System.out.println("Hello World! " + round);
			round++;
			
			if(round > 10)
				hello = false;
		}

	}

}
