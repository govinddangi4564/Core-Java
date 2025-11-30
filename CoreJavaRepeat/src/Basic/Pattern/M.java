package Basic.Pattern;

public class M {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j == 1 || j == a) {
					System.out.print("* ");
				} else if ((j == i) && j <= a - 3) {
					System.out.print("* ");
				} else if ((i == 3 && j == 5) || (j == 6 && i == 2)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
