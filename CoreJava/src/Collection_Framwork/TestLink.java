package Collection_Framwork;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class TestLink {
	public static void main(String[] args) {

		System.out.println("------------ List -------------");
		
		List al = new LinkedList();
		al.add("Sunami");
		al.add("Aag");
		al.add("Wings");
		al.add(95461);
		al.add("Sunamiya");
		System.out.println(al);

		System.out.println("------------ Vector-------------");
		
		Vector v = new Vector();
		v.add("Govind");
		v.add("Gopal");
		v.add("Gopi");
		v.add(79845);
		v.add("Govinda");
		v.add("Govind dangi");
		System.out.println(v);
		
		v.addElement("rizwan");
		v.addElement(98);
		System.out.println(v);
		
		System.out.println("------------ Stack -------------");
		
		Stack st = new Stack();
		st.push("Gagan");
		st.push("Magan");
		st.push("Cagan");
		st.push(546);
		st.push("Rahul");
		System.out.println(st);
		
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.capacity());
	}
}
