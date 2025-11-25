package com.infoviaan.basic.Package;

public class OtpGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String otp = "";
		
		for(int i = 1; i <= 6; i++) {
			int x = (int) (Math.random() * 10);
			otp = otp + x;
		}
		
		System.out.println("OTP = " + otp);
	}

}
