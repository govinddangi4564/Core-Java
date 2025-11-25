package ExeptionHandling;

public class FamilyPropagation {
	public static void kid() {
		MistakeException me = new MistakeException("Child Made  Mistake");
		throw me;
	}
	
	public static void mom() {
		kid();
	}
	
	public static void dad() {
		try {
			mom();
		} catch(MistakeException e) {
			System.out.println(e.getMessage());
			System.out.println("Handled by the Dad");
		}
	}
	
	public static void main(String[] args) {
		dad();
	}
}
