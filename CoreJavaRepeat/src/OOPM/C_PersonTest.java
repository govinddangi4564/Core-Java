package OOPM;

import java.util.Date;

public class C_PersonTest {
	public static void main(String[] args) {
		C_Person p1 = new C_Person();
		C_Person p2 = new C_Person();

		Date db = new Date();
		db.setDate(17);
		db.setMonth(6);
		db.setYear(106);
		db.setHours(10);
		db.setMinutes(30);

		p1.setName("Govind");
		p1.setAddress("Rajgarh");
		p1.setDob(db);

		System.out.println(p1.getName() + "  " + p1.getAvgAge() + "  " + p1.getAddress() + "  ");
		System.out.println(p1.getDob());
		
		
		System.out.println("---------------------------------");
		
//		C_Address
		
		C_Address ad = new C_Address();
		
		ad.setWard("Nothing");
		ad.setState("MP");
		ad.setCountry("India");
		
		p2.setName("Sunil");
		p2.setAdd(ad);
		
		C_Address a = p2.getAdd();
		System.out.println("Sunil Address Details.\n" + a.getCountry() + "   " + a.getState() + "   " + a.getWard());
		
	}

}
