package com.infoviaan.basic.Package;

public class BasicProperties {
	public static void main(String[] args) {
		
		System.out.println(Math.min(25, 80));
		System.out.println(Math.max(25, 80));
		System.out.println(Math.addExact(20, 40));
		System.out.println(Math.subtractExact(50, 80));
		System.out.println(Math.floor(25.80));
		System.out.println(Math.ceil(25.123));
		System.out.println(Math.round(14.4999999));
		System.out.println(Math.round(25.50001));
		System.out.println(Math.sqrt(16));
		System.out.println(Math.cbrt(28));
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.log10(10));
		System.out.println(Math.sin(25));
		System.out.println(Math.pow(5, 5));
		System.out.println(Math.random());
		System.out.println(Math.random() * 10);
		System.out.println(Math.random() * 100);
		
		int o = (int) (Math.random() * 10);
		System.out.println(o);
		System.out.println();
		System.out.println("---------------------------");
		
		String otp = "";
		
		for(int i = 1; i <= 6; i++) {
			int x = (int) (Math.random() * 10);
			otp = otp + x;
		}
		
		System.out.println("OTP = " + otp);
		System.out.println("---------------------------------");
		
		
	}

}
