package Switch;

public class MaxAndMin {
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		int result = (a > b) ? 1 : (a < b) ? 2 : 0;
		
		switch (result) {

		case 1:
			System.out.println("Maximum = " + a);
			System.out.println("Minimum = " + b);
			break;
			
		case 2:
			System.out.println("Maximum = " + b);
			System.out.println("Minimum = " + a);
			break;
		
		case 0:
			System.out.println("Both numbers are equal.");
			break;
			
		}
		
	}
}
