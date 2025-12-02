package CollectionFramwork;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

import org.xml.sax.HandlerBase;

public class LinkedListTest {
	public static void main(String[] args) {
		List li = new LinkedList();
		li.add("Govind");
		li.add("akshat");
		li.add("Rizwan");
		li.add(4564);
		li.add(1234);
		li.add(12.001);
		li.add("Sunil");
		
		System.out.println(li);
		System.out.println("---------------------------------------------");

		Vector v = new Vector();
		v.add("Raam");
		v.add("Shyam");
		v.add("Gopal");
		v.add("Reeta");
		v.add(2, "Honey");
		v.add("Hari");
		v.addElement("Dham");
		
		System.out.println(v);
		
		v.remove("Reeta");
		System.out.println(v);

		Stack st = new Stack();  // LIFO
		
		st.push("One");
		st.push("Two");
		st.push("Three");
		st.push("Four");
		st.push("Five");
		st.push("Six");
		
		System.out.println(st);
		
		System.out.println("Deleted : " + st.pop());
		System.out.println("Last : " + st.peek());
		System.out.println(st);
		
		st.addElement("Seven");
		System.out.println(st);

		System.out.println("---------------------------------------------");

		HashSet hs = new HashSet();
		hs.add("Ten");
		hs.add("Eleven");
		hs.add("Twelve");
		hs.add("Thirteen");
		hs.add(7410);
		hs.add(852.111);
		hs.add("Forteen");
		hs.add("Fifteen");

		System.out.println(hs);
		System.out.println("---------------------------------------------");

		TreeSet ts = new TreeSet();
		ts.add("Twentyone");
		ts.add("Hello");
		ts.add("Byy");
		ts.add("Good morning");
		ts.add("Khuda hafees");
		ts.add("Rab rakha");
		ts.add("Sheifjii");
		
		System.out.println(ts);
		
	}
	

}
