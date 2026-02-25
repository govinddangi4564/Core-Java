package Loop.Pattern;

public class LeftSide0_1 {
	public static void main(String[] args) {
		int n = 5;

		int digit = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (digit % 2 == 0) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
				digit++;
			}
			System.out.println();
		}
	}
}
