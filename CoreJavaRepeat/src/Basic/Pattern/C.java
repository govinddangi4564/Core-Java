package Basic.Pattern;

public class C {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int k = a / 3; k >= i; k--) {
				System.out.print(" ");
			}

			for (int k = a - i / 4; k <= i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= a; j++) {
				if (j == 1) {
					System.out.print("* ");
				} else if ((i == 1 || i == a) && j < 3 * a / 5) {
					System.out.print("* ");
				} else if ((i == 2 && j == a) || (i == a - 1 && j == a)) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
