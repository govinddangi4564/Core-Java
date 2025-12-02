package CollectionFramwork;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Ramtula");  						// Collection
		al.add("Kaand");
		al.add("Kishkinda");
		al.add(7410);
		al.add(8522.741);
		al.add("Sunami");
		al.add("Saurabh");
		al.add("Mayur");
		System.out.println(al);
		
		al.remove("Kaand");
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains("Mayur"));
		al.add(2, "Manika");                               // List
		System.out.println(al);
		System.out.println("Deleted : " + al.remove(3));
		System.out.println(al);
		al.set(4, "SAMANDAR");
		System.out.println(al);
		
		ArrayList aa = new ArrayList();
		
		aa.add("Trilok");
		aa.add("Ramesh");
		aa.add("Suresh");
		aa.add("Kalakar");
		aa.add("Subramanyam");
		aa.add(7410);
		aa.add("Ramtula");
		aa.add("Sushree");
		aa.add("Mayur");
		
		System.out.println(aa);
		aa.addAll(al);
		System.out.println(aa);
		System.out.println("---------------------------------------------");
		
		ArrayList ab = new ArrayList();
		ab.add("Surahi");
		ab.add("Gumnam");
		ab.add("Sheetla");
		ab.add("Parampara");
		ab.add(8525);
		ab.add(al);
		
		System.out.println(ab);
		System.out.println(ab.get(0));
		System.out.println(ab.get(5));
		
		System.out.println("---------------------------------------------");

		Object o = ab.get(3);
		
		System.out.println(o);
		
		System.out.println("---------------------------------------------");

		for(int i = 0; i < ab.size(); i++) {
			System.out.println(ab.get(i));
		}
		
		System.out.println("---------------------------------------------");

		for(Object ox : ab) {
			String ss = ox.toString();   // (String) ox;
			System.out.println(ss);
		}
		
		System.out.println("---------------------------------------------");

		Object ak = ab.get(5);
		
		ArrayList jj = (ArrayList) ak;
		System.out.println(jj.get(3));
		
		System.out.println("---------------------------------------------");

		for(Object h : jj) {
			System.out.println(h);
		}
	}
}
