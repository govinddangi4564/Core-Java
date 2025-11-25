package Exception_Handling;

public class TestDivision {
	public static void main(String[] args) {
		
		try {
			int a, b, c;
			a = 130;
			b = 0;
			c = a / b;

			System.out.println("Division : " + c);
		} catch (ArithmeticException e) {
			System.out.println("ERROR : Division by zero");
		} finally {
			System.out.println("It is finally");
		}
	}

}
