package Accessspecifier1;

import Accessspecifier.A;

public class E  extends A{
 public static void main(String[] args) {
	E obj = new E();

	//System.out.println(" Private    : "+ obj.p);
	System.out.println(" Protected  : "+ obj.q);
	System.out.println(" Public     : "+ obj.r);
	//System.out.println(" Default    : "+ obj.s);

}
}
