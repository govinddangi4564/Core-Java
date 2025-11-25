package com.infoviaan.basic.IfElse;

public class MarriageBeuroe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Akshat";
		int age = 25;
		String gender = "Male";
		
		System.out.println("******Welcome To Apna Marriage Beutoe******");
		
		if(age < 21) {
			System.out.println("Sorry! You can not eligible for Apply. ");
		} else if (age > 50) {
			System.out.println("Sorry! You are Overage. So you cannot register.");
		}else {
			System.out.println("Welcome......... Processing for Registration");
			if(gender == "Male" || gender == "male" || gender == "MALE") {
				System.out.println("Registration Successfull \n Mr. " + name + " We will find a perfect or Beautiful Girl for Marriage");
			} else if(gender == "Female" || gender == "female" || gender == "FEMALE") {
				System.out.println("Registration Successfull \n Ms. " + name + " We will find the perfect lige partner for you ");
			}else {
				System.out.println("Invalid Gender");
			}
		}
	}

}
