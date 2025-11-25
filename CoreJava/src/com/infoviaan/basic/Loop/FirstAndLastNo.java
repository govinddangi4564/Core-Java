package com.infoviaan.basic.Loop;

public class FirstAndLastNo {

    public static void main(String[] args) {
        int n = 1234;
        int ld = n % 10;
        int fd = n;
        
        while (fd >= 10) { 
            fd /= 10;
        }
        
        System.out.println("First Digit = " + fd);
        System.out.println("Last Digit = " + ld);
    }
}