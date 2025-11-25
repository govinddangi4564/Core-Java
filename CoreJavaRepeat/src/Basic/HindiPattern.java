package Basic;

public class HindiPattern {
	public static void main(String arg[]) {
		for (char i = '\u0905'; i <= '\u0920'; i++) {
			for (char j = '\u0905'; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
