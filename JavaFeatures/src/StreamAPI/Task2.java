package StreamAPI;

import java.util.Arrays;

public class Task2 {
	public static void main(String[] args) {
		int ar[] = {1,2,3,4,3,6,7,8,2,10};
		
		Arrays.stream(ar).distinct().forEach(a -> System.out.print(a + " "));
	}
}
