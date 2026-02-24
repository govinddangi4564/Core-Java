package Switch;

public class ChangeNumber {
	public static void main(String[] args) {
		int n = -10;
		
		int result = (n == 0) ? 0 : 1;
		
		switch(result) {
		
		case 0:
			System.out.println("Number is Zero");
			break;
		
		case 1:
			System.out.println(-(n));
			break;
		}
		
	}
}
