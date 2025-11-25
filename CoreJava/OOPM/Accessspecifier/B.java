package Accessspecifier;

public class B {
public static void main(String[] args) {
	A obj =new A();

	//System.out.println(" Private    : "+ obj.p);   not allowed 
	System.out.println(" Protected  : "+ obj.q);
	System.out.println(" Public     : "+ obj.r);
	System.out.println(" Default    : "+ obj.s);

}
}
