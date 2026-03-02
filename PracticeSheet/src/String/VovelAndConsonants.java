package String;

public class VovelAndConsonants {
	public static void main(String[] args) {
		String str = "java is programming language";

		int vovels = 0;
		int consonants = 0;

		str = str.toLowerCase();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vovels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println("Vovels = " + vovels);
		System.out.println("Consonants = " + consonants);
	}
}
