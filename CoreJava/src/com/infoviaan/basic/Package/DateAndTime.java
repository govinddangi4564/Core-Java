package com.infoviaan.basic.Package;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {

		Date dt = new Date();
		System.out.println(dt);
		
		System.out.println((dt.getDate()) + "/" + (1 + dt.getMonth()) + "/" + (dt.getYear() + 1900));
		
		System.out.println(dt.getHours() + ":" + dt.getMinutes());
		
		dt.setDate(18);
		dt.setMonth(9);
		
		System.out.println(dt);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(dt);
		System.out.println(s);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy");
//		String s = sdf.format(dt);
//		System.out.println(s);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy");
//		String s = sdf.format(dt);
//		System.out.println(s);
		
		String dob = "17/07/2006";
		Date d = sdf.parse(dob);
		System.out.println(d);
		
	}

}
