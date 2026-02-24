package Basic;

import java.util.Scanner;

public class DistanceBetweenPoints {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input first point
		System.out.print("Enter x1: ");
		double x1 = sc.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = sc.nextDouble();

		// Input second point
		System.out.print("Enter x2: ");
		double x2 = sc.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = sc.nextDouble();

		// Calculate distance
		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		// Output result
		System.out.println("Distance between two points is: " + distance);

		sc.close();
	}
}
