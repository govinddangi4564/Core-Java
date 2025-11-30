package Basic.Pattern;

public class V {

	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= 2*a; j++) {
				if ((j == i) && j <= a) {
					System.out.print("*");
				} else if ((i == 1) && (j == a*2) || (i == 2) && (j == a*2 - 1) || (i == 3) && (j == a*2-2) || (i == 4) && (j == a*2-3) || (i == 5) && (j == a*2-4) || (i == 6) && (j == a*2-5)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
