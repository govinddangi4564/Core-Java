package Array;

import java.util.Scanner;

public class CountAndDuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int count = arr.length;
		int dup = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					dup++;
					break;
				}
			}
		}
		System.out.println("Count = " + count);
		System.out.println("Duplicate = " + dup);
	}
}
