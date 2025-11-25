package com.infoviaan.basic.Package;

import java.time.LocalDateTime;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt = LocalDateTime.now();
		
		if(ldt.getHour() >= 18) {
			System.out.println("gm");
		}

		else if(ldt.getHour() >= 12) {
			System.out.println("good afternoon");
		}
		
		System.out.println(ldt);
		
	}

}
