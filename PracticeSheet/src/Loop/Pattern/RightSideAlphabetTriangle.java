package Loop.Pattern;

public class RightSideAlphabetTriangle {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("  ");
			}
			char ch = 'a';
			for (int k = 1; k <= i; k++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
	}
}
