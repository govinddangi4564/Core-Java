package Collection_Framwork;

import java.util.ArrayList;

public class GenericArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Govind");
		al.add("Sunil");
		al.add("Gopi");
		al.add("Gopal");
		al.add("Sunami");
		al.add("Aag");
		al.add("Wings");
		
		System.out.println(al);
		
		System.out.println("-------------------------------");
		
		ArrayList<Integer> ai = new ArrayList<>();
		ai.add(4563);
		ai.add(45);
		ai.add(63);
		ai.add(4589);
		ai.add(887);
		ai.add(3);
		
		System.out.println(ai);
		
		System.out.println(ai.get(1));
		System.out.println("-------------------------------");
		
		for(int i = 0; i < ai.size(); i++) {
			System.out.println(ai.get(i));
		}

		System.out.println("-------------------------------");
		
		ArrayList ah = new ArrayList();
		ah.add("Akshat");
		ah.add("Govind");
		ah.add("Rizwan");
		ah.add("Sandeep");
		ah.add(1432);
		ah.add("Chouhan");
		ah.add("Dangi");
		ah.add(7410);
		ah.add("Gopi");
		
		System.out.println(ah);
		
		for(int i = 0; i < ah.size(); i++) {
			Object o = ah.get(i);
			String s = o.toString();         // (String) o;
			System.out.println(s);
		}
	}
}
