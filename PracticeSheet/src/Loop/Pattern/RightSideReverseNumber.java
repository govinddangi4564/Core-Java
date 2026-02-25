package Loop.Pattern;

public class RightSideReverseNumber {

	public static void main(String[] args) {
		int n = 4;
		int a = 10;

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a--;
			}
			System.out.println();
		}
	}

}
