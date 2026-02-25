package Loop;

public class ReverseNumber {
	public static void main(String[] args) {
		int n = 45116;

		int reverse = 0;

		while (n != 0) {
			int digit = n % 10;

			reverse = reverse * 10 + digit;

			n = n / 10;

		}
		System.out.println("Reverse of a number = " + reverse);
	}
}
