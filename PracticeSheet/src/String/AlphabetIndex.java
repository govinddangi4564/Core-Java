package String;

public class AlphabetIndex {
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstvuwxyz";

		System.out.println("Character \t index");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int idx = str.indexOf(ch);
			System.out.println("    " + ch + "\t\t   " + idx);
		}
	}
}
