package Loop;

public class Series111 {
	public static void main(String[] args) {
		int n = 5; // number of terms
		int term = 0;
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			term = term * 10 + 1;
			sum = sum + term;
		}

		System.out.println("Sum = " + sum);
	}
}
