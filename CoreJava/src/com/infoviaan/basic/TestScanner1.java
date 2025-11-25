package com.infoviaan.basic;

import java.util.Scanner;

public class TestScanner1 {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Name : ");
			String nm = sc.nextLine();
			
			System.out.println("Enter age : ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter Address : ");
			String add = sc.nextLine();
			
			System.out.println("Enter Sallery : ");
			double sal = sc.nextDouble();
			
			System.out.println("Details are : ");
			System.out.println(nm + "  " + age + "   " + nm +"   " + sal + "  " + add);
	}
}
