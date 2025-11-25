package OOPM.Inheritance.Constructor;

public class B_ShapeTest {
	public static void main(String[] args) {
		
		B_Shape sc = new B_Circle(2.5);
		B_Shape sr = new B_Rectangle(25.6, 63.8);
		B_Shape st = new B_Triangle(41.8, 69.2);
		
		sc.area();
		sr.area();
		st.area();
		
		
	}

}
