package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class SuffleTest {
	public static void main(String[] args) {
		ArrayList aa = new ArrayList();

		aa.add("Trilok");
		aa.add("Ramesh");
		aa.add("Suresh");
		aa.add("Kalakar");
		aa.add("Subramanyam");
		aa.add("Ramtula");
		aa.add("Sushree");
		aa.add("Mayur");
		
		System.out.println(aa);
		Collections.sort(aa);
		System.out.println(aa);
		
		Collections.shuffle(aa);
		System.out.println(aa);
	}
}
