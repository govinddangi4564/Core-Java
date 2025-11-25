package com.infoviaan.basic.IfElse;

public class CheckCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = '$'; 

        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an Alphabet.");
        } else if (Character.isDigit(ch)) {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
	}

}
