package Collection_Framwork;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestSet {
	public static void main(String[] args) {
		HashSet hs  = new HashSet();
		hs.add("Sunami");
		hs.add("Aag");
		hs.add("Wings");
		hs.add(95461);
		hs.add("Sunamiya");
		hs.add("Govind");
		hs.add("Gopal");
		hs.add("Gopi");
		hs.add(79845);
		hs.add("Govinda");
		System.out.println(hs);
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Gagan");
		lhs.add("Magan");
		lhs.add("Cagan");
		lhs.add(546);
		lhs.add("Rahul");
		lhs.add("Sunil");
		lhs.add("Gopi");
		lhs.add("Gopal");
		lhs.add(852.963);
		lhs.add(1234);
		lhs.add("Krishna");
		System.out.println(lhs);
		
		TreeSet ts = new TreeSet();
		ts.add("Hariom");
		ts.add("Suraj");
		ts.add("Manoj");
		ts.add("Payal");
		ts.add("Gagan");
		ts.add("Magan");
		ts.add("Cagan");
		System.out.println(ts);
	}
}

