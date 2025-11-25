package Collection_Framwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Vikas", "Gangotri");
		hm.put("Ram", "Sita");
		hm.put(143, "Kanak");
		hm.put("Sameer", 777);
		hm.put("Vikas", "Sundari");
		hm.put("Paneer", "Dosa");
		hm.put(123, 987);
		
		System.out.println(hm);
		
		System.out.println("-------------------------------");

		Set k = hm.keySet();
		System.out.println("Keys : " + k);
		
		Collection cn = hm.values();
		System.out.println("Values : " + cn);
		
		System.out.println(hm.entrySet());
		System.out.println(hm.get("Sameer"));
		
		System.out.println("-------------------------------");
		
		for(Object oo : hm.entrySet()) {
			System.out.println(oo);
		}
		System.out.println("-----------------------------");
		
		Hashtable ht = new Hashtable();
		ht.put("akshat", "Govind");
		ht.put("Sameer", 777);
		ht.put("Paneer", "Dosa");
//		ht.put(null, "fdfgh");
//		ht.put(null, "fgh");
		ht.put(123, 987); 
		System.out.println(ht);

	}

}
