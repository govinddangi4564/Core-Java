package com.infoviaan.basic.Loop;

public class Reverse {

    public static void main(String[] args) {
        int a = 1234;
        int rev = 0;
        
        while (a != 0) { 
            int rem = a % 10;
            a = a / 10;
            rev = rev * 10 + rem;
        } 
        System.out.println("Reversed Number: " + rev);
    }
}

