package OOP;

public class Rectangle1 {
	private double length, width;
	
	double area() {
		return length * width;
	}
	
	double perimeter() {
		return 2 * (length + width);
	}

	public Rectangle1(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public static void main(String[] args) {
		Rectangle1 rec = new Rectangle1(10.0, 20.0);
		
		System.out.println("Area : " + rec.area());
		System.out.println("Perimeter : " + rec.perimeter());
	}
}


