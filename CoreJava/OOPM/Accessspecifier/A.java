package Accessspecifier;

public class A {
	private int p=10;
	protected int q=20;
	public int  r= 30;
	int s=40;

	public static void main(String[] args) {
		A obj = new A ();
		System.out.println(" Private    : "+ obj.p);
		System.out.println(" Protected  : "+ obj.q);
		System.out.println(" Public     : "+ obj.r);
		System.out.println(" Default    : "+ obj.s);

		
	}
}
