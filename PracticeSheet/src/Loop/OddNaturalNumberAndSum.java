package Loop;

public class OddNaturalNumberAndSum {
	public static void main(String[] args) {
		int n = 50;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
				System.out.print("Even Natural number = " + i + "  ");
			} else {
				System.out.println("Odd Natural number = " + i + "  ");
				sum2 = sum2 + i;
			}
		}
		System.out.println();
		System.out.println("Sum of Even Natural numbers = " + sum1);
		System.out.println("Sum of Odd Natural numbers = " + sum2);
	}
}
