package Basic.Pattern;

public class A {
	public static void main(String[] args) {
		int a = 10;

		for (int i = 1; i <= a; i++) {
			for (int k = a; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == 2 * a / 3) {
					System.out.print("* ");
				} else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
