package com.infoviaan.basic.Loop;

public class PelindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12321;
		 int original = a;
	        int rev = 0;
	        
	        while (a != 0) { 
	            int rem = a % 10;
	            a = a / 10;
	            rev = rev * 10 + rem;
	        } 
	        System.out.println(rev);
	        if(rev == original) {
	        	System.out.println("Number is Pelindrome ");
	        } else {
	        	System.out.println("Number is not Pelindrome");
	        }
	}

}
