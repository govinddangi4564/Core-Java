package Array;

import java.util.Scanner;

public class ArrayOperations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int sum = 0;
		int count = n;
		int product = 1;

		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
			product = product * arr[i]; 
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("Count = " + count);
		System.out.println("product = " + product);
	}
}
