package com.infoviaan.basic.Package;

public class WordSearch {
	public static void main(String[] args) {
		
		String word = "chandu ke chacha ne chandu ki chahi ko chatni chatai";
		char search = 'c';
		int count = 0;
		 for (int i =0; i<word.length();i++) {
			 if (search == word.charAt(i)) {
				 count++;
				 
			 }
		 }
			System.out.println("total search count : " + count);


	}
}
