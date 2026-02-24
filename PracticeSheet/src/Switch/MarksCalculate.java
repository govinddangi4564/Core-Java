package Switch;

public class MarksCalculate {
	public static void main(String[] args) {
		int a = 90;
		int b = 77;
		int c = 88;
		int d = 55;
		int e = 70;

		int total = a + b + c + d + e;
		double per = total / 5.0;

		System.out.println("Total marks = " + total);
		System.out.println("Percentage = " + per + " %");

		int result = (int) per / 10;
		
		switch(result) {
		
		case 10:
		case 9:
			System.out.println("Grade = A");
			break;
			
		case 8:
		case 7:
			System.out.println("Grade = B");
			break;
			
		case 6:
		case 5:
			System.out.println("Grade = C");
			break;
			
		case 4:
			System.out.println("Grade = E");
			break;
			
		default :
			System.out.println("Fail.");
		}
	}
}
