package Array;

import java.util.Scanner;

public class SaperateOddAndEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] Odd = new int[n];
		int[] Even = new int[n];
		int oddIndex = 0;
		int evenIndex = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				Even[evenIndex] = arr[i];
				evenIndex++;
			} else {
				Odd[oddIndex] = arr[i];
				oddIndex++;
			}
		}
		System.out.print("Odd = ");
		for (int i = 0; i < oddIndex; i++) {
			System.out.print(Odd[i] + " ");
		}
		System.out.println();

		System.out.print("Even = ");
		for (int i = 0; i < evenIndex; i++) {
			System.out.print(Even[i] + " ");
		}
	}
}
