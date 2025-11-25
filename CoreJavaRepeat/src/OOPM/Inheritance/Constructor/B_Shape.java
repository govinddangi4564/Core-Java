package OOPM.Inheritance.Constructor;

public class B_Shape {
	private String color;
	private int borderWidth;
	
	public void area() {
		System.out.println("Shape Area..");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

}
