package IO_Methods;

import java.io.Serializable;

public class Mobile implements Serializable {
	private String companyName;
	private String model;
	private int manuYear;
	private long imei;
	private transient String temp;

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(String companyName, String model, int manuYear, long imei, String temp) {
		super();
		this.companyName = companyName;
		this.model = model;
		this.manuYear = manuYear;
		this.imei = imei;
		this.temp = temp;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getManuYear() {
		return manuYear;
	}

	public void setManuYear(int manuYear) {
		this.manuYear = manuYear;
	}

	public long getImei() {
		return imei;
	}

	public void setImei(long imei) {
		this.imei = imei;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

}
