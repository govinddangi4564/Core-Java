package Switch;

public class VovelOrConsonant {
	public static void main(String[] args) {
		char ch = 'a';

		switch (ch) {

		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':

			System.out.println("Vovel");
			break;

		default:
			System.out.println("Consonants");
		}

	}
}
