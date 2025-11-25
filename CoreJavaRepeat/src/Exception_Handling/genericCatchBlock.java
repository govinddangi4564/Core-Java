package Exception_Handling;

public class genericCatchBlock {
	public static void main(String[] args) {
		String name = "Govind";
		
		try {
			System.out.println(name.charAt(7));
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
}
