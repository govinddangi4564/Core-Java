package Basic.Pattern;

public class U {

	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a + 2; j++) {
				if ((j == 1 || j == a) && (i < a - 1)) {
					System.out.print("* ");
				} else if ((j < a-1) && (j > 2 && i == a)) {
					System.out.print("* ");
				} else if ((j == 2 & i == a-1) || (j == a-1 & i == a-1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
