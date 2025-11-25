package UML;

import java.util.Date;

public class TestPerson1 {
	public static void main(String[] args) {
		
		Date db = new Date();
		db.setDate(10);
		db.setMonth(3);
		db.setYear(10);
		
		Person1 ram = new Person1();
		ram.setName("Ram Chandra");
		ram.setAddress("Ayodhya");
		ram.setDob(db);
	}
	
}
