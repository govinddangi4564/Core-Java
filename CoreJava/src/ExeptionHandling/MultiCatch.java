package ExeptionHandling;

public class MultiCatch {
	public static void main(String[] args) {
		
		String name = "Govind";
//		String name  = null;
		
		try {
			System.out.println(name.length());
			System.out.println(name.charAt(8));
		} catch (NullPointerException e) {
			System.out.println("Name Not Found");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Name Length");
		} finally {
			System.out.println("I its Work Defenately........");
		}
	}

}
