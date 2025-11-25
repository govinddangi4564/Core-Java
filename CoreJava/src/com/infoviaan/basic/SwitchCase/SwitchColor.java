package com.infoviaan.basic.SwitchCase;

public class SwitchColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char color = 'R';
		
		switch (color) {
		case 'R' :
			System.out.println("Red");
			break;
		case 'G' :
			System.out.println("Green");
			break;
		case 'B' :
			System.out.println("Blue");
			break;
			
		default :
			System.out.println("Color is not available");
		}

	}

}
