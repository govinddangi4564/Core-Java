package CollectionFramwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashTest {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Bottel", "Pani ki");
		hm.put("Box", "Mithai ka");
		hm.put("Paro", "Devdas ki");
		hm.put("Heer", "Ranjha ki");
		hm.put("Laila", "Majnu ki");
		hm.put(7410, 7896);
		hm.put(78965, "Pani ki");
		hm.put(null, null);
		System.out.println(hm);
		
		
		Hashtable ht = new Hashtable();
//		ht.put(null, "Roal");
//		ht.put("Roal",null );
		ht.put("Dear", "Long");
		System.out.println(ht);
		
		HashMap<Integer, String> hk = new HashMap<Integer, String>();
		hk.put(789, "Hello");
		hk.put(456, "Ram");
		hk.put(852, "Shyam");
		hk.put(989, "Gopal");
		System.out.println(hk);
		for(Object ob : hk.entrySet()) {
			System.out.println(ob);
		}
		
		ArrayList al = new ArrayList();
		al.add("Rani");
		al.add("Pooja");
		al.add("Vandna");
		al.add("Khushboo");
		al.add("Sushma");
		
		TreeMap tm = new TreeMap();
		tm.put("Raja", "Rani");
		tm.put("King", "Bazeer");
		tm.put("Rookh", "Knight");
		tm.put("Soan", "Papdi");
		tm.put("Bottle", 5000);
		tm.put("Akshat", 97945);
		tm.put("Rizwan", al);
		System.out.println(tm);
		
	}

}
