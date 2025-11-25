package Inheritence;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] books = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of Book " + (i + 1) + ": ");
            books[i] = sc.nextLine();
        }

        System.out.print("\nEnter your name (Student): ");
        String studentName = sc.nextLine();

        System.out.println("\nAvailable Books:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter the book number you want to issue: ");
        int bookChoice = sc.nextInt();

        if (bookChoice >= 1 && bookChoice <= n) {
            System.out.println(studentName + " issued the book: " + books[bookChoice - 1]);
        } else {
            System.out.println("Invalid choice.");
            sc.close();
            return;
        }

        System.out.print("\nEnter after how many days you are returning the book: ");
        int returnDays = sc.nextInt();

        int fine = 0;
        if (returnDays > 15 && returnDays <= 17) {
            fine = 5;
        } else if (returnDays > 17) {
            fine = 10;
        }

        System.out.println("\n--- Return Summary ---");
        System.out.println("Student Name: " + studentName);
        System.out.println("Book Returned: " + books[bookChoice - 1]);
        if (fine > 0) {
            System.out.println("Fine to Pay: ₹" + fine);
        } else {
            System.out.println("No fine. Thank you!");
        }

        sc.close();
    }
}
