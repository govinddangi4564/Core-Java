package Basic.Pattern;

public class K {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {

			for (int j = 1; j <= a; j++) {
				if (j == 1) {
					System.out.print("* ");
				}
			}
			for (int k = a / 2; k >= i; k--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= a; j++) {
				if (j == 1 && i <= a/2+1) {
					System.out.print("* ");
				}
			}
			for (int k = 5; k <= i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= a; j++) {
				if (j == 1 && i >= a/2+2) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
