package com.infoviaan.basic.Loop;

public class FibonacciSeries {

    public static void main(String[] args) {
       int x=0, y=1;
       
       for(int i=1;i<=10;i++) {
    	   System.out.println(x);
    	   x=x+y;
    	   y=x-y;
       }
    }
}
