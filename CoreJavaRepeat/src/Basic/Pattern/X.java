package Basic.Pattern;

public class X {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (i == j || j == a - i + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
