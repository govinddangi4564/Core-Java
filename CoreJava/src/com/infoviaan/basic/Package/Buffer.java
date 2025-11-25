package com.infoviaan.basic.Package;

public class Buffer {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer ("chandu ke chacha");
		
		System.out.println(sb);
		System.out.println("Length :  " + sb.length());
		
		sb.append("ne chandu ki chachi ko ");
		
		System.out.println(sb.length());
		System.out.println(sb.charAt(0));
		
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.length());


	}
}
