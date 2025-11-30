package Basic.Pattern;

public class R {

	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (j == 1) {
					System.out.print("* ");
				}else if((i == 1 && j <= 3) || (i == 4 && j <= 3)) {
					System.out.print("* ");
				}else if((i == 2 && j == 4) || (i == 3 && j == 4)) {
					System.out.print("* ");
				}else if((i-3 == j && j >= 1)) {
					System.out.print(" *");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
