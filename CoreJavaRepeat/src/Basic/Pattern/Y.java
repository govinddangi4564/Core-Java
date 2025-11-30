package Basic.Pattern;

public class Y {
	public static void main(String[] args) {
		int a = 7; // should be odd

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {

				if (i < a / 2 && (j == i || j == a - i - 1))
					System.out.print("*"); // upper V part
				else if (i >= a / 2 && j == a / 2)
					System.out.print("*"); // vertical stem
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
