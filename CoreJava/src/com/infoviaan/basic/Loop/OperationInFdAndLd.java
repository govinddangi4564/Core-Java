package com.infoviaan.basic.Loop;

public class OperationInFdAndLd {

    public static void main(String[] args) {
        int n = 1234;
        int ld = n % 10;
        int fd = n;
        
        while (fd >= 10) { 
            fd /= 10;
        }
        
        System.out.println("First Digit = " + fd);
        System.out.println("Last Digit = " + ld);
        System.out.println("Addition Result is = " + (fd + ld));
        System.out.println("Multiplication Result is = " + (fd * ld));
        System.out.println("Subtraction Result is = " + (fd - ld));
        System.out.println("Division Result is = " + ((float)fd / (float)ld));
    }
}