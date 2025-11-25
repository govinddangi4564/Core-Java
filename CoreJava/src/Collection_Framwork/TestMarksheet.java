package Collection_Framwork;

import java.util.ArrayList;

public class TestMarksheet {
	public static void main(String[] args) {
		Marksheet m1 = new Marksheet("Govind", 17, "0863CS231062",450);
		Marksheet m2 = new Marksheet("Akshat", 18, "0863CS231015",480);
		Marksheet m3 = new Marksheet("Rizwan", 19, "0863CS231112",495);
		Marksheet m4 = new Marksheet("Aditya", 20, "0863CS231012",433);
		Marksheet m5 = new Marksheet("Gopi", 21, "0863CS231101",500);
		
		ArrayList<Marksheet> li = new ArrayList<Marksheet>();
		li.add(m1);
		li.add(m2);
		li.add(m3);
		li.add(m4);
		li.add(m5);
		
		System.out.println("Name \t\t Age \t RollNum \t Marks \n");
		
//		for(Marksheet mm : li) {
//			System.out.println(mm.getName() + "\t" + mm.getAge() + " \t" + mm.getRollNo() + "\t" + mm.getMarks());
//		}
		
		for(Marksheet mm : li) {
			System.out.println(mm);
		}
	}
}
