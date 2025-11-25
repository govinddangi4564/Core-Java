package Basic;

public class StringReverse {
	public static void main(String[] args) {

		String ss = "Govind";

		String reverse = "";

		
//  Reverse String
		
		for (int i = ss.length() - 1; i >= 0; i--) {
			reverse = reverse + ss.charAt(i);
		}

		System.out.println(reverse);

//	Check Pelindrom

		for (int i = ss.length() - 1; i >= 0; i--) {
			reverse = reverse + ss.charAt(i);
		}

		if (ss.equals(reverse)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}

	}

}
