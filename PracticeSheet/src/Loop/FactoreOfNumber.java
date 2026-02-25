package Loop;

public class FactoreOfNumber {
	public static void main(String[] args) {
		int n = 50;
		System.out.print("Factor of " + n + " is = ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
