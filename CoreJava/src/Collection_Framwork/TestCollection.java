package Collection_Framwork;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Govind");
		al.add("Sunil");
		al.add("Gopi");
		al.add("Gopal");
		al.add(852.963);
		al.add(1234);
		al.add("Krishna");
		
		System.out.println(al);
		
		al.remove("Gopi");
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.remove(1));
		
		al.add(1, "Sandeep");
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add("Hariom");
		al2.add("Suraj");
		al2.add("Manoj");
		al2.add("Payal");
		al2.add(258.456);
		al2.add(958);
		al2.add("Manu");
		al2.add("Govind");
		
		System.out.println(al2);
		
		al.addAll(al2);
		System.out.println(al);
		
		al2.remove("Suraj");
		
		System.out.println("AL --> " + al);
		System.out.println("AL2 --> " + al2);
		
		al.retainAll(al2);
		
		System.out.println("-------------------------------");
		
		System.out.println("AL --> " + al);
		System.out.println("AL2 --> " + al2);
		
		System.out.println(al.contains("Gopal"));
		System.out.println(al2.containsAll(al));
		
	}
}
