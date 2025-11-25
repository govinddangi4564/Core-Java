package ExeptionHandling;

public class TestDivision {
	public static void main(String[] args) {
		try {
			int a, b, c;
			a = 154;
			b = 0;
			c = a / b;
			
			System.out.println("Division Result is : " + c);
		} catch (ArithmeticException e) {
			System.out.println("Error: Divide By Zero ");
		} finally {
			System.out.println("It is Division Programm");
		}
	}
}
