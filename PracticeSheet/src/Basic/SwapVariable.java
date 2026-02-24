package Basic;

public class SwapVariable {
	public static void main(String[] args) {
		int a = 11;
		int b = 22;
		int c = 33;
		int temp;
	
		System.out.println("Before swap : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		temp = a;
		a = b;
		b = c;
		c = temp;
		
		System.out.println("After swap : ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}
}
