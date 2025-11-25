package ExeptionHandling;

public class GenericCatchBlock {
	public static void main(String[] args) {
		
		String name = "Gopi";
		
		try {
//			System.out.println(10 / 0);
			System.out.println(name.length());
			System.out.println(name.charAt(5));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
