package IfElse;

import java.util.Scanner;

public class TriangleType {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        int a = sc.nextInt();

        System.out.println("Enter side 2: ");
        int b = sc.nextInt();

        System.out.println("Enter side 3: ");
        int c = sc.nextInt();

        // Check valid triangle condition
        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Triangle is Equilateral");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Triangle is Isosceles");
            }
            else {
                System.out.println("Triangle is Scalene");
            }

        } else {
            System.out.println("Not a valid triangle");
        }

        sc.close();
    }
}
