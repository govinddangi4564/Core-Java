package OOPM.Polymorphism.Uses;

public class B_Rectangle extends B_Shape{
	private double length, width;
	
	public B_Rectangle() {
	}
	
	B_Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return length * width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
