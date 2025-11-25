package com.infoviaan.basic.Loop;

public class SquareAndCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int square = 0;
		int cube = 0;
		
		for(int i=1; i<=n; i++) {
			square = square + n;
			cube = cube + square;
		}
		System.out.println("Square  = " + square);
		System.out.println("Cube = " + cube);
	}

}
