package CollectionFramwork;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {
		public static void main(String[] args) {
			
			Employee e1 = new Employee("Govind", "aa741", 20, 36980.2);
			Employee e2 = new Employee("Rizwan", "aa748", 26, 76980.2);
			Employee e3 = new Employee("Gopal", "aa712", 23, 96980.2);
			Employee e4 = new Employee("akshat", "aa743", 27, 41980.2);
			Employee e5 = new Employee("Monu", "aa740", 25, 22980.2);
			
			
			ArrayList<Employee> al = new ArrayList<>();
			al.add(e1);
			al.add(e2);
			al.add(e3);
			al.add(e4);
			al.add(e5);
			
			Collections.sort(al);
			
			System.out.println("Name \t Id \t RollNo \t Salary \n----------------------------------------------------");
			
			for(Employee em : al) {
				System.out.println(em);
			}
		}

}
