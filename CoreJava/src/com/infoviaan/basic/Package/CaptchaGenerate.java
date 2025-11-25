package com.infoviaan.basic.Package;

public class CaptchaGenerate {
	public static void main(String[] args) {
		String ct = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		System.out.println((int) (Math.random() * 26));
		String tt = "";
		
		for(int i = 1; i <= 3; i++) {
			int x = (int) (Math.random() * 10);
			int y = (int) (Math.random() * 26);
			tt += x + "" + ct.charAt(y);
		}
		System.out.println("CAPTCHA : " + tt);
	}
}
