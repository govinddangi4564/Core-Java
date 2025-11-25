package com.infoviaan.basic.Package;

public class DifferentCaptcha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String captcha = "";
		
		for(int i=1; i<=6; i++) {
			int t = (int) (Math.random() * 62);
			char c = x.charAt(t);
			captcha = captcha + "" + c;
		}
		System.out.println("CAPTCHA = " + captcha);
	}

}
