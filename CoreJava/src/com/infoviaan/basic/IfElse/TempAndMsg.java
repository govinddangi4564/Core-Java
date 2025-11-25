package com.infoviaan.basic.IfElse;

public class TempAndMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp = 20;
		
		if(temp >= 35) {
			System.out.println("It is a very high temperature");
		} else if(temp < 35 && temp >= 20){
			System.out.println("It is a Slightly Normal Temperature");
		} else if(temp < 20 && temp >= 5) {
			System.out.println("It is a Normal Temperature");
		} else {
			System.out.println("It is Low Temperature");
		}

	}

}
