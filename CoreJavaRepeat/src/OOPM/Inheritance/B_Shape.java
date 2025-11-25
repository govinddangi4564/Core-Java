package OOPM.Inheritance;

public class B_Shape {
	private String type;
	private String color;
	
	public void area() {    // override
		System.out.println("Shape area...");  
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
