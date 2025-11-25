package Accessspecifier1;

import Accessspecifier.A;

public class D {
	public static void main(String[] args) {
		
	
A obj = new A();

//System.out.println(" Private    : "+ obj.p);     not allowe in diffrent package 
//System.out.println(" Protected  : "+ obj.q);      not allowed 
System.out.println(" Public     : "+ obj.r);
//System.out.println(" Default    : "+ obj.s);     not allowed

}}
