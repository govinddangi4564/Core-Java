package Array;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 5;

		int[] arr = new int[n];

		System.out.println("Enter Elemets : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] rev = new int[n];
		
		for (int i = 0; i < n; i++) {
			rev[i] = arr[n - 1 - i];
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(rev[i] + " ");
		}
		
		
		System.out.println();
		for(int i = n-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
