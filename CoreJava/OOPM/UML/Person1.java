package UML;

import java.sql.Date;

public class Person1 {
	private String name;
	private Date dob;
	private String address;
	public static final int AVG_AGE = 75;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date db) {
		this.dob = db;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static int getAvgAge() {
		return AVG_AGE;
	}
	public void setDob(java.util.Date db) {
		// TODO Auto-generated method stub
		
	}
	
}
