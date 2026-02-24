package Switch;

public class PositiveOrNegative {
	public static void main(String[] args) {
		int n = 0;

		int result = (n > 0) ? 1 : (n < 0) ? 2 : 0;

		switch (result) {

		case 1:
			System.out.println("Positive..");
			break;
		case 2:
			System.out.println("Negative..");
			break;
		case 0:
			System.out.println("Zero..");
			break;
		}
	}
}
