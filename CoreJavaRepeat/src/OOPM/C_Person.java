package OOPM;

import java.util.Date;

public class C_Person {
	private String name;
	private String address;
	private Date dob;
	public static final int AVG_AGE = 60;
	private C_Address add;		 //	C_Address

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public static int getAvgAge() {
		return AVG_AGE;
	}

	public C_Address getAdd() {
		return add;
	}

//	C_Address
	
	public void setAdd(C_Address add) {
		this.add = add;
	}
	
	

}
