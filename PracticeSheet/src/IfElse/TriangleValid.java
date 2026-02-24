package IfElse;

import java.util.Scanner;

public class TriangleValid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Triangle is VALID.");
        } else {
            System.out.println("Triangle is NOT VALID.");
        }

        sc.close();
    }
}
