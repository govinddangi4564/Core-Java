package String;

public class MaximumOccuringCharacter {
	public static void main(String[] args) {
		String str = "Java";

		char maxChar = str.charAt(0);
		int maxCount = 0;

		for (int i = 0; i < str.length(); i++) {
			int count = 0;

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxChar = str.charAt(i);
			}
		}
		System.out.println("Maximum occurring character: " + maxChar);
		System.out.println("Frequency: " + maxCount);
	}
}
