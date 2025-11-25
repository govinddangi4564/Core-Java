package Polymorphism;

public class CompileTime {
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	public void add(double a, double b) {  // Method Overriding
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		CompileTime ct = new CompileTime();
		ct.add(10, 5);
		ct.add(3.5, 10.6);
	}

}
