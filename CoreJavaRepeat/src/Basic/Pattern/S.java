package Basic.Pattern;

public class S {
	public static void main(String[] args) {

		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if((j == 2 && i == 2) || (i == 1 && (j == 3 || j == 4)) || (j == 5 && i == 2) ) {
					System.out.print("* ");
				}else if((i == 3 && j == 2) || (i == 4 && j == 3) || (i == 4 && j == 4) || (i == 5 && j == 5)) {
					System.out.print("* ");
				} else if((i == a && j == 3) || (i == a && j == 4) || (i == a-1 && j == 2) || (i == a-1 && j == 5)) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
