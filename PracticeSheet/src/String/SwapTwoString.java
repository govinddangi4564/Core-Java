package String;

public class SwapTwoString {
	public static void main(String[] args) {
		String s1 = "Good";
		String s2 = "Morning";
		
		System.out.println("Before Swaping.");
		System.out.println("s1 = " + s1);
		System.out.println("s1 = " + s2);
		
		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());
		
		System.out.println("After Swaping.");
		System.out.println("s1 = " + s1);
		System.out.println("s1 = " + s2);
	}
}
