package OOPM.Inheritance;

public class C_RBI {
	private String name;
	private String branch;
	private String location;
	private String Ifsc;

	public String getName() {
		return name;
	}

	public String getIfsc() {
		return Ifsc;
	}

	public void setIfsc(String ifsc) {
		Ifsc = ifsc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}

	class Icici extends C_RBI{
	
	}
	
	class Sbi extends C_RBI{
		
	}
	
	class Canara extends C_RBI{
		
	}
	
	class Hdfc extends C_RBI{
		
	}
	
	
