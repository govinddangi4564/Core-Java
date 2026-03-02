package String;

public class SumOfNumbersInString {
	public static void main(String[] args) {
		String str = "He1lo2 3Wor4ld5";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				sum = sum + (ch - '0');
			}
			
		}
		System.out.println(sum);
	}
}
