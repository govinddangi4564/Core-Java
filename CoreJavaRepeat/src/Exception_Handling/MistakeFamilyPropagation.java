package Exception_Handling;

public class MistakeFamilyPropagation {
	public static void kid() {
		MistakeException me = new MistakeException("Kid made mistake");
		throw me;
	}

	public static void mom() {
		kid();
	}

	public static void dad() {
		try {
			mom();
		} catch (MistakeException e) {
			System.out.println(e.getMessage());
			System.out.println("Handled by the Dad");
		}
	}

	public static void main(String[] args) {
		dad();
	}

}
