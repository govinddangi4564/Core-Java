package Loop;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		int n = 10;
		int count = 0;

		for (int i = 0; i < n; i++) {
			count = count + i;
		}
		System.out.println("Sum of natural numbers = " + count);
	}
}
