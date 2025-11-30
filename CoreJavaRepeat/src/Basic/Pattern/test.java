package Basic.Pattern;

public class test {
	public static void main(String[] args) {
		int a = 7;

		for (int i = 1; i <= a; i++) {
			for (int k = 2; k <= i/2; k++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
}
