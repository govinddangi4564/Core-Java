package Basic.Pattern;

public class F {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j == 1) {
					System.out.print("* ");
				} else if ((i == 1 || i == 2*a/3) && j <= a - 2) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
