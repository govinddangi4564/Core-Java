package String;

public class RepeatEveryCharacter {
	public static void main(String[] args) {
		String str = "Welcome";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
			System.out.print(ch);
		}
	}
}
