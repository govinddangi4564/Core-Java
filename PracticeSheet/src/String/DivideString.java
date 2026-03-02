package String;

public class DivideString {
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxy";
		int parts = 5;
		int len = str.length();

		if (len % parts != 0) {
			System.out.println("Equal division not possible.");
		} else {
			int partSize = len / parts;

			for (int i = 0; i < len; i = i + parts) {
				System.out.println(str.substring(i, i + partSize));
			}
		}
	}
}
