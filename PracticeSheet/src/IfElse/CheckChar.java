package IfElse;

import java.util.Scanner;

public class CheckChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println("It is an Alphabet.");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Digit.");
        }
        else {
            System.out.println("It is a Special Symbol.");
        }

        sc.close();
    }
}
