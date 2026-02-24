package Switch;

public class QuadraticEquation {
	public static void main(String[] args) {
		double a = 1;
		double b = -3;
		double c = 2;

		double D = (b * b) - (4 * a * c);
		
		int result = (D > 0) ? 1 : (D == 0) ? 2 : 3;
		
		switch (result) {
		
		case 1:
			double root1 = (-b + Math.sqrt(D)) / (2 * a);
			double root2 = (-b - Math.sqrt(D)) / (2 * a);
			System.out.println("Roots are real and differnt");
			System.out.println("Root 1 = " + root1);
			System.out.println("Root 2 = " + root2);
			break;
			
		case 2:
			double root = -b / (2 * a);
			System.out.println("Roots are real and Equal");
			System.out.println("Root = " + root);
			break;
			
		case 3:
			System.out.println("Roots are imaginary..");
			break;
		}
	}
}
