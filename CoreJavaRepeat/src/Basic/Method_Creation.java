package Basic;

public class Method_Creation {

//	1.) No Return Value with no Arguments
	
	void Print1() {
		System.out.println("Hello i am No Return Value with no Arguments ");
	}
	
	
//	2.) No Return Value with Arguments
	
	void Print2(String name) {
		System.out.println("Hello " + name);
	}
	
	
//	3.) Return Value with not Arguments
	
	int Print3() {
		return 10;
	}
	
	
//	4.) Return Value with Arguments
	
	int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Method_Creation obj = new Method_Creation();
		
		obj.Print1();
		
		obj.Print2("Govind");
		
		int num = obj.Print3();
		System.out.println("Number is : " + num); 
		
		int sum = obj.add(8, 5);
		System.out.println("Sum is : " + sum);
	}
}
