package OOPM.Polymorphism;

public class CompileTime {
		  int add(int a, int b) {
		    return a + b;
		  }

		  double add(double a, double b) {
		    return a + b;
		  }

		  int add(int a, int b, int c) {
		    return a + b + c;
		  }

		  public static void main(String[] args) {
		    CompileTime m = new CompileTime();
		    System.out.println(m.add(2, 3));         // 5
		    System.out.println(m.add(2.5, 3.5));     // 6.0
		    System.out.println(m.add(1, 2, 3));      // 6
		  }

}
