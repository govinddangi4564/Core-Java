package IfElse;

import java.util.Scanner;

public class CheckSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        if (length == breadth) {
            System.out.println("It is a SQUARE.");
        } else {
            System.out.println("It is a RECTANGLE (Not a square).");
        }

        sc.close();
    }
}