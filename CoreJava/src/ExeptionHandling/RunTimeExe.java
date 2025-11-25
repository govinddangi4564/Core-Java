package ExeptionHandling;

public class RunTimeExe {
	public static void main(String[] args) {

		String name = "Govind";
//			String name  = null;

		try {
//			System.out.println(10 / 0);
			System.out.println(name.length());
			System.out.println(name.charAt(8));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Name Length");
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		} finally {
			System.out.println("I its Work Defenately........");
		}
	}

}
