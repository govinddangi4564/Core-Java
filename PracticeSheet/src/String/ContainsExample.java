package String;

public class ContainsExample {
	public static void main(String[] args) {
		String str = "PHP, Exercises and Python Exercises";
		
		String check = "and";
		
		boolean result = str.contains(check);
		
		System.out.println("Specified Sequence : " + check);
		System.out.println("Result : " + result);
	}
}
