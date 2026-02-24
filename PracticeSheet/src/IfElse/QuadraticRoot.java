package IfElse;
import java.util.Scanner;

public class QuadraticRoot {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.println("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.println("Enter value of c: ");
        double c = sc.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Two real and different roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } 
        else if (discriminant == 0) {
            double root = -b / (2 * a);

            System.out.println("Two real and equal roots:");
            System.out.println("Root = " + root);
        } 
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            System.out.println("Complex roots:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }

        sc.close();
    }
}
