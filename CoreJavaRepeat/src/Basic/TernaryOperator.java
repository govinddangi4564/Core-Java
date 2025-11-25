package Basic;

public class TernaryOperator {
	public static void main(String[] args) {
		int a, b, c;
		a = 100;
		b = 200;
		
		c = (a > b) ? a : b;
		
		System.out.println("Largest Number is : " + c);
		
		String s = (a > b) ? "First Number is largest" : "Second Number is Largest";
		System.out.println(s);
	}
}
