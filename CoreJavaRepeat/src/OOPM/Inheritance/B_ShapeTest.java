package OOPM.Inheritance;

public class B_ShapeTest {
	public static void main(String[] args) {
		B_Triangle bt = new B_Triangle();
		B_Circle c = new B_Circle();
		
		bt.setType("Traingle");
		bt.setColor("Blue");
		bt.setHeight(12);
		bt.setWidth(5);
		
		c.setColor("Red");
		c.setType("Circle");
		c.setRadius(2);
		
		System.out.println("Triangle Details...............");
		System.out.println(bt.getType() + "  " + bt.getColor());
		bt.area();
		
		System.out.println("Circle Details...............");
		System.out.println(c.getType() + "  " + c.getColor());
		c.area();
		
		System.out.println("--------------------------------------");
		
		B_Shape sc = new B_Circle();
		B_Shape st = new B_Triangle();
		
		sc.area();  // override
		st.area();  // override
		
		System.out.println("--------------------------------------");

		B_Shape scc = new B_Circle();
		B_Circle cc = (B_Circle) scc;   // Down-casting
		
		scc.area();
	}

}
