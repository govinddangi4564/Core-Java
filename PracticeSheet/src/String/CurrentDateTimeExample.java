package String;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy h:mm a");
		
		String result = now.format(formatter);
		
		System.out.println(result);
	}
}
