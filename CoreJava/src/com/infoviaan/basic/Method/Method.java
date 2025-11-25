package com.infoviaan.basic.Method;

public class Method {

//		Var-Arg --- Variable Length Argument
		
	public void sum(int...x) {
		int s = 0;
		for (int k : x) {
			s = s + k;
		}
		System.out.println("Total Sum = " + s);
	}
	
	public static void main(String[] args) {
		Method tt = new Method();
		tt.sum();
		tt.sum(10, 20, 30);
		int kk[] = {13, 25, 72, 82};
		tt.sum(kk);
	}
}
