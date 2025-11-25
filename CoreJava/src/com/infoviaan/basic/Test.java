package com.infoviaan.basic;

import java.util.Date;

public class Test {

		@SuppressWarnings({ "unused", "deprecation" })
		public static void main(String[] args) {

		        int birthYear = 2000;
		        int birthMonth = 4;
				int birthDay = 15;
		        
				Date dt = new Date();
				
//				dt.getDate();
				dt.getYear();
				
		        System.out.println(dt);
		        
//		        @SuppressWarnings("deprecation")
//				Date birthDate = new Date(birthYear - 1900, birthMonth, birthDay);
//		        Date currentDate = new Date();
//
//		        long diffInMillis = currentDate.getTime() - birthDate.getTime();
//
//		        long totalDays = diffInMillis / (1000L * 60 * 60 * 24);
//		        long years = totalDays / 365;
//		        long months = (totalDays % 365) / 30;
//		        long days = (totalDays % 365) % 30;
//
//		        System.out.println("Your age is: " + years + " years, " + months + " months, and " + days + " days.");
	}
}