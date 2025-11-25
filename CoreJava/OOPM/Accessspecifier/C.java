package Accessspecifier;

public class C  extends A{
	public static void main(String[] args) {
		C obj = new C();

		//System.out.println(" Private    : "+ obj.p);      not allowed
		System.out.println(" Protected  : "+ obj.q);
		System.out.println(" Public     : "+ obj.r);
		System.out.println(" Default    : "+ obj.s);

	}

}
