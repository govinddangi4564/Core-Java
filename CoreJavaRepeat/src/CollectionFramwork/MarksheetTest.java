package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarksheetTest {
	public static void main(String[] args) {
		Marksheet m1 = new Marksheet("Govind", 20, "0863CS231062", 82.4);
		Marksheet m2 = new Marksheet("Sandeep", 19, "0863CS231052", 89.4);
		Marksheet m3 = new Marksheet("Pawan", 22, "0863CS231062", 80.2);
		Marksheet m4 = new Marksheet("Hariom", 15, "0863CS231082", 88.5);
		Marksheet m5 = new Marksheet("Sandip", 25, "0863CS231042", 85.4);
		
		ArrayList<Marksheet> al = new ArrayList<>();
		al.add(m1);
		al.add(m2);
		al.add(m3);
		al.add(m4);
		al.add(m5);
		
		MarksheetOrder name = new MarksheetOrder();
		PercentageWise per = new PercentageWise();
		RollNoWise roll = new RollNoWise();
		
		Collections.sort(al, roll);

		
		for(Marksheet mm : al) {
			System.out.println(mm);
		}
		
		System.out.println("---------------------------------------------------");
		
		System.out.println(m1.equals(m3));
	}

}
