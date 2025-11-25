package Exception_Handling;

public class MultiCatchBlock {
	public static void main(String[] args) {
//		String name = null;
		String name = "null";

		try {
//			System.out.println(name.length());
			System.out.println(name.charAt(5));

		} catch (NullPointerException e) {
			System.out.println("Name not found");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Name is too short");
			System.out.println(e.getMessage());
		}
	}
}
