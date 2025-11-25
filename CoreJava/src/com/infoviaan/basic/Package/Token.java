package com.infoviaan.basic.Package;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = " Lorem ipsum, dolor sit amet consectetur adipisicing elit. Nisi debitis tempore, beatae minus, ducimus aut esse commodi animi necessitatibus placeat nulla illo, dignissimos itaque? Odio corrupti veniam vel delectus, nemo dolorum officia, in cum dicta, nostrum officiis facere accusamus quasi eligendi molestiae. Reprehenderit vitae tenetur rem illo omnis tempore perferendis dignissimos quibusdam, ad sapiente assumenda?";
		
		StringTokenizer stn = new StringTokenizer(data, ",");
	
		while(stn.hasMoreElements()) {
			System.out.println(stn.nextToken());
		}
	}

}
